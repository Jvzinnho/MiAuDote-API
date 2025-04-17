package com.miaudote.controller;

import com.miaudote.model.Ong;
import com.miaudote.repository.OngRepository;
import com.miaudote.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ongs")
public class OngController {

    @Autowired
    private OngRepository ongRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @PostMapping
    public Ong criarOng(@RequestBody Ong ong) {
        usuarioRepository.save(ong);
        return ongRepository.save(ong);
    }

    @GetMapping
    public List<Ong> listarOngs() {
        return ongRepository.findAll();
    }
}
