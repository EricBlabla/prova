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
public class ExamenUF1PE1Ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char dia;
        int esmorzar; 
        double preu = 0;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("El dia es laborable(L),Dissabte (S) o Festiu (F)");
        dia=sc.next().charAt(0);
        System.out.println("Quin tipus de esmorzar vols?(1-2)");
        esmorzar=sc.nextInt();
        
        if(dia=='L'||dia=='l')
        {
            if(esmorzar==1)
            {
                preu=2;
            }
            else if(esmorzar==2)
            {
               preu=2.5; 
            }
        }
        
        else if(dia=='S'||dia=='s')
        {
            if(esmorzar==1)
            {
                preu=2.20;
            }
            else if(esmorzar==2)
            {
               preu=2.70; 
            }
            
        }
        else if(dia=='F'||dia=='f')
        {
            if(esmorzar==1)
            {
                preu=2.30;
            }
            else if(esmorzar==2)
            {
               preu=2.80; 
            }
        }
        System.out.println("El preu sera "+preu+" Euros");
    }
    
}
