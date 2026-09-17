package com.logistica.transporte.controller;

import com.logistica.transporte.Model.Recepcion;
import com.logistica.transporte.repository.RecepcionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // Indica que esta clase es una API
@RequestMapping("/api/recepciones") // Esta será la URL base
@CrossOrigin(origins = "*") // Permite que tu frontend se conecte sin bloqueos de seguridad
public class RecepcionController {

    @Autowired
    private RecepcionRepository recepcionRepository;

    // 1. Método para VER todas las recepciones (GET)
    @GetMapping
    public List<Recepcion> obtenerTodasLasRecepciones() {
        return recepcionRepository.findAll();
    }

    // 2. Método para GUARDAR una nueva recepción enviada por el proveedor (POST)
    @PostMapping
    public Recepcion guardarRecepcion(@RequestBody Recepcion nuevaRecepcion) {
        return recepcionRepository.save(nuevaRecepcion);
    }

    // 3. MODIFICAR una recepción completa
    @PutMapping("/{id}")
    public Recepcion actualizarRecepcion(@PathVariable Long id, @RequestBody Recepcion detallesActualizados) {
        Recepcion recepcionExistente = recepcionRepository.findById(id).orElseThrow();

        // Actualizamos todos los campos permitidos
        recepcionExistente.setFechaEnvio(detallesActualizados.getFechaEnvio());
        recepcionExistente.setNombreProveedor(detallesActualizados.getNombreProveedor());
        recepcionExistente.setNombreConductor(detallesActualizados.getNombreConductor());
        recepcionExistente.setNumeroConductor(detallesActualizados.getNumeroConductor());
        recepcionExistente.setPlacaConductor(detallesActualizados.getPlacaConductor());
        recepcionExistente.setToneladasEnviadas(detallesActualizados.getToneladasEnviadas());

        return recepcionRepository.save(recepcionExistente);
    }
}