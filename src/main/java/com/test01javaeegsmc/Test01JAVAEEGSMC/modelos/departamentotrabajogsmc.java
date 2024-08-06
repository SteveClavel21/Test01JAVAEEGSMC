package com.test01javaeegsmc.Test01JAVAEEGSMC.modelos;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class departamentotrabajogsmc {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombregsmc;
    private String telefonogsmc;
    private String jefegsmc;

    public departamentotrabajogsmc() {
    }

    public departamentotrabajogsmc(Long id, String nombregsmc, String telefonogsmc, String jefegsmc) {
        this.id = id;
        this.nombregsmc = nombregsmc;
        this.telefonogsmc = telefonogsmc;
        this.jefegsmc = jefegsmc;
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

    public String getTelefonogsmc() {
        return telefonogsmc;
    }

    public void setTelefonogsmc(String telefonogsmc) {
        this.telefonogsmc = telefonogsmc;
    }

    public String getJefegsmc() {
        return jefegsmc;
    }

    public void setJefegsmc(String jefegsmc) {
        this.jefegsmc = jefegsmc;
    }


}
