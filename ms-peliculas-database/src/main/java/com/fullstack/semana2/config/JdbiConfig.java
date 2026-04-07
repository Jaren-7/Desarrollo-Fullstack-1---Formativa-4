package com.fullstack.semana2.config;

import javax.sql.DataSource;

import org.jdbi.v3.core.Jdbi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JdbiConfig {
    
    // ESTO CREA LA CONEXION A LA BASE DE DATOS ORACLE
    @Bean
    public Jdbi jdbi(DataSource dataSource){
        return Jdbi.create(dataSource);
    }

    // ONDEMAND ES COMO USING, CREA LA CONEXION Y HACE LA CONSULTA O SENTENCIA SQL Y LUEGO CIERRA UNA VEZ TERMINADA
    // LO SIGUIENTE SE DEBE HACER POR CADA REPOSITORIO CREADO
    // ESTO SE UTILIZA EN PROYECTO PEQUEÑOS, WITHHANDLE HACE LO MISMO Y ES COMO EL USING DE .NET
    // @Bean
    // public PeliculasRepository peliculasRepository(Jdbi jdbi){
    //     return jdbi.onDemand(PeliculasRepository.class);
    // }
}
