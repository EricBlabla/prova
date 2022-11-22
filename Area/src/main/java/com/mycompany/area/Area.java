package com.mycompany.area;
import java.util.Scanner;

public class Area {

    public static void main(String[] args) {
        //Instanciar objeto Scanner
        Scanner sc = new Scanner(System.in);
        
        //Crear variables
        double pi = 3.14,diametro,radio,longitud,area;
        
        System.out.println("Introduce el radio");
        radio = sc.nextDouble();
        
        diametro = radio + radio;
        longitud = pi * diametro;
        area = pi * (radio+radio);
        
        System.out.println("La longuitud es " + longitud);
    }
}
