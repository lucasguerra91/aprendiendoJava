package paquete;
import java.util.*;
public class Adivina_numero {
    public static void main(String[] args){
        // Construimos un objeto de tipo scanner
        Scanner entrada = new Scanner(System.in);
        int numero = 0;
        int intentos = 0;
        int aleatorio = (int)(Math.random()*100);
        //System.out.println(aleatorio);

        /* En caso de que el numero aleatorio sea 0 nunca se ejecutaria
        while (numero != aleatorio){

            System.out.println("Introduce un numero");
            numero = entrada.nextInt();
            if (aleatorio < numero){
                System.out.println("Mas bajo");
            } else if (aleatorio > numero){
                System.out.println("Mas alto");
            }
        } System.out.println("Correcto");
        */

        do {
            intentos++;
            System.out.println("Introduce un numero");
            numero = entrada.nextInt();
            if (aleatorio < numero){
                System.out.println("Mas bajo");
            } else if (aleatorio > numero){
                System.out.println("Mas alto");
            }
        } while (numero != aleatorio);
        System.out.println("Correcto");


    }
}
