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

    public Integer getIdSalon() {
        return idSalon;
    }

    public void setIdSalon(Integer idSalon) {
        this.idSalon = idSalon;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Integer getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }

    public List<Etiqueta> getEtiquetas() {
        return etiquetas;
    }

    public void setEtiquetas(List<Etiqueta> etiquetas) {
        this.etiquetas = etiquetas;
    }
}

