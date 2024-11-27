/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tic_tac_toe;

import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author aramv
 */
public class TIC_TAC_TOE {
    public static int[][] matriz = new int[3][3];
    public static int winner;

    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
         Random random = new Random();
        int seguir;

        do {
            reiniciarMatriz();
            winner = 1;

            while (winner == 1) {
                imprimirMatriz();
                System.out.println("Inserta posición (0-8) o cualquier otro número para salir:");
                int jugada = captu.nextInt();
                if (jugada < 0 || jugada > 8 || !hacerJugada(jugada, 4)) break;

                while (!hacerJugada((int) (Math.random() * 9), 1)) ;
                winner = verificarGanador();
            }

            imprimirMatriz();
            System.out.println(winner == 4 ? "¡Ganaste!" : winner == 1 ? "Perdiste." : "Empate.");
            System.out.println("¿Jugar de nuevo? (1=No, otro número=Sí):");
            seguir = captu.nextInt();
        } while (seguir != 1);

        System.out.println("Gracias por jugar.");
    }

    public static void reiniciarMatriz() {
        for (int i = 0; i < 3; i++) for (int j = 0; j < 3; j++) matriz[i][j] = 0;
    }

    public static void imprimirMatriz() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) System.out.print("[" + (matriz[i][j] == 4 ? "X" : matriz[i][j] == 1 ? "O" : " ") + "]");
            System.out.println();
        }
    }

    public static boolean hacerJugada(int jugada, int jugador) {
        int fila = jugada / 3, columna = jugada % 3;
        if (matriz[fila][columna] == 0) {
            matriz[fila][columna] = jugador;
            return true;
        }
        return false;
    }

    public static int verificarGanador() {
        for (int i = 0; i < 3; i++) {
            if (matriz[i][0] == matriz[i][1] && matriz[i][1] == matriz[i][2] && matriz[i][0] != 0) return matriz[i][0];
            if (matriz[0][i] == matriz[1][i] && matriz[1][i] == matriz[2][i] && matriz[0][i] != 0) return matriz[0][i];
        }
        if (matriz[0][0] == matriz[1][1] && matriz[1][1] == matriz[2][2] && matriz[0][0] != 0) return matriz[0][0];
        if (matriz[0][2] == matriz[1][1] && matriz[1][1] == matriz[2][0] && matriz[0][2] != 0) return matriz[0][2];
        return 1;
    }
    
}
       



















































































