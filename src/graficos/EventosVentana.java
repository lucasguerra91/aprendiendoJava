package graficos;

import javax.swing.*;

public class EventosVentana {
    public static void main (String[] args){
        MarcoVentana marcoV = new MarcoVentana();
        marcoV.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoVentana extends JFrame{

    public MarcoVentana(){
        setTitle("Respondiendo");
        setBounds(300,300,50,350);
        setVisible(true);

    }

}
