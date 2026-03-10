package practico1;

/**
 *
 * @author Brunoo
 */

import java.util.Scanner;

public class Practico1_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numwh = 10;
        int numdo = 10;
        
        while(numwh != 1000){
            System.out.println(numwh);
            numwh +=10;
        }
        
        for (int i = 10; i <= 1000; i += 10) {
            System.out.println(i);
        }
        
        do {
            System.out.println(numdo);
            numdo +=10;
        }while(numdo <= 1000);
    }
    
}
