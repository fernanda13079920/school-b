package com.example.demo.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "usuario")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String password;

    @ManyToOne
    @JoinColumn(name = "personal_carnet", referencedColumnName = "carnet", nullable = true)
    private Personal personal; // Relación opcional con Personal

    @ManyToOne
    @JoinColumn(name = "rol_id", nullable = false)
    private Rol rol; // Relación muchos-a-uno con Rol

    public User() {
    }

    public User(String username, String password, Personal personal, Rol rol) {
        this.username = username;
        this.password = password;
        this.personal = personal;
        this.rol = rol;
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Personal getPersonal() {
        return personal;
    }

    public void setPersonal(Personal personal) {
        this.personal = personal;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", personal=" + (personal != null ? personal.getCarnet() : "null") +
                ", rol=" + (rol != null ? rol.getNombre() : "null") +
                '}';
    }
}
