package Taller_5;

import java.util.Scanner;
import java.time.LocalTime;

public class Ejercicio3 {
    public static void main (String[] args) {
        Scanner acceso = new Scanner(System.in);


        int tarifaInicialAuto = 1000;
        int tarifaInicialMoto = 900;
        int tarifaInicialBicileta = 500;


        LocalTime horaActual = LocalTime.now();

        System.out.println("\nEstimado cliente recuerde que por cada hora, se incrementa en $1000 del costo base \nel cual es de $500");

        System.out.println("Indique el tipo de Vehiculo a ingresar \n 1. Auto \n 2. Moto \n 3. Bicileta");
        int seleccionVehiculo = acceso.nextInt();

        System.out.println("Indique SOLO la cantidad de horas que el vehiculo se encontrará en el parquedadero");
        int horas = acceso.nextInt();

        LocalTime horasAcceso = horaActual.plusHours(horas);

        System.out.println("Su vehiculo se encontrará desde: " + horaActual + "\nhasta las: " + horasAcceso);

        switch (seleccionVehiculo) {
            case 1:
                System.out.println("El precio base por tarifa diferencial es de " + tarifaInicialAuto);
                for(int i = 0; i < horas; i++){
                    tarifaInicialAuto += 1000;
                }

                if (horasAcceso.isAfter(LocalTime.of(20,0))) {
                    System.out.println("Su vehículo se encuentra incluido en el cargo nocturno por lo que se le cobrará \nun 20% sobre su tarifa");
                    double recargoNocturno = tarifaInicialAuto * (1 + 0.20);
                    tarifaInicialAuto = (int) + recargoNocturno;
                }

                System.out.println("Su pago final es de " + tarifaInicialAuto);

                break;
            case 2:
                System.out.println("El precio base por tarifa diferencial es de " + tarifaInicialMoto);
                for(int i = 0; i < horas; i++){
                    tarifaInicialMoto += 500;
                }
                if (horasAcceso.isAfter(LocalTime.of(20,0))) {
                    System.out.println("Su vehículo se encuentra incluido en el cargo nocturno por lo que se le cobrará \nun 20% sobre su tarifa");
                    double recargoNocturno = tarifaInicialMoto * (1 + 0.20);
                    tarifaInicialMoto = (int) + recargoNocturno;
                }

                System.out.println("Su pago final es de " + tarifaInicialMoto);
                break;
            case 3:
                System.out.println("El precio base por tarifa diferencial es de " + tarifaInicialBicileta);
                for(int i = 0; i < horas; i++){
                    tarifaInicialBicileta += 500;
                }
                System.out.println("Su pago final es de " + tarifaInicialBicileta);
                break;
            default:
                System.out.println("Ingrese correctamente la información solicitada");
        }






    }
}
