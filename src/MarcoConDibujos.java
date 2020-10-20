import javax.swing.*;

public class MarcoConDibujos extends JFrame {

    public MarcoConDibujos() {

        setTitle("Ficha de dominó");
        setSize(400, 400);
        PanelConFiguras lamina = new PanelConFiguras();
        add(lamina);
    }
}



