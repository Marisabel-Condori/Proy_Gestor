package com.gestor.gestor.controller;

import com.gestor.gestor.service.Adelanto;
import com.gestor.gestor.service.AdelantoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@RestController
@RequestMapping("/listaAdelanto")
public class AdelantoController {

    @Autowired
    private AdelantoService adelantoService;
    
    @GetMapping()
    public List<AdelantoDTO> obtenerListaAdelanto(){
        List<Adelanto> adelantos = this.adelantoService.obtenerListaAdelanto();
        return null;
    }
}