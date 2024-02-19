package com.ejemplo.io;

import java.util.Scanner;
/**
 * Libreria Entrada Salida
 *
 * @author Santiago Romero
* */
public class EntradaSalida {

    private static final Scanner scanner = new Scanner(System.in);
    /**
     * Solicita al usuario que introduzca una cadena.
     *
     * @param mensaje El mensaje que se mostrará al usuario antes de solicitar la entrada.
     * @return La cadena introducida por el usuario.
     */
    public static String pedirString(String mensaje) {
        System.out.println(mensaje);
        return scanner.nextLine();
    }

    /**
     * Solicita al usuario que introduzca un entero.
     *
     * @param mensaje El mensaje que se mostrará al usuario antes de solicitar la entrada.
     * @return El entero introducido por el usuario.
     */
    public static int pedirInt(String mensaje) {
        System.out.println(mensaje);
        return scanner.nextInt();
    }

    /**
     * Solicita al usuario que introduzca un float.
     *
     * @param mensaje El mensaje que se mostrará al usuario antes de solicitar la entrada.
     * @return El float introducido por el usuario.
     */
    public static float pedirFloat(String mensaje) {
        System.out.println(mensaje);
        return scanner.nextFloat();
    }
    /**
     * Muestra una cadena en la consola.
     *
     * @param mensaje La cadena que se mostrará en la consola.
     */
    public static void mostrarString(String mensaje) {
        System.out.println(mensaje);
    }

    /**
     * Muestra un entero en la consola.
     *
     * @param numero El entero que se mostrará en la consola.
     */
    public static void mostrarInt(int numero) {
        System.out.println(Integer.toString(numero));
    }

    /**
     * Muestra un float en la consola.
     *
     * @param numero El float que se mostrará en la consola.
     */
    public static void mostrarFloat(float numero) {
        System.out.println(Float.toString(numero));
    }

 }
