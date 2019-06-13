package ejercicios;

import java.io.*;

public class ejercicio02 {
    public static void main(String[] args)throws IOException
    {
        BufferedReader leer=new BufferedReader(new InputStreamReader(System.in));
        
        int d1,d2,b1,b2,altura,dato;
        double R,T;
        
        System.out.print("Escribe 1 para hallar ela área del rombo y 2 para el trapecio ");
        dato= Integer.parseInt(leer.readLine()); 
        
            if (dato==1)
            {
                System.out.println("Seleccionaste hallar el área del Rombo");
                
                System.out.print("Ingresa el valor Diagonal mayor: ");
                d1=Integer.parseInt(leer.readLine());
        
                System.out.print("Ingresa el valor d: ");
                d2=Integer.parseInt(leer.readLine());
        
                R=(d1*d2)/2.0;
                System.out.println("Ela área del rombo es: " +R);
                
            }else
                if(dato==2){
                System.out.println("Seleccionaste hallar el área del Trapecio");
                
                System.out.print("Ingresa el valor de base meyor: ");
                b1=Integer.parseInt(leer.readLine());
        
                System.out.print("Ingresa el valor de base menor: ");
                b2=Integer.parseInt(leer.readLine());
                
                System.out.print("Ingresa el valor de la altura: ");
                altura=Integer.parseInt(leer.readLine());
        
                T=((b1+b2)/2.0)*altura;
                System.out.println("Ela área del Trapecio es: " +T);
                }
                else{
                    
                System.out.print("DATO NO RECONOCIDO");
                
                }
    }
} 
