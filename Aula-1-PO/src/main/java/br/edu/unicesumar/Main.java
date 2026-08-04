package br.edu.unicesumar;

import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Olá Mundo");

        System.out.printf("Digite algo: ");
        int numeroDigitado = leitor.nextInt();

        if (numeroDigitado > 0){
            System.out.printf("Positivo");
        }else {
            System.out.printf("Negativo");
        }

    }





}