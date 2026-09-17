package com.logistica.transporte.Model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "recepcion")
public class Recepcion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRecepcion;

    @Column(name = "nombre_proveedor", length = 120, nullable = false)
    private String nombreProveedor;

    @Column(name = "fecha_envio", nullable = false)
    private LocalDate fechaEnvio;

    @Column(name = "toneladas_enviadas", nullable = false)
    private Double toneladasEnviadas;

    @Column(name = "nombre_conductor", length = 50, nullable = false)
    private String nombreConductor;

    @Column(name = "numero_conductor", length = 15, nullable = false)
    private String numeroConductor;

    @Column(name = "placa_conductor", length = 6, nullable = false)
    private String placaConductor;

    // Constructor vacío (Obligatorio para que Spring Boot funcione)
    public Recepcion() {
    }

    public Long getIdRecepcion() {return idRecepcion;}
    public void setIdRecepcion(Long idRecepcion) {this.idRecepcion = idRecepcion;}
    public String getNombreProveedor() {return nombreProveedor;}
    public void setNombreProveedor(String nombreProveedor) {this.nombreProveedor = nombreProveedor;}
    public LocalDate getFechaEnvio() {return fechaEnvio;}
    public void setFechaEnvio(LocalDate fechaEnvio) {this.fechaEnvio = fechaEnvio;}
    public Double getToneladasEnviadas() {return toneladasEnviadas;}
    public void setToneladasEnviadas(Double toneladasEnviadas) {this.toneladasEnviadas = toneladasEnviadas;}
    public String getNombreConductor() {return nombreConductor;}
    public void setNombreConductor(String nombreConductor) {this.nombreConductor = nombreConductor;}
    public String getNumeroConductor() {return numeroConductor;}
    public void setNumeroConductor(String numeroConductor) {this.numeroConductor = numeroConductor;}
    public String getPlacaConductor() {return placaConductor;}
    public void setPlacaConductor(String placaConductor) {this.placaConductor = placaConductor;}


}