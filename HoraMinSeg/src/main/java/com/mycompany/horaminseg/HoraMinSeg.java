package com.mycompany.horaminseg;
import java.util.Scanner;
public class HoraMinSeg {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        //Crear variables
        int hora,min,seg;
        
        //Pedir datos
        
        //Pedir hora
        System.out.println("¿Que hora es?");
        hora = in.nextInt();
        
        //Pedir minuto
        System.out.println("¿Que minuto es?");
        min = in.nextInt();
        
        //Pedir segundo
        System.out.println("¿Que segundo es?");
        seg = in.nextInt();
        seg++;
        
        if(seg == 60){
            seg = 0;
            min++;
            if(min == 60){
                min = 0;
                hora++;
                if(hora == 24){
                    hora = 0;
                    min = 0;
                    seg = 0;
                }
            }
        }
        System.out.println("La hora es: " + hora + ":" + min + ":" + seg);
    }
}
