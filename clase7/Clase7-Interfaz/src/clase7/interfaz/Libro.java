/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase7.interfaz;

/**
 *
 * @author Alumno
 */
public class Libro {
    private int código;
    private String nombre;
    private String autor;
    private String genero;
    private int stock;
    private double precio;
    
    public Libro (int código, String nombre, String autor, String genero,int stock, double precio) {
        this.código = código;
        this.nombre = nombre;
        this.autor = autor;
        this.genero = genero;
        this.stock = stock;
        this.precio = precio;
    }
    
    public int getCódigo(){
        return código;
    }
    
    public void setCódigo(int código){
        this.código = código;
    }
    
     public String getNombre() {
        return nombre;                 
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;          
    }
    

    public String getAutor() {
        return autor;
    }
    
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }
    
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public int getStock(){
        return stock;
    }
    
    public void setStock(int stock){
        this.stock = stock;
    }
    
    public double getPrecio() {
        return precio;
    }
    
    public void setPrecio(double precio) {
        if (precio <= 0) {
            System.out.println("Error: el precio debe ser mayor a 0.");
            return;
        }
        this.precio = precio;
    }
    
    public void vender(int cantidad) {
    if(cantidad > 0 && this.stock >= cantidad) {
        this.stock = this.stock - cantidad;
        System.out.println("Venta exitosa de " + cantidad + "unidades");
        System.out.println("Stock restante de " + nombre + ":" + this.stock);
    }else {
        System.out.println("Error: No hay suficiente stock para vender" + cantidad + "unidades de " + nombre);
    }
    
    public void mostrarInfo(){
        System.out.println("Ficha del libro");
        System.out.println("Código: " + código);
        System.out.println("Nombre: " + nombre);
        System.out.println("Autor: " + autor);
        System.out.println("Genero: " + genero);
        System.out.println("Stock disponible: " + stock + " unidades");
        System.out.println("Precio: $: " + precio);
    }
    
    
}
