/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase8;

/**
 *
 * @author Alumno
 */
public class LibrosFisicos extends Libros{
    
    private double costoEnvio;
    private int stock;

    public LibrosFisicos(String nombre, String autor, double precioBase,
                       double costoEnvio, int stock) {

        super(nombre, autor, precioBase);

        this.costoEnvio = costoEnvio;
        this.stock = stock;
    }

    @Override
    public double calcularPrecioFinal() {
        return getPrecioBase() + costoEnvio;
    }

    @Override
    public void mostrarDetalle() {
        System.out.println("Stock disponible: " + stock);
    }
}
