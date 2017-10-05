package poo;

import javax.swing.*;
import java.awt.event.*;
import java.util.Date;

public class PruebaTemporizador {

    public static void main (String[] args){
        getHour oyente = new getHour();
        Timer mi_temporizador = new Timer(5000 , oyente  );
        mi_temporizador.start();

        JOptionPane.showMessageDialog(null , "Pulsa aceptar para detener");
        System.exit(0);
    }
}

    class getHour implements ActionListener{
        public void actionPerformed(ActionEvent e){
            Date now = new Date();
            System.out.println("Te pongo la hora cada 5 segundos: " + now);
        }
    }
