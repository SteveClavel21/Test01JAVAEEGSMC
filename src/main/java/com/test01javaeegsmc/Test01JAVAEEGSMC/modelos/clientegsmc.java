package com.test01javaeegsmc.Test01JAVAEEGSMC.modelos;


import java.time.LocalDate;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class clientegsmc {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombregsmc;
    private String direcciongsmc;
    private LocalDate fechanacimientogsmc;
    private double sueldogsmc;
    private byte estatusgsmc;

    public clientegsmc() {
    }

    public clientegsmc(Long id, String nombregsmc, String direcciongsmc, LocalDate fechanacimientogsmc, double sueldogsmc, byte estatusgsmc) {
        this.id = id;
        this.nombregsmc = nombregsmc;
        this.direcciongsmc = direcciongsmc;
        this.fechanacimientogsmc = fechanacimientogsmc;
        this.sueldogsmc = sueldogsmc;
        this.estatusgsmc = estatusgsmc;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombregsmc() {
        return nombregsmc;
    }

    public void setNombregsmc(String nombregsmc) {
        this.nombregsmc = nombregsmc;
    }

    public String getDirecciongsmc() {
        return direcciongsmc;
    }

    public void setDirecciongsmc(String direcciongsmc) {
        this.direcciongsmc = direcciongsmc;
    }

    public LocalDate getFechanacimientogsmc() {
        return fechanacimientogsmc;
    }

    public void setFechanacimientogsmc(LocalDate fechanacimientogsmc) {
        this.fechanacimientogsmc = fechanacimientogsmc;
    }

    public double getSueldogsmc() {
        return sueldogsmc;
    }

    public void setSueldogsmc(double sueldogsmc) {
        this.sueldogsmc = sueldogsmc;
    }

    public byte getEstatusgsmc() {
        return estatusgsmc;
    }

    public void setEstatusgsmc(byte estatusgsmc) {
        this.estatusgsmc = estatusgsmc;
    }
}
