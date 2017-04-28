package paquete;


public class Uso_Arrays {
    public static void main(String[] args){

        /*
        int[] mi_matriz = new int[5];
        mi_matriz[0] = 5;
        mi_matriz[1] = 18;
        mi_matriz[2] = 12;
        mi_matriz[3] = 27;
        mi_matriz[4] = 45;
        */
        int [] mi_matriz = {5, 18, 12, 27, 45};
        for (int i = 0 ; i < mi_matriz.length ; i++){
            System.out.println("Valor del indice "+ i +" = "+mi_matriz[i]);
        }


    }
}
