/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg3;
 import java.util.Scanner;
public class Ejercicio3 {

     public static void main(String[] args) {
           //CREO UNA VARIABLE PARA PEDIR POR CONSOLA LOS DATOS

        Scanner iseg= new Scanner(System.in);
      

        
       // Creación de variables

       
       int vluz,seg,km; 
     
       
       //asignación de variables
      
       int vlluz=300000;
       
       //solicitud de valriables al usuario
     
      
       System.out.print("Ingrese el tiempo en segundos: ");
       seg= iseg.nextInt();
    
     
       //realizo la operación
       km = vlluz*seg;
       
       //salida de pantalla
       
       
       System.out.print("La distancia que recorre la luz en "+seg+" segundos es de: "+km+" kilometros");
    }
    
}
