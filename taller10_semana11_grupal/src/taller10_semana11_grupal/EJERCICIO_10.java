package taller10_semana11_grupal;

import java.util.Scanner;

/**
 * @author RICARDO ESPINOSA Y JUAN DIEGO GUERRERO
 */
public class EJERCICIO_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la altura de las pirámides:");
        int altura = scanner.nextInt();
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura - i - 1; j++) 
                System.out.print(" ");
            for (int k = 0; k <= i; k++) 
                System.out.print("* ");
            System.out.println(" ");
        }
        for (int i = altura - 2; i >= 0; i--) {
            for (int j = 0; j < altura - i - 1; j++) 
                System.out.print(" ");
            for (int k = 0; k <= i; k++) 
                System.out.print("* ");
            System.out.println(" ");
        }
    }
}
