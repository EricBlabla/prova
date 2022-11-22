package com.mycompany.uf2;
import java.util.Scanner;

public class Vocales {
    public static void main(String args[]){
        
        //Instancia Scanner
        Scanner in =  new Scanner(System.in);
        
        //Crear variables
        String frase;
        
        //Pedir frase al usuario
        System.out.println("Escribe una frase");
        frase = in.nextLine();
        
        //Devolver la informacion al usuario
        System.out.println("El numero de vocales es de " + ContarVocales(frase));
        
    }
    
    public static int ContarVocales(String frase){
        int count = 0;
        
        for(int i = 0; i < frase.length(); i++){
            
            if(frase.charAt(i) == 'a' || frase.charAt(i) == 'e' || frase.charAt(i) == 'i' || frase.charAt(i) == 'o' || frase.charAt(i) == 'u'){
                count++;
            }else if(frase.charAt(i) == 'A' || frase.charAt(i) == 'E' || frase.charAt(i) == 'I' || frase.charAt(i) == 'O' || frase.charAt(i) == 'U'){
                count++;
            }
        }
        
        return count;
    }
}
