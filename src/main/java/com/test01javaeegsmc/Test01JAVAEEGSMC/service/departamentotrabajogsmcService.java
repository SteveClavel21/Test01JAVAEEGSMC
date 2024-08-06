package com.test01javaeegsmc.Test01JAVAEEGSMC.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test01javaeegsmc.Test01JAVAEEGSMC.modelos.departamentotrabajogsmc;
import com.test01javaeegsmc.Test01JAVAEEGSMC.repository.departamentotrabajogsmcRepository;

@Service
public class departamentotrabajogsmcService {

    @Autowired
    private departamentotrabajogsmcRepository dep;

    public List<departamentotrabajogsmc> listarTodas() {
        return dep.findAll();
    }

    public departamentotrabajogsmc guardar(departamentotrabajogsmc departamentotrabajogsmc) {
        return dep.save(departamentotrabajogsmc);
    }

    public departamentotrabajogsmc obtenerPorId(Long id) {
        return dep.findById(id).orElse(null);
    }

    public void eliminar(Long id) {
        dep.deleteById(id);
    }
}
