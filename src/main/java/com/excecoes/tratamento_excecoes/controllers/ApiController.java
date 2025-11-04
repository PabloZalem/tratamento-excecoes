package com.excecoes.tratamento_excecoes.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/api")
public class ApiController {

    @GetMapping("/hello")
    public String Hello() {
        return "Hello World!";
    }
}
