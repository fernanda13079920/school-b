
package com.example.demo.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "asignacion_aulas")
public class AsignacionAula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "curso_id", nullable = false)
    private Curso curso;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "aula_id", nullable = false)
    private Aula aula;

    @Column(nullable = false)
    private Integer anio; // Año académico al que pertenece la asignación

    @Column(nullable = false)
    private Boolean activo; // Define si la asignación está vigente

    // Getters y Setters
}
