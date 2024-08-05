package com.test01javaeegsmc.Test01JAVAEEGSMC.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test01javaeegsmc.Test01JAVAEEGSMC.modelos.categoriagsmc;
import com.test01javaeegsmc.Test01JAVAEEGSMC.service.categoriagsmcService;

@Controller
@RequestMapping("categoria")
public class categoriagsmcController {

    @Autowired
    private categoriagsmcService categoriagsmcService;

    @GetMapping
    public String listarCategoria(Model model) {
        model.addAttribute("categorias", categoriagsmcService.listarTodas());
        return "categorias/categoria-list";
    }

    @GetMapping("/nuevo")
    public String mostrarFormularioNuevaCategoria(Model model) {
        model.addAttribute("categoria", new categoriagsmc());
        return "categorias/categoria-form";
    }

    @PostMapping
    public String guardarCategoria(categoriagsmc categoriagsmc) {
        categoriagsmcService.guardar(categoriagsmc);
        return "redirect:/categoria";
    }

    @GetMapping("/editar/{id}")
    public String mostrarFormularioEditarCategoria(@PathVariable Long id, Model model) {
        model.addAttribute("categoria", categoriagsmcService.obtenerPorId(id));
        return "categorias/categoria-form";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminarCategoria(@PathVariable Long id) {
        categoriagsmcService.eliminar(id);
        return "redirect:/categoria";
    }

}
