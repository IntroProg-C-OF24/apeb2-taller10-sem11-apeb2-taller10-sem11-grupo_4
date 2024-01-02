package taller10_semana11_grupal;
/**
 * @author RICARDO ESPINOSA Y JUAN DIEGO GUERRERO
 */
import java.util.Random;
public class EJERCICIO_07 {
    public static void main(String[] args) {
        int tamano = 5; 

        // Crear la matriz cuadrada con números aleatorios únicos
        int[][] matriz = new int[tamano][tamano];
        Random random = new Random();

        for (int i = 0; i < tamano; i++) { //Llenar matriz
            for (int j = 0; j < tamano; j++) {
                matriz[i][j] = (int) (Math.random() * 9) + -9;
            }
        }

        // Mostrar la matriz original
        System.out.println("Matriz Original:");
        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j < tamano; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        // Mostrar elementos de la diagonal secundaria
        System.out.println("\nElementos de la Diagonal Secundaria:");
        for (int i = 0; i < tamano; i++) {
            System.out.print(matriz[i][tamano - 1 - i] + " ");
        }
        System.out.println();

        // Mostrar elementos sobre la diagonal secundaria
        System.out.println("\nElementos sobre la Diagonal Secundaria:");
        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j < tamano; j++) {
                if (j > tamano - 1 - i) {
                    System.out.print(matriz[i][j] + " ");
                } else {
                    System.out.print("  ");
                }
            }
        }
        System.out.println();

        // Mostrar elementos bajo la diagonal secundaria
        System.out.println("\nElementos bajo la Diagonal Secundaria:");
        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j < tamano; j++) {
                if (j < tamano - 1 - i) {
                    System.out.print(matriz[i][j] + " ");
                } else {
                    System.out.print("  ");
                }
            }
        }
        System.out.println();
    }
}