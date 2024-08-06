package com.test01javaeegsmc.Test01JAVAEEGSMC.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test01javaeegsmc.Test01JAVAEEGSMC.modelos.departamentotrabajogsmc;
import com.test01javaeegsmc.Test01JAVAEEGSMC.service.departamentotrabajogsmcService;

@Controller
@RequestMapping("departamento")
public class departamentotrabajogsmcController {

    @Autowired
    private departamentotrabajogsmcService departamentotrabajogsmcService;

    @GetMapping
    public String listarDepertamento(Model model) {
        model.addAttribute("departamento", departamentotrabajogsmcService.listarTodas());
        return "departamento/departamento-list";
    }

    @GetMapping("/nuevo")
    public String mostrarFormularioNuoDepartamento(Model model) {
        model.addAttribute("departamento", new departamentotrabajogsmc());
        return "departamento/departamento-form";
    }

    @PostMapping
    public String guardardepartamento(departamentotrabajogsmc departamentooucr) {
        departamentotrabajogsmcService.guardar(departamentooucr);
        return "redirect:/departamento";
    }

    @GetMapping("/editar/{id}")
    public String mostrarFormularioEditardepartamento(@PathVariable Long id, Model model) {
        model.addAttribute("departamento", departamentotrabajogsmcService.obtenerPorId(id));
        return "departamento/departamento-form";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminardepartamento(@PathVariable Long id) {
        departamentotrabajogsmcService.eliminar(id);
        return "redirect:/departamento";
    }
}
