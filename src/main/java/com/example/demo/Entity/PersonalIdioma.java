package com.example.demo.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "personal_idioma")
public class PersonalIdioma {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_personal", nullable = false)
    private Personal personal;

    @ManyToOne
    @JoinColumn(name = "id_idioma", nullable = false)
    private Idioma idioma;

    @Enumerated(EnumType.STRING)
    private EstadoEnumB estadoEscribe;

    @Enumerated(EnumType.STRING)
    private EstadoEnumB estadoHabla;

    @Enumerated(EnumType.STRING)
    private EstadoEnumB estadoLee;

    public PersonalIdioma() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Personal getPersonal() {
        return personal;
    }

    public void setPersonal(Personal personal) {
        this.personal = personal;
    }

    public Idioma getIdioma() {
        return idioma;
    }

    public void setIdioma(Idioma idioma) {
        this.idioma = idioma;
    }

    public EstadoEnumB getEstadoEscribe() {
        return estadoEscribe;
    }

    public void setEstadoEscribe(EstadoEnumB estadoEscribe) {
        this.estadoEscribe = estadoEscribe;
    }

    public EstadoEnumB getEstadoHabla() {
        return estadoHabla;
    }

    public void setEstadoHabla(EstadoEnumB estadoHabla) {
        this.estadoHabla = estadoHabla;
    }

    public EstadoEnumB getEstadoLee() {
        return estadoLee;
    }

    public void setEstadoLee(EstadoEnumB estadoLee) {
        this.estadoLee = estadoLee;
    }

    public enum EstadoEnumB {
        Muy_Bien,
        Bien,
        Mal,
        No
    }
}
