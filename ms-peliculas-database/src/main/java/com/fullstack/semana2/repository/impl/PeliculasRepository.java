package com.fullstack.semana2.repository.impl;

import java.util.List;

import org.jdbi.v3.core.Jdbi;
import org.springframework.stereotype.Repository;
import com.fullstack.semana2.repository.interfaces.IPeliculasRepository;
import com.fullstack.semana2.model.Peliculas;

@Repository
public class PeliculasRepository implements IPeliculasRepository {
    
    private final Jdbi _jdbi;

    public PeliculasRepository(Jdbi jdbi){
        _jdbi = jdbi;
    }

    @Override
    public List<Peliculas> getAll() {
        
        return _jdbi.withHandle(handle -> 
            handle.createQuery("""
                SELECT  
                ID 
                ,TITULO 
                ,ANIO 
                ,DIRECTOR 
                ,GENERO 
                ,SINOPSIS 
                FROM PELICULAS
            """)
            .mapToBean(Peliculas.class)
            .list()
        );

    }

    @Override
    public Peliculas getById(int id) {
        
        return _jdbi.withHandle(handle -> 
            handle.createQuery("""
                SELECT 
                ID
                ,TITULO
                ,ANIO
                ,DIRECTOR
                ,GENERO
                ,SINOPSIS
                FROM PELICULAS
                WHERE ID = :id
            """)
            .bind("id", id)
            .mapToBean(Peliculas.class)
            .findOne()
            .orElse(null)
        );
    }


}
