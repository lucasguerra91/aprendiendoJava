package paquete;

/**
 * Created by lguerra on 20/03/2017.
 */
public class Estudiante {
    private String nombre;
    private double promedio;

    // el constructor inicializa las variables de instancia
    public Estudiante(String nombre, double promedio) {
            this.nombre = nombre;
            // valida que promedio sea > 0.0 y <= 100.0
            // mantiene el valor predeterminado de la variable de instancia promedio
            if(promedio > 0.0)
                if(promedio <= 100.0)
                    this.promedio= promedio; // asigna a la variable  de instancia
        }

    // establece el nombre del estudiante
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //recupera el nombre del estudiante
    public String getNombre() {
        return nombre;
    }

    // establece el promedio del estudiante


    public void setPromedio(double promedio) {
        // valida el promedio
        if(promedio > 0.0)
            if(promedio <= 100.0)
                this.promedio = promedio;
    }

    // Get de promedio
    public double getPromedio() {
        return promedio;
    }

    // Evalua calificacion en letras
    public String getCalificacionLetra(){
        String calificacionEstudiante = ""; // se inicializa
        if (promedio >= 90.0)
            calificacionEstudiante ="A";
        else if (promedio >= 80.0)
            calificacionEstudiante = "B";
        else if (promedio >= 70.0 )
            calificacionEstudiante = "C";
        else if (promedio >= 60.0)
            calificacionEstudiante = "D";
        else
            calificacionEstudiante = "F";
        return calificacionEstudiante;
    }


}
