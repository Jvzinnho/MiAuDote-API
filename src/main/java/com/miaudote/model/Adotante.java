package com.miaudote.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "adotantes")
public class Adotante extends Usuario {

    private String cpf;
    private String dataNascimento;

    public Adotante() {}

    public Adotante(String nome, String email, String senha, String cpf, String dataNascimento) {
        super(nome, email, senha);
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    // Getters e Setters
    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }

    public String getDataNascimento() { return dataNascimento; }
    public void setDataNascimento(String dataNascimento) { this.dataNascimento = dataNascimento; }
}
