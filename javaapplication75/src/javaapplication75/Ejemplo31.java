/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// importacion de las librerias
package javaapplication75;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Frank J. Saca Q
 */
public class Ejemplo31 {

    public static void main(String[] args) {
        // TODO code application logic here
        // declaracion de variables
        Scanner entrada = new Scanner(System.in);
        boolean b = true;
        String a;
        // Random = valores aleatorios
        Random aleatorios = new Random();
        int[] datos = new int[6];
        String[] rangos = {"0-8", "8.1-12", "12.1-16", "16.1-19", "19.1-20", "20.1-adelante"};
        // Ciclo while para que el usuario decida cuando terminar
        while (b == true) {
            System.out.printf("Ingrese una nota: ");
            double cantidad = entrada.nextDouble();
            // asignacion de datos al arreglo segun corresponde
            if (cantidad >= 0 && cantidad <= 8) {
                datos[0] = datos[0] + 1;
            } else {
                if (cantidad >= 8.1 && cantidad <= 12) {
                    datos[1] = datos[1] + 1;
                } else {
                    if (cantidad >= 12.1 && cantidad <= 16) {
                        datos[2] = datos[2] + 1;
                    } else {
                        if (cantidad >= 16.1 && cantidad <= 19) {
                            datos[3] = datos[3] + 1;
                        } else {
                            if (cantidad >= 19.1 && cantidad <= 20) {
                                datos[4] = datos[4] + 1;
                            } else {
                                datos[5] = datos[5] + 1;
                            }
                        }
                    }
                }
            }
            // limpieza del Buffer
            entrada.nextLine();
            System.out.printf("Presione s para agregar otra nota: ");
            a = entrada.nextLine();
            // validacion de si se quiere o no agregar mas notas
            if (a.equals("s")) {
                b = true;
            } else {
                b = false;
            }
        }
        // presentacion de datos
        System.out.println("Notas ingresadas...\nRangos: ");
        for (int i = 0; i < datos.length; i++) {
            System.out.printf("%s - %d\n", rangos[i], datos[i]);
        }
    }
}
