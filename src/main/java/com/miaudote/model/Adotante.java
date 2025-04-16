package com.miaudote.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "adotantes")
public class Adotante extends Usuario {

    private String cpf;
    private String dataDeNascimento;

    public Adotante() {
    }

    public Adotante(String nome, String email, String senha, String cpf, String dataDeNascimento) {
        super(nome, email, senha); // Chama o construtor da classe pai e passa os parâmetros
        this.cpf = cpf;
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }
}
