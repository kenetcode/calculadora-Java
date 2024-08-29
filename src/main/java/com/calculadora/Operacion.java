package com.calculadora;
import java.util.Random;
import java.util.Scanner;

public class Operacion {

    private int opcion;

    Calculadora calculadora = new Calculadora();
    Numero numero1 = new Numero();
    Numero numero2 = new Numero();

    public Operacion(){
    }

    private double operacionCalculadora(){
        
        switch (opcion){
            case 1:
                return calculadora.sumar(numero1.getNumero(), numero2.getNumero());
            case 2:
                return calculadora.restar(numero1.getNumero(), numero2.getNumero());
            case 3:
                return calculadora.multiplicar(numero1.getNumero(), numero2.getNumero());
            case 4:
                return calculadora.dividir(numero1.getNumero(), numero2.getNumero());
            case 5:
                return calculadora.potencia(numero1.getNumero(), numero2.getNumero());
            case 6:
                return calculadora.raizCuadrada(numero1.getNumero());
            case 7:
                System.out.println("Gracias por usar la calculadora");
                System.exit(0);
            default:
                System.out.println("Opción no válida");
                System.exit(0);
        }
        return 0;
    }

    //Menu que se muestra al usuario para que seleccione la operación que desea realizar
    public void menu(){
        System.out.println("Seleccione la operación que desea realizar:");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Potencia");
        System.out.println("6. Raiz cuadrada");
        System.out.println("7. Salir");
        System.out.println("Por favor ingrese el numero de la operacion que desea realizar: \n");
    }


}
