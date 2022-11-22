/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica1UF2;

import java.util.Scanner;


/**
 *
 * @author lule4853
 */
public class CalculadoraIMC {
    public static void main(String[] args) {
         float alzada, masa, IMC;
         boolean valid;
        do{
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la estatura(max. 2,75m)");
        alzada = sc.nextFloat();
        System.out.println("Introduce el peso(max. 635Kg");
        masa = sc.nextFloat();
       
        }while(!(valid = DadesCorrectes(alzada, masa)==true));
        IMC = calculadoraIMC(alzada, masa);
        System.out.println("Su valor de IMC es " + IMC);
        interpretarIndiceIMC(IMC);
    }
    
    public static boolean DadesCorrectes(float estatura, float pes){
        boolean correcto = true;
        if (estatura > 2.75) {
            correcto = false;
        }
        if (pes > 645) {
            correcto = false;
        }
       return correcto;
    }
    
    public static float calculadoraIMC(float estatura, float pes) {
        float inIMC;
        inIMC = pes / (estatura*2);
        return inIMC;
    }
    
    public static void interpretarIndiceIMC(float indiceIMC) {
        System.out.print("Su clasificacion es: ");
        if (indiceIMC < 18.50) {
         System.out.println("Bajo peso");
        }
        else if (indiceIMC >= 18.5 && indiceIMC <= 24.99) {
                System.out.println("Normal");          
        }
        else if (indiceIMC >= 25) {
                System.out.println("Sobre Pes");
                }
    }
}

