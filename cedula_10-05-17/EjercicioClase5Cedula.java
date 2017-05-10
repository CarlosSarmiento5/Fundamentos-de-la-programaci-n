/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.clase.pkg5.cedula;
import java.util.Scanner;
public class EjercicioClase5Cedula {

    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        //Creación de variables
        int a,b,c,d,e,f,g,h,i,j;
        int compa,uni,dec,total,suma,mod;

        //Ingreso de datos desde pantalla  
          System.out.print("Ingrese el numero de la cedula : ");
          a= datos.nextInt();
          b= datos.nextInt();
          c= datos.nextInt();
          d= datos.nextInt();
          e= datos.nextInt();
          f= datos.nextInt();
          g= datos.nextInt();
          h= datos.nextInt();
          i= datos.nextInt();
          j= datos.nextInt();
          
        
        // Proceso
         a=a*2;
         b=b*1;
         c=c*2;
         d=d*1;
         e=e*2;
         f=f*1;
         g=g*2;
         h=h*1;
         i=i*2;
         
         //condición
        if(a>=10){
         uni=(a/10);
         dec=(a%10);
         a=uni+dec;
        }
        if(b>=10){
         uni=(b/10);
         dec=(b%10);
         b=uni+dec;
        }
        if(c>=10){
         uni=(c/10);
         dec=(c%10);
         c=uni+dec;
        }
        if(d>=10){
         uni=(d/10);
         dec=(d%10);
         d=uni+dec;
        }
        if(e>=10){
         uni=(e/10);
         dec=(e%10);
         e=uni+dec;
        }
        if(f>=10){
         uni=(f/10);
         dec=(f%10);
         f=uni+dec;
        }
        if(g>=10){
         uni=(g/10);
         dec=(g%10);
         g=uni+dec;
        }
        if(h>=10){
         uni=(h/10);
         dec=(h%10);
         h=uni+dec;
        }
        if(i>=10){
         uni=(i/10);
         dec=(i%10);
         i=uni+dec;
        }
        //suma de dijitos
        suma=a+b+c+d+e+f+g+h+i;
        //verificación de la cedula
   
        System.out.println("La suma de los digitos: "+suma); 
         mod=suma%10;
         total=suma+10-mod;
        System.out.println("Inmediato superior decimal: "+total);    
 
         compa=total-suma;
         System.out.println("Digito a comparar: "+compa);
         System.out.println("Ultimo digito: "+j);
         if(compa==j){
          System.out.println("Su cedula es correcta");
         }else{
          System.out.println("Su cedula es incorrecta");
         }       
    }
}