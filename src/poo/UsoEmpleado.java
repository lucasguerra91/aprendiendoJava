package poo;

import java.lang.reflect.Array;
import java.util.*;

// USO DE EMPLEADO CON METODO MAIN
public class UsoEmpleado {
    public static void main (String[] args){

        // Creando objetos
        Jefatura jefe_RRHH = new Jefatura("Alberto", 105000,2010, 01, 05);
        jefe_RRHH.setIncentivo(2000);

        Empleado[] misEmpleados = new Empleado[5];
        misEmpleados[0] = new Empleado("Paco Gomez",85000,1990,12,17);
        misEmpleados[1] = new Empleado("Ana Lopez",95000,1995,6,2);
        misEmpleados[2] = new Empleado("Maria Martin",105000,2000,8,10);
        misEmpleados[3] = jefe_RRHH; // Polimorfismo - Principio de sustitucion : se puede usar un opbjeto de la subclase siempre que el programa espere un objeto de la superclase
        misEmpleados[4] = new Jefatura("Maria", 95000, 1999 ,12 , 1 );

        //Casting
        // misEmpleados[4] no permite acceder a setIncentivo
        Jefatura jefaFinanzas = (Jefatura) misEmpleados[4];
        jefaFinanzas.setIncentivo(5000); // En cambio, al hacer un casting, si podemos acceder a los metodos de la clase Jefatura
        // Al intentar hacer un casting de un empleado a jefatura, nos va a dar error porque no esta dentro de la herencia "To_do jefe es empleado pero no to_do empleado siempre es jefe"


        // Ejemplos de instanciamiento y uso de instanceof

        Empleado director_comercial = new Jefatura("Sandra", 85000, 2012,05,05);
        Comparable ejemplo = new Empleado("Roberto", 25000, 2015 , 06 , 06);

        if (director_comercial instanceof Empleado){
            System.out.println("Es de tipo jefatura");
        }

        if (ejemplo instanceof Comparable){
            System.out.println("Implementa la interfaz comparable");
        }

        // Implementacion de metodo tomar_decisiones de la interface Jefes
        System.out.println(jefaFinanzas.tomar_decisiones("Tomarse vacaciones"));

        System.out.println("\nEl/la jefe  " + jefaFinanzas.getNombre() + "  tiene un bono de " +
                jefaFinanzas.establece_bono(5000) + " AR$");

        System.out.println("\nEl empleado  " + misEmpleados[2].getNombre() + "  tiene un bono de " +
                misEmpleados[2].establece_bono(500) + " AR$");

        // System.out.println(misEmpleados[3].getAltaContrato());  Se puede acceder a los metodos desde la instancia
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

        // Implementando interface Comparable para ordenar los empleados
        Arrays.sort(misEmpleados);

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




//  ------------------------------   CLASE EMPLEADO ------------------------------------

    class Empleado implements Comparable, Trabajadores{

        // Constructor de la clase
        public Empleado(String nom, double sue, int y,  int m, int d ){
            nombre = nom;
            sueldo = sue;
            GregorianCalendar calendario = new GregorianCalendar(y,m-1,d);
            altaContrato = calendario.getTime();
        }

        // GETTERS
        public String getNombre(){return nombre;}
        public double getSueldo(){
            return sueldo;
        }
        public  Date getAltaContrato(){
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

        // Sobreescritura del metodo compareTo para que funcione el implement  Comparable
        public int compareTo(Object miObjeto){
            Empleado otroEmpleado = (Empleado) miObjeto; // Es necesario hacer el casting para comparar
            if(this.sueldo < otroEmpleado.sueldo){return -1;}
            if (this.sueldo > otroEmpleado.sueldo){return 1;}
            return 0;
        }

        // Sobreescritura del metodo establece bono de la interface Trabajadores
        @Override
        public double establece_bono (double bono){
            return Trabajadores.bono_base + bono;
        }

        
        // Campos de clase
        private String nombre;
        private double sueldo;
        private Date altaContrato;

    }



    // ---------------------------- SubClase Jefatura que se extiende de la superclase Empleado -----------------
    class Jefatura extends Empleado implements Jefes{

        // Constructor
        public Jefatura(String nom, double sue, int y , int m , int d){
            super(nom,sue,y,m,d);
        }

        // Implementamos el metodo declarado en la interfaz
        @Override
        public String tomar_decisiones(String decision) {
            return "Un miembro de la direccion ha tomado la direccion de : " + decision;
        }

        // Metodo establece_bono de la interface
        @Override
        public double establece_bono(double bono) {
            double prima = 2000;
            return Trabajadores.bono_base + bono + prima;
        }

        // Metodo establece incentivo
        public void setIncentivo(double b){
            incentivo = b;
         }

        // GETTERS
        public double getSueldo(){
            double sueldoJefe = super.getSueldo();
            return sueldoJefe + incentivo;
        }

        // Campos de clase siempre al final o al inicio de una clase
        private double incentivo;
    }

