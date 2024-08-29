package com.calculadora;

public class Calculadora {

    public Calculadora() {
    }

    // Método para sumar dos números
    public int sumar(int num1, int num2) {
        return num1 + num2;
    }

    //Metodo para restar dos números
    public int restar(int num1, int num2) {
        return num1 - num2;
    }

    //Metodo para multiplicar dos números
    public int multiplicar(int num1, int num2) {
        return num1 * num2;
    }

    //metodo para dividir dos números
    public int dividir(int num1, int num2) {
        return num1 / num2;
    }

    //metodo para realizar una potencia
    //num1 es la base y num2 es el exponente
    public int potencia(int num1, int num2) {
        return (int) Math.pow(num1, num2);
    }

    //metodo para realizar una raiz cuadrada
    //num1 es el número al que se le va a sacar la raiz cuadrada
    public double raizCuadrada(int num1) {
        return Math.sqrt(num1);
    }
}
