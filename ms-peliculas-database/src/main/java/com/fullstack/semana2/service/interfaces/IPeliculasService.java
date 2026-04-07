package com.fullstack.semana2.service.interfaces;

import com.fullstack.semana2.dto.PeliculasResponseDTO;
import java.util.List;

public interface IPeliculasService {
    
    List<PeliculasResponseDTO> getAll();

    PeliculasResponseDTO getById(int id);
    
}
