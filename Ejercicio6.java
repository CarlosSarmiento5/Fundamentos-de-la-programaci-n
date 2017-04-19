/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg6;

 import java.util.Scanner;
public class Ejercicio6 {

    public static void main(String[] args) {
           //CREO UNA VARIABLE PARA PEDIR POR CONSOLA LOS DATOS

        Scanner idolar= new Scanner(System.in);
        

        
       // Creación de variables

    
       double dolar,peso,pesomex;
       //declaracion de variables
       peso=18.6018825;
      
    
       //solicitud de valriables al usuario
       
       System.out.print("Ingrese la cantidad de dolares a cambiar a pesos: ");
       dolar = idolar.nextDouble();
    
     
       //realizo la operación
       pesomex = dolar*peso;
              
       //salida de pantalla
       
       
       System.out.print("Se debe pagar la cantidad de "+pesomex+" pesos por "+dolar+" dolares.");
       
    }
    
}

