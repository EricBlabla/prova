package factorial_recursivitat;
import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String args[]){
        //Instancia Scanner
        Scanner in =  new Scanner(System.in);
        
        //Crear variables
        int max,min,result;
        
        //Pedir datos
        System.out.println("Introduce el valor minimo");
        min = in.nextInt();
        
        System.out.println("Introduce el valor maximo");
        max = in.nextInt();
        
        result = CalculoValores(min, max);
        System.out.println("La suma de valores entre los 2 numero es: " + result);
    }
    
    //Fumciones
    
    //Funcion que calcula la suma de los valores intemerdios entre dos enteros
    public static int CalculoValores(int min, int max){
        
        if(min == max){
            return 0;
        }else if(min < max){
            int result = CalculoValores(min,max);
        }
        
        return 0;
    }
}
