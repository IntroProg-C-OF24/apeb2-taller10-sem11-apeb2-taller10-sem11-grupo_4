package taller10_semana11_grupal;
/**
 * @author RICARDO ESPINOSA Y JUAN DIEGO GUERRERO
 */
import java.util.Scanner;
public class EJERCICIO_06 {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        int filas = 0, columnas = 0, operacion = 0;
        String opcion = null;
        System.out.println("Ingresa las filas de la matriz");
        filas = tc.nextInt();
        System.out.println("Ingresa las columnas de la matriz");
        columnas = tc.nextInt();
        int matriz1 [][] = new int [filas][columnas];
        int matriz2 [][] = new int [filas][columnas];
        int resultado [][] = new int [filas][columnas];
        for (int i = 0; i < filas; i++) { //Llenar matriz 1
            for (int j = 0; j < columnas; j++) {
                matriz1[i][j] = (int) (Math.random() * 9) + -9;
            }
        }
        for (int i = 0; i < filas; i++) { //Llenar matriz 2
            for (int j = 0; j < columnas; j++) {
                matriz2[i][j] = (int) (Math.random() * 9) + -9;
            }
        }
        System.out.println("MATRIZ 1");
        for (int i = 0; i < filas; i++) { //Mostrar matriz 1
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz1[i][j]+"\t");
            }
            System.out.println(" ");
        }
        System.out.println("MATRIZ 2");
        for (int i = 0; i < filas; i++) { //Mostrar matriz 2
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz1[i][j]+"\t");
            }
            System.out.println(" ");
        }
        do {
            System.out.println("ELIGE LA OPERACION: ");
            System.out.println("1 -- SUMA");
            System.out.println("2 -- RESTA");
            operacion = tc.nextInt();
            switch (operacion) {
                case 1:
                    for (int i = 0; i < filas; i++) { //sumar
                        for (int j = 0; j < columnas; j++)
                            resultado[i][j] = matriz1[i][j] + matriz2[i][j];
                    }
                    break;
                case 2:
                    for (int i = 0; i < filas; i++) { //restar
                        for (int j = 0; j < columnas; j++)
                            resultado[i][j] = matriz1[i][j] - matriz2[i][j];
                    }
                    break;
                default:
                    System.out.println("Opcion no disponible");
            }
            System.out.println("RESULTADO");
        for (int i = 0; i < filas; i++) { //Mostrar resultado
            for (int j = 0; j < columnas; j++) {
                System.out.print(resultado[i][j]+"\t");
            }
            System.out.println(" ");
        }
            System.out.println("Quieres seguir con el programa (si/no)");
            opcion = tc.next();
        } while (opcion.equals("si"));
        
        
    }
}