
package pruebas_practicas;

import java.util.Scanner;

/**
 *
 * @author Rebeca
 */
public class PruebaPractica_2 {
     public static void main(String[] args) {
 
        Scanner scanner = new Scanner(System.in);
              
        int edad, femeninas_menores, i, masculinos_mayores, personas_mayores;
        int personas_menores, sexo, femeninas,contm,contf , total;
        double porcentaje_de_mayores, porcentaje_de_femeninas;
        femeninas_menores = 0;
        femeninas=0;
        masculinos_mayores = 0;
        personas_mayores = 0;
        personas_menores = 0;
        porcentaje_de_mayores = 0;
        porcentaje_de_femeninas=0;
        total=50;
        
        int personas[][]=new int [total][2];
        
       
        for (i=0; i<total; i++) {
            System.out.print("PERSONA " + (i+1));
           
            System.out.println("-Ingresa el valor de edad: ");
            edad = scanner.nextInt();
            personas[i][1]=edad;
            
            System.out.println("Selecciona el valor de sexo.");
            System.out.println("\t1.- Hombre");
            System.out.println("\t2.- Mujer");
            System.out.print("\t: ");
            do {
                sexo = scanner.nextInt();
                if (sexo<1||sexo>2)
                    System.out.print("Valor incorrecto. Ingresalo nuevamente.: ");
            } while (sexo<1||sexo>2); 
           personas[i][0]=sexo;
        }
        
        System.out.println("***VECTOR***");
        for (int w = 0; w < personas.length; ++w) {
          System.out.println("PERSONA "+(w+1));
          contm=0;
          contf=0;
          for(int z = 0; z < personas[w].length; ++z) {
             
             if(z<1){
                 if(personas[w][z]==1){
                  System.out.println("-SEXO: HOMBRE");
                    contm++;
                 }
                 else{
                    System.out.println("-SEXO: MUJER");
                    femeninas++;
                    contf++;
                 }
             }                   

             if(z>=1){
                System.out.println("-EDAD: "+ personas[w][z]);
                 if(personas[w][z]>=18){
                   personas_mayores++;
                   if(contm>0){

                       masculinos_mayores=masculinos_mayores+1;
                   }
                 }
                 else{
                    personas_menores++;
                    if(contf>0){
                       femeninas_menores=femeninas_menores+1;
                   }
                 }
             }
           }
           System.out.println("**");
         }
        porcentaje_de_mayores=(personas_mayores*100)/total;
        porcentaje_de_femeninas=(femeninas*100)/total;   
        
        System.out.println("***RESULTADOS***");
        System.out.println("A.Cantidad de personas mayores de edad: " + personas_mayores);
        System.out.println("B.Cantidad de personas menores de edad: " + personas_menores);
        System.out.println("C.Cantidad de personas masculinas mayores de edad: " + masculinos_mayores);
        System.out.println("D.Cantidad de personas femeninas menores de edad: " + femeninas_menores);
        System.out.println("E.Porcentaje que representan las personas mayores de edad respecto al total de personas: " + porcentaje_de_mayores+"%");
        System.out.println("F.Porcentaje que representan las mujeres respecto al total de personas: " + porcentaje_de_femeninas+"%");
        System.out.println("*******");
        
     }
     

}