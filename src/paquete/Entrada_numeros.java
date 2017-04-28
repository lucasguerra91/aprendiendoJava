package paquete;
import javax.swing.*;

public class Entrada_numeros {
    public static void main(String[] args){
        //double x = 10000.0;
        //System.out.printf("%1.2f", x/3);
        String num1 = JOptionPane.showInputDialog("Introduce un numero");
        // Usamos la clase Double para parsearlo
        double num2 = Double.parseDouble(num1);
        // Lo mostramos con formato
        System.out.print("La raiz de "+ num2 + " es ");
        System.out.printf("%1.2f", Math.sqrt(num2));
    }
}
