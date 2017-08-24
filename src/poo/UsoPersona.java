package poo;

import java.util.Date;
import java.util.GregorianCalendar;

    // ------------- Metodo Main --------------

public class UsoPersona {
    public static void main(String[] args){
        Persona[] lasPersonas = new Persona[2];
        lasPersonas[0] = new Empleado2("Luis Conde", 50000, 2010,25, 10);
        lasPersonas[1] = new Alumno("Roberto ","Abogacia");

        for (Persona x : lasPersonas){
            System.out.println(x.getNombre()+ "," + x.getDescripcion());
        }
    }
}










    //--------------------------------- CLASE PERSONA - ABSTRACTA ---------------------------------
abstract class Persona{

    // Constructor de clase
    public Persona(String nom){
        nombre = nom;

    }

    // Getters
    public String getNombre(){
        return nombre;
    }


    public abstract String getDescripcion(); // Declaracion de un metodo abstracto, se obliga a las sub-clases a sobreescribir este metodo
    private String nombre;
}


    //---------------------------------------- CLASE EMPLEADO ----------------------------------------

class Empleado2 extends Persona{

    // Constructor de la clase
    public Empleado2(String nom, double sue, int y,  int m, int d ){
        super(nom);
        sueldo = sue;
        GregorianCalendar calendario = new GregorianCalendar(y,m-1,d);
        altaContrato = calendario.getTime();
        ++IdSiguiente;
        Id=IdSiguiente;

    }

    // Metodo obligatorio heredado de la clase persona
    public String getDescripcion(){
        return "Este empleado tiene un Id= " + Id + " con un sueldo igual= " + sueldo;
    }

    // GETTERS

    public double getSueldo(){
        return sueldo;
    }

    public Date getAltaContrato(){
        return altaContrato;
    }

    //SETTERS


    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public void setAltaContrato(Date altaContrato) {
        this.altaContrato = altaContrato;
    }

    // Aumento de sueldo
    public void subeSueldo(double porcentaje){
        double aumento = sueldo*porcentaje/100;
        sueldo+= aumento;
    }


    // Campos de clase que por costumbre se ponen al final
    private double sueldo;
    private Date altaContrato;
    private int Id, IdSiguiente;

}



    // ------------------------------ CLASE ALUMNO ------------------------------

class Alumno extends Persona{
    public Alumno(String nom, String car){
        super(nom);
        carrera = car;
    }

    // Metodo Obligadotorio

    public String getDescripcion() {
        return "Este alumno cursa la carrera de : " + carrera;
    }

    private String carrera; // Encapsulacion
}