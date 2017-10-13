package graficos;

import javax.swing.*;
import java.awt.*;

public class CreandoMarcoCentrado {

    public static void main(String[] args) {
        MarcoCentrado marco2 = new MarcoCentrado();

    }
}
    class MarcoCentrado extends JFrame{

        // constructor
        public MarcoCentrado(){
            Toolkit miPantalla      = Toolkit.getDefaultToolkit(); // Obtenemos el toolkit por defecto de nuestro sistema
            Dimension miDimension   = miPantalla.getScreenSize(); // Obtengo la resolucion de la pantalla principal

            // Obtengo los valores del ancho y alto
            int alturaPantalla      = miDimension.height;
            int anchoPantalla       = miDimension.width;

            // Con esos valores especifico el origen de la ventana
            setSize(anchoPantalla/2,alturaPantalla/2);
            setLocation(anchoPantalla/4,alturaPantalla/4);

            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setVisible(true);
            setTitle("marcoCentrado");
            Image miIcono = miPantalla.getImage("src/graficos/debian.gif");
            setIconImage(miIcono);

        }
    }


