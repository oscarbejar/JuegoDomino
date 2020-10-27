import javax.swing.*;
import java.awt.event.ActionListener;

public class Inicio extends JFrame {

    JPanel panelInicio;
    JLabel fondo;
    JButton boton;

    public Inicio() {

        setSize(1200, 900);
        setLocationRelativeTo(null);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        panelInicio = new JPanel();
        panelInicio.setSize(getWidth(), getHeight());
        panelInicio.setLayout(null);
        panelInicio.setVisible(true);

        fondo = new JLabel();
        fondo.setIcon(new ImageIcon("/img/dominopizza.gif"));
        fondo.setSize(1500, 600);
        fondo.setVisible(true);
        panelInicio.add(fondo);

        boton=new JButton("Comenzar");
        boton.setLayout(null);
        boton.setBounds(50,25,30,25);
        boton.setSize(40,40);
        boton.setVisible(true);
        add(boton);

    }

    public void iniciar(){
        Inicio dbj = new Inicio();
        JFrame ventan = new JFrame( "Juego de Domino");
        ventan.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventan.setSize(1200,600);
        ventan.add(dbj.panelInicio);
        ventan.add(dbj.boton);
        ventan.setVisible(true);
    }

}



