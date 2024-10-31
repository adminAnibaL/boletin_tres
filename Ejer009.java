package Ejericios_B3;

import java.util.Arrays;

public class Ejer009 {

    //Modifica el metodo anterior y acepta un parámetro “reverse”, que indique si el array
    //debe devolverse ordenado de menor a mayor o al revés.


    public static void main(String[] args) {
        int[] burbuja = {10, 50, 2, 6, 5};

        // Llamada a la función con reverse = false (orden ascendente)
        devolver(burbuja, false);

        // Llamada a la función con reverse = true (orden descendente)
        devolver(burbuja, true);
    }

    public static void devolver(int[] burbuja, boolean reverse) {
        // Algoritmo de ordenación de burbuja
        for (int i = 0; i < burbuja.length - 1; i++) {
            for (int j = 0; j < burbuja.length - i - 1; j++) {
                // Condición cambia según el valor de 'reverse'
                if ((reverse && burbuja[j] < burbuja[j + 1]) || (!reverse && burbuja[j] > burbuja[j + 1])) {
                    int nFlotante = burbuja[j];
                    burbuja[j] = burbuja[j + 1];
                    burbuja[j + 1] = nFlotante;
                }
            }
        }

        // Imprimir el arreglo ordenado
        System.out.println("Array ordenado " + (reverse ? "de mayor a menor: " : "de menor a mayor: ") + Arrays.toString(burbuja));
    }}

