package com.ejemplo.io;

import java.util.Scanner;

public class EntradaSalida {

    private static final Scanner scanner = new Scanner(System.in);

    public static String pedirString(String mensaje) {
        System.out.println(mensaje);
        return scanner.nextLine();
    }

    public static int pedirInt(String mensaje) {
        System.out.println(mensaje);
        return scanner.nextInt();
    }

    public static float pedirFloat(String mensaje) {
        System.out.println(mensaje);
        return scanner.nextFloat();
    }

    public static void mostrarString(String mensaje) {
        System.out.println(mensaje);
    }

    public static void mostrarInt(int numero) {
        System.out.println(numero);
    }

    public static void mostrarFloat(float numero) {
        System.out.println(numero);
    }
}
