package com.veterinaria.veterinaria.service;

import com.veterinaria.veterinaria.exception.ReglaNegocioException;
import com.veterinaria.veterinaria.model.Mascota;
import com.veterinaria.veterinaria.repository.MascotaRepository;
import com.veterinaria.veterinaria.repository.PropietarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MascotaService {

    @Autowired
    private MascotaRepository mascotaRepository;

    @Autowired
    private PropietarioRepository propietarioRepository;

    public Mascota guardarMascota(Mascota mascota) {

        if (mascota.getPropietario() == null ||
                !propietarioRepository.existsById(mascota.getPropietario().getId())) {
            throw new ReglaNegocioException("La mascota debe estar asociada a un propietario existente.");
        }

        return mascotaRepository.save(mascota);
    }
}