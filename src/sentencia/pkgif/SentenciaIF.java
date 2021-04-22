/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sentencia.pkgif;
import java.util.*;
/**
 *
 * @author Edson Coj
 */
public class SentenciaIF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Escriba dos numeros e indique cual es el mayor de ambos.
        System.out.println("Tarea 1");
        int num1,num2;
        
        Scanner n=new Scanner(System.in);
        
        System.out.println("Ingrese un primer numero");
        num1=n.nextInt();
        System.out.println("Ingrese el segundo numero");
        num2=n.nextInt();
        
        if (num1>num2){
            System.out.println(num1 + "Es mayor que" + num2);
        }
        else{
            System.out.println(num2 + "Es mayor que" + num1);
        }
        
        // Lea dos numeros e indique cual es el mayor y cual el menor de ambos
        System.out.println("Tarea 2");
        
        System.out.println("Ingrese un primer numero");
        num1=n.nextInt();
        System.out.println("Ingrese el segundo numero");
        num2=n.nextInt();
        
        if (num1>num2)
            System.out.println("El numero mayor es el " +num1);
        if (num1<num2)
            System.out.println("El numero menor es " +num1);
        
        // Lea un numero que indique cual es mayor, cual es menor, y cuales son iguales.
        System.out.println("Tarea 3");
        
        
        System.out.println("Ingrese un primer numero");
        num1=n.nextInt();
        System.out.println("Ingrese el segundo numero");
        num2=n.nextInt();
        
        if (num1>num2)
            System.out.println("El numero mayor es el " +num1);
        if (num1<num2)
            System.out.println("El numero menor es " +num1);
        if (num1==num2)
            System.out.println("Los numeros son iguales");
        
            
       
    }
    
}
