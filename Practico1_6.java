package practico1;

/**
 *
 * @author Brunoo
 */

import java.util.Scanner;

public class Practico1_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrece velocidad en Km/h  ");
        float km = sc.nextInt();
        float ms = km/3.6f;
        System.out.print("La velocidad en m/s es:  " + ms);
        
    }
    
}
