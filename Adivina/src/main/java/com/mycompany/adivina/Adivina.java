package com.mycompany.adivina;

import java.util.Scanner;

public class Adivina {

    public static void main(String[] args) {

        //Declarar Scanner
        Scanner in = new Scanner(System.in);

        //Declaracion de variables
        int opcion, valor, min = 1, max = 100, mitad;
        char respuesta;
        boolean flag = false;

        //Operaciones
        do {
            mitad = (min + max) / 2;
            System.out.println("El numero es " + mitad);

            System.out.println("¿Es correcto?(i,m,n)");
            respuesta = in.next().charAt(0);
            
            if(respuesta == 'm'){
                min = mitad;
                
            }else if(respuesta == 'n'){
                max = mitad;
                
            }
            
        } while (respuesta != 'i');
        
        System.out.println("Acertaste");
    }
}
