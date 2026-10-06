package com.veterinaria.veterinaria.service;

import com.veterinaria.veterinaria.exception.ReglaNegocioException;
import com.veterinaria.veterinaria.model.Propietario;
import com.veterinaria.veterinaria.repository.PropietarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PropietarioService {

    @Autowired
    private PropietarioRepository propietarioRepository;

    public Propietario guardarPropietario(Propietario propietario) {

        if (propietario.getTelefono() == null || propietario.getTelefono().isBlank()) {
            throw new ReglaNegocioException("El propietario debe registrar un número de teléfono.");
        }

        return propietarioRepository.save(propietario);
    }
}