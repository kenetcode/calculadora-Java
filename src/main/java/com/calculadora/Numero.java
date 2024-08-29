package com.calculadora;

public class Numero {

    private int numero;

    public Numero(){
    }

    public Numero(int numero){
        this.numero = numero;
    }

    int getNumero() {
        return numero;
    }
    int setNumero(int numero){
        this.numero = numero;
        return numero;
    }
}
