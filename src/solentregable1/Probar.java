/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solentregable1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author juan_
 */
public class Probar {
    public static void main(String[] args) {
        try {
            Usuario u1= new Usuario("Juan", 25, 8000);
            PersistenciaUsuario p= new PersistenciaUsuario();
            p.guardar(u1);
            for(Usuario u :p.leerTodos()){
                System.out.println(u);
            }
        } catch (Exception ex) {
            Logger.getLogger(Probar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
