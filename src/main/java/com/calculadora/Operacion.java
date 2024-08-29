package com.calculadora;

import java.util.Random;
import java.util.Scanner;

public class Operacion {

    Calculadora calculadora = new Calculadora();

    public Operacion() {
    }

    public double calcular(int opcion, int numero1, int numero2) {

        switch (opcion) {
            case 1:
                return calculadora.sumar(numero1, numero2);
            case 2:
                return calculadora.restar(numero1, numero2);
            case 3:
                return calculadora.multiplicar(numero1, numero2);
            case 4:
                return calculadora.dividir(numero1, numero2);
            case 5:
                return calculadora.potencia(numero1, numero2);
            case 6:
                //Se le pasa el numero1 ya que es el único número que se necesita para sacar la raiz cuadrada a ese numero
                //que se esta pasando como parametro al metodo.
                return calculadora.raizCuadrada(numero1);
            case 7:
                System.out.println("Gracias por usar la calculadora");
                System.exit(0);
            default:
                System.out.println("Opción no válida");
                System.exit(0);
        }
        return 0;
    }
}