/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.pkg2.pkg2.pkgswitch;

 import java.util.Scanner;
public class Clase22Switch {

       public static void main(String[] args) {
       
        // Creacion de variable para pedir por consola los datos
        Scanner datos = new Scanner(System.in); 
        String opcion; 
        
        // Creacion de variables
        char departamento;
        
 
        // Solicitud de variables al usuario
        System.out.print("Ingrese la letra del departamento: ");
        opcion=datos.next();
        
        departamento = opcion.charAt(0);
         switch(departamento)
         {
             case 'A':
                 System.out.print("desarrollo ");
                 break;
             case 'B':
                 System.out.print("recursos humanos");
                 break;
             case 'C':
                 System.out.print("dinanzas");
                 break;
             case 'D':
                 System.out.print("mercadeo");
                 break;
             default:
                 System.out.print("departamento invalido ");
        
             
 
        
         }
         System.out.println("Codigo para la el departamento es: "+departamento);
      
        
       
        
    }
    
}