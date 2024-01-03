package taller10_semana11_grupal;
import java.util.Scanner;
/**
 * @author RICARDO ESPINOSA Y JUAN DIEGO GUERRERO
 */
public class EJERCICIO_09 {
    public static void main(String[] args) {
                Scanner tc = new Scanner(System.in);
        int lim;
        System.out.println("Ingrese el limite");
        lim = tc.nextInt();
        for (int i = 0; i < lim; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
        System.out.println(" ");    
        }
    }
}

