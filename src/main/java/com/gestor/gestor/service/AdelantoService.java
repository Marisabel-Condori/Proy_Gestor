package com.gestor.gestor.service;

import com.gestor.gestor.repository.repo.GestoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Service
public class AdelantoService {

    @Autowired
    private GestoreRepository gestoreRepository;

    public List<Adelanto> obtenerListaAdelanto() {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/mm/yyyy");

        String fechaInicio = "7/8/2024";
        
        LocalDateTime fechaFin = LocalDateTime.of(2025, 7, 1, 0, 0);

        List<Object[]> resultados = this.gestoreRepository.consultaReporte(fechaInicio, fechaFin.format(formatter));
        //List<Object[]> resultados = this.gestoreRepository.consultaReporte(fechaInicio, fechaFin.format(formatter));
        return resultados.stream()
                .map(this::mapToAdelanto)
                .toList();
    }

    private Adelanto mapToAdelanto(Object[] resultado) {
        return Adelanto.builder()
                .regional((String) resultado[0])
                .cantidad(((Number) resultado[1]).longValue())
                .monto(((Number) resultado[2]).longValue())
                .comisionNueva(((Number) resultado[3]).doubleValue())
                .penalizacion(((Number) resultado[4]).doubleValue())
                .build();
    }
}
