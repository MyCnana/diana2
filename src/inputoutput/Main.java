/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputoutput;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author juan_
 */
public class Main {
    public static void main(String[] args) {
        try {
            Persistencia p = new Persistencia();
            
            p.guardar("Hola mundo");
            System.out.println("Mensaje guardado");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            
        }
        
    }
}
