package com.mycompany.exemplesfuncions;

import java.util.Scanner;

public class ExemplesFuncions {

    public static void main(String[] args) {
        //Instancia Scanner
        Scanner in = new Scanner(System.in);

        //Crear variables
        int num = 0;
        String caracter;

        //Preguntar datos
        System.out.println("¿Que idioma quieres? 1.Castellano 2.Catalan 3.Ingles");
        num = in.nextInt();

        System.out.println("¿Es de dia o es de noche? a.si es de dia");
        caracter = in.next();

        HelloWolrd(num, caracter);

    }
    /**
     * 
     * @param num
     * @param caracter 
     */

    public static void HelloWolrd(int num, String caracter) {

        if (num == 1) {

            if (caracter.charAt(0) == 'a') {
                System.out.println("Buenos dias");
            } else {
                System.out.println("Buenas noches");
            }

        } else if (num == 2) {

            if (caracter.charAt(0) == 'a') {
                System.out.println("Bon dia");
            } else {
                System.out.println("Bona nit");
            }

        } else if (num == 3) {

            if (caracter.charAt(0) == 'a') {
                System.out.println("Hello");
            } else {
                System.out.println("Bye");
            }

        }
    }

}
