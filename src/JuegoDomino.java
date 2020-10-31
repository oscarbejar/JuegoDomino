import jdk.swing.interop.SwingInterOpUtils;

import javax.swing.*;
import java.awt.*;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;


public class JuegoDomino {
    public static void main(String[] args) {
        System.out.println("Domino");
        Inicio dib = new Inicio();
        dib.iniciar();


        Ficha ficha1 = new Ficha(0, 0);
        Ficha ficha2 = new Ficha(0, 1);
        Ficha ficha3 = new Ficha(0, 2);
        Ficha ficha4 = new Ficha(0, 3);
        Ficha ficha5 = new Ficha(0, 4);
        Ficha ficha6 = new Ficha(0, 5);
        Ficha ficha7 = new Ficha(0, 6);
        Ficha ficha8 = new Ficha(1, 1);
        Ficha ficha9 = new Ficha(1, 2);
        Ficha ficha10 = new Ficha(1, 3);
        Ficha ficha11 = new Ficha(1, 4);
        Ficha ficha12 = new Ficha(1, 5);
        Ficha ficha13 = new Ficha(1, 6);
        Ficha ficha14 = new Ficha(2, 2);
        Ficha ficha15 = new Ficha(2, 3);
        Ficha ficha16 = new Ficha(2, 4);
        Ficha ficha17 = new Ficha(2, 5);
        Ficha ficha18 = new Ficha(2, 6);
        Ficha ficha19 = new Ficha(3, 3);
        Ficha ficha20 = new Ficha(3, 4);
        Ficha ficha21 = new Ficha(3, 5);
        Ficha ficha22 = new Ficha(3, 6);
        Ficha ficha23 = new Ficha(4, 4);
        Ficha ficha24 = new Ficha(4, 5);
        Ficha ficha25 = new Ficha(4, 6);
        Ficha ficha26 = new Ficha(5, 5);
        Ficha ficha27 = new Ficha(5, 6);
        Ficha ficha28 = new Ficha(6, 6);

            ArrayList<Ficha> fichas = new ArrayList<>();

            fichas.add(ficha1);
            fichas.add(ficha2);
            fichas.add(ficha3);
            fichas.add(ficha4);
            fichas.add(ficha5);
            fichas.add(ficha6);
            fichas.add(ficha7);
            fichas.add(ficha8);
            fichas.add(ficha9);
            fichas.add(ficha10);
            fichas.add(ficha11);
            fichas.add(ficha12);
            fichas.add(ficha13);
            fichas.add(ficha14);
            fichas.add(ficha15);
            fichas.add(ficha16);
            fichas.add(ficha17);
            fichas.add(ficha18);
            fichas.add(ficha19);
            fichas.add(ficha20);
            fichas.add(ficha21);
            fichas.add(ficha22);
            fichas.add(ficha23);
            fichas.add(ficha24);
            fichas.add(ficha25);
            fichas.add(ficha26);
            fichas.add(ficha27);
            fichas.add(ficha28);

            Collections.shuffle(fichas);

            for(int i = 0; i < fichas.size(); i++) {
                System.out.println(fichas);
            }
        }

    }







        //commit2
        /*Ventana vent = new Ventana();
        vent.ventana.setVisible(true);
        vent.panelInicio.setVisible(true);
    //hola
        /*
        MarcoConDibujos marco = new MarcoConDibujos();
        marco.setVisible(true);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
*/



        /*

*/








