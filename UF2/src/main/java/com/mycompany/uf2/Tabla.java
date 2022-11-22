package com.mycompany.uf2;
import java.util.Scanner;

public class Tabla {
    public static void main(String args[]){
        
        //Instancia objeto Scanner
        Scanner in =  new Scanner(System.in);
        
        //Crear variables
        int tabla;
        
        //Pedir datos al usuario
        System.out.println("¿Que tabla quieres mostrar?");
        tabla =  in.nextInt();
        
        System.out.println("La tabla es: " + tabla);
        Tabla(tabla);
    }
    
    //Funciones
    public static void Tabla(int tabla){
        
        for(int i = 0; i <= 10; i++){
            System.out.println(tabla + " * " + i + " = " + (i*tabla));
        }
    }
}
