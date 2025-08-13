package Taller_5;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        final double precioCamisa = 25.99;
        final double precioPantalon = 35.50;
        final double precioChaqueta = 75.00;


        String tipoPrenda;
        int cantidad;
        double precioUnitario = 0;
        double totalPagar = 0;
        boolean prendaValida = true;


        System.out.println("Bienvenido a nuestra tienda de ropa");
        System.out.println("Tipos de prenda disponibles: camisa, pantalon, chaqueta");
        System.out.print("Ingrese el tipo de prenda que desea comprar: ");
        tipoPrenda = scanner.nextLine().toLowerCase();

        System.out.print("Ingrese la cantidad de prendas: ");
        cantidad = scanner.nextInt();


        switch (tipoPrenda) {
            case "camisa":
                precioUnitario = precioCamisa;
                break;
            case "pantalon":
                precioUnitario = precioPantalon;
                break;
            case "chaqueta":
                precioUnitario = precioChaqueta;
                break;
            default:
                prendaValida = false;
                System.out.println("Tipo de prenda no válido.");
        }


        if (prendaValida) {
            totalPagar = cantidad * precioUnitario;


            if (cantidad > 5) {
                double descuento = totalPagar * 0.15;
                totalPagar = totalPagar - descuento;
                System.out.println("¡Felicidades! Obtuviste un 15% de descuento por comprar más de 5 unidades.");
            }


            System.out.println("\nResumen de compra:");
            System.out.println("Tipo de prenda: " + tipoPrenda);
            System.out.println("Cantidad: " + cantidad);
            System.out.println("Precio unitario: $" + precioUnitario);
            System.out.println("Total a pagar: $" + totalPagar);
        }

        scanner.close();
    }
}