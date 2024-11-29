
package com.example.demo.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "materia_nivel")
public class MateriaNivel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_materia", nullable = false)
    private Materia materia;

    @ManyToOne
    @JoinColumn(name = "id_nivel", nullable = false)
    private Nivel nivel;

    public MateriaNivel() {
    }

    public MateriaNivel(Materia materia, Nivel nivel) {
        this.materia = materia;
        this.nivel = nivel;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public Nivel getNivel() {
        return nivel;
    }

    public void setNivel(Nivel nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return "MateriaNivel{" +
                "id=" + id +
                ", materia=" + (materia != null ? materia.getNombre() : "null") +
                ", nivel=" + (nivel != null ? nivel.getNombre() : "null") +
                '}';
    }
}
