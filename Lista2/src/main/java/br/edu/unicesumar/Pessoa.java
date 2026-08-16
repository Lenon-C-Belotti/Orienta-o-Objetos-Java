package br.edu.unicesumar;

public class Pessoa {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade > 16) {
            this.idade = idade;
        } else {
            System.out.println("Erro: a idade deve ser maior que zero.");
        }
    }
}