/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_5_examen_2da;

import java.util.Scanner;

/**
 *
 * @author aramv
 */
public class EVA3_5_EXAMEN_2DA {
    //CONSTANTES: variable que se le asigna UNA vez el valor
public static final int PIEDRA = 1;
public static final int PAPEL = 2;
public static final int TIJERA = 3;
public static final int EMPATE = 0;
public static final int GANA = 1;
public static final int PIERDE = 2;

    public static void main(String[] args) {
//pedir datos al usuario
int resu;
int jugada;
int resuJug;
do{
 resu = pedirJugada("Introduce tu jugada (1-Piedra, 2-Papel, 3-Tijera, 0-Salir)");
jugada = generarJugadaComp();
    System.out.println(jugada);
    resuJug = evaluarPartida (resu, jugada);
    System.out.println(resuJug);
}while(resu != 0);

    }
    public static int pedirJugada(String mensaje){
        Scanner captu = new Scanner(System.in);
        System.out.println(mensaje);
        int seleccion = captu.nextInt();
        return seleccion;
    }
    //generar la jugada de la computadora
    public static int generarJugadaComp(){
    int jugada;
    double valor = Math.random();
    //¿Como generamos la jugada?
    if((valor >= 0) && (valor < 0.3))
        jugada = PIEDRA; 
    else if((valor >= 0.3) && (valor < 0.6))
jugada = PAPEL; 
    else
        jugada = TIJERA; 
    return jugada;
    
    }
    //evaluar la jugada
    public static int evaluarPartida(int jugadaUsu, int jugadaComp){
       int resu; //0-empate, 1-gana, 2-pierde
        if  ((jugadaUsu == PIEDRA) && (jugadaComp == PIEDRA))
            resu = EMPATE;
        else if ((jugadaUsu == PIEDRA) && (jugadaComp == PAPEL))
                resu = PIERDE;
        else if ((jugadaUsu == PIEDRA) && (jugadaComp == TIJERA))
                resu = GANA;
        else if ((jugadaUsu == PAPEL) && (jugadaComp == PIEDRA))
                resu = GANA;
         else if((jugadaUsu == PAPEL) && (jugadaComp == PAPEL))
                resu = EMPATE;
         else if ((jugadaUsu == PAPEL) && (jugadaComp == TIJERA))
                resu = PIERDE;
                else if ((jugadaUsu == TIJERA) && (jugadaComp == PIEDRA))
                resu = PIERDE;
         else if ((jugadaUsu == TIJERA) && (jugadaComp == PAPEL))
        resu = GANA;
         else if ((jugadaUsu == TIJERA) && (jugadaComp == TIJERA))
                resu = EMPATE;
                else 
                resu = 0;
                return 
                        }
}
