package com.test01javaeegsmc.Test01JAVAEEGSMC.modelos;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class categoriagsmc {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombregsmc;
    private String descripciongsmc;

    public categoriagsmc() {
    }

    public categoriagsmc(Long id, String nombregsmc, String descripciongsmc) {
        this.id = id;
        this.nombregsmc = nombregsmc;
        this.descripciongsmc = descripciongsmc;
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

    public String getDescripciongsmc() {
        return descripciongsmc;
    }

    public void setDescripciongsmc(String descripciongsmc) {
        this.descripciongsmc = descripciongsmc;
    }
}
