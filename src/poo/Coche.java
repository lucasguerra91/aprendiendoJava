package poo;

public class Coche {
    // Caracteristicas comunes
    private int ruedas;
    private int largo; // ambos en -
    private int ancho; // centimetros
    private int motor; // en centimetros cubicos
    private int peso_plataforma; // en kilos

    // Caracteristicas variables
    String color;
    int peso_total;
    boolean asientos_cuero, climatizador;

    public Coche(){ // Constructor

        ruedas = 4 ;
        largo = 2000;
        ancho = 300;
        motor = 1600;
        peso_plataforma = 500;
    }

    public String getLargo(){ // GETTER
        return "El largo del auto es "+ largo;
    }

    public String getAll(){
        return "La plataforma del vehiculo tiene "+ ruedas + " ruedas" +
                " . \nMide "+ largo/1000 + " metros con un ancho de " +
                " cm y un peso de plataforma de " + peso_plataforma + " kg.";
    }


    public void setColor(String color_select){ //SETTER
        color = color_select;
    }

    public String getColor(){ // GETTER del color del auto
        return "El color del auto es "+ color;
    }

    // SETTER de asientos de cuero
    public void setAsientos_cuero(String asientos_cuero){
        if (asientos_cuero.equalsIgnoreCase("si")){
            this.asientos_cuero = true;
        }else {
            this.asientos_cuero = false;
        }
    }

    // GETTER de asientos de cuero
    public String getAsientos(){
        if (asientos_cuero == true){
            return "El auto tiene asientos de cuero.";
        } else {
            return "El auto tiene asientos de serie.";
        }
    }

    //SETTER climatizador
    public void setClimatizador (String climatizador){
        if (climatizador.equalsIgnoreCase("Si")){
            this.climatizador= true;
        } else{
            this.climatizador = false;
        }
    }

    // GETTER climatizador
    public String getClimatizador(){
        if (climatizador==true){
            return "El auto incorpora climatizador.";
        } else{
            return "El auto lleva aire acondicionado.";
        }
    }

    public String getPesoCoche(){
        int peso_carroceria= 500;
        peso_total = peso_plataforma + peso_carroceria;
        if (asientos_cuero){
            peso_total= peso_total + 50;
        }

        if (climatizador){
            peso_total = peso_total + 20 ;
        }

        return "El peso del coche es de " + peso_total + " kilos. ";
    }

    // GETTER con setter incluido , no recomendado, a modo de ejemplo
    public int precio_coche(){
        int precio_final = 10000;
        if (asientos_cuero == true){
            precio_final += 2000;
        }

        if (climatizador == true){
            precio_final+= 1500;
        }
        return precio_final;

    }


}
