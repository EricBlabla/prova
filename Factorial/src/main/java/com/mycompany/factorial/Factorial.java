package com.mycompany.factorial;
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        
        int factor,valor,resultado = 0;
        Scanner in = new Scanner(System.in);
        
        System.out.println("¿Introduce un numero para calcular su factorial?");
        factor = in.nextInt();
        valor = factor;
        
        for(int i = 1; i < valor; i++){
            System.out.println(factor + " * " + i);
            //factor = resultado + (factor * i);
            
        }
        //System.out.println("El numero a calcular el factor es " + valor + " y el resultado es " + resultado);
    }
}
