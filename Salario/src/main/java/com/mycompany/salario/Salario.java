/*
package com.mycompany.salario;
import java .util.Scanner;

public class Salario {
    public static void main(String[] args) {
        //Instancia objeto Scanner
        Scanner in =  new Scanner(System.in);
        
        //Crear variables
        double horas,precioHora,horasExtra,salario,precioExtra,salarioBruto,retencion,salarioNeto;
        String nombre;
        final int MAXIMO_HORAS = 35, SALRIO_SIN_RETENCION = 500;
        final double PRECIO_HORA_EXTRA = 1.5, RETENCION_APLI = 0.25;
        
        //Pedir datos
        System.out.println("¿Cuantas horas has trabajado?");
        horas = in.nextDouble();
        
        System.out.println("¿Cual es el precio de la hora?");
        precioHora = in.nextDouble();
        
        System.out.println("¿Cual es el nombre del trabajador?");
        nombre = in.nextLine();
        
        //hacer calculo
        if(MAXIMO_HORAS > 35){
            precioExtra = precioHora + PRECIO_HORA_EXTRA;
            
            horasExtra = horas - MAXIMO_HORAS;
            salario = MAXIMO_HORAS * precioHora;
            salario = salario + (horasExtra * precioExtra);
        }else{
            salario = horas * precioHora;
        }
        
        if(salario > 500){
            retencion  = salario - 500;
            retencion = retencion * RETENCION_APLI;
            salarioNeto = 
        }
        
        System.out.println("El salario total es de " + salario);
    }
}
*/