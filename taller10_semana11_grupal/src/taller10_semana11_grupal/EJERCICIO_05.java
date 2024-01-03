package taller10_semana11_grupal;

import java.util.Random;
import java.util.Scanner;

/**
 * @author RICARDO ESPINOSA Y JUAN DIEGO GUERRERO
 */
public class EJERCICIO_05 {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Ingrese el número de filas de la primera matriz:");
        int filas1 = tc.nextInt();
        System.out.println("Ingrese el número de columnas de la primera matriz:");
        int columnas1 = tc.nextInt();
        System.out.println("Ingrese el número de filas de la segunda matriz:");
        int filas2 = tc.nextInt();
        System.out.println("Ingrese el número de columnas de la segunda matriz:");
        int columnas2 = tc.nextInt();
        int[][] matriz1 = new int[filas1][columnas1];
        int[][] matriz2 = new int[filas2][columnas2];
        int[][] resultado = new int[filas1][columnas2];
        MatAleatoria(matriz1, random);
        MatAleatoria(matriz2, random);
        System.out.println("Matriz A:");
        mostrarMatriz(matriz1);
        System.out.println("Matriz B:");
        mostrarMatriz(matriz2);
        multMatrices(matriz1, matriz2, resultado);
        System.out.println("Resultado de la multiplicación:");
        mostrarMatriz(resultado);
    }
    private static void MatAleatoria(int[][] matriz, Random random) {
        int filas = matriz.length;
        int columnas = matriz[0].length;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                int numero;
                numero = random.nextInt(19) - 9;
                matriz[i][j] = numero;
            }
        }
    }
    private static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }
    private static void multMatrices(int[][] matriz1, int[][] matriz2, int[][] resultado) {
        int filasA = matriz1.length;
        int columnasA = matriz1[0].length;
        int columnasB = matriz2[0].length;

        for (int i = 0; i < filasA; i++) {
            for (int j = 0; j < columnasB; j++) {
                int sum = 0;
                for (int k = 0; k < columnasA; k++) {
                    sum += matriz1[i][k] * matriz2[k][j];
                }
                resultado[i][j] = sum;
            }
        }
    }
}