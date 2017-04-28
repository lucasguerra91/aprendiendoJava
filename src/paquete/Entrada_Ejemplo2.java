package paquete;
import javax.swing.*;

public class Entrada_Ejemplo2 {
    public static void main (String[] args){

        String nombre_usuario = JOptionPane.showInputDialog("Ingresar nombre");
        String edad = JOptionPane.showInputDialog("Ingresar edad");

        // Usamos la clase Integer de la Api de Java para formatear un string a int
        int edad_usuario = Integer.parseInt(edad);

        System.out.println("Hola " + nombre_usuario + ". El proximo año tendras  "+ (edad_usuario+1) + " años");


    }
}
