package com.miaudote.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "usuarios") // <-- ESSA LINHA É ESSENCIAL!
public class Usuario {

    @Id
    private String id;

    private String nome;
    private String email;
    private String senha;  // Adicionando o campo "senha"

    // Construtor sem parâmetros
    public Usuario() {
    }

    // Construtor com nome, email e senha
    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;  // Inicializando a senha
    }

    // Getter e Setter para o id
    public String getId() {
        return id;
    }

    // Getter e Setter para o nome
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter e Setter para o email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Getter e Setter para a senha
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
