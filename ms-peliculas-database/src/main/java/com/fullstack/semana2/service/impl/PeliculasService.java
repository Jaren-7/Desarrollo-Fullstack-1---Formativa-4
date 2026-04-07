package com.fullstack.semana2.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fullstack.semana2.dto.PeliculasResponseDTO;
import com.fullstack.semana2.exception.ResourceNotFoundException;
import com.fullstack.semana2.mapper.PeliculasMapper;
import com.fullstack.semana2.model.Peliculas;
import com.fullstack.semana2.repository.impl.PeliculasRepository;
import com.fullstack.semana2.service.interfaces.IPeliculasService;

@Service
public class PeliculasService implements IPeliculasService{
    
    // private final List<PeliculaResponseDTO> peliculas = new ArrayList<>();

    private final PeliculasRepository _repo;
    private final PeliculasMapper _mapper;

    public PeliculasService(PeliculasRepository repo, PeliculasMapper mapper){
        _repo = repo;
        _mapper = mapper;
    }

    @Override
    public List<PeliculasResponseDTO> getAll(){

        List<Peliculas> peliculas = _repo.getAll();

        return _mapper.toResponseList(peliculas);
    }

    @Override
    public PeliculasResponseDTO getById(int id) {

        Peliculas pelicula = _repo.getById(id);

        if (pelicula == null) {
            throw new ResourceNotFoundException("No se encontro la pelicula con el id: "+id);
        }
        
        return _mapper.toResponse(pelicula);
    }

}
