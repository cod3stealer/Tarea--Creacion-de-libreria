package com.ejemplo.operaciones;

import java.util.Scanner;

/**
 * Librería para realizar operaciones básicas matemáticas.
 *
 * @author Santiago Romero
 */
public class LibreriaOperaciones {

    private static final Scanner scanner = new Scanner(System.in);

    /**
     * Realiza una operación matemática entre dos números.
     *
     * @param num1 El primer número.
     * @param num2 El segundo número.
     * @param operacion La operación a realizar (+, -, *, /).
     * @return El resultado de la operación o null si hay un error.
     */
    public static Float operar(Float num1, Float num2, String operacion) {
        try {
            switch (operacion) {
                case "+":
                    return num1 + num2;
                case "-":
                    return num1 - num2;
                case "*":
                    return num1 * num2;
                case "/":
                    if (num2 == 0) {
                        throw new IllegalArgumentException("División por cero.");
                    } else {
                        return num1 / num2;
                    }
                default:
                    throw new IllegalArgumentException("Operación no válida.");
            }
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
            return null;
        }
    }
}
