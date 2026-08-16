package br.edu.unicesumar;
public class Carro {
    private String marca;
    private String modelo;
    private int velocidadeAtual;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void acelerar(int incremento) {
        if (incremento > 0) {
            if (velocidadeAtual + incremento <= 180) {
                velocidadeAtual += incremento;
            } else {
                velocidadeAtual = 180;
                System.out.println("A velocidade maxima de 180 km/h foi atingida!");
            }
        } else {
            System.out.println("Erro: o incremento deve ser positivo!");
        }
    }

    public void frear(int decremento) {
        if (decremento > 0) {
            if (velocidadeAtual - decremento >= 0) {
                velocidadeAtual -= decremento;
            } else {
                velocidadeAtual = 0;
                System.out.println("O carro parou!");
            }
        } else {
            System.out.println("Erro: o decremento deve ser positivo!");
        }
    }
}
