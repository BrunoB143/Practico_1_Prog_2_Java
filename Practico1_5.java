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
public class Practico1_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese cantidad de grados centigrados ");
        int grados = sc.nextInt();
        int fah = 32 + (9*grados/5);
        
        System.out.print("Esta es la cantidad en Fahrenheit:  " + fah);
    }
    
}
