package com.miaudote.controller;

import com.miaudote.model.FormularioAdocao;
import com.miaudote.repository.FormularioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/formularios")
public class FormularioController {

    @Autowired
    private FormularioRepository formularioRepository;

    @PostMapping
    public FormularioAdocao createFormulario(@RequestBody FormularioAdocao formulario) {
        return formularioRepository.save(formulario);
    }

    @GetMapping
    public List<FormularioAdocao> getAllFormularios() {
        return formularioRepository.findAll();
    }

    @GetMapping("/{id}")
    public FormularioAdocao getFormularioById(@PathVariable String id) {
        return formularioRepository.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public FormularioAdocao updateFormulario(@PathVariable String id, @RequestBody FormularioAdocao updatedFormulario) {
        updatedFormulario.setId(id);
        return formularioRepository.save(updatedFormulario);
    }

    @DeleteMapping("/{id}")
    public void deleteFormulario(@PathVariable String id) {
        formularioRepository.deleteById(id);
    }
}
