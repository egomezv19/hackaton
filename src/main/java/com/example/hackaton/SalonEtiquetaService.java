package com.example.hackaton;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SalonEtiquetaService {

    @Autowired
    private SalonEtiquetaRepository salonEtiquetaRepository;

    public SalonEtiqueta addEtiquetaToSalon(SalonEtiqueta salonEtiqueta) {
        return salonEtiquetaRepository.save(salonEtiqueta);
    }

    // Otros métodos según sea necesario
}

