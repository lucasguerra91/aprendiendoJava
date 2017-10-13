package graficos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class PruebaEventos {
    public static void main(String[] args){

        MarcoBotones marco5 = new MarcoBotones();
    }
}

class MarcoBotones extends JFrame{

    public MarcoBotones(){
        setVisible(true);
        setTitle("Botones y eventos");
        setBounds(700,300,500,300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        LaminaBotones miLamina = new LaminaBotones();
        add(miLamina);
    }
}

// La clase se convierte en oyente
class LaminaBotones extends JPanel implements ActionListener{
        JButton botonAzul = new JButton("Azul");
        JButton botonRojo = new JButton("Rojo");
        JButton botonAmarillo = new JButton("Amarillo");

        public LaminaBotones(){
            // Agregamos los botones
            add(botonAzul);
            add(botonAmarillo);
            add(botonRojo);

            // creamos el actionListener indicando que es la misma clase la que esta a la escucha
            botonAzul.addActionListener(this);
            botonRojo.addActionListener(this);
            botonAmarillo.addActionListener(this);
        }

        // Sobreescribiendo el metodo obligatorio de la interface
        public void actionPerformed(ActionEvent e){
            // verificamos la fuente, es decir, que boton se apreto
            Object botonPulsado = e.getSource();
            // en funcion de la fuente , cambiamos el color del fondo
            if (botonPulsado == botonAzul){
                setBackground(Color.blue);
            }else if (botonPulsado == botonAmarillo){
                setBackground(Color.yellow);
            }else{
                setBackground(Color.red);
            }

        }
}
