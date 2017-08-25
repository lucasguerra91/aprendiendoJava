package paquete;
import java.util.*;

public class Uso_Tallas {

    // Declaramos la variable enum y especificamos los valores que puede aceptar
    // enum Talla{ PEQUEÑO, MEDIANO, GRANDE ,MUY_GRANDE};

    enum Talla {
        MINI("S"), MEDIANO("M"), GRANDE("L"), MUY_GRANDE("XL");

        private Talla(String abreviatura) {
            this.abreviatura = abreviatura;
        }

        // GETTERS
        public String getAbreviatura(){
            return abreviatura;
        }

        private String abreviatura;
    }

    public static void main(String[] args){
        // Creamos un oobjeto de tipo scanner
        Scanner entrada = new Scanner(System.in);

        // Le pedimos al usuario que lo cargue
        System.out.println("Escribe una talla: MINI, MEDIANO, GRANDE , MUY_GRANDE");

        // Ponemos al scanner en modo escucha y convertimos a mayusculas lo que ingrese el usuario
        String entrada_datos = entrada.next().toUpperCase();



        /*
        Talla s = Talla.PEQUEÑO;
        Talla m = Talla.MEDIANO;
        Talla g = Talla.GRANDE;
        Talla xl = Talla.MUY_GRANDE;
            Se podrian definir las tallas de esta manera
        String talla;
        talla = "Pequeña";
        talla = "Mediana";
        talla = "Grande";
            Hasta que nos encontramos con un valor que no tiene nada que ver
        talla = "Azul";
        */

    }

}
