package com.miaudote.controller;

import com.miaudote.model.Ong;
import com.miaudote.repository.OngRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/ongs")
public class OngController {

    @Autowired
    private OngRepository ongRepository;

    // Criar ou atualizar ONG
    @PostMapping
    public Ong createOng(@RequestBody Ong ong) {
        return ongRepository.save(ong);
    }

    // Buscar todas as ONGs
    @GetMapping
    public List<Ong> getAllOngs() {
        return ongRepository.findAll();
    }

    // Buscar ONG por ID
    @GetMapping("/{id}")
    public Ong getOngById(@PathVariable String id) {
        Optional<Ong> ong = ongRepository.findById(id);
        return ong.orElse(null); // Retorna null se não encontrar
    }

    // Deletar ONG por ID
    @DeleteMapping("/{id}")
    public void deleteOng(@PathVariable String id) {
        ongRepository.deleteById(id);
    }
}
