/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practico1;

/**
 *
 * @author Brunoo
 */
public class Practico1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 8;
        int b = 3;
        int c = -5;
        
        System.out.print(" a) " + (a+b+c));
        System.out.print(" b) "+ (2*b+3*(a-c)));
        System.out.print(" c) "+(a/b));
        System.out.print(" d) "+(a%b));
        System.out.print(" e) "+(a/c));
        System.out.print(" f) "+(a%c));
        System.out.print(" g) "+(a*b/c));
        System.out.print(" h) "+(a*(b/c)));
        System.out.print(" i) "+(((a*c)%b)));
        System.out.print(" j) "+(a*(c%b)));
        System.out.print(" k) " + ((3*a-2*b)%(2*a-c)));
        System.out.print(" l) "+ (2*(a/5+(4-b*3)) % (a+c-2)));
        System.out.print(" m) "+ ((a-3*b)%(c+2*a)/(a-c)));
        System.out.print(" n) "+ ((a - b - c*2)));
        
    }
    
}
