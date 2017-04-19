
package ejercicio.pkg5;

 import java.util.Scanner;
public class Ejercicio5 {

   public static void main(String[] args) {
           //CREO UNA VARIABLE PARA PEDIR POR CONSOLA LOS DATOS

        Scanner artic= new Scanner(System.in);
        Scanner costo= new Scanner(System.in);

        
       // Creación de variables

       String arti;
       double cost,util,impu,preciov,imputotal,utiltotal;
      // Asignacion de variables
        impu=0.15;
        util=1.5;
       
       //solicitud de valriables al usuario
     
      
       System.out.print("Ingrese el nombre del articulo: ");
       arti = artic.next();
       System.out.print("Ingrese el costo del articulo: ");
       cost =costo.nextDouble();
    
     
       //realizo la operación
       utiltotal=cost*util;
       imputotal=cost*impu;
       preciov=cost+imputotal+utiltotal;
              
       //salida de pantalla
       
       
       System.out.print("El articulo "+arti+" tiene una utilidad de "+utiltotal+",\n");
       System.out.print("un impuesto de "+imputotal+" y un precio de venta de "+preciov+"\n");
    }
    
}
