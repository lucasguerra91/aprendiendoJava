package poo;
import javax.swing.*;


public class Uso_Coche {
    public static void main(String[] args){
        Coche miauto = new Coche();

        miauto.setColor(JOptionPane.showInputDialog("Introduce color"));
        System.out.println(miauto.getColor());

        System.out.println(miauto.getAll());

        miauto.setAsientos_cuero(JOptionPane.showInputDialog("Tiene asientos de cuero? Si/No"));
        System.out.println(miauto.getAsientos());

        miauto.setClimatizador(JOptionPane.showInputDialog("Tiene climatizador Si/No"));
        System.out.println(miauto.getClimatizador());

        System.out.println(miauto.getPesoCoche());

        System.out.println("El precio del auto es de " + miauto.precio_coche());

    }
}
