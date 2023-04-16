/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author Danny_Guancha
 */
public class CargarDatos {

    public List<Regalo> cargarRegalos(String ruta) throws ExceptionArchivo, FileNotFoundException, JSONException {
        File archivo = new File(ruta);
        List<Regalo> listaRegalos = new ArrayList<>();
        if (verificarRuta(ruta)) {
            String contenido;
            Scanner consola = new Scanner(archivo);
            contenido = consola.useDelimiter("\\Z").next();
            JSONArray archivoJson = new JSONArray(contenido);
            for (int i = 0; i < archivoJson.length(); i++) {
                JSONObject datos = archivoJson.getJSONObject(i);
                Regalo regalos = new Regalo();
                regalos.setNombre(datos.getString("nombre"));
                regalos.setEdad(datos.getInt("edad"));
                regalos.setPrecio(datos.getDouble("precio"));
                regalos.setProveedor(datos.getString("proveedor"));
                // Establece otras propiedades si es necesario
                listaRegalos.add(regalos);
            }
            return listaRegalos;

        } else {
            throw new ExceptionArchivo("Error al abrir el archivo, error en la ruta");
        }

    }

    public List<Proveedor> cargarProveedores(String ruta) throws ExceptionArchivo, FileNotFoundException, JSONException {
        File archivo = new File(ruta);
        List<Proveedor> listaProveedores = new ArrayList<>();
        if (verificarRuta(ruta)) {
            String contenido;
            Scanner consola = new Scanner(archivo);
            contenido = consola.useDelimiter("\\Z").next();
            JSONArray archivoJson = new JSONArray(contenido);
            for (int i = 0; i < archivoJson.length(); i++) {
                JSONObject datos = archivoJson.getJSONObject(i);
                Proveedor proveedores = new Proveedor();
                proveedores.setNombre(datos.getString("nombre"));
                proveedores.setPrecioEnvio(datos.getDouble("precioEnvio"));
                // Establece otras propiedades si es necesario
                listaProveedores.add(proveedores);

            }
            return listaProveedores;

        } else {
            throw new ExceptionArchivo("Error al abrir el archivo, error en la ruta");
        }

    }

    public boolean verificarRuta(String ruta) {
        File archivo = new File(ruta);
        if (archivo.exists()) {
            return true;
        } else {
            return false;
        }

    }

}
