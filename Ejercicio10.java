
package ejercicio.pkg10;

import static java.lang.Math.cos;
import static java.lang.Math.sin;
import java.util.Scanner;
public class Ejercicio10 {

    public static void main(String[] args) {
        // Creacion de variable para pedir por consola los datos
        Scanner datos = new Scanner(System.in);  
        
        // Creacion de variables
        double grad;
        double rad, sen, cose;
        
        // Solicitud de variables al usuario
        System.out.print("Ingrese el angulo en grados: ");
        grad=datos.nextDouble();
                      
        // Realiza las operaciones
        rad=grad*3.14/180;
        sen=sin(rad);
        cose=cos(rad);
        
        // Salida en pantalla
        System.out.print("El seno es: "+sen+"");
        System.out.print("El coseno es: "+cose);
        
       
    }

   
    
}