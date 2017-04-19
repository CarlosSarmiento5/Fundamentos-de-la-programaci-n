/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg4;

 import java.util.Scanner;
public class Ejercicio4 {

    public static void main(String[] args) {
           //CREO UNA VARIABLE PARA PEDIR POR CONSOLA LOS DATOS

        Scanner iC= new Scanner(System.in);
      

        
       // Creación de variables

       
       double C,F;
     
       
       //solicitud de valriables al usuario
     
      
       System.out.print("Ingrese los grados Celsius a convertir a Fahrenheit: ");
       C= iC.nextDouble();
    
     
       //realizo la operación
       F=(9*C)/5+32;
       
       //salida de pantalla
       
       
       System.out.print("La temperatura fahrenheit equivalente es: "+F+" grados");
    }
    
}
