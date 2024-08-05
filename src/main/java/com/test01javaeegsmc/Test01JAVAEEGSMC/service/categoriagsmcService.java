package com.test01javaeegsmc.Test01JAVAEEGSMC.service;

import com.test01javaeegsmc.Test01JAVAEEGSMC.modelos.categoriagsmc;

import com.test01javaeegsmc.Test01JAVAEEGSMC.repository.categoriagsmcRepository;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class categoriagsmcService {
    @Autowired
    private categoriagsmcRepository categoriagsmcRepository;

    public List<categoriagsmc> listarTodas() {
        return categoriagsmcRepository.findAll();
    }

    public categoriagsmc guardar(categoriagsmc categoriagsmc) {
        return categoriagsmcRepository.save(categoriagsmc);
    }

    public categoriagsmc obtenerPorId(Long id) {
        return categoriagsmcRepository.findById(id).orElse(null);
    }

    public void eliminar(Long id) {
        categoriagsmcRepository.deleteById(id);
    }
}
