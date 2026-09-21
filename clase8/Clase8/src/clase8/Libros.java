/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase8;

/**
 *
 * @author Alumno
 */
public abstract class Libros {

    private String nombre;
    private String autor;
    private double precioBase;

    public Libros(String nombre, String autor, double precioBase) {
        this.nombre = nombre;
        this.autor = autor;
        this.precioBase = precioBase;
    }
    public String getNombre() {
        return nombre;
    }

    public String getAutor() {
        return autor;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void mostrarInfo() {
        System.out.println("Título: " + nombre);
        System.out.println("Autor: " + autor);
    }

    public abstract double calcularPrecioFinal();

    public abstract void mostrarDetalle();
}
