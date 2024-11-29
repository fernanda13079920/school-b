package com.example.demo.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "curso")
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "nivel_id", nullable = false)
    private Nivel nivel;

    @ManyToOne
    @JoinColumn(name = "grado_id", nullable = false)
    private Grado grado;

    @ManyToOne
    @JoinColumn(name = "paralelo_id", nullable = false)
    private Paralelo paralelo;

    @ManyToOne
    @JoinColumn(name = "colegio_id", nullable = false)
    private Colegio colegio;

    @Column(nullable = false)
    private String turno; // Turno asignado al curso (ej. Mañana, Tarde)

    public Curso() {
    }

    public Curso(Nivel nivel, Grado grado, Paralelo paralelo, Colegio colegio, String turno) {
        this.nivel = nivel;
        this.grado = grado;
        this.paralelo = paralelo;
        this.colegio = colegio;
        this.turno = turno;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Nivel getNivel() {
        return nivel;
    }

    public void setNivel(Nivel nivel) {
        this.nivel = nivel;
    }

    public Grado getGrado() {
        return grado;
    }

    public void setGrado(Grado grado) {
        this.grado = grado;
    }

    public Paralelo getParalelo() {
        return paralelo;
    }

    public void setParalelo(Paralelo paralelo) {
        this.paralelo = paralelo;
    }

    public Colegio getColegio() {
        return colegio;
    }

    public void setColegio(Colegio colegio) {
        this.colegio = colegio;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "id=" + id +
                ", nivel=" + nivel +
                ", grado=" + grado +
                ", paralelo=" + paralelo +
                ", colegio=" + colegio +
                ", turno='" + turno + '\'' +
                '}';
    }
}
