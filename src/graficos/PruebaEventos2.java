package graficos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class PruebaEventos2 {
    public static void main(String[] args){

        MarcoBotones marco5 = new MarcoBotones();
    }
}

class MarcoBotones2 extends JFrame{

    public MarcoBotones2(){
        setVisible(true);
        setTitle("Botones y eventos");
        setBounds(700,300,500,300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        LaminaBotones miLamina = new LaminaBotones();
        add(miLamina);
    }
}

// La clase se convierte en oyente 
class LaminaBotones2 extends JPanel {
        JButton botonAzul       = new JButton("Azul");
        JButton botonRojo       = new JButton("Rojo");
        JButton botonAmarillo   = new JButton("Amarillo");

        public LaminaBotones2(){
            // Agregamos los botones
            add(botonAzul);
            add(botonAmarillo);
            add(botonRojo);

            // Instancias de la clase ColorFondo
            ColorFondo Amarillo = new ColorFondo(Color.yellow);
            ColorFondo Azul     = new ColorFondo(Color.blue);
            ColorFondo Rojo     = new ColorFondo(Color.red);

            // creamos el actionListener indicando que es la misma clase la que esta a la escucha
            botonAzul.addActionListener(Azul);
            botonRojo.addActionListener(Rojo);
            botonAmarillo.addActionListener(Amarillo);
        }

        // Clase interna con el objeto listener
        private class ColorFondo implements ActionListener{

            public ColorFondo (Color c){
                colorFondo = c;
            }

            @Override
            public void actionPerformed(ActionEvent e) {
                setBackground(colorFondo);
            }

            private Color colorFondo;
        }
}

