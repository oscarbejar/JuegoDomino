import java.util.*;

public class Tablero {
    public Tablero() {

    }

    ArrayList<Ficha> fichasTablero = new ArrayList<>();
    ArrayList<Ficha> fichasAct = new ArrayList<>();
    ArrayList<Ficha> fichaInicial = new ArrayList<>();
    ArrayList<Ficha> fichat = new ArrayList<>();
    int pos1;
    int pos2;
    int izq;
    int der;


    public ArrayList quienSale(ArrayList<Ficha> fichaJug1, ArrayList<Ficha> fichaJug2) {
        if (fichaJug1 != null && fichaJug2 != null) {
            for (int j = 6; j >= 0; j--) {
                for (int i = 0; i < 7; i++) {
                    if (fichaJug1.get(i).getNum1() == j && fichaJug1.get(i).getNum2() == j) {
                        fichaInicial.add(fichaJug1.get(i));
                        System.out.println("Debe salir el jugador 1 con la ficha: " + fichaInicial);
                        break;
                    } else if (fichaJug2.get(i).getNum1() == j && fichaJug2.get(i).getNum2() == j) {
                        fichaInicial.add(fichaJug2.get(i));
                        System.out.println("Debe salir el jugador 2 con la ficha: " + fichaInicial);
                        break;
                    }
                }
                if (fichaInicial.size() > 0) {
                    if (fichaInicial.get(0).getNum1() == j && fichaInicial.get(0).getNum2() == j) {
                        break;
                    }
                }


            }
            if (fichaInicial.size() < 1) {
                pos1 = fichamayor(fichaJug1);
                pos2 = fichamayor(fichaJug2);
                if (fichaJug1.get(pos1).getNum1() + fichaJug1.get(pos1).getNum2() > fichaJug2.get(pos2).getNum2() + fichaJug2.get(pos2).getNum2()) {
                    fichaInicial.add(fichaJug1.get(pos1));
                    System.out.println("Debe salir el jugador 1 con la ficha: " + fichaInicial);
                } else
                    fichaInicial.add(fichaJug2.get(pos2));
                System.out.println("Debe salir el jugador 2 con la ficha: " + fichaInicial);
            }
        }
        return fichaInicial;
    }

    public ArrayList ponerFichaI(ArrayList<Ficha> fichaJug, int pos) {
        if (fichasTablero.size() < 1) {
            fichasTablero.add(fichaJug.get(pos));
            izq = fichasTablero.get(0).getNum1();
            der = fichasTablero.get(0).getNum2();
            fichaJug.remove(pos);
            fichasAct = fichaJug;
            //System.out.println("+++++");
            //System.out.println(fichaJug);
            //System.out.println("-----");
            //System.out.println(fichasAct);

        }
        return fichasAct;
    }

    public ArrayList ponerFicha(ArrayList<Ficha> fichaJug, int pos) {
        if (fichaJug.get(pos).getNum1() == izq) {
            fichaJug.set(pos, fichaJug.get(pos).ordenarFicha(fichaJug.get(pos)));
            fichasTablero.add(0, fichaJug.get(pos));
            fichaJug.remove(pos);
            izq = fichasTablero.get(0).getNum1();
        } else if (fichaJug.get(pos).getNum2() == izq) {
            fichasTablero.add(0, fichaJug.get(pos));
            fichaJug.remove(pos);
            izq = fichasTablero.get(0).getNum1();
        } else if (fichaJug.get(pos).getNum2() == der) {
            fichaJug.set(pos, fichaJug.get(pos).ordenarFicha(fichaJug.get(pos)));
            fichasTablero.add(fichasTablero.size(), fichaJug.get(pos));
            fichaJug.remove(pos);
            der = fichasTablero.get(fichasTablero.size() - 1).getNum2();
        } else if (fichaJug.get(pos).getNum1() == der) {
            fichasTablero.add(fichasTablero.size(), fichaJug.get(pos));
            fichaJug.remove(pos);
            der = fichasTablero.get(fichasTablero.size() - 1).getNum2();
        }
        return fichaJug;
    }


    public int fichamayor(ArrayList<Ficha> fichasJug) {
        int fmayor = 0;
        int pos = 0;


        for (int i = 0; i <= fichasJug.size() - 1; i++) {
            if (fichasJug.get(i).getNum1() + fichasJug.get(i).getNum2() > fmayor) {
                fmayor = fichasJug.get(i).getNum1() + fichasJug.get(i).getNum2();
                pos = i;

            }
        }
        return pos;
    }


    public int turnoI(ArrayList<Ficha> fichasJug1, ArrayList<Ficha> fichasJug2, ArrayList<Ficha> fichaSalir) {
        int jug = 0;
        for (int i = 0; i <= fichasJug1.size() - 1; i++) {
            if (fichaSalir.get(0) == fichasJug1.get(i)) {
                jug = 1;
                break;
            }
            if (fichaSalir.get(0) == fichasJug2.get(i)) {
                jug = 2;
                break;
            }
        }
        return jug;
    }

    public boolean validarJuego(ArrayList<Ficha> fichasJug1, ArrayList<Ficha> fichasJug2, ArrayList<Ficha> fichasM) {
        boolean validador = true;
        int v = 0;
        for (int i = 0; i < fichasJug1.size(); i++) {
            if ((fichasJug1.get(i).getNum1() == izq) || (fichasJug1.get(i).getNum2() == izq) || (fichasJug1.get(i).getNum2() == der) || (fichasJug1.get(i).getNum1() == der)) {
                v += 1;
                break;
            }
        }
        for (int i = 0; i < fichasJug2.size(); i++) {
            if ((fichasJug2.get(i).getNum1() == izq) || (fichasJug2.get(i).getNum2() == izq) || (fichasJug2.get(i).getNum2() == der) || (fichasJug2.get(i).getNum1() == der)) {
                v += 1;
                break;
            }
        }
        for (int i = 0; i < fichasM.size(); i++) {
            if ((fichasM.get(i).getNum1() == izq) || (fichasM.get(i).getNum2() == izq) || (fichasM.get(i).getNum2() == der) || (fichasM.get(i).getNum1() == der)) {
                v += 1;
                break;
            }
        }
        if (v > 0) {
            validador = true;
        } else {
            validador = false;
        }
        return validador;

    }

    public boolean validarJugada(ArrayList<Ficha> fichasJug, int posc) {
        boolean valida = false;
            if ((fichasJug.get(posc).getNum1() == izq) || (fichasJug.get(posc).getNum2() == izq) || (fichasJug.get(posc).getNum2() == der) || (fichasJug.get(posc).getNum1() == der)) {
                valida = true;
            }

        return valida;
    }

    public int puntaje(ArrayList<Ficha> fichasJug) {
        int puntosJug = 0;
        for (int i = 0; i < fichasJug.size(); i++) {
            puntosJug += fichasJug.get(i).getNum1();
            puntosJug += fichasJug.get(i).getNum2();

        }
        return puntosJug;
    }

}




