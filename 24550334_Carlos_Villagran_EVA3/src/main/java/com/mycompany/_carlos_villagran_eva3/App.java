/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._carlos_villagran_eva3;

import java.util.Scanner;

/**
 *
 * @author aramv
 */
public class App {

    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        
        
        System.out.println("Ingrese el número de estudiantes: ");
       int numEstudiantes = captu.nextInt();
      
        if (numEstudiantes <= 0){
            System.out.println("El numero de estudiantes debe ser mayor a 0");
        return;
        }
        double[] calificaciones = new double[numEstudiantes];
      for (int i = 0; i < numEstudiantes; i++) {
            System.out.print("Ingrese la calificación del estudiante " + (i + 1) + ": ");
            calificaciones[i] = captu.nextDouble();
              
      if (calificaciones[i] < 0 || calificaciones[i] > 100) {
                System.out.println("La calificación debe estar entre 0 y 100.");
                System.out.print("Ingrese la calificación del estudiante " + (i + 1) + ": ");
                calificaciones[i] = captu.nextDouble();
                
            }
        }

        double promedio = calcularPromedio(calificaciones);
        int mayoresOIguales = contarCalificacionesMayores(calificaciones, promedio);
        double max = obtenerCalificacionMasAlta(calificaciones);
        double min = obtenerCalificacionMasBaja(calificaciones);

        System.out.println("Promedio de calificaciones: " + promedio);
        System.out.println("Número de calificaciones mayores o iguales al promedio: " + mayoresOIguales);
        System.out.println("Calificación más alta: " + max);
        System.out.println("Calificación más baja: " + min);
    }

    public static double calcularPromedio(double[] calificaciones) {
        double suma = 0;
        for (double calificacion : calificaciones) {
            suma += calificacion;
        }
        return suma / calificaciones.length;
    }
//mayores 
    public static int contarCalificacionesMayores(double[] calificaciones, double promedio) {
        int contador = 0;
        for (double calificacion : calificaciones) {
            if (calificacion >= promedio) {
                contador++;
            }
        }
        return contador;
    }
//mas alta
    public static double obtenerCalificacionMasAlta(double[] calificaciones) {
        double max = calificaciones[0];
        for (double calificacion : calificaciones) {
            if (calificacion > max) {
                max = calificacion;
            }
        }
        return max;
    }
//mas baja
    public static double obtenerCalificacionMasBaja(double[] calificaciones) {
        double min = calificaciones[0];
        for (double calificacion : calificaciones) {
            if (calificacion < min) {
                min = calificacion;
            }
        }
        return min;
    }
}


        
        
    