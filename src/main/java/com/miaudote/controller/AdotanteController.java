package com.miaudote.controller;

import com.miaudote.model.Adotante;
import com.miaudote.repository.AdotanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/adotantes")
public class AdotanteController {

    @Autowired
    private AdotanteRepository adotanteRepository;

    // Criar ou atualizar adotante
    @PostMapping
    public Adotante createAdotante(@RequestBody Adotante adotante) {
        return adotanteRepository.save(adotante);
    }

    // Buscar todos os adotantes
    @GetMapping
    public List<Adotante> getAllAdotantes() {
        return adotanteRepository.findAll();
    }

    // Buscar adotante por ID
    @GetMapping("/{id}")
    public Adotante getAdotanteById(@PathVariable String id) {
        Optional<Adotante> adotante = adotanteRepository.findById(id);
        return adotante.orElse(null); // Retorna null se não encontrar
    }

    // Deletar adotante por ID
    @DeleteMapping("/{id}")
    public void deleteAdotante(@PathVariable String id) {
        adotanteRepository.deleteById(id);
    }
}
