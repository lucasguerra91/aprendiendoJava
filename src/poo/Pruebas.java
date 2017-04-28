package poo;

// METODO MAIN DE LA CLASE
public class Pruebas {
    public static void main(String[] args){
        Empleados trabajador1 = new Empleados("Marciano Olvidado");
        Empleados trabajador2 = new Empleados("Forastero Violado");
        Empleados trabajador3 = new Empleados("Mono Vapeador");
        Empleados trabajador4 = new Empleados("Maria Latrola");
        trabajador1.setSeccion("Gerencia");

        System.out.println(trabajador1.getDatos());
        System.out.println(trabajador2.getDatos());
        System.out.println(trabajador3.getDatos());
        System.out.println(trabajador4.getDatos());

        System.out.print("\n" + Empleados.getIdSgte());
    }
}

// CLASE EMPLEADOS
class Empleados{

    public Empleados(String nombre){
        this.nombre = nombre;
        seccion = "Administracion";
        Id= IdSiguiente;
        IdSiguiente++;


    }

    // SETTERS
    public void setSeccion(String seccion){
        this.seccion = seccion;
    }



    // GETTERS
    public String getDatos(){
        return "\nEl nombre es: " + nombre + " , se encuentra en la seccion " + seccion + " y su Id es  " + Id;
    }

    public static String getIdSgte(){
        return "El Id siguiente es: " + IdSiguiente;
    }

    private final String  nombre;
    private String seccion;
    private int Id;
    private static int IdSiguiente=1;
}
