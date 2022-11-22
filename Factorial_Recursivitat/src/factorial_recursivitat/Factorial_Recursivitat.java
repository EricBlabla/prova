package factorial_recursivitat;
import java.util.Scanner;

public class Factorial_Recursivitat {

    public static void main(String[] args) {
        /*
            1-identificar casos base casos en los que no hay que hacer ninguna operacion
            2-realizar el caso donde se hace la llamada a la funcion
        */
        //Instancia objeto Scanner
        Scanner in = new Scanner(System.in);
        
        //Crear variables
        int num, resultado;
        
        System.out.println("Introduce el numero del que quiera calcular el factorial");
        num = in.nextInt();
        
        resultado = Factorial(num);
        System.out.println(num + "!" + " = " + resultado);
    }
    
    //Funciones
    
    //Calcula el factorial de un entero
    public static int Factorial(int n){
        
        if(n == 1){
            return 1;
        }else if(n == 0){
            return 1;
        }else{
            return n * Factorial(n - 1);
        }
    }
}
