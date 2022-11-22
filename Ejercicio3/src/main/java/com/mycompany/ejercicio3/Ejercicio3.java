package com.mycompany.ejercicio3;
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        
        //Importar objeto Scanner
        Scanner in = new Scanner(System.in);
        
        //Crear variables
        int grupo,num_personas,num_menores,precio,e_adulto = 20,e_infantil = 10;
        double precioTotal;
        
        //Pedir datos al usuario para calcular el precio
        System.out.println("¿Quantas entradas quieres?");
        num_personas = in.nextInt();
        
        System.out.println("De las " + num_personas + " ¿Cuantas son infantiles?");
        num_menores = in.nextInt();
        
        //Procesar los datos para calcular el precio total
        
        //Se resta el numero de entradas infantiles al total
        num_personas -= num_menores;
        
        //Se suman las entradas para comprobar si se puede hacer algun descuento por grupo
        grupo = num_personas + num_menores;
        
        //Se calcula el total de precio antes de descuento 
        precio = (num_personas * e_adulto) + (num_menores * e_infantil);
        
        //Se comprueba si existe algun descuento por grupo   
            if(grupo > 10 && grupo <= 25){
                precioTotal = precio - (precio * 0.25);
            }else if(grupo > 25){
                precioTotal = precio - 20;
                precioTotal = precioTotal - (precioTotal * 0.25);
            }else{
                precioTotal = precio;
            }
        
        System.out.println("Las entradas totales son: " + grupo);
        System.out.println("de las cuales infantiles hay: " + num_menores);
        System.out.println("El precio total es de " + precioTotal);                
    }
}
