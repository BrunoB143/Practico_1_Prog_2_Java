package practico1;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author Brunoo
 */
public class Practico1_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int suma = 0;
        Scanner sc = new Scanner(System.in);
        for(int i=1; i <= 10; i++){
            System.out.print("Ingrese un numero " + i + "  ");
            int numero = sc.nextInt();
            suma += numero;
        }
        System.out.print("La suma de todos los numeros es: " + suma);
    }
}
