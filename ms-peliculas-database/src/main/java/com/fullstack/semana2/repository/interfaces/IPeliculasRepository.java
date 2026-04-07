package com.fullstack.semana2.repository.interfaces;

import com.fullstack.semana2.model.Peliculas;
import java.util.List;

public interface IPeliculasRepository {
    
    List<Peliculas> getAll();

    Peliculas getById(int id);

}
