package paquete;
import javax.swing.*;
public class Uso_Arrays2 {
    public static void main(String[] args){
        /*
        String [] paises = new String[8];
        for (int i = 0; i<8 ; i++){
            paises[i] = JOptionPane.showInputDialog("Introduce pais " + (i+1) );
        }

        /*
        // rellenando
        paises[0] = "España";
        paises[1] = "Mexico";
        paises[2] = "Canada";
        paises[3] = "Argentina";
        paises[4] = "Francia";
        paises[5] = "Ecuador";
        paises[6] = "Venezuela";
        paises[7] = "Italia";

        for (int i = 0; i < paises.length; i++ ){
            System.out.println("Pais "+ (i+1) + " " + paises[i] );
        }

        for (String elemento:paises){
            System.out.println("Pais: " + elemento);
        }*/

        int[] matriz_random = new int[150];
        for (int i = 0; i < matriz_random.length; i++){
            matriz_random[i]= (int)Math.round(Math.random()*100);
        }

        for (int numero:matriz_random){
            System.out.print(numero + " ");
        }
    }
}
