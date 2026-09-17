package com.logistica.transporte.controller;

import com.logistica.transporte.Model.Despacho;
import com.logistica.transporte.repository.DespachoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/despachos")
@CrossOrigin(origins = "*")
public class DespachoController {

    @Autowired
    private DespachoRepository despachoRepository;

    // VER todos los despachos
    @GetMapping
    public List<Despacho> listarTodos() {
        return despachoRepository.findAll();
    }

    // GUARDAR un nuevo despacho
    @PostMapping
    public Despacho guardarDespacho(@RequestBody Despacho nuevoDespacho) {
        return despachoRepository.save(nuevoDespacho);
    }

    // MODIFICAR toneladas en caso de discordancia
    @PutMapping("/{id}")
    public Despacho actualizarDespacho(@PathVariable Long id, @RequestBody Despacho detallesActualizados) {
        Despacho despachoExistente = despachoRepository.findById(id).orElseThrow();

        // Actualizamos todos los campos permitidos
        despachoExistente.setFechaDespacho(detallesActualizados.getFechaDespacho());
        despachoExistente.setClienteDestino(detallesActualizados.getClienteDestino());
        despachoExistente.setNombreConductor(detallesActualizados.getNombreConductor());
        despachoExistente.setCiudadDestino(detallesActualizados.getCiudadDestino());
        despachoExistente.setLote(detallesActualizados.getLote());
        despachoExistente.setToneladas(detallesActualizados.getToneladas());

        return despachoRepository.save(despachoExistente);
    }
}