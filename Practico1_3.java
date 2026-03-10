/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.Scanner;
/**
 *
 * @author Brunoo
 */
public class Practico1_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int salarioTotal = 0;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su nombre");
        String nombre = sc.nextLine();
        
        System.out.print("Ingrese su edad");
        int edad = sc.nextInt();
        
        while (edad < 18 ){
            System.out.print("Ingrese edad mayor a 18");
            edad = sc.nextInt();

        }
        
        System.out.print("Ingrese su salario");
        int salario = sc.nextInt();
        
         if (edad >= 18 && edad <= 50) {
            salarioTotal = salario + (salario * 5) / 100;
        } else if (edad >= 51 && edad <= 60) {
            salarioTotal = salario + (salario * 10) / 100;
        } else {
            salarioTotal = salario + (salario * 15) / 100;
        }
            
            System.out.print(nombre +" "+ salarioTotal);
        }
    }
