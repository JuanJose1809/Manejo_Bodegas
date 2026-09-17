package com.logistica.transporte.Model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "despacho")
public class Despacho {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDespacho;

    @Column(name = "fecha_despacho", nullable = false)
    private LocalDate fechaDespacho;

    @Column(name = "cliente_destino", length = 50, nullable = false)
    private String clienteDestino;

    @Column(name = "toneladas", nullable = false)
    private Double toneladas;

    @Column(name = "nombre_conductor", length = 50, nullable = false)
    private String nombreConductor;

    @Column(name = "ciudad_destino", length = 50, nullable = false)
    private String ciudadDestino;

    @Column(name = "lote", length = 30, nullable = false)
    private String lote;

    // Constructor vacío
    public Despacho() {
    }
    public Long getIdDespacho() {return idDespacho;}
    public void setIdDespacho(Long idDespacho) {this.idDespacho = idDespacho;}
    public LocalDate getFechaDespacho() {return fechaDespacho;}
    public void setFechaDespacho(LocalDate fechaDespacho) {this.fechaDespacho = fechaDespacho;}
    public String getClienteDestino() {return clienteDestino;}
    public void setClienteDestino(String clienteDestino) {this.clienteDestino = clienteDestino;}
    public Double getToneladas() {return toneladas;}
    public void setToneladas(Double toneladas) {this.toneladas = toneladas;}
    public String getNombreConductor() {return nombreConductor;}
    public void setNombreConductor(String nombreConductor) {this.nombreConductor = nombreConductor;}
    public String getCiudadDestino() {return ciudadDestino;}
    public void setCiudadDestino(String ciudadDestino) {this.ciudadDestino = ciudadDestino;}
    public String getLote() {return lote;}
    public void setLote(String lote) {this.lote = lote;}

}