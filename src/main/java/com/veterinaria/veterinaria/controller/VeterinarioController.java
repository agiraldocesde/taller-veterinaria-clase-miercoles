package com.veterinaria.veterinaria.controller;

import com.veterinaria.veterinaria.model.Veterinario;
import com.veterinaria.veterinaria.service.VeterinarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/veterinarios")
public class VeterinarioController {

    @Autowired
    private VeterinarioService veterinarioService;

    @PostMapping
    public Veterinario crear(@RequestBody Veterinario veterinario) {
        return veterinarioService.guardarVeterinario(veterinario);
    }
}