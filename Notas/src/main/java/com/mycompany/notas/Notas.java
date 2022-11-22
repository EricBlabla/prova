package com.mycompany.notas;
import java.util.Scanner;

public class Notas {

    public static void main(String[] args) {
       
        Scanner in = new Scanner(System.in);
        int valor,flag = 0;
        boolean diez = false;
        
        System.out.println("Introduce las notas. Para parar introduce -1");
        
        while(flag == 0){
            
            System.out.println("Introduce la nota");
            valor = in.nextInt();
            
            if(valor == 10){
                diez = true;
            }
            if(valor == -1){
                flag = 1;
            }
        }
        
        if(diez == true ){
            System.out.println("En las notas hay al menos un 10");
        }else{
            System.out.println("No has puesto ningun 10");
        }
    }
}
