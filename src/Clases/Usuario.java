
package Clases;

import java.util.Scanner;

/**
 *
 * @author Danny_Guancha
 */
public class Usuario {
    public static void main (String [] args){
        Scanner consola = new Scanner(System.in);
        String ruta1 = "C:/Users/aguir/OneDrive/Documentos/NetBeansProjects/taller3Sw1/src/Archivos/Regalos.json";
        String ruta2 ="C:/Users/aguir/OneDrive/Documentos/NetBeansProjects/taller3Sw1/src/Archivos/Proveedor.json";
        Usuario pr = new Usuario();
        System.out.println("Ingrese la edad.");
        int edad = consola.nextInt();
        System.out.println("Ingrese el valor que esta dispuesto a pagar.");
        double valorAPagar= consola.nextDouble();
        pr.mostrarDatos(ruta1,ruta2,edad,valorAPagar);
        
    }
    
    public void mostrarDatos(String ruta1,String ruta2,int edad, double valorPago)  {
        BuscarInformacion info = new BuscarInformacion();
        info.mostrarInformacion(ruta1, ruta2, edad, valorPago);      
    }
}
