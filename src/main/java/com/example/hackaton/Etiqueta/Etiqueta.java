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

    public Integer getIdEtiqueta() {
        return idEtiqueta;
    }

    public void setIdEtiqueta(Integer idEtiqueta) {
        this.idEtiqueta = idEtiqueta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Salon> getSalones() {
        return salones;
    }

    public void setSalones(List<Salon> salones) {
        this.salones = salones;
    }
}

