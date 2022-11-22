/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.correcion_pol;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author pomo6989
 */
public class ExamenUF1PE1Ex3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero_multiplicacion;
        int maximo=10;
        int contador=0;
        int multiplo=0;
        int errores=0;
        Random rd = new Random();   
        Scanner sc = new Scanner(System.in);
       
        numero_multiplicacion=rd.nextInt(9)+1;
        System.out.println("Taula de multiplicar del numero: "+numero_multiplicacion);
  
        do
        {      
                       
            multiplo++;
            System.out.print(numero_multiplicacion+"*"+multiplo+"=");
            int numero_usuario=sc.nextInt();
            int acierto=numero_multiplicacion*multiplo;
            if(!(numero_usuario==acierto))
            {
                System.out.println("Incorrecte!"+numero_multiplicacion+"*"+multiplo+" es igual a "+acierto);
                errores++;                
            }
            contador++;       
        }while(!(contador==maximo));
        System.out.println("As cometido "+errores+" errores");
        System.out.println("FIN");
    }
    
}
