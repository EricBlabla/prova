package com.mycompany.uf2;
import java.util.Scanner;
        
public class Millas_KM {
    public static void main(String args[]){
        
        //Instancia objeto Scanner
        Scanner in =  new Scanner(System.in);
        
        //Declaracion de variables
        double km, millas;
        
        //Pedir datos al usuario
        System.out.println("¿Cuantas millas quieres pasar a KM?");
        millas = in.nextDouble();
        
        //Recoger resultado de la funcion
        km =  Millas_KM(millas);
        
        //Devolver resultado al usuario
        System.out.println(millas + " millas es igual a " + km + "KM");
        
    }
    
    //Funciones
    public static double Millas_KM(double millas){
        
        double km = 0;
        
        km = millas * 1.6;
        
        return km;
    }
}
