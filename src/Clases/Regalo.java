/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Danny_Guancha
 */
public class Regalo {
    private String nombre;
    private int edad;
    private double precio;
    private String  proveedor;

    public Regalo(String nombreRegalo, int edad, double precio, String Proveedor) {
        this.nombre = nombreRegalo;
        this.edad = edad;
        this.proveedor = proveedor;
    }
    public Regalo() {
       
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getPrecio() {
        return precio;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }
    
    
}
