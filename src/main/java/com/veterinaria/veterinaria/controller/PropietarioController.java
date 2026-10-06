package com.veterinaria.veterinaria.controller;

import com.veterinaria.veterinaria.model.Propietario;
import com.veterinaria.veterinaria.service.PropietarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/propietarios")
public class PropietarioController {

    @Autowired
    private PropietarioService propietarioService;

    @PostMapping
    public Propietario crear(@RequestBody Propietario propietario) {
        return propietarioService.guardarPropietario(propietario);
    }
}