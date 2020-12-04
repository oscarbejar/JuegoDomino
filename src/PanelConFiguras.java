import javax.swing.*;
import java.awt.*;

public class PanelConFiguras extends JPanel
{

        public void paintComponent(Graphics g)
        {

            super.paintComponent(g);

            g.drawRect(10, 10, 20, 60);
            g.drawLine(10, 40, 30, 40);
            g.fillOval(14, 14, 4, 4);
            g.fillOval(18, 24, 4, 4);
            g.fillOval(22, 32, 4, 4);
            g.fillOval(18, 52, 4, 4);
        }
}

