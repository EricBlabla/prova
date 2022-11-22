package com.mycompany.examen_ejercicio1;

import java.util.Scanner;

public class Examen_Ejercicio1 {

    public static void main(String[] args) {
        //Inscancia objeto Scanner
        Scanner in = new Scanner(System.in);

        //Declaracion de variables
        String dia;
        int menu;

        //Pedir datos al usuario
        System.out.println("¿Que dias es? Las opciones son laborable -> L, sabado -> S, festivo -> F");
        dia = in.next();
        
        System.out.println("Elige entre el menu 1 o 2");
        menu = in.nextInt();

        //En las condiciones de los if se comparan los datos aportados por el usuario y elige el flijo de programa dando una respuesta
        if (dia.charAt(0) == 'L') {
            if (menu == 1) {
                System.out.println("El precio es de 2.00€");
            } else if (menu == 2) {
                System.out.println("El precio es de 2.50€");
            } else {
                System.out.println("El menu no es correcto");
            }
        } else if (dia.charAt(0) == 'S') {
            if (menu == 1) {
                System.out.println("El precio es de 2.20€");
            } else if (menu == 2) {
                System.out.println("El precio es de 2.70€");
            } else {
                System.out.println("El menu no es correcto");
            }
        } else if (dia.charAt(0) == 'F') {
            if (menu == 1) {
                System.out.println("El precio es de 2.30€");
            } else if (menu == 2) {
                System.out.println("El precio es de 2.80€");
            } else {
                System.out.println("El menu no es correcto");
            }
        } else {
            System.out.println("El dia no es correcto");
        }
    }
}
