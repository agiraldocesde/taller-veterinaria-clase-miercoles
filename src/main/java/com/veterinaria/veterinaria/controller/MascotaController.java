package com.veterinaria.veterinaria.controller;

import com.veterinaria.veterinaria.model.Mascota;
import com.veterinaria.veterinaria.service.MascotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/mascotas")
public class MascotaController {

    @Autowired
    private MascotaService mascotaService;

    @PostMapping
    public Mascota crear(@RequestBody Mascota mascota) {
        return mascotaService.guardarMascota(mascota);
    }
}