package poo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.Timer;


public class PruebaTemporizador2 {
    public static void main (String[] args){
        // Creamos un objeto de la clase reloj e invocamos al metodo enMarcha para que arranque
        Reloj mi_reloj = new Reloj(3000, true);
        mi_reloj.enMarcha();

        // Ventana en primer plano para que el programa no termine
        JOptionPane.showMessageDialog(null, "Pulsa aceptar para terminar");
        System.exit(0);

    }
}


// Clase reloj del temporizador

class Reloj{
    // constructor
    public Reloj(int intervalo, boolean sonido){
        this.intervalo= intervalo;
        this.sonido = sonido;
    }

    // metodos de la clase
    public void enMarcha(){

        // Clase interna local, sin modificador de acceso
        class DameLaHora2 implements ActionListener{
            public void actionPerformed(ActionEvent evento){
                Date ahora = new Date();
                System.out.println("Te escribo la hora cada 3 sg " + ahora);
                if (sonido){ // sonido pertenece a la clase PruebaTemporizador2 por eso la podemos acceder a pesar de estar encapsulada, sin necesidad de set y get
                    Toolkit.getDefaultToolkit().beep();
                }
            }
        }
        
        ActionListener oyente = new DameLaHora2();
        Timer mitemporizador = new Timer(intervalo , oyente);
        mitemporizador.start();
    }

    // variables encapsuladas
    private int intervalo;
    private boolean sonido;



}
