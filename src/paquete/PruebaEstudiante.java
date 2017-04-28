package paquete;

/**
 * Created by lguerra on 20/03/2017.
 */
public class PruebaEstudiante {
    public static void main (String[] args){
        Estudiante cuenta1 = new Estudiante("Alberto Roto", 94.8);
        Estudiante cuenta2 = new Estudiante("Maria Rota", 45.2);

        System.out.printf("La calificacion de %s es : %s%n", cuenta1.getNombre(), cuenta1.getCalificacionLetra());
        System.out.printf("La calificacion de %s es : %s%n", cuenta2.getNombre(), cuenta2.getCalificacionLetra());
    }
} // fin de la clase
