package com.excecoes.tratamento_excecoes.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ApiExcHandlers {
    
    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<String> handleRuntimeException(RuntimeException ex, HttpServletRequest request) {
        final var aMessage = "Um erro ocorreu" + ex.getMessage();
        final var aResponse = ResponseEntity.badRequest().body(aMessage);
        return aResponse;
    }


    @ExceptionHandler(ResourceRuntimeException.class)
    public ResponseEntity handleRespondeNotFound(ResourceRuntimeException ex, HttpServletRequest request) {
        final var aMessage = ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
        return aMessage;
    }
}
