package com.mycompany.examen_ejercicio3;

import java.util.Scanner;

public class Examen_Ejercicio3 {

    public static void main(String[] args) {
        //Instancia objeto Scanner
        Scanner in = new Scanner(System.in);
        
        //Crear varibales
        int tabla = (int) (Math.random() * 9 + 1), count = 0, resultado,fallos = 0;

        //Se le informa al usuario de la tabla a multiplicar y acontinuacion se inicia el ciclo
        System.out.println("La tabla del " + tabla);
        while (count <= 10) {
            System.out.println(tabla + " * " + count);

            System.out.println("Introduce el resultado:");
            resultado = in.nextInt();

            if (!(resultado == (tabla * count))) {
                System.out.println("Incorrecto!! el resultado de: " + tabla + " * " + count + " es " + tabla * count);
                fallos++;
            }
            count++;
        }
        System.out.println("Has tenido " + fallos + " fallos");
    }
}
