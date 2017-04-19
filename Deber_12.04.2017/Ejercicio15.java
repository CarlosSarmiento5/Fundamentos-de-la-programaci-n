/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg8;

import java.util.Scanner;

public class Ejercicio8 {

       public static void main(String[] args) {
        // Creacion de variable para pedir por consola los datos
        Scanner valor = new Scanner(System.in);  
        
        // Creacion de variables
        double dolar;
        double cambio1, cambio2, cambio3, cambio4;
        double yen, peset, libr=0,marcos=0;
        
        // Solicitud de variables al usuario
        System.out.print("Ingrese los dolares: ");
        dolar=valor.nextDouble();
        System.out.print("Ingrese el tipo de cambio a yenes: ");
        cambio1=valor.nextDouble();
        System.out.print("Ingrese el tipo de cambio a pesetas: ");
        cambio2=valor.nextDouble();
        System.out.print("Ingrese el tipo de cambio a libras: ");
        cambio3=valor.nextDouble();
        System.out.print("Ingrese el tipo de cambio a marcos: ");
        cambio4=valor.nextDouble();
                      
        // Realiza las operaciones
        yen=dolar*cambio1;
        peset=dolar*cambio2;
        libr=dolar*cambio3;
        marcos=dolar*cambio4;
        
        // Salida en pantalla
        System.out.print(+dolar+" dolares equivale a : \n");
        System.out.print(+yen+" yenes \n");
        System.out.print(+peset+" pesetas \n");
        System.out.print(+libr+" libras \n");
        System.out.print(+marcos+" marcos \n");
    }
    
}