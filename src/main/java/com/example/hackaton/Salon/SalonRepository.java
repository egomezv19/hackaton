package com.example.hackaton.Salon;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalonRepository extends JpaRepository<Salon, Integer> {
    // Puedes agregar métodos personalizados si es necesario
}

