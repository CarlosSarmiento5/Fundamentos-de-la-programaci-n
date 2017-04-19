/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg9;
 import static java.lang.Math.cos;
 import static java.lang.Math.sin;
 import java.util.Scanner;

public class Ejercicio9 {

 public static void main(String[] args) {
        // Creacion de variable para pedir por consola los datos
        Scanner iangulo = new Scanner(System.in);  
        
        // Creacion de variables
        double ang;
        double tang, ctn, scn, csc;
        
        // Solicitud de variables al usuario
        System.out.print("Ingrese el angulo en radianes: ");
        ang=iangulo.nextDouble();
                      
        // Realiza las operaciones
        tang=sin(ang)/cos(ang);
        ctn=1/tang;
        scn=1/cos(ang);
        csc=1/sin(ang);
        
        // Salida en pantalla
        System.out.print("La tangente es: "+tang+"\n");
        System.out.print("La cotangente es: "+ctn+"\n");
        System.out.print("La secante es: "+scn+"\n");
        System.out.print("La cosecante es: "+csc+"\n");
       
    }

   
    
}
