import java.util.ArrayList;
import java.util.List;

public class Jugador {

    String nombre;
    int puntos;
    ArrayList<Ficha> fichasJugador = new ArrayList<>();

    public Jugador()
    {
        this.nombre = nombre;
        this.puntos = puntos;

    }


    public void tomarFicha(ArrayList<Ficha> mesa) {
        if (mesa.size() > 0) {
            fichasJugador.add(mesa.get(0));
            mesa.remove(0);
        }
        else{
            System.out.println("Mesa Vacia");
        }
    }


}




