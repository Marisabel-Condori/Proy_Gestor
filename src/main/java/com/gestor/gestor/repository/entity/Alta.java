package com.gestor.gestor.repository.entity;

import java.time.LocalDateTime;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "COMGES_ALTA_SERVICIO")
public class Alta {
    @Id
    @Column(name = "ID_ALTA_SERVICIO")
    private Long idAltaServicio;

    @Column(name = "PERIODO", length = 6)
    private String periodo;

    @Column(name = "NRO_SOLICITUD", length = 20)
    private String nroSolicitud;

    @Column(name = "FECHA_ALTA_INS")
    private LocalDateTime fechaAltaIns;

    @Column(name = "FECHA_INSTALACION_INS")
    private LocalDateTime fechaInstalacionIns;

    @Column(name = "INSTANCIA_FTT", length = 20)
    private String instanciaFtt;

    @Column(name = "ID_INSTANCIA")
    private Long idInstancia;

    @Column(name = "INSTANCIA", length = 20)
    private String instancia;

    @Column(name = "ESTADO", length = 20)
    private String estado;

    @Column(name = "CLIENTE_DES", length = 20)
    private String clienteDes;

    @Column(name = "CUENTA_DES", length = 20)
    private String cuentaDes;

    @Column(name = "NOMBRE_CLIENTE", length = 100)
    private String nombreCliente;

    @Column(name = "MEDIO_CONTACTO", length = 50)
    private String medioContacto;

    @Column(name = "PAQUETE_ARQV", length = 20)
    private String paqueteArqv;

    @Column(name = "COMPONENTE_ARQV", length = 20)
    private String componenteArqv;


    @ManyToOne
    @JoinColumn(name = "ID_GESTOR", referencedColumnName = "ID_GESTOR")
    private Gestore gestore;

    @ManyToOne
    @JoinColumn(name = "ID_SERVICIO_TARIFA", referencedColumnName = "ID_SERVICIO_TARIFA")
    private Tarifa tarifa;
}
