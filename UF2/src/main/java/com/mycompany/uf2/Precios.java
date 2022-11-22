package com.mycompany.uf2;
import java.util.Scanner;

public class Precios {
    public static void main(String args[]){
        //Instancia objeto Scanner
        Scanner in = new Scanner(System.in);
        
        //Crear variables
        double precio,resultado;
        
        for(int i = 0; i < 5; i++){
            System.out.println("Dame el precio numero: " + (i + 1));
            precio = in.nextDouble();
            
            resultado = precioConIVA(precio);
            System.out.println("El precio: " + precio + " mas el iva es: " + resultado);
        }
        
    }
    
    public static double precioConIVA(double precio){
        
        double precioMasIVA = precio  + (precio * 0.21);
        return precioMasIVA;
    }
}
