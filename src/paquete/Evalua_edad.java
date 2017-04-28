package paquete;
import java.util.*;
/**
 * Created by lguerra on 22/03/2017.
 */
public class Evalua_edad {
    public static void main (String[] args){
        // Construimos el objeto scanner
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduzca su edad");
        // capturamos la edad
        int edad = entrada.nextInt();

        if (edad < 18){
            System.out.println("Eres un adolescente.");
        }else if(edad < 40){
            System.out.println("Eres joven");
        } else if (edad < 65){
            System.out.println("Eres nmaduro");
        }else {
            System.out.println("Cuidate");
        }

    }
}
