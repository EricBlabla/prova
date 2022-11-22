package com.mycompany.divisibles3;
import java.util.Scanner;
public class Divisibles3 {

    public static void main(String[] args) {
        //Instancia Scanner
        Scanner in =  new Scanner(System.in);
        
        //Crear variables
        int count_3 = 0, num = 0, suma = 0;
        
        while(count_3 != 3){
            System.out.println("¿Que numero quieres ver si es divisible entre 3?");
            num = in.nextInt();
            
            if(num%3 == 0){
                count_3++;
                suma += num;
            }
        }
        
        System.out.println("Los divisibles de 3 que has introducido suman: " + suma);
    }
}
