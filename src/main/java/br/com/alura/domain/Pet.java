package br.com.alura.domain;

public class Pet {
    private String tipo;
    private String nome;
    private int idade;
    private double peso;
    private String raca;
    private String cor;

    public Pet(String tipo, String nome, int idade, double peso, String raca, String cor) {
        this.tipo = tipo;
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.raca = raca;
        this.cor = cor;
    }

    public String getTipo() {
        return tipo;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getPeso() {
        return peso;
    }

    public String getRaca() {
        return raca;
    }

    public String getCor() {
        return cor;
    }
}
