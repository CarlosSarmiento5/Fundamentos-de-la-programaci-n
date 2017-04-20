/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.pkg2.pkg3.materia;

  import java.util.Scanner;
public class Clase23Materia {

          public static void main(String[] args) {
       
        // Creacion de variable para pedir por consola los datos
        Scanner datos = new Scanner(System.in);  
        
        // Creacion de variables
        String dia;
        
 
        // Solicitud de variables al usuario
        System.out.print("Ingrese el dia de la materia: ");
        dia=datos.next();
        
       
         switch(dia)
         {
             case "Lunes":
                 System.out.print("desarrollo espiritual");
                 break;
             case "Martes":
                 System.out.print("logica matematica");
                 break;
             case "Miercoles":
                 System.out.print("programacion");
                 break;
             case "Jueves ":
                 System.out.print("fisica ");
                 break;
             case "Viernes":
                 System.out.print("farra");
                 break;
             default:
                 System.out.print("materia invalido ");
        
             
 
        
         }
         System.out.println("Codigo para la el departamento es: "+dia);
      
        
       
        
    }
    
}
