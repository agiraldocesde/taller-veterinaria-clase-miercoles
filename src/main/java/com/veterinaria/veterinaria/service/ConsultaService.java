package com.veterinaria.veterinaria.service;

import com.veterinaria.veterinaria.exception.ReglaNegocioException;
import com.veterinaria.veterinaria.model.Consulta;
import com.veterinaria.veterinaria.repository.ConsultaRepository;
import com.veterinaria.veterinaria.repository.MascotaRepository;
import com.veterinaria.veterinaria.repository.VeterinarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConsultaService {

    @Autowired
    private ConsultaRepository consultaRepository;

    @Autowired
    private MascotaRepository mascotaRepository;

    @Autowired
    private VeterinarioRepository veterinarioRepository;

    public Consulta guardarConsulta(Consulta consulta) {

        if (consulta.getMascota() == null ||
                !mascotaRepository.existsById(consulta.getMascota().getId())) {
            throw new ReglaNegocioException("La consulta debe estar asociada a una mascota existente.");
        }

        if (consulta.getVeterinario() == null ||
                !veterinarioRepository.existsById(consulta.getVeterinario().getId())) {
            throw new ReglaNegocioException("La consulta debe estar asociada a un veterinario existente.");
        }

        return consultaRepository.save(consulta);
    }
}