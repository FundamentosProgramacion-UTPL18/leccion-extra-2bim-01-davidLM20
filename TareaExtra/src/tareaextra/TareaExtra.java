/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareaextra;

/**
 *
 * @author jhand
 */
public class TareaExtra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // DECLARACION DE VARIABLES
        double[] arreglo1 = {110, 220, 430, 140, 250, 460};
        double[] arreglo2 = {10, 20, 30, 40, 50, 60};
        double[] arreglo3 = new double[6];
        double promedio = 0;
        double suma = 0;
        // Encabezados
        System.out.println("Arreglo1\tArreglo2\tResultado");
        // Primer ciclo for 
        for (int i = 0; i < arreglo3.length; i++) {
            // suma de datos y division para guardar en el nuevo arreglo 
            arreglo3[i] = (arreglo1[i] + arreglo2[i]) / 2;
            //suma para el nuevo arreglo
            suma = arreglo3[i] + suma;
        }
        //promedio del final 
        promedio = suma / 6;
        //segundo ciclo for para presentar resultados
        for (int i = 0; i < arreglo3.length; i++) {
            System.out.printf("%.0f\t\t%.0f\t\t%.0f\n", arreglo1[i], arreglo2[i], arreglo3[i]);
        }
        //print para presentar el promedio final
        System.out.println("");
        System.out.printf("El promedio de arreglo3 es: %.0f\n", suma);
    }

}
