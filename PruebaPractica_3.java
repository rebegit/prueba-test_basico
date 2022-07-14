
package pruebas_practicas;

import java.util.Scanner;

/**
 *
 * @author Rebeca
 */
public class PruebaPractica_3 {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         
         int horas_trabajadas=0;
         double tarifa=0;
         double sueldo=0;
         int max_horas=40;
         int resto_horas=0;
         double tarifaplus=0;
         
         System.out.println("Ingresa horas trabajadas: ");
         horas_trabajadas = scanner.nextInt();
         System.out.println("Ingresa tarifa: ");
         tarifa = scanner.nextDouble();
         
         if (horas_trabajadas<=max_horas){
             sueldo=horas_trabajadas*tarifa;
         } else {
            resto_horas= horas_trabajadas-max_horas;
            tarifaplus=((tarifa*50)/100)+tarifa;
            sueldo=(resto_horas*tarifaplus)+(max_horas*tarifa); 
         }
         System.out.println("Sueldo semanal: "+ sueldo +"€");
         
     }
     
}
