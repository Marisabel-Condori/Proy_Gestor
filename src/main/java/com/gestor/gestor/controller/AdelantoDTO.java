package com.gestor.gestor.controller;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AdelantoDTO {
    private String regional;
    private Long cantidad;
    private Long monto;
    private Double comisionNueva;
    private Double penalizacion;
}
