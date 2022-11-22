package com.mycompany.uf2;
import java.util.Scanner;

public class Descuento {
    public static void main(String args[]){
        //Instancia objeto Scanner
        Scanner in =  new Scanner(System.in);
        
        //Crear variables
        double precioConDescuento, precioSinDescuento, resultado;
        
        //Pedir datos al usuario
        System.out.println("Cual es el precio sin descuento");
        precioSinDescuento = in.nextInt();
        
        System.out.println("Cual es el precio con descuento");
        precioConDescuento = in.nextInt();
        
        //Llamada a la funcion para sacar el porcentaje
        resultado = Porcentaje(precioSinDescuento,precioConDescuento);
    }
    
    //Funciones
    public static double Porcentaje(double precioSinDescuento, double precioConDescuento){
        
        double diferencia = precioSinDescuento - precioConDescuento;
        double porcentaje = (diferencia / precioConDescuento) * 100;
        
        return porcentaje;
    }
}
