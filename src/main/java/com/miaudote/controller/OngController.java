package com.miaudote.controller;

import com.miaudote.model.Ong;
import com.miaudote.model.Usuario;
import com.miaudote.repository.OngRepository;
import com.miaudote.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/ongs")
public class OngController {

    @Autowired
    private OngRepository ongRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @PostMapping
    public Ong createOng(@RequestBody Ong ong) {
        // Salvar os dados básicos na coleção usuarios
        Usuario usuario = new Usuario(ong.getNome(), ong.getEmail(), ong.getSenha());
        usuarioRepository.save(usuario);

        // Salvar os dados completos na coleção ongs
        return ongRepository.save(ong);
    }

    @GetMapping
    public List<Ong> getAllOngs() {
        return ongRepository.findAll();
    }

    @GetMapping("/{id}")
    public Ong getOngById(@PathVariable String id) {
        Optional<Ong> ong = ongRepository.findById(id);
        return ong.orElse(null);
    }

    @DeleteMapping("/{id}")
    public void deleteOng(@PathVariable String id) {
        ongRepository.deleteById(id);
    }
}
