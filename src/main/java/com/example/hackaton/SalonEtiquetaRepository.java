package com.example.hackaton;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalonEtiquetaRepository extends JpaRepository<SalonEtiqueta, Integer> {
    // Puedes agregar métodos personalizados si es necesario
}
