
package ejercicios;

import java.io.*;
public class ejercicio01 {
    public static void main(String[] args)throws IOException
    { 
        BufferedReader leer=new BufferedReader(new InputStreamReader(System.in));
     
        int n1,n2;
        double promedio;
        
        System.out.print("Ingresa el primer número: ");
        n1=Integer.parseInt(leer.readLine());
        
        System.out.print("Ingresa el segundo número: ");
        n2=Integer.parseInt(leer.readLine());
        
        promedio=(n1+n2)/2.0;
        System.out.println("Promedio: " +promedio);
       
        
    }
    
}
