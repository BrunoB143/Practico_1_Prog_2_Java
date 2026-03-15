package practico1_11;
import java.util.Scanner;

public class Practico1_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese hora de entrada en formato militar");
        int horaIngrE = sc.nextInt();
        
        int horaE = horaIngrE / 100;
        int minE = horaIngrE % 100;
        
        while (horaE < 0 || horaE > 23 || minE < 0 || minE > 59){
            System.out.println("Ingrese una hora valida");
            horaIngrE = sc.nextInt();
            horaE = horaIngrE / 100;
            minE = horaIngrE % 100;
        }      
        
        System.out.println("Ingrese hora de salida en formato militar");
        int horaIngrS = sc.nextInt();
        
        int horaS = horaIngrS / 100;
        int minS = horaIngrS % 100;
        
        while (horaS < 0 || horaS > 23 || minS < 0 || minS > 59 || horaIngrS < horaIngrE){
            System.out.println("Ingrese una hora valida");
            horaIngrS = sc.nextInt();
            horaS = horaIngrS / 100;
            minS = horaIngrS % 100;
        }
        
        int horaF = horaS - horaE;
        int minF = minS - minE;
        
        if (minF < 0){
            minF = minF + 60;
            horaF = horaF - 1;
        }
        
        System.out.println("El empleado trabajo: " + horaF + ":" + minF);
    }
}