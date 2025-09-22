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