package com.miaudote.controller;

import com.miaudote.model.Usuario;
import com.miaudote.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    // Criar ou atualizar usuário
    @PostMapping
    public Usuario createUser(@RequestBody Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    // Buscar todos os usuários
    @GetMapping
    public List<Usuario> getAllUsers() {
        return usuarioRepository.findAll();
    }

    // Buscar usuário por ID
    @GetMapping("/{id}")
    public Usuario getUserById(@PathVariable String id) {
        Optional<Usuario> usuario = usuarioRepository.findById(id);
        return usuario.orElse(null); // Retorna null se não encontrar
    }

    // Deletar usuário por ID
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable String id) {
        usuarioRepository.deleteById(id);
    }
}
