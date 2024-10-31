package Ejericios_B3;

public class Ejer001 {

    /*
     * Crea un programa que sume todas las posiciones pares
     * de un array de enteros.
     * */
    public static void main(String[] args) {
        int[] arrayEntero = {10, 2, 8, 9, 3};
        int suma = 0;

        for (int i = 0; i < arrayEntero.length; i++) {
            //System.out.print(arrayEntero[i] + " ");

            if (arrayEntero[i] % 2 == 0) {
                suma += arrayEntero[i];

            }

        }

        System.out.print(suma + " ");
    }

}