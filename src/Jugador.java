import java.util.ArrayList;
import java.util.List;

public class Jugador {

    String nombre;
    int puntos;
    ArrayList<Ficha> fichasJugador = new ArrayList<>();

    public Jugador() {
        this.nombre = nombre;
        this.puntos = puntos;


    }

    public void tomarficha(ArrayList<Ficha> mesa) {
        fichasJugador.add(mesa.get(0));
        mesa.remove(0);
    }


}
/*

    public boolean darFicha(Fichas ficha) {
        if (ficha != null) {
            array.add(ficha);
            return true;
        } else {
            return false;
        }
    }
}


/*
    public boolean equals(Object x){
/*if (!(x instanceof Jugador)) return false;
int c=0;
for(int j=0;j<((Jugador)x).fichas.size();j++)
for(int i=0;i<fichas.size();i++)
if (fichas.get(i).equals(((Jugador)x).fichas.get(j))) c++;
return (c==fichas.size()&&
        fichas.size()==((Jugador)x).fichas.size());
        return nombre.equals(((Jugador)x).nombre);

    }
    */



