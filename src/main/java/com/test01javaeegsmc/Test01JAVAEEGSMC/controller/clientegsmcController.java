package com.test01javaeegsmc.Test01JAVAEEGSMC.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test01javaeegsmc.Test01JAVAEEGSMC.modelos.clientegsmc;
import com.test01javaeegsmc.Test01JAVAEEGSMC.service.clientegsmcService;

@Controller
@RequestMapping("cliente")
public class clientegsmcController {

    @Autowired
    private clientegsmcService clientegsmcService;

    @GetMapping
    public String listarCliente(Model model) {
        model.addAttribute("cliente", clientegsmcService.listarTodas());
        return "cliente/cliente-list";
    }

    @GetMapping("/nuevo")
    public String mostrarFormularioNuevoCliente(Model model) {
        model.addAttribute("cliente", new clientegsmc());
        return "cliente/cliente-form";
    }

    @PostMapping
    public String guardarCliente(clientegsmc clientegsmc) {
        clientegsmcService.guardar(clientegsmc);
        return "redirect:/cliente";
    }

    @GetMapping("/editar/{id}")
    public String mostrarFormularioEditarCliente(@PathVariable Long id, Model model) {
        model.addAttribute("cliente", clientegsmcService.obtenerPorId(id));
        return "cliente/cliente-form";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminarCliente(@PathVariable Long id) {
        clientegsmcService.eliminar(id);
        return "redirect:/cliente";
    }
}
