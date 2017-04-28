package paquete;
import javax.swing.*;

public class Acceso_app {
    public static void main(String[] args){
        String clave="12345";
        String pass = "";

        while (clave.equals(pass)==false){ // equals corresponde a los metodos de la clase String

            pass = JOptionPane.showInputDialog("Introduce la contraseña");
            if (clave.equals(pass)==false){
                System.out.println("Contraseña incorrecta");
            }
        }
        System.out.println("Acceso correcto");

    }
}
