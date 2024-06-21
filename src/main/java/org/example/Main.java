package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ConsultarMoneda consulta = new ConsultarMoneda();

        int opcion = 0;
        while (opcion != 7) {
            System.out.println("================================================");
            System.out.println("|    Sea bienvenido/a al Conversor de Moneda   |");
            System.out.println("|                                              |");
            System.out.println("|  1) Dólar ==>> Peso argentino                |");
            System.out.println("|  2) Peso Argentino ==>> Dólar                |");
            System.out.println("|  3) Dólar ==>> Real Brasileño                |");
            System.out.println("|  4) Real Brasileño ==>> Dólar                |");
            System.out.println("|  5) Dólar ==>> Peso Colombiano               |");
            System.out.println("|  6) Peso Colombiano ==>> Dólar               |");
            System.out.println("|  7) Salir                                    |");
            System.out.println("|  Elija una opción válida                     |");

            try {
                opcion = Integer.parseInt(sc.nextLine().trim());
                if (opcion > 0 && opcion < 7) {
                    switch (opcion) {
                        case 1:
                            ConvertirMoneda.convertir("USD", "ARS", consulta, sc);
                            break;
                        case 2:
                            ConvertirMoneda.convertir("ARS", "USD", consulta, sc);
                            break;
                        case 3:
                            ConvertirMoneda.convertir("USD", "BRL", consulta, sc);
                            break;
                        case 4:
                            ConvertirMoneda.convertir("BRL", "USD", consulta, sc);
                            break;
                        case 5:
                            ConvertirMoneda.convertir("USD", "COP", consulta, sc);
                            break;
                        case 6:
                            ConvertirMoneda.convertir("COP", "USD", consulta, sc);
                            break;
                        case 7:
                            System.out.println("*************Gracias por su consulta**************");
                            break;
                    }
                } else if (opcion != 7) {
                    System.out.println("***********Error digite valor correcto***********");
                }
            } catch (NumberFormatException e) {
                System.out.println("*********Error digite un número entero válido*********");
                opcion = 0;
            }
        }
    }
}