package com.miaudote.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "formularioAdocao")
public class FormularioAdocao {

    @Id
    private String id;
    private String idAdotante;
    private String resposta1;
    private String respostaONG;
    private String nomeAdotante;
    private String nomeOng;

    // Getters e Setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdAdotante() {
        return idAdotante;
    }

    public void setIdAdotante(String idAdotante) {
        this.idAdotante = idAdotante;
    }

    public String getResposta1() {
        return resposta1;
    }

    public void setResposta1(String resposta1) {
        this.resposta1 = resposta1;
    }

    public String getRespostaONG() {
        return respostaONG;
    }

    public void setRespostaONG(String respostaONG) {
        this.respostaONG = respostaONG;
    }

    public String getNomeAdotante() {
        return nomeAdotante;
    }

    public void setNomeAdotante(String nomeAdotante) {
        this.nomeAdotante = nomeAdotante;
    }

    public String getNomeOng() {
        return nomeOng;
    }

    public void setNomeOng(String nomeOng) {
        this.nomeOng = nomeOng;
    }
}
