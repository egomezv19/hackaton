package com.example.hackaton.Salon;

import com.example.hackaton.Exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class SalonService {

    @Autowired
    private SalonRepository salonRepository;

    public Salon createSalon(Salon salon) {
        return salonRepository.save(salon);
    }

    public List<Salon> getAllSalones() {
        return salonRepository.findAll();
    }

    public Salon updateSalon(Integer id, Salon salonDetails) {
        Salon salon = salonRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Salon not found"));
        salon.setNombre(salonDetails.getNombre());
        salon.setUbicacion(salonDetails.getUbicacion());
        salon.setCapacidad(salonDetails.getCapacidad());
        salon.setDescripcion(salonDetails.getDescripcion());
        return salonRepository.save(salon);
    }

    public void deleteSalon(Integer id) {
        Salon salon = salonRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Salon not found"));
        salonRepository.delete(salon);
    }

    // Otros métodos según sea necesario
}

