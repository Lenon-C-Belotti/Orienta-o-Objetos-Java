package br.edu.unicesumar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("================================");
            System.out.println("       MENU DE EXERCICIOS");
            System.out.println("================================");
            System.out.println("1 - Pessoa - Exercicios 1 e 2");
            System.out.println("2 - Conta Bancaria - Exercicio 3");
            System.out.println("3 - Funcionario - Exercicio 4");
            System.out.println("4 - Aluno - Exercicio 5");
            System.out.println("5 - Produto - Exercicio 6");
            System.out.println("6 - Livro - Exercicio 7");
            System.out.println("7 - Termostato - Exercicio 8");
            System.out.println("8 - Usuario - Exercicio 9");
            System.out.println("9 - Carro - Exercicio 10");
            System.out.println("0 - Sair");
            System.out.println("================================");
            System.out.print("Escolha uma opcao: ");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                case 1:
                    exercicio1e2(sc);
                    break;

                case 2:
                    exercicio3(sc);
                    break;

                case 3:
                    exercicio4(sc);
                    break;

                case 4:
                    exercicio5(sc);
                    break;

                case 5:
                    exercicio6(sc);
                    break;

                case 6:
                    exercicio7(sc);
                    break;

                case 7:
                    exercicio8(sc);
                    break;

                case 8:
                    exercicio9(sc);
                    break;

                case 9:
                    exercicio10(sc);
                    break;

                case 0:
                    System.out.println("Programa encerrado!");
                    break;

                default:
                    System.out.println("Opcao invalida!");
            }

            if (opcao != 0) {
                System.out.println("\nPressione ENTER para voltar ao menu...");
                sc.nextLine();
            }

        } while (opcao != 0);

        sc.close();
    }

    //---------------------------------------

    public static void exercicio1e2(Scanner sc) {
        Pessoa pessoa = new Pessoa();

        System.out.print("Digite seu nome: ");
        pessoa.setNome(sc.nextLine());

        int idade;

        do {
            System.out.print("Digite sua idade: ");
            idade = sc.nextInt();
            sc.nextLine();

            pessoa.setIdade(idade);

        } while (idade <= 0);

        System.out.println("\nDados da pessoa:");
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
    }

    //---------------------------------------

    public static void exercicio3(Scanner sc) {
        ContaBancaria conta = new ContaBancaria();

        System.out.print("Digite o nome do titular: ");
        conta.setTitular(sc.nextLine());

        System.out.print("Digite o numero da conta: ");
        conta.setNumeroConta(sc.nextInt());

        System.out.print("Digite o valor para depositar: ");
        double deposito = sc.nextDouble();
        conta.depositar(deposito);

        System.out.print("Digite o valor para sacar: ");
        double saque = sc.nextDouble();
        conta.sacar(saque);

        System.out.println("\nDados da conta:");
        System.out.println("Titular: " + conta.getTitular());
        System.out.println("Numero da conta: " + conta.getNumeroConta());
        System.out.println("Saldo: R$ " + conta.getSaldo());

        sc.nextLine();
    }

    //---------------------------------------

    public static void exercicio4(Scanner sc) {
        Funcionario funcionario = new Funcionario();

        System.out.print("Digite o nome: ");
        funcionario.setNome(sc.nextLine());

        System.out.print("Digite o cargo: ");
        funcionario.setCargo(sc.nextLine());

        System.out.print("Digite o salario: ");
        double salario = sc.nextDouble();
        sc.nextLine();

        funcionario.setSalario(salario);

        System.out.println("\nDados do funcionario:");
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Cargo: " + funcionario.getCargo());
        System.out.println("Salario: R$ " + funcionario.getSalario());
    }

    //---------------------------------------

    public static void exercicio5(Scanner sc) {
        Aluno aluno = new Aluno();

        System.out.print("Digite o nome do aluno: ");
        aluno.setNome(sc.nextLine());

        System.out.print("Digite a nota 1: ");
        double nota1 = sc.nextDouble();
        aluno.setNota1(nota1);

        System.out.print("Digite a nota 2: ");
        double nota2 = sc.nextDouble();
        aluno.setNota2(nota2);

        sc.nextLine();

        System.out.println("\nDados do aluno:");
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Nota 1: " + aluno.getNota1());
        System.out.println("Nota 2: " + aluno.getNota2());
    }

    //---------------------------------------

    public static void exercicio6(Scanner sc) {
        Produto produto = new Produto();

        System.out.print("Digite o nome do produto: ");
        produto.setNome(sc.nextLine());

        System.out.print("Digite o preco do produto: ");
        double preco = sc.nextDouble();
        sc.nextLine();

        produto.setPreco(preco);

        System.out.println("\nDados do produto:");
        System.out.println("Nome: " + produto.getNome());
        System.out.println("Preco: R$ " + produto.getPreco());
    }

    //---------------------------------------

    public static void exercicio7(Scanner sc) {
        Livro livro = new Livro();

        System.out.print("Digite o titulo do livro: ");
        livro.setTitulo(sc.nextLine());

        System.out.print("Digite o autor do livro: ");
        livro.setAutor(sc.nextLine());

        System.out.println("\nLivro cadastrado!");
        System.out.println("Titulo: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutor());
        System.out.println("Disponivel: " + livro.getDisponivel());

        System.out.println("\nEmprestando o livro...");
        livro.emprestar();
        System.out.println("Disponivel: " + livro.getDisponivel());

        System.out.println("\nDevolvendo o livro...");
        livro.devolver();
        System.out.println("Disponivel: " + livro.getDisponivel());
    }

    //---------------------------------------

    public static void exercicio8(Scanner sc) {
        Termostato termostato = new Termostato();

        System.out.print("Digite a temperatura atual: ");
        double temperaturaAtual = sc.nextDouble();
        termostato.setTemperaturaAtual(temperaturaAtual);

        System.out.print("Digite a temperatura desejada: ");
        double temperaturaDesejada = sc.nextDouble();
        sc.nextLine();

        termostato.setTemperaturaDesejada(temperaturaDesejada);

        System.out.println("\nDados do termostato:");
        System.out.println("Temperatura atual: " + termostato.getTemperaturaAtual() + " C");
        System.out.println("Temperatura desejada: " + termostato.getTemperaturaDesejada() + " C");
    }

    //---------------------------------------

    public static void exercicio9(Scanner sc) {
        Usuario usuario = new Usuario();

        System.out.print("Digite seu nome: ");
        usuario.setNome(sc.nextLine());

        System.out.print("Digite sua senha: ");
        String senha = sc.nextLine();

        usuario.setSenha(senha);

        System.out.println("\nDados do usuario:");
        System.out.println("Nome: " + usuario.getNome());
        System.out.println("Senha: " + usuario.getSenha());
    }

    //---------------------------------------

    public static void exercicio10(Scanner sc) {
        Carro carro = new Carro();

        System.out.print("Digite a marca do carro: ");
        carro.setMarca(sc.nextLine());

        System.out.print("Digite o modelo do carro: ");
        carro.setModelo(sc.nextLine());

        System.out.print("Digite quanto deseja acelerar: ");
        int incremento = sc.nextInt();
        carro.acelerar(incremento);

        System.out.println("\nDados do carro:");
        System.out.println("Marca: " + carro.getMarca());
        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Velocidade atual: " + carro.getVelocidadeAtual() + " km/h");

        System.out.print("\nDigite quanto deseja frear: ");
        int decremento = sc.nextInt();
        carro.frear(decremento);

        System.out.println("Velocidade atual: " + carro.getVelocidadeAtual() + " km/h");

        sc.nextLine();
    }
}
