package poo;

import java.util.*;

// USO DE EMPLEADO CON METODO MAIN
public class UsoEmpleado {
    public static void main (String[] args){
       /*
       Empleado empleado1 = new Empleado("Roberto Acuña",18000,2016,10,25);
       Empleado empleado2 = new Empleado("Maria Petea",18000,2017,1,2);
       empleado1.subeSueldo(10);
       empleado2.subeSueldo(5);
       muestraEmpleado(empleado1);
       muestraEmpleado(empleado2);
        */

        Empleado[] misEmpleados = new Empleado[3];
        misEmpleados[0] = new Empleado("Paco Gomez",85000,1990,12,17);
        misEmpleados[1] = new Empleado("Ana Lopez",95000,1995,6,2);
        misEmpleados[2] = new Empleado("Maria Martin",105000,2000,8,10);

        /*
        for (int i = 0; i <3 ; i++){
            misEmpleados[i].subeSueldo(5);
        }

        for (int i = 0 ; i<3; i++){
            System.out.println("\n\nNombre: " + misEmpleados[i].getNombre()
            + "\nSueldo: "+ misEmpleados[i].getSueldo()+ "\nFecha de alta: "+ misEmpleados[i].getAltaContrato());
        }*/

        // FOR MEJORADO
        for (Empleado e: misEmpleados){
            e.subeSueldo(5);
        }

        for (Empleado e: misEmpleados){
            System.out.println("\n\nNombre: " + e.getNombre() + "\nSueldo: "+ e.getSueldo()+ "\nFecha de alta: "+ e.getAltaContrato());
        }

    }

    public static void muestraEmpleado(Empleado x){
        System.out.println("\n\t\tDatos del empleado");
        System.out.println("Nombre: "+ x.getNombre());
        System.out.println("Sueldo: "+ x.getSueldo());
        System.out.println("Contratacion: "+ x.getAltaContrato());
    }


}


// CLASE EMPLEADO
class Empleado{

    // Constructor de la clase
    public Empleado(String nom, double sue, int y,  int m, int d ){
        nombre = nom;
        sueldo = sue;
        GregorianCalendar calendario = new GregorianCalendar(y,m-1,d);
        altaContrato = calendario.getTime();
    }

    // GETTERS

    public String getNombre(){
        return nombre;
    }

    public double getSueldo(){
        return sueldo;
    }

    public Date getAltaContrato(){
        return altaContrato;
    }

    //SETTERS

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

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


    // Campos de clase
    private String nombre;
    private double sueldo;
    private Date altaContrato;

}

class Jefatura extends Empleado{
    public Jefatura(String nom, double sue, int y , int m , int d){
        super(nom,sue,y,m,d);
    }

    public void setIncentivo(double b){
        incentivo = b;
    }

    public double getSueldo(){
        double sueldoJefe = super.getSueldo();
        return sueldoJefe + incentivo;
    }


    // Campos de clase siempre al final o al inicio de una clase
    private double incentivo;

}