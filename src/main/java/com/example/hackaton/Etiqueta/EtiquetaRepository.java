package com.example.hackaton.Etiqueta;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EtiquetaRepository extends JpaRepository<Etiqueta, Integer> {
    // Puedes agregar métodos personalizados si es necesario
}

