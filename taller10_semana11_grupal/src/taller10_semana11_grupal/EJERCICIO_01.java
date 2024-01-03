package taller10_semana11_grupal;
/**
 * @author RICARDO ESPINOSA Y JUAN DIEGO GUERRERO
 */
public class EJERCICIO_01 {
    public static void main(String[] args) {
        String nomAbad[] = {"Juan S.", "Juan D.", "Ricardo", "Carlos", "Flor", "Jesus"};
        int limEst = nomAbad.length, limNotas = 3;
        double matNotas [][] = new double [limEst][limNotas];
        double arrPromedio[] = new double[limEst];
        double numeroMayor, numeroMenor, promedioTotal = 0;
        String nombreMayor, nombreMenor;
        for (int i = 0; i < limEst; i++) 
            for (int j = 0; j < limNotas; j++)
                matNotas[i][j] = (double)(Math.random()*9+1);
        for (int i = 0; i < limEst; i++) {
            arrPromedio[i] = (matNotas[i][0]*0.35)+(matNotas[i][1]*0.35)+(matNotas[i][2]*0.30);
        }
        for (int i = 0; i < limEst; i++) {
            promedioTotal += arrPromedio[i];
        }
        promedioTotal = promedioTotal/limEst;
        numeroMayor = arrPromedio[0];
        numeroMenor = arrPromedio[0];
        nombreMayor = nomAbad [0];
        nombreMenor = nomAbad [0];
        for (int i = 1; i < limEst; i++) {
            if (numeroMayor<arrPromedio[i]){
                numeroMayor = arrPromedio[i];
                nombreMayor = nomAbad[i];
            }
            else 
                if (numeroMenor>arrPromedio[i]){
                    numeroMenor = arrPromedio[i];
                    nombreMenor = nomAbad[i];
                }
        }
        System.out.println("NOMBRES | ACD   | APE   | AA    | PROMEDIOS");
        for (int i = 0; i < limEst; i++){
            System.out.print(nomAbad[i] + "\t");
            for (int j = 0; j < limNotas; j++)
                    System.out.printf("| %.2f \t", matNotas[i][j]);
            System.out.printf("| %.2f \t", arrPromedio[i]);
            System.out.println("");
        }
        System.out.printf("%s%.2f\n","Promedio del curso: ", promedioTotal);
        System.out.println("Mayores al promedio del curso: ");
        for (int i = 0; i < limEst; i++) {
            if(arrPromedio[i]>promedioTotal)
                System.out.printf("%s | %.2f\n", nomAbad[i],arrPromedio[i]);
        }
        System.out.println("Menores al promedio del curso: ");
        for (int i = 0; i < limEst; i++) {
            if(arrPromedio[i]<promedioTotal)
                System.out.printf("%s | %.2f\n", nomAbad[i],arrPromedio[i]);
        }
        System.out.printf("%s%.2f%s%s\n", "Nota mayor: ", numeroMayor, " que pertenece a ", nombreMayor);
        System.out.printf("%s%.2f%s%s" , "Nota menor: ", numeroMenor, " que pertenece a ", nombreMenor);
        System.out.println("");
    }
}