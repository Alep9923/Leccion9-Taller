package Taller_5;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner factura = new Scanner(System.in);
        System.out.println("Indique el total de su compra");
        float total = factura.nextFloat();

        System.out.println("¿Qúe cantidad de productos ha comprado?");
        int cantidadProductos = factura.nextInt();

        System.out.println("¿Cuanta con membresia? (true/false)");
        boolean membresia = factura.nextBoolean();

        if (membresia) {
            float descuento10 = total * (1 - 0.10f);
            System.out.println("El total con descuento aplicado por membresia es de: " + descuento10);
        } else if (cantidadProductos >= 10) {
            float descuento5 = total * (1 - 0.05f);
            System.out.println("El total con descuento aplicado por la compra es de :" + descuento5);
        } else {
            System.out.println("El total de su cuenta es de: " + total);
        }

    }
}

