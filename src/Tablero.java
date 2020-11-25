import java.util.ArrayList;

public class Tablero {
    public Tablero(){

    }
    ArrayList<Ficha> fichasTablero = new ArrayList<>();
    ArrayList<Ficha> fichasAct = new ArrayList<>();


    public ArrayList ponerFicha(ArrayList<Ficha> fichaJug) {
        if (fichaJug != null) {
            fichasTablero.add(fichaJug.get(0));

            fichaJug.remove(0);
            fichasAct = fichaJug;
            System.out.println("+++++");
            System.out.println(fichaJug);
            System.out.println("-----");
            System.out.println(fichasAct);
        }
        return fichasAct;
    }

}
