package paquete;

//Imports
import javax.swing.*;

//Comienzo de clase
public class Comprueba_Mail {
    public static void main(String[] args){
        boolean arroba = false;

        String mail = JOptionPane.showInputDialog("Ingrese mail");

        for (int i = 0 ; i < mail.length(); i++){
            if (mail.charAt(i)=='@'){
                arroba = true;
            }
        }

        if(arroba == true){
            System.out.println("Es correcto");
        }else {
            System.out.println("No es correcto");
        }
    }
}
