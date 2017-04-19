/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;

 import java.util.Scanner;
public class Ejercicio7 {

    public static void main(String[] args) {
           //CREO UNA VARIABLE PARA PEDIR POR CONSOLA LOS DATOS

        Scanner iradio= new Scanner(System.in);

       // Creación de variables

    
       double radio,pi,volumen,area;
       //Declaracion de variables
       pi=3.14;
              
      
       System.out.print("Ingrese el radio de la esfera: ");
       radio = iradio.nextDouble();
    
     
       //realizo la operación
       volumen=(4*pi*(radio*radio*radio))/3;
       area=pi*(radio*radio);
       
              
       //salida de pantalla
       
       
       System.out.print("El volumen de la esfera es de:"+volumen);
       System.out.print("El area de la esfera es de:"+area);
    }
    
}

