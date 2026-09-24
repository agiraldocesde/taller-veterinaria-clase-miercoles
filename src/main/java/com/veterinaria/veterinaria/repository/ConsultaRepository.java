package com.veterinaria.veterinaria.repository;

import com.veterinaria.veterinaria.model.Consulta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsultaRepository extends JpaRepository<Consulta, Long> {
}