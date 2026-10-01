package com.veterinaria.veterinaria.service;

import com.veterinaria.veterinaria.exception.ReglaNegocioException;
import com.veterinaria.veterinaria.model.Veterinario;
import com.veterinaria.veterinaria.repository.VeterinarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VeterinarioService {

    @Autowired
    private VeterinarioRepository veterinarioRepository;

    public Veterinario guardarVeterinario(Veterinario veterinario) {

        if (veterinario.getIdentificacionProfesional() == null ||
                veterinario.getIdentificacionProfesional().isBlank()) {
            throw new ReglaNegocioException("El veterinario debe tener una identificación profesional registrada.");
        }

        return veterinarioRepository.save(veterinario);
    }
}