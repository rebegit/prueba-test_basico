
package pruebas_practicas;

import java.util.Scanner;

/**
 *
 * @author Rebeca
 */
public class PruebaPractica_1 {

    public static void main(String[] args) {
       Scanner lector = new Scanner(System.in);

        System.out.println("Introduce un numero para LEER NUMERO");
        int numero = lector.nextInt();
        
        if(numero==0){
            System.out.println("El numero introducido no es par ni impar, es 0");
        }else if (numero%2==0){
            System.out.println("El numero introducido es par");
            for (int i=numero; i>-1; i--){
                if (i%2==0){
                 System.out.println(i);
                }
            }
        } else{
            System.out.println("El numero introducido es impar");
            for (int i=numero; i>0; i--){
               if (i%2!=0){
                 System.out.println(i);
               }
            }
        }
     
    }
    
}
