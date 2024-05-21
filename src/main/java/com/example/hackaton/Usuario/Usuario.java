package com.example.hackaton.Usuario;
import javax.persistence.*;
import java.util.List;

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idUsuario;

    private String nombre;
    private String correoElectronico;
    private String contrasena;
    private String telefono;

    @OneToMany(mappedBy = "usuario")
    private List<Reserva> reservas;

    // Getters and Setters
}
