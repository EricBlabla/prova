package com.mycompany.uf2;
import java.util.Scanner;

public class Fecha {
    public static void main(String args[]){
        //Instancia objeto Scanner
        Scanner in =  new Scanner(System.in);
        
        //Declaracion de variables
        int dia,mes,anio;
        boolean flag;
        
        //Pedir datos al usuario
        System.out.println("Introduce el dia");
        dia = in.nextInt();
        
        System.out.println("Introduce el mes");
        mes = in.nextInt();
        
        System.out.println("Introduce el año");
        anio = in.nextInt();
        
        flag = Fecha(dia,mes,anio);
        if(flag){
            System.out.println("La fecha es correcta");
        }else{
            System.out.println("La fecha es incorrecta");
        }
    }
    
    //Funciones
    //Se le pasan 3 parametros dia mes año y se comprueba si la fecha es correcta
    public static boolean Fecha(int dia, int mes, int anio){
        boolean flag = true;
        
        if(!(dia <= 30 && dia >= 1)){
            flag = false;
        }
        
        if(!(mes <= 12 && mes >= 1)){
            flag = false;
        }
        
        if(!(anio >= 1900 && anio <= 2022)){
            flag = false;
        }
                
        return flag;
    }
}
