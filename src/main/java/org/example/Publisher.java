package org.example;

public class Publisher {

    private String nome;
    private String pais;

    public Publisher(String nome, String pais) {
        this.nome = nome;
        this.pais = pais;
    }

    public String getNome() {
        return nome;
    }

    public String getPais() {
        return pais;
    }
}
