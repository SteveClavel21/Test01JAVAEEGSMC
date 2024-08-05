package com.test01javaeegsmc.Test01JAVAEEGSMC.modelos;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class marcagsmc {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombregsmc;

    public marcagsmc() {

    }

    public marcagsmc(Long id, String nombregsmc) {
        this.id = id;
        this.nombregsmc = nombregsmc;
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
}
