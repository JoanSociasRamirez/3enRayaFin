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
    private JugadorIA jIA;    
    private Partida partida;
    private Marcador m;


    public Sesion() {
        m = new Marcador();
        j = new Jugador("X", nombreJugadorA());
        jIA = new JugadorIA("O", "IA");
        
        int salir = 0;
        do {
            partida = new Partida(m, j, jIA);
            partida.iniciar();
            System.out.println("1-Salir; Distinto de 1-Continuar");
            Scanner scanSalir = new Scanner(System.in);
            salir= scanSalir.nextInt();
        } 
        while (salir != 1);//cuando se introduce 1 sale del bucle while; 
                           //numero distinto de 1 sigue en el bucle 

    }

    private String nombreJugadorA() { //pregunta el nombre del j
        Scanner scanJug = new Scanner(System.in);
        System.out.println("Escribe el Nombre del jugador A: ");
        return scanJug.nextLine(); //lee string scan1 nextLine
    }

}
