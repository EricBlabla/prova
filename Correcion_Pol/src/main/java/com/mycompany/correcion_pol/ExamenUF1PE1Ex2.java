/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.correcion_pol;

import java.util.Scanner;

/**
 *
 * @author pomo6989
 */
public class ExamenUF1PE1Ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double celsius, celsius_max; 
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Posa el interval de temperatures a convertir de graus celsius a Fahrenheit");
        System.out.println("Posa els graus minims");      
        celsius=sc.nextDouble();
        System.out.println("Posa els graus maxims");
        celsius_max=sc.nextDouble();
        
        
        while(celsius<=celsius_max)
        {
            double Fahrenheit=1.8*celsius+32;
            System.out.println("Graus celsius "+celsius+" Graus Fahrenheit="+Fahrenheit);
            celsius++;
        }
    }
    
}
