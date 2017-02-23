/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3enraya2;

/**
 *
 * @author dam1a26
 */
public class Marcador {

    private int empate;
    private int victoriasA;
    private int victoriasB;

    public Marcador() {
        victoriasA = 0;
        victoriasB = 0;
        empate = 0;
    }

    public int getVictoriasA() {
        return victoriasA;
    }

    public int getVictoriasB() {
        return victoriasB;
    }

    public void imprimirMarcador(Jugador j) { //Imprime por consola el marcador actual.
        System.out.println("Victorias " + j.getNombre() + ": " + victoriasA);
        System.out.println("Victorias Jugador2: " + victoriasB);
        //System.out.println("Victorias "+jIA.getNombre()+": "+victoriasB);
        System.out.println("Empates: " + empate);
    }

    public void empatar() { //Empata si el tablero esta lleno y nadie gana.
        empate++;
    }

    public void ganarA() { //suma 1 el puntuaje del jugador cada vez que gana una partida.
        victoriasA++;
    }

    public void ganarB() { //suma 1 el puntuaje de la IA ".
        victoriasB++;
    }

}
