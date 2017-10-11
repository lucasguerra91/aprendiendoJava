package graficos;

import javax.swing.*;
import java.awt.*;

public class crandoMarcos {
    public static void main(String[] args){
        // Instanciamos nuestra ventana
        miMarco marco1 = new miMarco();


    }
}

class miMarco extends JFrame{
    // constructor
    public miMarco(){
        setSize(500 , 300 );
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Creando ventanas de mierda");
        setLocation(500,300 );
    }


}