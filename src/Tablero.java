import java.util.ArrayList;

public class Tablero {
    public Tablero(){

    }
    ArrayList<Ficha> fichasTablero = new ArrayList<>();
    ArrayList<Ficha> fichasAct = new ArrayList<>();


    public ArrayList ponerficha(ArrayList<Ficha> fichaJug) {
        if (fichaJug != null) {
            fichasTablero.add(fichaJug.get(0));

            fichaJug.remove(0);
            fichasAct = fichaJug;
        }
        return fichasAct;
    }

}
