/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practico1;

/**
 *
 * @author Brunoo
 */
public class Practico1_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean w = false;
        boolean x = true;
        boolean y = true;
        boolean z = false;
        
        System.out.print(" a) " + (w||y&&x&&w||z));
        System.out.print(" b) " + (x&&!y&&!x||!w&&y));
        System.out.print(" c) " + (!(w||!y)&&x||z));
        System.out.print(" d) " + (x&&y&&w||z||x));
        System.out.print(" e) " + (y||!((y||z&&w))));
        System.out.print(" f) " + (!x&&y&&(!z||!x)));
    }
    
}
