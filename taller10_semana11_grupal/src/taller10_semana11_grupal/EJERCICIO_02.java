package taller10_semana11_grupal;
/**
 * @author RICARDO ESPINOSA Y JUAN DIEGO GUERRERO
 */
import java.util.Objects;
import java.util.Scanner;
public class EJERCICIO_02 {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        String nombreAux = null, seguir = null;
        int filas = 0, opcion = 0, opcion2 = 0;
        System.out.println("***BIENVENIDO***");
        System.out.println("Agrega tus productos para empezar con el programa:");
        System.out.println("Cuantos productos vas a agregar?");
        filas = tc.nextInt();
        String nombreProducto [] = new String [filas]; //Arreglo para guardar los nombres de cada producto
        double precioCantidad[][] = new double [filas][2]; //Arreglo para guardar el precio y la cantidad de cada producto
        System.out.println("Ingresa uno por uno cada producto con sus datos");
        for(int i=0; i<filas; i++){
        System.out.println("Ingresa el nombre del producto: " + (i + 1));
        nombreProducto[i] = tc.next();
        System.out.println("Ingresa precio y seguidamente unidades: " + (i + 1));
            for(int j=0; j<2; j++)
                precioCantidad[i][j] = tc.nextDouble();
        }
        do{
            System.out.println("Selecciona la opcion correspondiente a lo que deseas realizar");
            System.out.println("1 -- Actualizar caracteristicas");
            System.out.println("2 -- Buscar un producto");
            System.out.println("3 -- Eliminar un producto");
            opcion = tc.nextInt();
            switch (opcion){
                case 1:
                     System.out.println("Selecciona que caracteristica vas a modificar");
                    System.out.println("1 -- nombre");
                    System.out.println("2 -- precio");
                    System.out.println("3 -- unidades");
                    opcion2 = tc.nextInt();
                    switch (opcion2) {
                        case 1:
                            System.out.println("Ingresa el nombre del producto que vas a modificar");
                            nombreAux = tc.next();
                            for (int i=0; i<filas; i=i+1) {
                                if (nombreAux.equals(nombreProducto[i])){
                                    System.out.println("Ingresa el nuevo nombre del producto");
                                    nombreProducto[i] = tc.next();
                                }
                            }
                            break;
                        case 2:
                            System.out.println("Ingresa el nombre del producto del que vas a cambiar su precio");
                            nombreAux = tc.next();
                            for (int i=0; i<filas; i++) {
                                for (int j=0; j<2; j++) {
                                    if (nombreAux.equals(nombreProducto[i])){
                                    System.out.println("Ingresa el nuevo precio del producto");
                                    precioCantidad[i][j] = tc.nextDouble();
                                    }
                                    break;
                                }
                            }
                            break;
                        case 3:
                            System.out.println("Ingresa el nombre del producto del que vas a cambiar sus unidades");
                            nombreAux = tc.next();
                            for (int i=0; i<filas; i++) {
                                for (int j=0; j<2; j++){
                                    if (nombreAux.equals(nombreProducto[i])){
                                    System.out.println("Ingresa las unidades actuales del producto");
                                    precioCantidad[i][j+1] = tc.nextDouble();
                                    }
                                    break;
                                }
                            }
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Ingresa el nombre del producto que vas a buscar");
                    nombreAux = tc.next();
                    for(int i=0; i<filas; i++) {
                        for(int j=0; j<2; j++) {
                            if (nombreAux.equals(nombreProducto[i])){
                                System.out.println("El producto: " + nombreProducto[i]);
                                System.out.println("Tiene un precio de: $" + precioCantidad[i][j]);
                                System.out.println("Y dispones de: " + precioCantidad[i][j+1] + " Unidades");
                            }
                            break;
                        }
                    }
                    break;
                case 3:
                    System.out.println("Ingresa el nombre del producto que vas a buscar");
                    nombreAux = tc.next();
                    for(int i=0; i<filas; i++) {
                        for(int j=0; j<2; j++) {
                            if (nombreAux.equals(nombreProducto[i])){
                                nombreProducto[i] = "No existe";
                                precioCantidad[i][j] = 0;
                                precioCantidad[i][j+1] = 0;
                            }
                            break;
                        }
                    }
                    break;
                default:
                    System.out.println("Opcion no disponible");
                    break;
            }
            System.out.println("Deseas seguir en el programa?");
            seguir = tc.next();
        }while(seguir.equals("si"));
    }
}