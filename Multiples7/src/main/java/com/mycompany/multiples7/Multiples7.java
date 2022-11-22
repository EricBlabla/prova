package com.mycompany.multiples7;

import java.util.Scanner;

public class Multiples7 {

    public static void main(String[] args) {
        //Un programa que muestre los 10 multimples de 7 a partir de 12

        int mult = 12, num = 7, contador = 0;

        while (contador < 10) {
            
            if (mult % num == 0) {
                contador++;
                System.out.print("[ " + mult + " ]");
            }
            mult++;
        }
    }
}
