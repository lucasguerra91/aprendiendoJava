package paquete;
import java.util.*;

public class EntradaEjemplo1 {
        public static void main(String[] args){
            // Constructor de objeto de la clase scanner
            Scanner entrada = new Scanner(System.in);
            System.out.println("Introduce tu nombre, por favor");
            // Captura de un string ingresada por teclado
            String nombre_usuario = entrada.nextLine();
            System.out.println("Introduce tu edad, por favor");
            // Captura de un int ingresada por teclado
            int edad = entrada.nextInt();
            System.out.println("Hola"+ nombre_usuario+ ". El año que viene tendras "+(edad+1)+" años");
        }
}
