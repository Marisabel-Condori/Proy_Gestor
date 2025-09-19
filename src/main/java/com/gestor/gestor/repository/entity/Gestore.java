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
    @Column(name = "REGIONAL")
    private String regional;
    @Column(name = "DEPARTAMENTO")
    private String departamento;

    @OneToMany(mappedBy = "gestore")
    private List<Alta> altaList;
}
