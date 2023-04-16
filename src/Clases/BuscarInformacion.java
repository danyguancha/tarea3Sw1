
package Clases;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONException;

/**
 *
 * @author Danny_Guancha
 */
public class BuscarInformacion {

    private final CargarDatos cargaDatos;

    public BuscarInformacion(){
        this.cargaDatos= new CargarDatos();
    }
    
    public List<String> buscarInformacion(String rutaRegalos, String rutaProveedores, int edad, double valorPago) {
        List<String> listaDatos=new ArrayList<>();
        String salida;
        boolean encontrado =false;
        try {

            for (Proveedor p : cargaDatos.cargarProveedores(rutaProveedores)) {
                for (Regalo r : cargaDatos.cargarRegalos(rutaRegalos)) {
                    if(p.getNombre().equals(r.getProveedor()) && edad==r.getEdad() && r.getPrecio()<valorPago){
                        double precioTotal = calcularPrecioTotal(p.getPrecioEnvio(),r.getPrecio());
                        salida=r.getNombre().toString()+"- Precio base: $"+r.getPrecio()+
                                " - precio de envio: $"+p.getPrecioEnvio()+" - precio total: $"+precioTotal;  
                        encontrado = true;
                        listaDatos.add(salida);
                    }
                }
            }
           if(!encontrado){
               salida ="No se tiene productos para esa edad o precio.";
               listaDatos.add(salida);
           }
         

        } catch (ExceptionArchivo error) {
            System.out.println(error);

        } catch (FileNotFoundException ex) {
            Logger.getLogger(BuscarInformacion.class
                    .getName()).log(Level.SEVERE, null, ex);

        } catch (JSONException ex) {
            Logger.getLogger(BuscarInformacion.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        return listaDatos;
    }
    
   public void mostrarInformacion(String rutaRegalos, String rutaProveedores, int edad, double valorPago) {
       List salida =buscarInformacion(rutaRegalos, rutaProveedores, edad, valorPago);
        for(int i=0; i<salida.size();i++ ){
            System.out.println(salida.get(i));
        }
        
    }
    
    
    public double calcularPrecioTotal(double precioEnvio, double precioBase){
        return precioEnvio+precioBase;
    }
    
    
}
