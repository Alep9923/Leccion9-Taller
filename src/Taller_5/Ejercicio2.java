package Taller_5;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main (String[] args) {
        Scanner veterinario = new Scanner(System.in);
        System.out.println("¿Qué tipo de mascota será atendido? \n Marque 1. Para Perros \n Marque 2. Para Gatos \n Marque 3. Para Aves \n Marque 4. Para Otros");
        int seleccion = veterinario.nextInt();

        System.out.println("¿Qué edad tiene tu mascota?");
        float edadAnimal = veterinario.nextFloat();

        switch (seleccion) {
            case 1:
                System.out.println("Su perro será atentido por el Medico Especialista Veterinario Alexander");
                if (edadAnimal >= 5) {
                    System.out.println("Su mascota tiene más de 5 años, se recomienda vacunar contra Parvovirus o Moquillo");
                }
                break;
            case 2:
                System.out.println("Su gato será atentito por la Medica Especialista Veterinaria Samantha");
                if (edadAnimal >= 5) {
                    System.out.println("Su mascota tiene más de 5 años, se recomienda vacunar contra Parvovirus o Moquillo");
                }
                break;
            case 3:
                System.out.println("Su ave será atentido por la Medica Especilista en Avifauna Karen");
                break;
            case 4:
                System.out.println("Su mascota será atentida por el Medico Veterinario Juan para una consulta general");
                break;
            default:
                System.out.println("Por favor, marque de manera adecuada para ser atentido");
        }
    }
}
