/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase7.interfaz;
import java.util.ArrayList; // El import va siempre acá, fuera de la clase

public class Clase7Interfaz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // 1. Creamos la lista de libros
        ArrayList<Libro> catalogo = new ArrayList<>();
        
        
        
        // 2. Guardamos 4 libros usando el constructor que armaste
        catalogo.add(new Libro(1001, "El Principito", "Antoine de Saint-Exupéry", 8500.0, 10));
        catalogo.add(new Libro(1002, "Ficciones", "Jorge Luis Borges", 12000.0, 5));
        catalogo.add(new Libro(1003, "1984", "George Orwell", 9500.0, 8));
        catalogo.add(new Libro(1004, "Rayuela", "Julio Cortázar", 15000.0, 3));

        System.out.println("=== ESTADO INICIAL DEL CATÁLOGO ===");
        imprimirTablaStock(catalogo);

        // 3. Ejecutamos algunas ventas sobre distintos libros usando get()
        System.out.println(">> Jose vende 2 unidades de 'El Principito'...");
        catalogo.get(0).vender(2); 
        
        System.out.println(">> Jose vende 1 unidad de 'Rayuela'...");
        catalogo.get(3).vender(1);
        
        System.out.println(">> Jose intenta vender 10 unidades de 'Ficciones' (para probar el error)...");
        catalogo.get(1).vender(10); 
        
        System.out.println();

        // 4. Volvemos a imprimir la tabla para ver el stock actualizado
        System.out.println("ESTADO DESPUÉS DE LAS VENTAS");
        imprimirTablaStock(catalogo);
    }
    
    
}
