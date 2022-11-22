package com.mycompany.examen_ejercicio2;
import java.util.Scanner;

public class Examen_ejercicio2 {

    public static void main(String[] args) {
        //Instancia objeto Scanner
        Scanner in = new Scanner(System.in);
        
        //Declaracion de variables
        int min,max,count;
        
        //Pedir datos al usuario
        System.out.println("Introduce la temperaturua minima");
        min =  in.nextInt();
        
        System.out.println("Introduce la temperaturua maxima");
        max =  in.nextInt();
        
        //Con los datos aportados por el usuario mostramos un rango de temperaturas entre la minima y maxima tanto en celsius como en fahrenheit
        
        count = min;
        while(count <= max){
            
            System.out.print(count + "C");
            System.out.print("  -  ");
            System.out.print((int) ((float)((double) 9/5) * count + 32) + "F");
            
            count++;
            System.out.println();
        }
    }
}
