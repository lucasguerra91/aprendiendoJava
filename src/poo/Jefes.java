package poo;

public interface Jefes extends Trabajadores {

    // Todos los metodos son publicos y abstractos por lo que no es necesario especificarlo
    // Tampoco es necesario desarrollarlos porque deben ser sobreescritos por la clase que lo implemente
    String tomar_decisiones (String decision);


}
