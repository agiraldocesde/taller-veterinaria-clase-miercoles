package com.veterinaria.veterinaria.controller;

import com.veterinaria.veterinaria.model.Consulta;
import com.veterinaria.veterinaria.service.ConsultaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/consultas")
public class ConsultaController {

    @Autowired
    private ConsultaService consultaService;

    @PostMapping
    public Consulta crear(@RequestBody Consulta consulta) {
        return consultaService.guardarConsulta(consulta);
    }
}