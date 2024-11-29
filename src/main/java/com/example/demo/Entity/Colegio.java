package com.example.demo.Entity;

import jakarta.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "colegio")
public class Colegio {
    @Id
    private Integer codigo;

    private String area;
    private String canton;
    private String ciudad;
    private Integer codigoDistrito;
    private String departamento;

    @Column(columnDefinition = "TEXT")
    private String descripcion;

    private String direccion;
    private String distrito;

    @Enumerated(EnumType.STRING)
    private EstadoEnum estado;

    private String nombre;
    private String provincia;
    private String seccionMunicipal;
    private String zona;

    @ManyToOne
    @JoinColumn(name = "id_director", referencedColumnName = "carnet")
    private Personal director; // Relación con Personal para el director

    @ManyToMany
    @JoinTable(
            name = "colegio_turno", // Nombre de la tabla intermedia
            joinColumns = @JoinColumn(name = "colegio_id"), // Columna que referencia a Colegio
            inverseJoinColumns = @JoinColumn(name = "turno_id") // Columna que referencia a Turno
    )
    private Set<Turno> turnos = new HashSet<>(); // Relación con Turno

    public Colegio() {
    }

    // Getters y Setters
    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCanton() {
        return canton;
    }

    public void setCanton(String canton) {
        this.canton = canton;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Integer getCodigoDistrito() {
        return codigoDistrito;
    }

    public void setCodigoDistrito(Integer codigoDistrito) {
        this.codigoDistrito = codigoDistrito;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public EstadoEnum getEstado() {
        return estado;
    }

    public void setEstado(EstadoEnum estado) {
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getSeccionMunicipal() {
        return seccionMunicipal;
    }

    public void setSeccionMunicipal(String seccionMunicipal) {
        this.seccionMunicipal = seccionMunicipal;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public Personal getDirector() {
        return director;
    }

    public void setDirector(Personal director) {
        this.director = director;
    }

    public Set<Turno> getTurnos() {
        return turnos;
    }

    public void setTurnos(Set<Turno> turnos) {
        this.turnos = turnos;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Colegio{");
        sb.append("codigo=").append(codigo);
        sb.append(", area='").append(area).append('\'');
        sb.append(", canton='").append(canton).append('\'');
        sb.append(", ciudad='").append(ciudad).append('\'');
        sb.append(", codigoDistrito=").append(codigoDistrito);
        sb.append(", departamento='").append(departamento).append('\'');
        sb.append(", descripcion='").append(descripcion).append('\'');
        sb.append(", direccion='").append(direccion).append('\'');
        sb.append(", distrito='").append(distrito).append('\'');
        sb.append(", estado=").append(estado);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", provincia='").append(provincia).append('\'');
        sb.append(", seccionMunicipal='").append(seccionMunicipal).append('\'');
        sb.append(", zona='").append(zona).append('\'');
        sb.append(", director=").append(director);
        sb.append(", turnos=").append(turnos);
        sb.append('}');
        return sb.toString();
    }

    public enum EstadoEnum {
        Abierta,
        Cerrada,
        Vacaciones_de_Fin_de_Año,
        Vacaciones_de_Invierno
    }
}
