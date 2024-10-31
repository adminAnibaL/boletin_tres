package Ejericios_B3;

import java.util.Scanner;

public class Ejer003 {

    /*
     * Crea un programa Que PREGUNTE cuantos elementos tendremos en un array
     * posteriormente SE Preguntan tantos enteros como haya indicado el usuario.
     * Posteriormente mostraremos por pantalla
     * - El mayor
     * - El menor
     * - La media
     * - (SI) el numero mayor o menor estan repetidos ¿Cuantas veces se repite?
     *
     * */


    public static void main(String[] args) {
        //********************************************* Creacion del array ******************************
        Scanner sc = new Scanner(System.in);
        System.out.print("Cuantos elemento tendrá el array → ");
        int size = sc.nextInt();
        //se crea el array de tamaño N *************************
        int[] arraySize = new int[size];

        // ***************** Solicitamos los enteros para el array **************************************
        System.out.println("Ingresa los elementos del array ");
        for (int i = 0; i < arraySize.length; i++) {
            arraySize[i] = sc.nextInt();
        }
//****************************** Imprimimos por pantalla ************************************************
        for (int i = 0; i < arraySize.length; i++) {
            System.out.print(arraySize[i] + " ");
        }
        System.out.println();
// *********************************** Cual es el mayor de los elementos agregados. *********************

      /* if (size > 0) {
            int mayor = arraySize[0];
            for (int i = 1; i < arraySize.length; i++) {
                if (arraySize[i] > mayor) {
                    mayor = arraySize[i];
                }
            }
            System.out.println(mayor);
        }*/
        //Empezamos comprobando que el array tiene elemento *********************************************
        if (size > 0) {
            //Empezamos a buscar el Mayor
            int mayor = arraySize[0];
            for (int i = 1; i < arraySize.length; i++) {
                if (arraySize[i] > mayor) {
                    mayor = arraySize[i];
                }

            }
            System.out.println("El elemento mayor → " + mayor);
            System.out.println();

        }

        //************************* Cual es el menor de los elementos agregados *************************

        if (size > 0) {
            int menor = arraySize[0];
            for (int i = 1; i < arraySize.length; i++) {
                if (arraySize[i] < menor) {
                    menor = arraySize[i];
                }

            }
            System.out.println("El menor es → " + menor);

        }


//************************* Cual es la media *************************
        int suma = 0;
        double media = 0;
        if (size > 0) {
            for (int i = 0; i < arraySize.length; i++) {
                suma += arraySize[i];
            }
            media = (double) suma / arraySize.length;
            System.out.println("La suma de los enteros → " + suma);
            System.out.println("La media es → " + media);
        }

        //************************* Cuantas veces se repite el numero *************************
        int contador = 0;
        if (size > 0) {
            int duplicado = arraySize[0];
            for (int i = 1; i < arraySize.length; i++) {
                if (arraySize[i] == duplicado) {
                    contador++;

                }
            }
            System.out.println("hola " +contador);
        }





    }





}


