/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.io.FileNotFoundException;

/**
 *
 * @author Danny_Guancha
 */
public class ExceptionArchivo extends FileNotFoundException {
    public ExceptionArchivo(String mensaje){
        super(mensaje);
    }
}
