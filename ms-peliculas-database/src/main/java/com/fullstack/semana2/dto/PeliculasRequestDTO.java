package com.fullstack.semana2.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PeliculasRequestDTO {

    @NotBlank(message = "El Id es obligatorio")
    private int id;
    
    @NotBlank(message = "El Titulo de la pelicula es obligatorio")
    private String titulo;

    @NotBlank(message = "El Año de la pelicula es obligatorio")
    private int anio;
    
    @NotBlank(message = "El Director es obligatorio")
    private String director;

    @NotBlank(message = "El Genero de la pelicula es obligatorio")
    private String genero;

    @NotBlank(message = "La Sinopsis de la pelicula es obligatoria")
    private String sinopsis;
}
