package com.miaudote.controller;

import com.miaudote.model.Adotante;
import com.miaudote.repository.AdotanteRepository;
import com.miaudote.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/adotantes")
public class AdotanteController {

    @Autowired
    private AdotanteRepository adotanteRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @PostMapping
    public Adotante criarAdotante(@RequestBody Adotante adotante) {
        usuarioRepository.save(adotante);
        return adotanteRepository.save(adotante);
    }

    @GetMapping
    public List<Adotante> listarAdotantes() {
        return adotanteRepository.findAll();
    }
}
