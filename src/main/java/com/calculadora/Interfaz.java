package com.calculadora;

import java.util.Scanner;

public class Interfaz {
    //Se crea un objeto de la clase Scanner para poder leer la entrada del usuario
    Scanner scanner = new Scanner(System.in);
    //Se crean los objetos de las clases Numero y Operacion
    Numero numero1 = new Numero();
    Numero numero2 = new Numero();
    Operacion operacion = new Operacion();
    //Se inicializan las variables opcion, resultado y continuar
    int opcion = 0;
    double resultado = 0;
    int continuar = 0;

    public Interfaz() {
    }

    //Menu que se muestra al usuario para que seleccione la operación que desea realizar
    public void menu() {
        System.out.println("Bienvenido a la calculadora");
        do {
            //se muestra el menú al usuario
            System.out.println("Por favor elija la operación que desea realizar:");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Potencia");
            System.out.println("6. Raiz cuadrada");
            System.out.println("7. Salir");
            System.out.println("Por favor ingrese el numero de la operacion que desea realizar: ");
            //Se valida que el usuario ingrese un número entre 1 y 7
            opcion = 0; //Se inicializa la variable opcion en 0
            while (opcion < 1 || opcion > 7) {
                //Se valida que el usuario ingrese un número
                try {
                    opcion = scanner.nextInt();
                    if (opcion < 1 || opcion > 7) {
                        System.out.println("Por favor ingrese un número entre 1 y 7");
                        opcion = 0;
                    }
                    //se captura la excepción en caso de que el usuario ingrese un valor diferente a un número
                } catch (Exception e) {
                    System.out.println("Por favor ingrese un número válido");
                    //La linea siguiente se utiliza para consumir la linea de entrada incorrecta de scanner del usuario
                    scanner.nextLine();
                    opcion = 0;
                }
            }
            //Si la opción seleccionada es diferente de 4, 5, 6 y 7 se le pide al usuario que ingrese los números
            //para realizar la operación seleccionada
            if (opcion != 4 && opcion != 5 && opcion != 6 && opcion != 7) {
                if (opcion == 1) {
                    System.out.println("Ha seleccionado la opción de sumar");
                } else if (opcion == 2) {
                    System.out.println("Ha seleccionado la opción de restar");
                } else {
                    System.out.println("Ha seleccionado la opción de multiplicar");
                }
                //Se le pide al usuario que ingrese los números para realizar la operación
                System.out.println("Por favor ingrese el primer número: ");
                numero1.setNumero(pedirNumero());
                System.out.println("Por favor ingrese el segundo número: ");
                numero2.setNumero(pedirNumero());
                //Se le pasa los números ingresados por el usuario a la clase Operacion para realizar la operación seleccionada
                resultado = operacion.calcular(opcion, numero1.getNumero(), numero2.getNumero());
                //Se muestra el resultado de la operación
                System.out.println("El resultado de la operación es: " + resultado);
                //Se le pregunta al usuario si desea realizar otra operación
                continuar = continuar();
            } else if (opcion == 4) {
                //Si la opción seleccionada es 4 se le pide al usuario que ingrese el dividendo y el divisor
                System.out.println("Ha seleccionado la opción de dividir");
                System.out.println("Por favor ingrese el dividendo: ");
                numero1.setNumero(pedirNumero());
                System.out.println("Por favor ingrese el divisor: ");
                numero2.setNumero(pedirNumero());
                //Se valida que el divisor sea diferente de 0
                if (numero2.getNumero() == 0) {
                    while (numero2.getNumero() == 0) {
                        //Si el divisor es 0 se le pide al usuario que ingrese un número diferente de 0
                        System.out.println("No se puede dividir por 0, por favor ingrese un número diferente de 0 para el divisor: ");
                        numero2.setNumero(pedirNumero());
                    }
                }
                //Se le pasa los números ingresados por el usuario a la clase Operacion para realizar la operación seleccionada
                resultado = operacion.calcular(opcion, numero1.getNumero(), numero2.getNumero());
                System.out.println("El resultado de la operación es: " + resultado);
                //Se le pregunta al usuario si desea realizar otra operación
                continuar = continuar();
            } else if (opcion == 5) {
                //Si la opción seleccionada es 5 se le pide al usuario que ingrese la base y el exponente
                boolean var; //variable controladora del bucle
                System.out.println("Ha seleccionado la opción de potencia");
                do {
                    try {
                        //Se le pide al usuario que ingrese la base y el exponente
                        System.out.println("Por favor ingrese la base: ");
                        numero1.setNumero(pedirNumero());
                        System.out.println("Por favor ingrese el exponente: ");
                        numero2.setNumero(pedirNumero());
                        //Se le pasa los números ingresados por el usuario a la clase Operacion para realizar la operación seleccionada
                        resultado = operacion.calcular(opcion, numero1.getNumero(), numero2.getNumero());
                        //Se valida que el usuario no ingrese 0 como base y un número negativo como exponente
                        var = false;
                        if (numero1.getNumero() == 0 && numero2.getNumero() < 0) {
                            System.out.println("No se puede elevar 0 a un número negativo, por favor ingrese un número diferente de 0 para la base y un número positivo para el exponente: ");
                            var = true;
                        } else if (numero1.getNumero() == 0 && numero2.getNumero() == 0) {
                            //Se valida que el usuario no ingrese 0 como base y 0 como exponente
                            System.out.println("No se puede elevar 0 a la 0, por favor ingrese un número diferente de 0 para la base y el exponente: ");
                            var = true;
                        }
                        //Se captura la excepción en caso de que el usuario ingrese un dato incorrecto para la base y el exponente
                    } catch (Exception e) {
                        System.out.println("Por favor ingrese un número válido para la base y el exponente");
                        var = true;
                    }
                } while (var);
                //Se muestra el resultado de la operación y se le pregunta al usuario si desea realizar otra operación
                System.out.println("El resultado de la operación es: " + resultado);
                continuar = continuar();
            } else if (opcion == 6) {
                //Si la opción seleccionada es 6 se le pide al usuario que ingrese el número al que le desea sacar la raiz cuadrada
                System.out.println("Ha seleccionado la opción de raiz cuadrada");
                System.out.println("Por favor ingrese el número al que le desea sacar la raiz cuadrada: ");
                numero1.setNumero(pedirNumero());
                //Se valida que el número ingresado por el usuario sea positivo
                if (numero1.getNumero() < 0) {
                    while (numero1.getNumero() < 0) {
                        //Si el número ingresado es negativo se le pide al usuario que ingrese un número positivo
                        System.out.println("No se puede sacar la raiz cuadrada de un número negativo, por favor ingrese un número positivo: ");
                        numero1.setNumero(pedirNumero());
                    }
                }
                //Se le pasa el número 0 como segundo parametro ya que no se necesita un segundo número para sacar la raiz cuadrada
                //y se le pasa el número ingresado por el usuario a la clase Operacion para realizar la operación seleccionada
                resultado = operacion.calcular(opcion, numero1.getNumero(), 0);
                //Se muestra el resultado de la operación y se le pregunta al usuario si desea realizar otra operación
                System.out.println("El resultado de la operación es: " + resultado);
                continuar = continuar();
            } else {
                //Si la opción seleccionada es 7 se termina el programa
                System.out.println("Gracias por usar la calculadora");
                System.exit(0);
            }
            // si el usuario selecciona la opción 2 de no realizar otra operación se termina el programa
            // si selecciona la opción 1 se vuelve a mostrar el menú para que seleccione otra operación
            if (continuar == 2) {
                System.out.println("Gracias por usar la calculadora");
            }

        } while (continuar == 1); //Se valida si el usuario desea realizar otra operación
    }

