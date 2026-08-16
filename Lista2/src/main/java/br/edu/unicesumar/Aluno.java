package br.edu.unicesumar;

public class Aluno {
    private String nome;
    private double nota1;
    private double nota2;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota) {
        if (nota >= 0 && nota <= 10) {
            this.nota1 = nota;
        } else {
            System.out.println("Erro: a nota deve estar entre 0 e 10!");
        }
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota) {
        if (nota >= 0 && nota <= 10) {
            this.nota2 = nota;
        } else {
            System.out.println("Erro: a nota deve estar entre 0 e 10!");
        }
    }
}
