package com.miaudote.controller;

import com.miaudote.model.Adotante;
import com.miaudote.model.Usuario;
import com.miaudote.repository.AdotanteRepository;
import com.miaudote.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/adotantes")
public class AdotanteController {

    @Autowired
    private AdotanteRepository adotanteRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @PostMapping
    public Adotante createAdotante(@RequestBody Adotante adotante) {
        // Salvar os dados básicos na coleção usuarios
        Usuario usuario = new Usuario(adotante.getNome(), adotante.getEmail(), adotante.getSenha());
        usuarioRepository.save(usuario);

        // Salvar os dados completos na coleção adotantes
        return adotanteRepository.save(adotante);
    }

    @GetMapping
    public List<Adotante> getAllAdotantes() {
        return adotanteRepository.findAll();
    }

    @GetMapping("/{id}")
    public Adotante getAdotanteById(@PathVariable String id) {
        Optional<Adotante> adotante = adotanteRepository.findById(id);
        return adotante.orElse(null);
    }

    @DeleteMapping("/{id}")
    public void deleteAdotante(@PathVariable String id) {
        adotanteRepository.deleteById(id);
    }
}
