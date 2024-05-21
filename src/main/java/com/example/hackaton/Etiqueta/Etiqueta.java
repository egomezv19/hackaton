package com.example.hackaton.Etiqueta;

import com.example.hackaton.Salon.Salon;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Etiqueta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idEtiqueta;

    private String nombre;

    @ManyToMany(mappedBy = "etiquetas")
    private List<Salon> salones;

    // Getters and Setters
}

