package com.gestor.gestor.repository.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "COMGES_GESTORES")
public class Gestore {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idGestore;

    @Column(name = "ID_GESTOR")
    private Long id;

    @Column(name = "NOMBRE_COMPLETO", length = 100)
    private String nombreCompleto;

    @Column(name = "ID_CLIENTE")
    private Long idCliente;

    @Column(name = "FECHA_ALTA")
    private String fechaAlta;

    @Column(name = "FECHA_BAJA")
    private String fechaBaja;

    @Column(name = "FECHA_BAJA_REPORTE")
    private String fechaBajaReporte;

    @Column(name = "REGIONAL", length = 50)
    private String regional;

    @Column(name = "DEPARTAMENTO", length = 10)
    private String departamento;

    @OneToMany(mappedBy = "gestore", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Alta> altaList;
}
