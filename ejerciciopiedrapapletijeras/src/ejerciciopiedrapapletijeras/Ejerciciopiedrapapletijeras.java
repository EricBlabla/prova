/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciopiedrapapletijeras;

import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author erse0803
 */
public class Ejerciciopiedrapapletijeras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int tiradajugador;
        
       tiradajugador = jugada(); 
       
                
    }

    public static int jugada() {
        Scanner sc = new Scanner(System.in);
        int num = 4;
        boolean flag = false;

        while (!flag) {
            System.out.println("Dime un numero de 0 al 2");
            num = sc.nextInt();
            if (num == 0) {
                flag = true;
            } else if (num == 1) {
                flag = true;
            } else if (num == 2) {
                flag = true;
            } else {
                System.out.println("Pon un valor entre 0 y 2 :");
            }

        }
        return num;
    }
    
    public static int jugada_ordenador(){
    
    int num_ordenador;
    
    
    
    
    return num_ordenador;
    }
    

}
