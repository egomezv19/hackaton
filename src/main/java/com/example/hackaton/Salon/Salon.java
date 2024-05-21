package com.example.hackaton.Salon;


import com.example.hackaton.Etiqueta.Etiqueta;
import com.example.hackaton.Reserva.Reserva;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Salon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idSalon;

    private String nombre;
    private String ubicacion;
    private Integer capacidad;
    private String descripcion;

    @OneToMany(mappedBy = "salon")
    private List<Reserva> reservas;

    @ManyToMany
    @JoinTable(
            name = "SalonEtiqueta",
            joinColumns = @JoinColumn(name = "idSalon"),
            inverseJoinColumns = @JoinColumn(name = "idEtiqueta")
    )
    private List<Etiqueta> etiquetas;

    // Getters and Setters
}

