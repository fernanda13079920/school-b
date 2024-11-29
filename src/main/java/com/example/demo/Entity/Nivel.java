package com.example.demo.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "nivel")
public class Nivel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    @ManyToOne
    @JoinColumn(name = "id_personal", referencedColumnName = "carnet", nullable = false)
    private Personal director; // Relación con Personal para el director del nivel

    public Nivel() {
    }

    public Nivel(String nombre, Personal director) {
        this.nombre = nombre;
        this.director = director;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Personal getDirector() {
        return director;
    }

    public void setDirector(Personal director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Nivel{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", director=" + (director != null ? director.getNombres() : "null") +
                '}';
    }
}
