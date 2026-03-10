package practico1;

/**
 *
 * @author Brunoo
 */
import java.util.Scanner;

public class Practico1_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese un número positivo de 3 cifras");
        int numero = in.nextInt();
        System.out.println("1er dígito: "+(numero/100));
        System.out.println("2do dígito: "+(numero%100)/10);
        System.out.println("3er dígito: "+(numero%100)%10);
    }
    
}
