/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Danny_Guancha
 */
public class Proveedor {
    private String nombre;
    private double precioEnvio;
    
    public Proveedor(String nombreProveedor, double precioEnvio){
        this.nombre = nombre;
        this.precioEnvio = precioEnvio;
    }
    
    public Proveedor(){
        
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecioEnvio() {
        return precioEnvio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecioEnvio(double precioEnvio) {
        this.precioEnvio = precioEnvio;
    }
    
    
    
}
