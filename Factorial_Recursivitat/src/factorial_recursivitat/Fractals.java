package factorial_recursivitat;
import java.util.Scanner;

public class Fractals {
    public static void main(String args[]){
        //dgfsgdfg
        Scanner in =  new Scanner(System.in);
        int lado;
        //dfghndgfh
        System.out.println("Dime el lado del cuadrato inicial");
        lado =  in.nextInt();
        
        int perimetroTotal = ContarPerimetroFractal(lado);
        System.out.println("Perimetro total " + perimetroTotal);
    }

    public static int ContarPerimetroFractal(int lado) {
        
        if(lado == 0){
            return 0;
            
        }else if(lado > 0){
            return 4*lado + 4 * ContarPerimetroFractal(lado / 2);
        }
        
        return -1;
    }
}
