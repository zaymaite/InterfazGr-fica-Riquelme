/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase8;

/**
 *
 * @author Alumno
 */
public class Clase8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        LibrosFisicos fisico = new LibrosFisicos(
                "El Principito",
                "Antoine de Saint-Exupéry",
                10000,
                2000,
                10
        );
        LibroDigital digital = new LibroDigital(
                "1984",
                "George Orwell",
                8000,
                "PDF"
        );

        LibroUsado usado = new LibroUsado(
                "Rayuela",
                "Julio Cortázar",
                12000,
                "Bueno"
        );
        
         System.out.println("=== TODOS LOS LIBROS ===");
            for (Libros libros : fisico) {
                 libros.mostrarInfo();
            }
    }
    
}
