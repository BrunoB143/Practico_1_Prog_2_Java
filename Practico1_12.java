package practico1_11;

import java.util.Scanner;

public class Practico1_12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Jugador 1, (1)Piedra, (2)papel o (3)tijera?");
        int j1 = sc.nextInt();
        
        System.out.println("Jugador 2, (1)Piedra, (2)papel o (3)tijera?");
        int j2 = sc.nextInt();
        
        if ((j1 == 1 && j2 == 1) || (j1 == 2 && j2 == 2) || (j1 == 3 && j2 == 3)){
            System.out.println("EMPATE");
        }else if((j1 == 1 && j2 == 3) || (j1 == 2 && j2 == 1) || (j1 == 3 && j2 == 2)){
            System.out.println("GANADOR J1");
        }else{
            if((j1 == 1 && j2 == 2) || (j1 == 2 && j2 == 3) || (j1 == 3 && j2 == 1)){
                System.out.println("GANADOR J2");
            }
        }
    }
    
}
