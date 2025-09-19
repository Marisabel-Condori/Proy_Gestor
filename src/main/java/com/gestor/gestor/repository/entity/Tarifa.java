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
@Table(name = "COMGES_SERVICIO_TARIFAS")
public class Tarifa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_SERVICIO_TARIFA")
    private Long id_tarifa;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Column(name = "COMBO_PLAY")
    private String combo_play;
    @Column(name = "PLAN_PAQUETE")
    private String plan_paquete;
    @Column(name = "COMPONENTE")
    private String componente;
    @Column(name = "TARIFA")
    private long tarifa ;
    @Column(name = "FECHA_ALTA")
    private LocalDateTime fecha_alta;
    @Column(name = "NEGOCIO")
    private String negocio;

    @OneToMany(mappedBy = "tarifa")
    private List<Tarifa> tarifaList;
}
