
package ejercicio.pkg2;

import java.util.Scanner;
public class Ejercicio2 {

    public static void main(String[] args) {
           //CREO UNA VARIABLE PARA PEDIR POR CONSOLA LOS DATOS

        Scanner ihora= new Scanner(System.in);
      

        
       // Creación de variables

       
       double hora,minuto,segundo,dia;     
       
       //asignación de variables
      
       double dia1=24.0,min=60.0,seg=360.0;
       
       //solicitud de valriables al usuario
     
      
       System.out.print("Ingrese la cantidad de horas: ");
       hora= ihora.nextDouble();
    
     
       //realizo la operación
       minuto=hora*min;
       segundo=hora*seg;
       dia=hora/dia1;
       
       //salida de pantalla
       
       
       System.out.print("Las "+hora+" horas equivalen a \n"+minuto+" minutos \n"+segundo+" segundos \n"+dia+" dias");
    }
    
}