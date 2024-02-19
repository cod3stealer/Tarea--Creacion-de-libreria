package com.ejemplo.operaciones;

import com.ejemplo.io.EntradaSalida;

public class LibreriaOperacionesMain {

    public static void main(String[] args) {
        
        String num1Str = EntradaSalida.pedirString("Introduce el primer número:");
        Float num1 = Float.parseFloat(num1Str);

        String num2Str = EntradaSalida.pedirString("Introduce el segundo número:");
        Float num2 = Float.parseFloat(num2Str);

        String operacion = EntradaSalida.pedirString("Introduce la operación (+, -, *, /):");

        Float resultado = LibreriaOperaciones.operar(num1, num2, operacion);

        if (resultado != null) {
            EntradaSalida.mostrarString("El resultado es: " + resultado);
        }
    }
}
