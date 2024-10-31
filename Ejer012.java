package Ejericios_B3;

import java.util.Arrays;

public class Ejer012 {


    /* Crea un metodo que acepte un array de enteros y devuelva el mismo array ordenado
        de menor a mayor. Utiliza para ello el metodo de ordenación de la burbuja.
    */
    public static void main(String[] args) {


        int[] burbuja = {10, 50, 2, 6};
        int nFlotante = 0;

        for (int i = 0; i < burbuja.length - 1; i++) {
            for (int j = 0; j < burbuja.length - i - 1; j++) {
                if (burbuja[j] > burbuja[j + 1]) {
                    nFlotante = burbuja[j];
                    burbuja[j] = burbuja[j + 1];
                    burbuja[j + 1] = nFlotante;

                }

            }

        }
        System.out.println(Arrays.toString(burbuja));


    }
}






