package graficos;

import javax.swing.*;
import java.awt.*;

public class EscribiendoEnMarco {
    public static void main (String[] args){
        MarcoConTexto marco3 = new MarcoConTexto();
    }
}

class MarcoConTexto extends JFrame{
    public MarcoConTexto() {
        setVisible(true);
        setTitle("Marco con texto");
        setSize(600,450);
        setLocation(400, 200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Lamina lamina1 = new Lamina();
        add(lamina1);
    }
}


class Lamina extends JPanel{

    public void paintComponent(Graphics g){
            super.paintComponent(g);
            g.drawString("Aprendiendo los conceptos de Swing",100,100);
        }
}