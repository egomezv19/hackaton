package com.example.hackaton.Etiqueta;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EtiquetaService {

    @Autowired
    private EtiquetaRepository etiquetaRepository;

    public Etiqueta createEtiqueta(Etiqueta etiqueta) {
        return etiquetaRepository.save(etiqueta);
    }

    public List<Etiqueta> getAllEtiquetas() {
        return etiquetaRepository.findAll();
    }

    public Etiqueta updateEtiqueta(Integer id, Etiqueta etiquetaDetails) {
        Etiqueta etiqueta = etiquetaRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Etiqueta not found"));
        etiqueta.setNombre(etiquetaDetails.getNombre());
        return etiquetaRepository.save(etiqueta);
    }

    public void deleteEtiqueta(Integer id) {
        Etiqueta etiqueta = etiquetaRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Etiqueta not found"));
        etiquetaRepository.delete(etiqueta);
    }

    // Otros métodos según sea necesario
}
