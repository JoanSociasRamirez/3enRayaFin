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
public class Posicion {
    private int fil, col;

    public Posicion(int fil, int col) {
        this.fil = fil;
        this.col = col;
    }

    public Posicion() {
    }

    public int getFila() {
        return fil;
    }

    public int getColumna() {
        return col;
    }

    public void setFila(int fila) {
        this.fil = fila;
    }

    public void setColumna(int columna) {
        this.col = columna;
    }
       
}
