package com.miaudote.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "ongs")
public class Ong extends Usuario {

    private String cnpj;
    private String endereco;

    public Ong() {}

    public Ong(String nome, String email, String senha, String cnpj, String endereco) {
        super(nome, email, senha);
        this.cnpj = cnpj;
        this.endereco = endereco;
    }

    // Getters e Setters
    public String getCnpj() { return cnpj; }
    public void setCnpj(String cnpj) { this.cnpj = cnpj; }

    public String getEndereco() { return endereco; }
    public void setEndereco(String endereco) { this.endereco = endereco; }
}
