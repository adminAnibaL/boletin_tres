package Ejericios_B3;

public class Ejer002 {

    /*Crea un programa que detecte cuantos
     * numeros negativos hay en un array de entero*/

    public static void main(String[] args) {

        int[] arrayEnterosNegativos = {-15, -2, 8, -3, 8, -1};
        int contadorNegativos = 0;

        for (int i = 0; i < arrayEnterosNegativos.length; i++) {

            if (arrayEnterosNegativos[i] <0 ){
                contadorNegativos ++;
                System.out.print(" " + arrayEnterosNegativos[i]);

            }

        }
        System.out.println(" → Existen : "+ contadorNegativos + " negativos " + " en el array");
    }


}
