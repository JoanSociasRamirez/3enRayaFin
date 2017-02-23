/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3enraya2;

import java.util.Scanner;

/**
 *
 * @author dam1a26
 */
public class Sesion {// PLAY

    private Jugador j;
    private Jugador2 j2;
    private JugadorIA jIA;
    private Partida partida;
    private Marcador m;

    public Sesion() {
        m = new Marcador();
        j = new Jugador("X", nombreJugadorA());

        int salir = 0;
        do {
            int level = 0;
            System.out.println("Selecciona la dificultad de la IA: 0-VS HUMAN 1-1ªIA 2-IA1 3-IA2v1 4-IA2v2 5-IA3");
            Scanner scanLvl = new Scanner(System.in);
            level = scanLvl.nextInt();
            switch (level) {
                case 0:
                    jIA = new Jugador2("O", nombreJugadorB());
                    break;
                case 1:
                    jIA = new JugadorIA("O", "1ªIA");
                    break;
                case 2:
                    jIA = new Ia1("O", "IA1");
                    break;
                case 3:
                    jIA = new Ia2("O", "IA2");
                    break;
                case 4:
                    jIA = new Ia2_2("O", "IA2 2.0");
                    break;
                case 5:
                    jIA = new Ia3("O", "IA3");
                    break;
                default:
                    System.out.println("No está esta opción");
                    System.out.println("***");
                    break;
            }
            partida = new Partida(m, j, jIA);
            partida.iniciar();
            System.out.println("1-Salir; Distinto de 1-Continuar");
            Scanner scanSalir = new Scanner(System.in);
            salir = scanSalir.nextInt();
        } while (salir != 1);//cuando se introduce 1 sale del bucle while; 
        //numero distinto de 1 sigue en el bucle 

    }

    private String nombreJugadorA() { //pregunta el nombre del j
        Scanner scanJug = new Scanner(System.in);
        System.out.println("Escribe el Nombre del jugador A: ");
        return scanJug.nextLine(); //lee string scanJug nextLine
    }

    private String nombreJugadorB() {
        Scanner scanJug2 = new Scanner(System.in);
        System.out.println("Escribe el Nombre del jugador B: ");
        return scanJug2.nextLine(); //lee string scanJug nextLine
    }
}

/*private int sorteoT() {
        return 1;
    }*/

 /*private String DificultadIA() { // pregunta la dificultad de la IA 
        Scanner scanLvl = new Scanner(System.in);
        System.out.println("Selecciona la dificultad de la IA: 1-IA1 2-IA2 3-IA3");
        return scanLvl.nextLine(); //lee string scanLvl nextLine

    }*/
