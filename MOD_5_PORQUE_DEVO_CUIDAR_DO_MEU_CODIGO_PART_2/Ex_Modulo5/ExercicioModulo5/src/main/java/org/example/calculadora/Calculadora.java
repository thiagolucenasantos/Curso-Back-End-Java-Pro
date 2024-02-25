package org.example.calculadora;

public class Calculadora {
    private int adicionar;
    private int subtrair;
    private int multiplicar;

    private int dividir;



    public int getAdicionar(int a, int b) {
        return a + b;
    }

    public int getSubtrair(int a, int b) {
        return a - b;
    }

    public int getMultiplicar(int a, int b) {
        return a * b;
    }

    public int getDividir(int a, int b) throws IllegalAccessException {
        if (b == 0){
            throw new IllegalAccessException("Divisão não pode ser por zero");
        }
        return a / b;
    }
}
