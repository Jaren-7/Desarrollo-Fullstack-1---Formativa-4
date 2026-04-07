package com.fullstack.semana2.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fullstack.semana2.dto.PeliculasResponseDTO;
import com.fullstack.semana2.service.interfaces.IPeliculasService;

@RestController
@RequestMapping("/Peliculas")
public class PeliculasController {
    
    private final IPeliculasService _service;

    public PeliculasController(IPeliculasService service){
        _service = service;
    }

    @GetMapping
    public ResponseEntity<List<PeliculasResponseDTO>> getAll(){
        
        return ResponseEntity.ok(_service.getAll());

    }

    @GetMapping("/")
    public ResponseEntity<PeliculasResponseDTO> getById(@RequestParam int id){
        
        return ResponseEntity.ok(_service.getById(id));

    }

}
