package examen;
import java.util.Scanner;

public class Calculadora_IMC {
    public static void main(String args[]){
        //Instancia Scanner
        Scanner in = new Scanner(System.in);
        
        //Crear variables
        double estatura,peso,imc;
        boolean validacion = false;
        
        //Pedir datos a usuario
        System.out.println("Introduce la altura");
        estatura = in.nextDouble();
        
        System.out.println("Introduce el peso");
        peso = in.nextDouble();
        
        //Validar datos del usuario
        validacion = validacion(estatura, peso);
        
        if(validacion){
            imc = calculoIndiceIMC(estatura, peso);
            InterpretarIndiceIMC(imc);
        }else{
            System.out.println("Los datos no son correctos");
        }
        
    }
    
    //Funciones
    
    //Funcion que hace el calcutlo
    public static double calculoIndiceIMC(double estatura, double pes){
        double imc = pes / (estatura * 2);
        return imc;
    }
    
    //Funcion que retorna un mensaje por pantalla al usuario
    public static void InterpretarIndiceIMC(double imc){
        
        if(imc < 18.50){
            System.out.println("IMC: " + imc + " Baix Pes");
        }else if(imc >= 18.50 && imc <= 24.99){
            System.out.println("IMC: " + imc + " Normal");
        }else if(imc > 25){
            System.out.println("IMC: " + imc + " SobrePes");
        }
    }
    
    //Funcion que valida los datos introducidos por el usuario
    public static boolean validacion(double estatura, double pes){
        boolean altura = false;
        boolean peso = false;
        boolean datosCorrectos = false;
        
        if(estatura < 2.75 && estatura > 0.50){
            altura = true;
        }
        
        if(pes <= 635 && pes >= 30){
            peso = true;
        }
        
        if(altura && peso){
            datosCorrectos = true;
        }
        
        return datosCorrectos;
    }
}
