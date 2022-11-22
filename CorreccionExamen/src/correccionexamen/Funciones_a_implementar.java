/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica1UF2;

import java.util.Random;
import java.util.Scanner;


/**
 *
 * @author lule4853
 */
public class Funciones_a_implementar {
    
    
    public static void main(String[] args) {
        int saldo = 10, apuesta, premio;
        char disc1, disc2,disc3;
        do {
            
        
        apuesta = Quantitat_apostada(saldo);
        saldo = saldo - apuesta;
        disc1 = tirada_disc1();
        disc2 = tirada_disc2();
        disc3 = tirada_disc3();
        mostrar_tirada(disc1, disc2, disc3);
        premio = Calcular_premi(disc1, disc2, disc3, apuesta);
        saldo = saldo + premio;
        }while(!(Seguir_jugant(saldo)==false));
        System.out.println("Se acabo la partida");

    }
    
    public static int Quantitat_apostada​(int saldo){
        Scanner sc = new Scanner (System.in);
        int dinero_apuesta;
        do{
            System.out.println("Cuanto monedas quiere apostar. Aun tienes "+ saldo +" monedas");
            dinero_apuesta = sc.nextInt();  
        }while(saldo < dinero_apuesta || dinero_apuesta <= 0);
        return dinero_apuesta;
    }
    
    public static char tirada_disc1(){
        char tir1 = 0;
        Random rd = new Random();
        int tirada1 = rd.nextInt(3);
        
        if (tirada1 == 0) {
            tir1= 'A';
        }
        else if (tirada1 == 1) {
            tir1 = 'B';
        }
        else if (tirada1 == 2) {
            tir1 = 'C';
        }     
        return tir1;
    }
    public static char tirada_disc2(){
        char tir2 = 0;
        Random rd = new Random();
        int tirada2 = rd.nextInt(3);
        
        if (tirada2 == 0) {
            tir2= 'A';
        }
        else if (tirada2 == 1) {
            tir2 = 'B';
        }
        else if (tirada2 == 2) {
            tir2 = 'C';
        }     
        return tir2;
    }
    public static char tirada_disc3(){
        char tir3 = 0;
        Random rd = new Random();
        int tirada3 = rd.nextInt(3);
        
        if (tirada3 == 0) {
            tir3= 'A';
        }
        else if (tirada3 == 1) {
            tir3 = 'B';
        }
        else if (tirada3 == 2) {
            tir3 = 'C';
        }     
        return tir3;
    }
    
    public static void mostrar_tirada​(char tir1, char tir2, char tir3){
            System.out.println("*" + tir1 + "-" + tir2 + "-" + tir3 +"*");
    }
    
    public static int Calcular_premi(char tirada1, char tirada2, char tirada3, int dinero_apuesta){
        int dGanado;
        if (tirada1 == 'A' && tirada2 == 'A' && tirada3 == 'A'){
            dGanado = dinero_apuesta + 5;
            System.out.println("Has ganado 5 monedas mas lo apostado");
        }
        else if (tirada1 == 'B' && tirada2 == 'B' && tirada3 == 'B'){
            dGanado = dinero_apuesta + 2;
             System.out.println("Has ganado 2 monedas mas lo apostado");
        }
        else if (tirada1 == 'C' && tirada2 == 'C' && tirada3 == 'C'){
            dGanado = dinero_apuesta * 2;
             System.out.println("Has ganado, se te duplica la cantidad que tienes.");
        }
        else {
             System.out.println("Has perdido");
            dGanado = 0;
        }
        return dGanado;
    }
    
    public static boolean Seguir_jugant​(int saldo){
        boolean continua = true;
        if(saldo >25 || saldo <= 0){
            continua = false;
        }
        return continua;
    }
            
            
}
