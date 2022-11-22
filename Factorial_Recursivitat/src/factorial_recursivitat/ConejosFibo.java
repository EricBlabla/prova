package factorial_recursivitat;
import java.util.Scanner;

public class ConejosFibo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int numC;
        
        System.out.println("introduce un numero");
        numC = in.nextInt();
        
        System.out.println("El numero de conejos a los " + numC + " meses es " + numConejos(numC));
    }
    
    public static int numConejos(int numC){
        
        if(numC <= 1){
            return 1;
        }else if(numC > 1){
            int resultado = numConejos(numC -1) + numConejos(numC - 2);
            return resultado;
        }
        
        return 1;
    }
}
