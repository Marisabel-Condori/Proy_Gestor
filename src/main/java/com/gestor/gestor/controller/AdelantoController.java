package com.gestor.gestor.controller;

import com.gestor.gestor.service.AdelantoService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@RestController
@RequestMapping("/listaAdelanto")
@CrossOrigin(origins = "http://localhost:4200") 
public class AdelantoController {

    @Autowired
    private AdelantoService adelantoService;
    
    @GetMapping()
    public List<AdelantoDTO> obtenerListaAdelanto(){
        return this.adelantoService.obtenerListaAdelanto()
            .stream().map(adelanto -> {
            AdelantoDTO adelantoDTO = new AdelantoDTO();
            adelantoDTO.setCantidad(adelanto.getCantidad());
            adelantoDTO.setComisionNueva(adelanto.getComisionNueva());
            adelantoDTO.setMonto(adelanto.getMonto());
            adelantoDTO.setPenalizacion(adelanto.getPenalizacion());
            adelantoDTO.setRegional(adelanto.getRegional());
            return adelantoDTO;
        }).toList();
    }
}