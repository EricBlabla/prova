package examen;

import java.util.Scanner;

public class Tragaperras {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int saldo = 10, aposta = 0, premio;
        char char1 = 'Z', char2 = 'Z', char3 = 'Z';
        boolean seguir = true;

        while (seguir == true) {
            
            //Pregunta cuanto quieres apostar
            aposta = Quantitat_apostada(saldo);
            saldo = saldo - aposta;
            
            //Tirada de los 3 discos
            char1 = tirada_disc();
            char2 = tirada_disc();
            char3 = tirada_disc();
            
            //Muestra la tirada
            Mostrar_tirada(char1,char2,char3);
            
            //Retorna el premio de la tirada
            premio = Calcular_premi(char1, char2, char3, aposta);
            saldo = saldo + premio;
            
            //Comprueba si es posible seguir jugando
            seguir = Seguir_jugant(saldo);
            System.out.println(saldo);
        }
    }

    //Funciones
    
    //Pregunta que cantidad quiere apostar el usuario
    public static int Quantitat_apostada(int saldo) {
        Scanner in = new Scanner(System.in);
        int quantitat = 100;

        while (quantitat > saldo || quantitat < 0) {
            System.out.println("¿Cuanto quieres apostar?");
            quantitat = in.nextInt();
        }

        return quantitat;
    }

    //Funcion que retorna un numero aleatorio y segun el numero devuelve un char
    public static char tirada_disc() {
        int num;
        char letra = 'Z';
        num = (int) (Math.random() * 3);

        if (num == 0) {
            letra = 'A';
        } else if (num == 1) {
            letra = 'B';
        } else if (num == 2) {
            letra = 'C';
        }
        return letra;
    }

    //Funcion que muestra por pantalla el resultado de la tirada
    public static void Mostrar_tirada(char char1, char char2, char char3) {
        System.out.println("*************");
        System.out.println("* " + char1 + " - " + char2 + " - " + char3 + " *");
        System.out.println("*************");
    }

    //Funcion que comprueba el resultado de la apuesta
    public static int Calcular_premi(char char1, char char2, char char3, int aposta) {
        int dinero_ganado = 0;

        if (char1 == 'A' && char2 == 'A' && char3 == 'A') {
            dinero_ganado = aposta + 5;
        } else if (char1 == 'B' && char2 == 'B' && char3 == 'B') {
            dinero_ganado = aposta + 2;
        } else if (char1 == 'C' && char2 == 'C' && char3 == 'C') {
            dinero_ganado = aposta * 2;
        } else {
            dinero_ganado = 0;
        }

        return dinero_ganado;
    }

    //Funcion que comprueba si se puede seguir jugando
    public static boolean Seguir_jugant(int saldo) {
        boolean seguir = false;

        if (saldo <= 0 || saldo > 25) {
            seguir = false;
        } else {
            seguir = true;
        }
        return seguir;
    }

}
