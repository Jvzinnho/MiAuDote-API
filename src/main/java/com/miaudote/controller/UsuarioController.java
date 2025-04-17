package com.miaudote.controller;

import com.miaudote.dto.UsuarioDTO;
import com.miaudote.model.Usuario;
import com.miaudote.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping
    public List<UsuarioDTO> listarUsuarios() {
        return usuarioRepository.findAll().stream()
                .map(u -> new UsuarioDTO(u.getId(), u.getNome(), u.getEmail(), u.getSenha()))
                .collect(Collectors.toList());
    }
}
