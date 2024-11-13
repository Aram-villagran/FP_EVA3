/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_6_matrices;

/**
 *
 * @author aramv
 */
public class EVA3_6_MATRICES {

    public static void main(String[] args) {
int[] valores = new int[5];
//ARREGLO DE DOS DIMENSIONES --> Matriz: Hoja de excel
int[][] matriz = new int [3][3];
matriz[0][0] = 100; //primer posicion
matriz[0][1] = 200; //primer posicion
matriz[0][2] = 300; //primer posicion
matriz[1][0] = 400; //primer posicion
matriz[1][1] = 500; //primer posicion
matriz[1][2] = 600; //primer posicion
matriz[2][0] = 700; //primer posicion
matriz[2][1] = 800; //primer posicion
matriz[2][2] = 900; //ultima posicion
//imprimir matriz:
for (int i = 0; i < 3; i++) { //primer dimension: filas
    for (int j = 0; j < 3; j++) { //2da dim: columnas
        System.out.print("[" + matriz [i][j] + "]");
    }
    System.out.println("");            
        }
 
    }
}
