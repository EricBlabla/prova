package com.mycompany.uf2;
import java.util.Scanner;

public class PruebaString {
    public static void main(String args[]){
        //Instancia Scanner
        Scanner in = new Scanner(System.in);
        
        //Crear varibales
        String frase;
        
        //funcion contar caracteres
        System.out.println("Introduce ubna frase para contar sus caracteres");
        frase = in.nextLine();
        System.out.println(contarCaracteres(frase));
        
        
        
    }
    
    public static int contarCaracteres(String frase){
        int num = 0;
        
        num = frase.length();
        
        return num;
    }
}
