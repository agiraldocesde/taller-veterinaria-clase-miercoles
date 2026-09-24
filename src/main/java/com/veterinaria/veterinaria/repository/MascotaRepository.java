package com.veterinaria.veterinaria.repository;

import com.veterinaria.veterinaria.model.Mascota;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MascotaRepository extends JpaRepository<Mascota, Long> {
}