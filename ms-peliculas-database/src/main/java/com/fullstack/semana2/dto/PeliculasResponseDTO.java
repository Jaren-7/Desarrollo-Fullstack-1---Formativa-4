package com.fullstack.semana2.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PeliculasResponseDTO {
    
    private int id;
    private String titulo;
    private int anio;
    private String director;
    private String genero;
    private String sinopsis;

}
