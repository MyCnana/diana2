/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solentregable1;
import java.io.*;
import java.util.ArrayList;
/**
 *
 * @author juan_
 */
public class PersistenciaUsuario {
    ArrayList<Usuario> usuarios;

    public PersistenciaUsuario() {
        usuarios = new ArrayList<>();
    }
    public void guardar(Usuario u)
    throws Exception{
        File f = new File ("usuarios");
        if(f.exists()) usuarios = leerTodos();
        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        usuarios.add(u);
        oos.writeObject(usuarios);
    }
    public ArrayList<Usuario> leerTodos()throws Exception{
        File f=new File("usuarios");
        FileInputStream fis=new FileInputStream(f);
        ObjectInputStream ois=new ObjectInputStream(fis);
     usuarios=    (ArrayList<Usuario>) ois.readObject();
     return usuarios;
    }
}
