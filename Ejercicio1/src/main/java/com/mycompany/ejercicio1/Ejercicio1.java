package com.mycompany.ejercicio1;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        //Importar objeto Scanner
        Scanner in = new Scanner(System.in);

        //Crear variables
        int dia, mes, año;
        boolean flag = true;

        //Pedir datos al usuario
        System.out.println("Introduce el dia");
        dia = in.nextInt();

        System.out.println("Introduce el mes");
        mes = in.nextInt();

        System.out.println("Introduce el año");
        año = in.nextInt();

        //Procesar los datos para validar la fecha
        if (mes >= 1 && mes <= 12) {

            if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                if (dia >= 1 && dia <= 30) {

                } else {
                    System.out.println("El dia " + dia + " no es correcto con el mes " + mes + " el rango a de ser del 1 al 30");
                    flag = false;
                }
            } else if (mes == 2) {
                if (dia >= 1 && dia <= 28) {

                } else {
                    System.out.println("El dia " + dia + " no es correcto con el mes " + mes + " el rango a de ser del 1 al 28");
                    flag = false;
                }
            } else {
                if (dia >= 1 && dia <= 31) {

                } else {
                    System.out.println("El dia " + dia + " no es correcto con el mes " + mes + " el rango a de ser del 1 al 31");
                    flag = false;
                }
            }
        } else {
            System.out.println("El mes no es correcto el rango esta del 1 al 12");
            flag = false;
        }

        if (año >= 1900 && año <= 2022) {

        } else {
            System.out.println("El año no es correcto el rango es del 1900 al 2022");
            flag = false;
        }

        if (flag) {
            System.out.println(dia + "/" + mes + "/" + año);
            System.out.println("La fecha es correcta");
        }
    }
}
