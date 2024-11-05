/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_3_captura;

import java.util.Scanner;

/**
 *
 * @author aramv
 */
public class EVA3_3_CAPTURA {

    public static void main(String[] args) {
    String nombre =   capturarTexto("Introduce tu nombre");
 String apellido = capturarTexto("Introduce tu apellido");
 int salario = capturarEntero ("Introduce tu salario");
 double edad = capturarDoble ("Introduce tu edad");
 
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Salario: " + salario);
        System.out.println("Edad: " + edad);
        
    }
    
    public static String capturarTexto(String mensaje){
        Scanner captu = new Scanner(System.in);
        String texto;
        System.out.println(mensaje);
        texto = captu.nextLine();
        return texto;
    } 
    public static int capturarEntero(String entero){ 
        Scanner captu = new Scanner(System.in);
        int salario;
        System.out.println(entero);
        salario = captu.nextInt();
        return salario;
        
}
     public static double capturarDoble (String doble){
         Scanner captu = new Scanner(System.in);
         double edad;
         System.out.println(doble);
         edad = captu.nextDouble();
         return edad;
     }       
}
