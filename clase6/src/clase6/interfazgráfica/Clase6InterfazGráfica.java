/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase6.interfazgráfica;

/**
 *
 * @author Alumno
 */
public class Clase6InterfazGráfica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //1) Imprimir "Hola, mundo" en consola.
       System.out.println("hola mundo");
       
       //2)Pedir el nombre del usuario e imprimirlo con un saludo. Por ejemplo: Hola, Ruperto.
       String nombre = "Maria";
       System.out.println("Hola " + nombre);
       
       //3)Pedir dos números enteros e imprimir su suma.
       int a = 20;
       int b = 10;
        System.out.println("Suma: "+ (a + b));
        
       //Pedir dos números e imprimir la suma, resta, multiplicación y división.
       int f = 20;
       int g = 2;
        System.out.println("Suma: " + (f + g));
        System.out.println("Resta: "+ (f - g));
        System.out.println("Multiplicacion: " + (f * g));
        System.out.println("Division: " + (f / g));
        
       //Pedir la edad del usuario e imprimir si es mayor o menor de edad.
       int edad = 16;
       
       if(edad <= 18){
           System.out.println("Menor de edad");
       }else{
        System.out.println("Mayor de edad");
            }
       
       //Imprimir los números del 1 al 20 usando for.
       for(int i = 1; i <= 20; i++){
           System.out.println(i + " ");
       }
       
       //Pedir un número N e imprimir su tabla de multiplicar completa.
       for(int i = 1; i <= 10; i++){
           System.out.println("2 x " + i + " = " + (2 * i));
       }
       
      
    }
    
}
