package com.gestor.gestor.repository.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "COMGES_GESTORES")
public class Gestore {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_GESTOR")
    private Long id;
    @Column(name = "NOMBRE_COMPLETO")
    private String nombreCompleto;
    @Column(name = "ID_CLIENTE")
    private Long idCliente;
    @Column(name = "FECHA_ALTA")
    private LocalDateTime fechaAlta;
    @Column(name = "FECHA_BAJA")
    private LocalDateTime fechaBaja;
    @Column(name = "FECHA_BAJA_REPORTE")
    private LocalDateTime fechaBajaReporte;
    @Column(name = "REGIONAL")
    private String regional;
    @Column(name = "DEPARTAMENTO")
    private String departamento;

    @OneToMany(mappedBy = "gestore")
    private List<Alta> altaList;
}
