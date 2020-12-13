import jdk.swing.interop.SwingInterOpUtils;
import org.w3c.dom.ls.LSOutput;
import javax.swing.*;
import java.awt.*;
import java.sql.SQLOutput;
import java.util.*;

public class JuegoDomino {

    public static void main(String[] args) {

        ArrayList<Ficha> fichaSalir = new ArrayList<>();
        int posS;
        boolean validador = true;
        int primerT;
        ArrayList<Ficha> fichavl = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);
        System.out.println("Bienvenidos al juego Domino");
        Inicio dib = new Inicio();
        //dib.iniciar();


        Jugador jugador1 = new Jugador();
        System.out.print("Ingrese su nombre Jugador 1: ");
        jugador1.nombre = entrada.nextLine();

        Jugador jugador2 = new Jugador();
        System.out.print("Ingrese su nombre Jugador 2: ");
        jugador2.nombre = entrada.nextLine();

        Tablero tablero = new Tablero();


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


        ArrayList<Ficha> fichas = new ArrayList<Ficha>();
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
        ArrayList<Ficha> mesa = new ArrayList<>();
        for (int i = 0; i <= fichas.size() - 1; i++) {
            if (i < 7) {
                jugador1.fichasJugador.add(fichas.get(i));
            }
            if (i >= 7 && i < 14) {
                jugador2.fichasJugador.add(fichas.get(i));
            } else if (i >= 14 && i <= 28) {
                mesa.add(fichas.get(i));
            }
        }

        System.out.println("Las Fichas del Jugador " + jugador1.nombre + " Son:");
        System.out.println(jugador1.fichasJugador);
        System.out.println("Las Fichas del Jugador " + jugador2.nombre + " Son:");
        System.out.println(jugador2.fichasJugador);
        System.out.println("Las Fichas de las Mesa");
        System.out.println(mesa + "\n");
        fichaSalir = tablero.quienSale(jugador1.fichasJugador, jugador2.fichasJugador);
        primerT = tablero.turnoI(jugador1.fichasJugador, jugador2.fichasJugador, fichaSalir);


        if (primerT == 1) {
            System.out.println("Turno de " + jugador1.nombre);
            System.out.println(jugador1.fichasJugador);
            System.out.print("Indicar la posición de la ficha a colocar (1-7): ");
            posS = entrada.nextInt();
            tablero.ponerFichaI(jugador1.fichasJugador, posS - 1);
        } else {
            System.out.println("Turno de " + jugador2.nombre);
            System.out.println(jugador2.fichasJugador);
            System.out.print("Indicar la posición de la ficha a colocar (1-7): ");
            posS = entrada.nextInt();
            tablero.ponerFichaI(jugador2.fichasJugador, posS - 1);
        }

        System.out.println("Fichas del tablero jugadas: " + tablero.fichasTablero);
        System.out.println("");
        while (validador == true) {
            boolean v = tablero.validarJugadas(jugador1.fichasJugador, jugador2.fichasJugador, mesa);
            if(v == false){
                System.out.println("Partida trancada");
                validador = false;
                break;
            }
            if (primerT == 1) {
                primerT = 2;
            } else {
                primerT = 1;
            }
            if (primerT == 1) {
                System.out.println("Turno de " + jugador1.nombre);
                System.out.println(jugador1.fichasJugador);
                System.out.print("Indicar la posición de la ficha a colocar (1-7) ");
                System.out.print("(Si desea tomar de la mesa ingrese 0) :");
                posS = entrada.nextInt();
                while (posS == 0) {
                    jugador1.tomarFicha(mesa);
                    System.out.println(jugador1.fichasJugador);
                    System.out.print("Indicar la posición de la ficha a colocar (1-7) ");
                    System.out.print("(Si desea tomar de la mesa ingrese 0) :");
                    posS = entrada.nextInt();
                }
                    tablero.ponerFicha(jugador1.fichasJugador, posS - 1);
                    System.out.println("Fichas del tablero jugadas: " + tablero.fichasTablero);
                    System.out.println("");

            } else {
                System.out.println("Turno de " + jugador2.nombre);
                System.out.println(jugador2.fichasJugador);
                System.out.print("Indicar la posición de la ficha a colocar (1-7) ");
                System.out.print("(Si desea tomar de la mesa ingrese 0): ");
                posS = entrada.nextInt();
                while (posS == 0) {
                    jugador2.tomarFicha(mesa);
                    System.out.println(jugador2.fichasJugador);
                    System.out.print("Indicar la posición de la ficha a colocar (1-7) ");
                    System.out.print("(Si desea tomar ficha de la mesa ingrese 0) :");
                    posS = entrada.nextInt();
                }
                    tablero.ponerFicha(jugador2.fichasJugador, posS - 1);
                    System.out.println("Fichas del tablero jugadas: " + tablero.fichasTablero);
                    System.out.println("");
                }
                }

            System.out.println("Fichas del tablero jugadas: " + tablero.fichasTablero);
            System.out.println("");


            System.out.println("sigo?");
            validador = entrada.nextBoolean();
        }

    }




        /*



        System.out.println("pongala2");
        posS = entrada.nextInt();
        tablero.ponerFicha(jugador2.fichasJugador, posS);

        System.out.println("");
        System.out.println("Fichas del tablero" + tablero.fichasTablero);
        System.out.println("1" + jugador1.fichasJugador);
        System.out.println("2" + jugador2.fichasJugador);


*/












































        //jugador1.tomarFicha(mesa);
        //jugador2.tomarFicha(mesa);
        //jugador2.tomarFicha(mesa);
        //jugador2.tomarFicha(mesa);

        //jugador1.tomarFicha(mesa);
        //System.out.println(jugador1.fichasJugador);
        //System.out.println(mesa);

    /*
        jugador1.fichasJugador = tablero.ponerFicha(jugador1.fichasJugador);
        jugador2.fichasJugador = tablero.ponerFicha(jugador2.fichasJugador);
        System.out.println("Las Fichas jugadas: " + tablero.fichasTablero);
        //System.out.println(jugador2.fichasJugador);
        Ficha ultFicha;
        ultFicha = tablero.fichasTablero.get(0);
        System.out.println("sin ordenar");
        System.out.println(ultFicha);

        ultFicha = ultFicha.ordenarFicha(ultFicha);
        System.out.println("ordenado");
        System.out.println(ultFicha);
        //System.out.println("");
        //System.out.println(ultFicha.getNum1());
        //System.out.println(ultFicha.getNum2());
*/











