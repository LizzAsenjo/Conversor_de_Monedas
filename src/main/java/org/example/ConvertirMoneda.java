package org.example;

import java.util.Scanner;

public class ConvertirMoneda {
    public static void convertir(String monedaInicial, String monedaFinal, ConsultarMoneda consulta, Scanner sc){
        double cantidad;
        double cantidadConvertida;

        Moneda moneda = consulta.buscarMoneda(monedaInicial, monedaFinal);
        System.out.println("Ingrese el valor que deseas convertir");
        cantidad = Double.parseDouble(sc.nextLine());
        cantidadConvertida = cantidad * moneda.getConversion_rate();
        System.out.println("El valor "+cantidad+" ["+moneda.getBase_code()+"] corresponde al valor final de ==>> "+cantidadConvertida+" ["+moneda.getTarget_code()+"]");
    }
}
