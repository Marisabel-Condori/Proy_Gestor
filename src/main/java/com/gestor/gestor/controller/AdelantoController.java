package com.gestor.gestor.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
@RequestMapping("/listaAdelanto")
public class AdelantoController {

    @Autowired
    private AdelantoService adelantoService;
    
    @GetMapping()
    public List<AdelantoDTO> obtenerListaAdelanto(){
        return this.adelantoService.obtenerListaAdelanto();
    }
}