    //Metodo para preguntar al usuario si desea realizar otra operación
    private int continuar() {
        System.out.println("Desea realizar otra operación?");
        System.out.println("1. Si");
        System.out.println("2. No");
        System.out.println("Por favor ingrese el número de la opción que desea realizar: ");
        int continuar = 0;
        //Se valida que el usuario ingrese un número entre 1 y 2
        while (continuar == 0) {
            try {
                continuar = scanner.nextInt();
                if (continuar < 1 || continuar > 2) {
                    System.out.println("Por favor ingrese un número entre 1 y 2");
                }
            } catch (Exception e) {
                //Se captura la excepción en caso de que el usuario ingrese un valor diferente a un número
                System.out.println("Por favor ingrese un número válido");
                //La linea siguiente se utiliza para consumir la linea de entrada incorrecta de scanner del usuario
                scanner.nextLine();
                continuar = 0;
            }
        }
        //Se retorna la opción seleccionada por el usuario
        return continuar;
    }

    //Metodo para pedir un número al usuario y validar que sea un número
    private int pedirNumero() {
        //Se inicializa la variable numero en 0 y se le pide al usuario que ingrese un número
        int numero = 0;
        boolean var = true;
        while (var) {
            //Se valida que el usuario ingrese un número
            try {
                numero = scanner.nextInt();
                var = false;
            } catch (Exception e) {
                //Se captura la excepción en caso de que el usuario ingrese un valor diferente a un número
                System.out.println("Por favor ingrese un número válido");
                //La linea siguiente se utiliza para consumir la linea de entrada incorrecta de scanner del usuario
                scanner.nextLine();
                numero = 0;
                var = true;
            }
        }
        return numero;
    }
}
