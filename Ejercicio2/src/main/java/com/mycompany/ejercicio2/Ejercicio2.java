package com.mycompany.ejercicio2;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        //Importar el objeto Scanner
        Scanner in = new Scanner(System.in);

        //Crear variables
        int num;

        //Pedir numero al usuario
        System.out.println("Introduce un numero");
        num = in.nextInt();

        //Procesar el numero para ver si es divisible entre 2 y en caso de que no lo sea comprobar si lo es entre 3
        if (num % 2 == 0) {
            
            if (num % 3 == 0) {
                System.out.println("El numero es par y divisible entre 3");
            } else {
                System.out.println("El numero es par y no divisible entre 3");
            }

        } else {
            System.out.println("El numero no es par");
        }
    }
}
