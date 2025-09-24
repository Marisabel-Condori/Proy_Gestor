package com.gestor.gestor.service;

import com.gestor.gestor.repository.repo.GestoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Service
public class AdelantoService {

    @Autowired
    private GestoreRepository gestoreRepository;

    public List<Adelanto> obtenerListaAdelanto() {
        //String fechaInicio = "7/8/2024";

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/M/yyyy");
        LocalDate fecha = LocalDate.of(2024, 8, 7);

        List<Object[]> resultados = this.gestoreRepository.consultaReporte(fecha.format(formatter));
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
