package poo;


import paquetepruebas.Clase3;

public class Clase2 {
    public static void main(String[] args){

        // Creando objetos correspondientes a clases que se encuentran en otros paquetes
        Clase1 miobj = new Clase1();
        Clase3 miobj2= new Clase3();

        // Modificando el objeto creado y utilizando un  metodo propio de su clase
        miobj2.mivar = 7;
        System.out.println(miobj2.mimetodo());


    }
}
