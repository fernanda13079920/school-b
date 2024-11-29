package com.example.demo.Entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "personal")
public class Personal {

    @Id
    private Integer carnet;

    @ManyToOne
    @JoinColumn(name = "id_financiamiento", referencedColumnName = "id")
    private Financiamiento financiamiento;

    @ManyToOne
    @JoinColumn(name = "id_funcion", referencedColumnName = "id")
    private Funcion funcion;

    @ManyToOne
    @JoinColumn(name = "id_formacion", referencedColumnName = "id")
    private Formacion formacion;

    private String apellidoMaterno;
    private String apellidoPaterno;
    private Boolean braile = false;
    private String complemento;
    private String correo;
    private String denominativo;
    private String direccionDomiciliaria;
    private Boolean extranjero = false;

    @Column(name = "fecha_nacimiento", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fechaNacimiento;

    @Enumerated(EnumType.STRING)
    private GeneroEnum genero;
    private String nombres;
    private Boolean normalista = false;
    private Integer nroCelular;
    private Integer nroItem;
    private Integer rda;

    public Personal() {
    }

    // Getters y setters...


    @Override
    public String toString() {
        return "Personal{" +
                "carnet=" + carnet +
                ", financiamiento=" + financiamiento +
                ", funcion=" + funcion +
                ", formacion=" + formacion +
                ", apellidoMaterno='" + apellidoMaterno + '\'' +
                ", apellidoPaterno='" + apellidoPaterno + '\'' +
                ", braile=" + braile +
                ", complemento='" + complemento + '\'' +
                ", correo='" + correo + '\'' +
                ", denominativo='" + denominativo + '\'' +
                ", direccionDomiciliaria='" + direccionDomiciliaria + '\'' +
                ", extranjero=" + extranjero +
                ", fechaNacimiento=" + fechaNacimiento +
                ", genero=" + genero +
                ", nombres='" + nombres + '\'' +
                ", normalista=" + normalista +
                ", nroCelular=" + nroCelular +
                ", nroItem=" + nroItem +
                ", rda=" + rda +
                '}';
    }

    public Integer getCarnet() {
        return carnet;
    }

    public String getNombres() {
        return nombres;
    }

    public enum GeneroEnum {
        Masculino,
        Femenino
    }
}
