package com.fullstack.semana2.model;

import lombok.Data;

@Data
public class Peliculas {
    
    public int id;
    public String titulo;
    public int anio;
    public String director;
    public String genero;
    public String sinopsis;
}
