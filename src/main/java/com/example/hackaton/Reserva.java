package com.example.hackaton;

import com.example.hackaton.Salon.Salon;
import com.example.hackaton.Usuario.Usuario;
import jakarta.persistence.*;


import java.util.Date;
import java.util.List;

@Entity
public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idReserva;

    private Date fecha;
    private String horaInicio;
    private String horaFin;

    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "idSalon")
    private Salon salon;

    // Getters and Setters
}
