package com.fullstack.semana2.exception;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
	public ResponseEntity<Map<String, Object>> handleGeneralError(Exception ex) {

		Map<String, Object> response = new HashMap<>();
		response.put("timestamp", LocalDateTime.now());
		response.put("status", HttpStatus.INTERNAL_SERVER_ERROR.value());
		response.put("mensaje", "Error interno del servidor");
		response.put("detalle", ex.getMessage());

		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
	}    

	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<Map<String, Object>> handleNotFound(ResourceNotFoundException ex) {

		Map<String, Object> response = new HashMap<>();
		response.put("timestamp", LocalDateTime.now());
		response.put("status", HttpStatus.NOT_FOUND.value());
		response.put("mensaje", "Recurso no encontrado");
		response.put("detalle", ex.getMessage());

		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
	}  
}
