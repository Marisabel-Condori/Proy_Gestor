package com.gestor.gestor.service;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Adelanto {
    private String regional;
    private Long cantidad;
    private Long monto;
    private Double comisionNueva;
    private Double penalizacion;
}
