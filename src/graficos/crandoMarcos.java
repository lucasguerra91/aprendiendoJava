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
        //setSize(500 , 300 );
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Creando ventanas de mierda");
        //setLocation(500,300 );
        // con esto prescindimos de size y location
        setBounds(500,300,250,250);
        //setResizable(false);
        setExtendedState(Frame.MAXIMIZED_BOTH); // tambien podemos poner 6 que es el valor de la constante
    }


}