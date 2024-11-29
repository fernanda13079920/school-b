
package com.example.demo.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "horarios")
public class Horario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "curso_id", nullable = false)
    private Curso curso;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "docente_id", nullable = false)
    private Personal docente;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "materia_id", nullable = false)
    private Materia materia;

    @Column(nullable = false)
    private String dia; // Lunes, Martes, etc.

    @Column(nullable = false)
    private String horaInicio; // Formato HH:mm

    @Column(nullable = false)
    private String horaFin; // Formato HH:mm

    @Column(nullable = false)
    private Integer anio; // Año académico al que pertenece el horario

    @Column(nullable = false)
    private Boolean activo; // Define si el horario está vigente

    // Getters y Setters
}
