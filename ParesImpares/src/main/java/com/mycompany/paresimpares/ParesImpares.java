package com.mycompany.paresimpares;

public class ParesImpares {

    public static void main(String[] args) {
        
        int numeros, acum_pares=0, acum_impar=0;
        
        for(numeros = 100; numeros <= 200; numeros++){
            
            if(numeros%2==0){
                acum_pares = acum_pares + numeros;
            }else{
                acum_impar = acum_impar + numeros;
            }
        }
        
        System.out.println("Pares " + "[" + acum_pares +"]");
        System.out.println("Impar " + "[" + acum_impar +"]");
    }
}
