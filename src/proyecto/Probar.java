/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.util.*;

/**
 *
 * @author campitos
 */
public class Probar {

    public static void main(String[] args) {
        //Pregunta de prueba 1
        Opcion op1 = new Opcion("Ecatepec", false);
        Opcion op2 = new Opcion("Ecaterror", false);
        Opcion op3 = new Opcion("Kiev", true);
        Opcion op4 = new Opcion("Chalco", false);
        ArrayList<Opcion> opciones = new ArrayList<>();
        opciones.add(op1);
        opciones.add(op2);
        opciones.add(op3);
        opciones.add(op4);
        Pregunta p1 = new Pregunta("¿Cuál es la capital de Ucrania?", opciones);

        //Pregunta de prueba 2
        Opcion op11 = new Opcion("Mizcalco", false);
        Opcion op12 = new Opcion("NezaYork", false);
        Opcion op13 = new Opcion("Minezota", false);
        Opcion op14 = new Opcion("México", true);
        ArrayList<Opcion> opciones1 = new ArrayList<>();
        opciones1.add(op11);
        opciones1.add(op12);
        opciones1.add(op13);
        opciones1.add(op14);
        Pregunta p11 = new Pregunta("¿Cuál es la capital de México?", opciones1);
        
        //Pregunta real 1 :D
        Opcion op21 = new Opcion("12 de Abril de 2011", false);
        Opcion op22 = new Opcion("12 de  Marzo de 2012", false);
        Opcion op23 = new Opcion("12 de Abril de 2012", true);
        Opcion op24 = new Opcion("12 de Marzo de 2011", false);
        ArrayList<Opcion> opciones2 = new ArrayList<>();
        opciones2.add(op21);
        opciones2.add(op22);
        opciones2.add(op23);
        opciones2.add(op24);
        Pregunta p21 = new Pregunta("¿Cuál es la fecha de debut de EXO?", opciones2);
        
        //Pregunta real 2
        Opcion op31 = new Opcion("Sehun", true);
        Opcion op32 = new Opcion("Kai", false);
        Opcion op33 = new Opcion("Baekyun", false);
        Opcion op34 = new Opcion("D.O", false);
        ArrayList<Opcion> opciones3 = new ArrayList<>();
        opciones3.add(op31);
        opciones3.add(op32);
        opciones3.add(op33);
        opciones3.add(op34);
        Pregunta p31 = new Pregunta("¿Quien es el maknae o miembro más joven de ellos?", opciones3);
        
        //Pregunta real 3
        Opcion op41 = new Opcion("XOXO", false);
        Opcion op42 = new Opcion("MAMA", true);
        Opcion op43 = new Opcion("Miracles in December", false);
        Opcion op44 = new Opcion("Overdose", false);
        ArrayList<Opcion> opciones4 = new ArrayList<>();
        opciones4.add(op41);
        opciones4.add(op42);
        opciones4.add(op43);
        opciones4.add(op44);
        Pregunta p41 = new Pregunta("¿Cuál fue su album de debut?", opciones4); 
        
        //Pregunta real 4
        Opcion op51 = new Opcion("EXO-K", false);
        Opcion op52 = new Opcion("EXO'RDIUM's", false);
        Opcion op53 = new Opcion("EXO-M", false);
        Opcion op54 = new Opcion("EXO-L", true);
        ArrayList<Opcion> opciones5 = new ArrayList<>();
        opciones5.add(op51);
        opciones5.add(op52);
        opciones5.add(op53);
        opciones5.add(op54);
        Pregunta p51 = new Pregunta("¿Cuál es el nombre del fandom del gurpo?", opciones5); 
        
        //Pregunta real 5
        Opcion op61 = new Opcion("Kim Jong Dae", true);
        Opcion op62 = new Opcion("Kim Jum Myeon", false);
        Opcion op63 = new Opcion("Kim Min seok", false);
        Opcion op64 = new Opcion("Kim Jong In", false);
        ArrayList<Opcion> opciones6 = new ArrayList<>();
        opciones6.add(op61);
        opciones6.add(op62);
        opciones6.add(op63);
        opciones6.add(op64);
        Pregunta p61 = new Pregunta("¿Cuál es el nombre real de Chen?", opciones6); 
        
        //Pregunta real 6
        Opcion op71 = new Opcion("SM Visual", false);
        Opcion op72 = new Opcion("So I married an antifan", false);
        Opcion op73 = new Opcion("Annoying Brother", false);
        Opcion op74 = new Opcion("EXO Next Door", true);
        ArrayList<Opcion> opciones7 = new ArrayList<>();
        opciones7.add(op71);
        opciones7.add(op72);
        opciones7.add(op73);
        opciones7.add(op74);
        Pregunta p71 = new Pregunta("¿Cuál fue el primer drama dónde aparecieron casi todos los integrantes?", opciones7); 
        
        //Pregunta real 7
        Opcion op81 = new Opcion("Kai", false);
        Opcion op82 = new Opcion("Suho", true);
        Opcion op83 = new Opcion("Chanyeol", false);
        Opcion op84 = new Opcion("D.O", false);
        ArrayList<Opcion> opciones8 = new ArrayList<>();
        opciones8.add(op81);
        opciones8.add(op82);
        opciones8.add(op83);
        opciones8.add(op84);
        Pregunta p81 = new Pregunta("¿Quién es el líde de EXO-K?", opciones8); 
        
        //Pregunta real 8
        Opcion op91 = new Opcion("Xiumin", false);
        Opcion op92 = new Opcion("Chem", false);
        Opcion op93 = new Opcion("Kris", true);
        Opcion op94 = new Opcion("Tao", false);
        ArrayList<Opcion> opciones9 = new ArrayList<>();
        opciones9.add(op91);
        opciones9.add(op92);
        opciones9.add(op93);
        opciones9.add(op94);
        Pregunta p91 = new Pregunta("¿Quién es el líder de EXO-M?", opciones9); 
        
        //Pregunta real 9
        Opcion op101 = new Opcion("Luhan", false);
        Opcion op102 = new Opcion("Kris", true);
        Opcion op103 = new Opcion("Tao", false);
        Opcion op104 = new Opcion("Lay", false);
        ArrayList<Opcion> opciones10 = new ArrayList<>();
        opciones10.add(op101);
        opciones10.add(op102);
        opciones10.add(op103);
        opciones10.add(op104);
        Pregunta p101 = new Pregunta("¿Quién se retiró primero?", opciones10);
        
        //Pregunta real 10
        Opcion op111 = new Opcion("8", true);
        Opcion op112 = new Opcion("9", false);
        Opcion op113 = new Opcion("12", false);
        Opcion op114 = new Opcion("10", false);
        ArrayList<Opcion> opciones11 = new ArrayList<>();
        opciones11.add(op111);
        opciones11.add(op112);
        opciones11.add(op113);
        opciones11.add(op114);
        Pregunta p111 = new Pregunta("¿Cuántos miembros están activos actualmente?", opciones11);
        
        //Pregunta real 11
        Opcion op121 = new Opcion("Pofi", false);
        Opcion op122 = new Opcion("Fifi", false);
        Opcion op123 = new Opcion("Vivi", true);
        Opcion op124 = new Opcion("Nani", false);
        ArrayList<Opcion> opciones12 = new ArrayList<>();
        opciones12.add(op121);
        opciones12.add(op122);
        opciones12.add(op123);
        opciones12.add(op124);
        Pregunta p121 = new Pregunta("¿Cómo se llama la mascota de Sehun?", opciones12);
        
        //Pregunta real 12
        Opcion op131 = new Opcion("Dorado", false);
        Opcion op132 = new Opcion("Azul Zafiro", false);
        Opcion op133 = new Opcion("Turqueza", false);
        Opcion op134 = new Opcion("Plateado", true);
        ArrayList<Opcion> opciones13 = new ArrayList<>();
        opciones13.add(op131);
        opciones13.add(op132);
        opciones13.add(op133);
        opciones13.add(op134);
        Pregunta p131 = new Pregunta("¿Cuál es el color oficial del grupo?", opciones13);
        
        ArrayList<Pregunta> preguntas = new ArrayList<>();
        preguntas.add(p1);
        preguntas.add(p11);
        preguntas.add(p21);
        preguntas.add(p31);
        preguntas.add(p41);
        preguntas.add(p51);
        preguntas.add(p61);
        preguntas.add(p71);
        preguntas.add(p81);
        preguntas.add(p91);
        preguntas.add(p101);
        preguntas.add(p111);
        preguntas.add(p121);
        preguntas.add(p131);
        
        //Probamos el modelo
        for (Pregunta pregunta : preguntas) {
            System.out.println(pregunta.getTitulo());
            for (Opcion opcion : pregunta.getOpciones()) {
                System.out.println(opcion.getTitulo());

            }
        }
    }
}
