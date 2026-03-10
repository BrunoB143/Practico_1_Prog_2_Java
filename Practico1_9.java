package practico1;

/**
 *
 * @author Brunoo
 */

import java.util.Scanner;

public class Practico1_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sumaPar = 0;
        int sumaImpar = 0;
        
        for(int i = 0; i < 10; i++){
            System.out.print("Ingrese un numero:  ");
            int num = sc.nextInt();
            
            if(num % 2 != 0){
                sumaImpar += num;
            }else{
                sumaPar +=num;
            }
            
        }
        System.out.print("Suma de pares:  " + sumaPar + " \n" + "Suma de Impares:  " + sumaImpar);
    }
    
}
