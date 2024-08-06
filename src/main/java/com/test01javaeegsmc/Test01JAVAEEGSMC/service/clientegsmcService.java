package com.test01javaeegsmc.Test01JAVAEEGSMC.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test01javaeegsmc.Test01JAVAEEGSMC.modelos.clientegsmc;
import com.test01javaeegsmc.Test01JAVAEEGSMC.repository.clientegsmcRepository;

@Service
public class clientegsmcService {

    @Autowired
    private clientegsmcRepository clientegsmcRepository;

    public List<clientegsmc> listarTodas() {
        return clientegsmcRepository.findAll();
    }

    public clientegsmc guardar(clientegsmc clientegsmc) {
        return clientegsmcRepository.save(clientegsmc);
    }

    public clientegsmc obtenerPorId(Long id) {
        return clientegsmcRepository.findById(id).orElse(null);
    }

    public void eliminar(Long id) {
        clientegsmcRepository.deleteById(id);
    }
}
