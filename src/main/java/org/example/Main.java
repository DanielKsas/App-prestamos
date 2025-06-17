package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("sistema de préstamos con interés simple");
        System.out.println("Por favor, ingrese la información solicitada.\n");

        // Datos clientes 
        System.out.print("Nombre del cliente: ");
        String nombreCliente = scanner.nextLine();

        // Pedimos el nombre del banco
        System.out.print("Nombre del banco: ");
        String nombreBanco = scanner.nextLine();

        // Pedimos el monto del préstamo
        System.out.print("Ingrese el monto del préstamo ($): ");
        double montoPrestamo = scanner.nextDouble();

        // Pedimos la tasa de interés anual (porcentaje)
        System.out.print("Ingrese la tasa de interés anual (%): ");
        double tasaInteres = scanner.nextDouble();

        // Pedimos el plazo en años
        System.out.print("Ingrese el plazo del préstamo (en años): ");
        byte plazoYears = scanner.nextByte();

        // 💡 Fórmula del interés simple:
        // Interés = monto * tasa * tiempo / 100
        double interesTotal = montoPrestamo * tasaInteres * plazoYears / 100;

        // Monto total a pagar = monto + interés
        double montoFinal = montoPrestamo + interesTotal;

        // Resultados
        System.out.println("\n RESUMEN DEL PRÉSTAMO");
        System.out.println("-------------------------------");
        System.out.println("Cliente: " + nombreCliente);
        System.out.println("Banco: " + nombreBanco);
        System.out.println("Monto solicitado: $" + montoPrestamo);
        System.out.println("Tasa de interés anual: " + tasaInteres + "%");
        System.out.println("Plazo del préstamo: " + plazoYears + " años");
        System.out.println("-------------------------------");
        System.out.printf("Interés total a pagar: ", interesTotal);
        System.out.printf("Monto total a devolver: ", montoFinal);


    }
}
