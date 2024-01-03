package taller10_semana11_grupal;
import java.util.Scanner;
/**
 * @author RICARDO ESPINOSA Y JUAN DIEGO GUERRERO
 */
public class EJERCICIO_04 {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        int fila, columna;
        char jugadorActual = 'X';
        char[][] tablero = {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}
        };
        for (int turno = 0; turno < 9; turno++) {
            for (int i = 0; i < tablero.length; i++) {
                for (int j = 0; j < tablero[i].length; j++) {
                    System.out.print(tablero[i][j] + "|");
                }
                System.out.println("\n-----");
            }
            System.out.printf("Jugador " + jugadorActual + " ingresa una fila: ");
            fila = tc.nextInt();
            System.out.printf("Jugador " + jugadorActual + " ingresa una columna: ");
            columna = tc.nextInt();
            while (tablero[fila][columna] != ' ') {
                System.out.println("Ocupada por una: " + jugadorActual + " Intentalo de nuevo");
                System.out.println("Jugador " + jugadorActual + " ingresa una fila: ");
                fila = tc.nextInt();
                System.out.printf("Jugador " + jugadorActual + " ingresa una columna: ");
                columna = tc.nextInt();
            }
            tablero[fila][columna] = jugadorActual;
            if ((tablero[0][0] == jugadorActual && tablero[0][1] == jugadorActual && tablero[0][2] == jugadorActual) ||
                    (tablero[1][0] == jugadorActual && tablero[1][1] == jugadorActual && tablero[1][2] == jugadorActual) ||
                    (tablero[2][0] == jugadorActual && tablero[2][1] == jugadorActual && tablero[2][2] == jugadorActual) ||
                    (tablero[0][0] == jugadorActual && tablero[1][0] == jugadorActual && tablero[2][0] == jugadorActual) ||
                    (tablero[0][1] == jugadorActual && tablero[1][1] == jugadorActual && tablero[2][1] == jugadorActual) ||
                    (tablero[0][2] == jugadorActual && tablero[1][2] == jugadorActual && tablero[2][2] == jugadorActual) ||
                    (tablero[0][0] == jugadorActual && tablero[1][1] == jugadorActual && tablero[2][2] == jugadorActual) ||
                    (tablero[0][2] == jugadorActual && tablero[1][1] == jugadorActual && tablero[2][0] == jugadorActual)) {
                // Imprimir el tablero actual después de ganar
                for (int i = 0; i < tablero.length; i++) {
                    for (int j = 0; j < tablero[i].length; j++) {
                        System.out.print(tablero[i][j] + "|");
                    }
                    System.out.println(" \n");
                }
                System.out.println("¡El jugador" + jugadorActual + "ha ganado!\n");
                break;
            }
            jugadorActual = (jugadorActual == 'X') ? 'O' : 'X';
            if (turno == 8) {
                for (int i = 0; i < tablero.length; i++) {
                    for (int j = 0; j < tablero[i].length; j++) {
                        System.out.print(tablero[i][j] + "|");
                    }
                    System.out.println(" \n");
                }
                System.out.println("Empate");
            }
        }
    }
}