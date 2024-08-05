package com.test01javaeegsmc.Test01JAVAEEGSMC.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test01javaeegsmc.Test01JAVAEEGSMC.modelos.marcagsmc;
import com.test01javaeegsmc.Test01JAVAEEGSMC.service.marcagsmcService;

@Controller
@RequestMapping("marca")
public class marcagsmcController {

    @Autowired
    private marcagsmcService marcagsmcService;

    @GetMapping
    public String listarMarcas(Model model) {
        model.addAttribute("marcas", marcagsmcService.listarTodas());
        return "marca/marca-list";
    }

    @GetMapping("/nuevo")
    public String mostrarFormularioNuevaMarca(Model model) {
        model.addAttribute("marca", new marcagsmc());
        return "marca/marca-form";
    }

    @PostMapping
    public String guardarMarca(marcagsmc marcagsmc) {
        marcagsmcService.guardar(marcagsmc);
        return "redirect:/marca";
    }

    @GetMapping("/editar/{id}")
    public String mostrarFormularioEditarMarca(@PathVariable Long id, Model model) {
        model.addAttribute("marca", marcagsmcService.obtenerPorId(id));
        return "marca/marca-form";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminarMarca(@PathVariable Long id) {
        marcagsmcService.eliminar(id);
        return "redirect:/marca";
    }
}