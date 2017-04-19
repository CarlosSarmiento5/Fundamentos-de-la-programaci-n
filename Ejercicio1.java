
package ejercicio.pkg1;
 import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
       
        // Creacion de variable para pedir por consola los datos
        Scanner icant = new Scanner(System.in);  
        
        // Creacion de variables
        int cant=0;
        double cmat, cfijo, total=0; 
        
        // Asignacion de variables
        cmat=3.5;
        cfijo=10700;        
        
        // Solicitud de variables al usuario
        System.out.print("Ingrese el numero de unidades a producir: ");
       cant=icant.nextInt();
               
        // Realiza las operaciones
        total=cmat*cant+cfijo;
        
        // Salida en pantalla
        System.out.print("El costo total del articulo es: "+total+"\n");
        
    }
    
}

