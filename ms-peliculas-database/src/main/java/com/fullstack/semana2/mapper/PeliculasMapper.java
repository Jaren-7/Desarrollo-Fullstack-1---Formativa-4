package com.fullstack.semana2.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.fullstack.semana2.dto.PeliculasRequestDTO;
import com.fullstack.semana2.dto.PeliculasResponseDTO;
import com.fullstack.semana2.model.Peliculas;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PeliculasMapper {
    
    // HARA EL INTERCAMBIO DE REQUEST A ENTITY/MODEL E IGNORARA EL ID YA QUE SE GENERA POR BASE DE DATOS
    @Mapping(target = "id", ignore = true)
    Peliculas toEntity(PeliculasRequestDTO request);

    PeliculasResponseDTO toResponse(Peliculas pelicula);

    List<PeliculasResponseDTO> toResponseList(List<Peliculas> peliculas);
}
