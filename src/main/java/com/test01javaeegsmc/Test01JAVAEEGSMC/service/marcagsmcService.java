package com.test01javaeegsmc.Test01JAVAEEGSMC.service;

import com.test01javaeegsmc.Test01JAVAEEGSMC.modelos.marcagsmc;
import com.test01javaeegsmc.Test01JAVAEEGSMC.repository.marcagsmcRepository;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class marcagsmcService {

    @Autowired
    private marcagsmcRepository marcagsmcRepository;

    public List<marcagsmc> listarTodas() {
        return marcagsmcRepository.findAll();
    }

    public marcagsmc guardar(marcagsmc marcagsmc) {
        return marcagsmcRepository.save(marcagsmc);
    }

    public marcagsmc obtenerPorId(Long id) {
        return marcagsmcRepository.findById(id).orElse(null);
    }

    public void eliminar(Long id) {
        marcagsmcRepository.deleteById(id);
    }

}
