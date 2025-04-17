package com.miaudote.dto;

public class UsuarioDTO {
    private String id;
    private String nome;
    private String email;
    private String senha;

    public UsuarioDTO(String id, String nome, String email, String senha) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    // Getters
    public String getId() { return id; }
    public String getNome() { return nome; }
    public String getEmail() { return email; }
    public String getSenha() { return senha; }
}
