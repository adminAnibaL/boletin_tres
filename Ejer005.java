package Ejericios_B3;


import java.util.Scanner;

public class Ejer005 {

    /*
     *Enunciado
     * Crea un metodo, que acepte un parametro "tamaño"
     * Genere un array de "tamaño" con posiciones de numero aleatorios 0-1000
     * y lo muestre por pantalla
     * */

    /*
    En general, para conseguir un número entero entre M y N [con M menor que N y ambos incluídos]
    int valorEntero = (int) (Math.floor(Math.random()*(N-M+1)+M));  // Valor entre M y N, ambos incluidos.

    Si no queremos un valor [entero] [si-no] → double, la fórmula es sin el +1
    double valorAleatorio = Math.random()*(N-M)+M;*/

    public static void main(String[] args) {

        int[] array = arrTamaño();
        array = arrayAleatorio(array);
        imprimir(array);
    }

    public static int[] arrTamaño() {


        Scanner sc = new Scanner(System.in);
//final int numMaxR = 1000;
        System.out.println("Ingrese el tamaño del Array");

        int size = sc.nextInt();
        int[] arrNuevo = new int[size];
        System.out.println("Se ha creado el array");
        return arrNuevo;
    }

    public static int[] arrayAleatorio(int[] array) {
        // Número aleatorio entre 0 y 40, excluido el 40.
        int randomNumber = (int) (Math.random() + 1);

        int[] arrNuevo = new int[randomNumber];
        for (int i = 0; i < arrNuevo.length; i++) {
            arrNuevo[i] = arrNuevo[i];
        }
        return arrNuevo;
    }

    public static void imprimir(int[] arrayNuevo) {
        for (int i = 0; i < arrNuevo.length; i++) {

            System.out.print(arrNuevo[i] + " ");

        }
    }

}





