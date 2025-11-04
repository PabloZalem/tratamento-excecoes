package com.excecoes.tratamento_excecoes.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.excecoes.tratamento_excecoes.exceptions.ResourceRuntimeException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/api")
public class ApiController {

    @GetMapping("/hello")
    public String Hello() {
        return "Hello World!";
    }

    @GetMapping("/myerror")
    public String MyError() {
        throw new RuntimeException("Esta é uma mensagem de erro customizada do endpoint MyError.");
    }

    @GetMapping("/mycustomerror")
    public String myCustomError() {
        throw new ResourceRuntimeException("Esta é uma mensagem de erro customizada do endpoint MyCustomError.");
    }
    
}
