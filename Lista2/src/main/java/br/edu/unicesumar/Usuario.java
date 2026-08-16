package br.edu.unicesumar;

public class Usuario {
    private String nome;
    private String senha;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        if (senha.length() >= 8) {
            this.senha = senha;
        } else {
            System.out.println("Erro: a senha deve ter pelo menos 8 caracteres!");
        }
    }
}
