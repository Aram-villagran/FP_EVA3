/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_4_metodos;

import java.util.Scanner;

/**
 *
 * @author aramv
 */
public class EVA3_4_METODOS {

    public static void main(String[] args) {
        System.out.println("Mayor de 8 y 7 = " + buscarMayor(8,7));
        System.out.println("Inserte un dia de la semana (1-7)") + determinarDia;
    }
    
    //determinar el mayor de dos numeros
    public static int buscarMayor(int num1, int num2){
        if(num1 > num2){
        return num1;
    }else{
            return num2;
            }
    }

    //determinar el dia de la semana
    public static String determinarDia (String Dia){     
    String dia;
     Scanner captu = new Scanner (System.in);
     System.out.println("Numero correspondiente al dia de la semana (1-7):");
        String nextLine = captu.nextLine();
    switch(Dia){
         case 1 -> System.out.println("Lunes");
            //ultima instruccion = fin del caso
     case 2 -> System.out.println("Martes");
     case 3 -> System.out.println("Miercoles");
     case 4 -> System.out.println("Jueves");
     case 5 -> System.out.println("Viernes");
     case 6 -> System.out.println("Sabado");
     case 7 -> System.out.println("Domingo");
     default -> {
         //opcional, sin break, siempre es la ultima seccion del switch
         System.out.println("Inserte un dia valido (1-7)");
         
         return Dia;
            }
