package com.gestor.gestor.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/saludo")
public class SaludoController {
    
    @GetMapping("/hola")
    public String saludo(){
        return "Hola que tal... ayuden a migrar la bse";
    }
}
