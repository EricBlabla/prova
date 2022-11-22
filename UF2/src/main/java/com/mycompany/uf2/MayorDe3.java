package com.mycompany.uf2;
import java.util.Scanner;

public class MayorDe3 {
    public static void main(String args[]){
        //Instancia objeto Scanner
        Scanner in =  new Scanner(System.in);
        
        //Crear variables
        int num1,num2,num3,mayor,mayorDe3;
        
        //Pedir valores al usuario
        System.out.println("Introduce el primer valor");
        num1 = in.nextInt();
        
        System.out.println("Introduce el segundo valor");
        num2 = in.nextInt();
        
        System.out.println("Introduce el tercer valor");
        num3 = in.nextInt();
        
        //Llamado a la funcion para ver el mayor de 2
        mayor = Mayor(num1,num2);
        System.out.println("El mayor de num1 y num2 es " + "[ " + mayor + " ]");
        
        //Llamado a la funcion para ver el mayor de 3
        mayorDe3 = Mayor(mayor,num3);
        System.out.println("El mayor de los 3 es " + "[ " + mayorDe3 + " ]");
    }
    
    //Funciones
    //Comprueba 2 valores y devuelve el mayor
    public static int Mayor(int valor1, int valor2){
        int mayor = 0;
        
        if(valor1 > valor2){
            mayor = valor1;
        }else if(valor1 < valor2){
            mayor = valor2;
        }else if(valor1 == valor2){
            mayor = valor1;
        }
        
        return mayor;
    }
}
