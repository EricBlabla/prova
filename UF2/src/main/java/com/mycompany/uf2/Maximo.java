package com.mycompany.uf2;
import java.util.Scanner;

public class Maximo {
    public static void main(String args[]){
        //Instancia Scanner
        Scanner in = new Scanner(System.in);
        
        //Crear variables
        int num1,num2,maximo;
        
        //Pedir datos al usuario
        System.out.println("¿Cual es el primer valor?");
        num1 =  in.nextInt();
        
        System.out.println("¿Cual es el segundo valor?");
        num2 = in.nextInt();
        
        //maximo = Maximo(num1,num2);
        
        System.out.println(Maximo(num1,num2));
    }
    
    public static int Maximo(int num1, int num2){
        int maximo;
        
        if(num1 > num2){
            maximo = num1;
        }else{
            maximo = num2;
        }
        
        return maximo;
    }
}
