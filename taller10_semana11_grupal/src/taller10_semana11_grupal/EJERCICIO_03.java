package taller10_semana11_grupal;
/**
 * @author RICARDO ESPINOSA Y JUAN DIEGO GUERRERO
 */
import java.util.Scanner;
public class EJERCICIO_03 {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        String nombreAux = null, seguir = null;
        int filas = 0, opcion = 0, opcion2 = 0, codigo = 0;
        double total = 0, IVA = 0, fin = 0;
        System.out.println("***BIENVENIDO***");
        System.out.println("FERRETERIA LA SEMILLA");
        String nombreProducto [] = new String [10];
        nombreProducto[0] = "Martillo";
        nombreProducto[1] = "Taladro";
        nombreProducto[2] = "Caladora";
        nombreProducto[3] = "Sierra";
        nombreProducto[4] = "Destornillador";
        double precioCantidad[][] = new double [10][2];
        precioCantidad[0][0] = 5;//-Precio Matrillo-
        precioCantidad[0][1] = 10;//Unidades Martillo 
        precioCantidad[1][0] = 40;//-Precio Taladro-
        precioCantidad[1][1] = 5;//Unidades Taladro
        precioCantidad[2][0] = 80;//-Precio Caladora-
        precioCantidad[2][1] = 5;//Unidades Caladora
        precioCantidad[3][0] = 15;//-Precio Sierra-
        precioCantidad[3][1] = 10;//Unidades Sierra
        precioCantidad[4][0] = 8;//-Precio Destornillador-
        precioCantidad[4][1] = 30;//Unidades Destornillador
        do{
            System.out.println("VENDER UN PRODUCTO");
            System.out.println("CODIGOS:");//El codigo es el indice
            System.out.println("Martillo: 0");
            System.out.println("Taladro: 1");
            System.out.println("Caladora: 2");
            System.out.println("Sierra: 3");
            System.out.println("Destornillador: 4");
            codigo = tc.nextInt();
                for(int i=0; i<filas; i++) {
                    for(int j=0; j<2; j++) {
                        if (codigo == i){
                            total = total + precioCantidad[i][j];//Se van sumando los precios
                            precioCantidad[i][j+1] = precioCantidad[i][j+1] - 1; //Se restan las unidades
                        }
                        break;
                    }
                }
            System.out.println("Deseas seguir vendiendo? (si/no)");
            seguir = tc.next();
        }while(seguir.equals("si"));
        IVA = total * 0.12;
        fin = total + IVA;
        System.out.println("*****FACTURA******");
        System.out.println("Subtotal: " + total);
        System.out.println("IVA: " + IVA);
        System.out.println("TOTAL: " + fin);
    }
}