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
public class Tablero {

    private Posicion p;
    private String casillas[][] = new String[3][3]; //creay incia el tablero 3x3
    private String tipoFicha;

    public Tablero(String tipoFicha) {
        this.tipoFicha = tipoFicha;
    }

    public Tablero() {//constructor del tablero
        for (int fil = 0; fil < 3; fil++) {
            for (int col = 0; col < 3; col++) {
                this.casillas[fil][col] = "_";
            }
        }
    }

    public String[][] getCasillas() {
        return casillas;
    }

    public String getTipoFicha() {
        return tipoFicha;
    }

    public void setCasillas(String[][] casillas) {
        this.casillas = casillas;
    }

    public void setTipoFicha(String tipoFicha) {
        this.tipoFicha = tipoFicha;
    }

    public void ponerFicha(Posicion p, String f) { //posicion donde se pone la ficha.
        this.casillas[p.getFila()][p.getColumna()] = f;
    }

    public void mostrar() { //Imprime el tablero por consola.
        int fil, col;

        for (fil = 0; fil < 3; fil++) {
            for (col = 0; col < 3; col++) {
                System.out.print(this.casillas[fil][col] + " ");
            }
            System.out.println();
        }
    }

    public String consultar(Posicion p) {
        //Mira si en una posicion hay una ficha
        return this.casillas[p.getFila()][p.getColumna()];
    }

    public boolean completo() {
        //Comprueba si el tablero esta completo contando casillas vacias
        int contVacias, fil, col;
        contVacias = 0;

        for (fil = 0; fil < 3; fil++) {
            for (col = 0; col < 3; col++) {
                if (this.casillas[fil][col].equals("_")) {
                    contVacias++;
                }
            }
        }
        return (contVacias == 0);
    }

    public boolean validarMovimiento(Posicion p) {
        boolean ok;
//valida el movimiento si la posicion de la casilla esta vacia.
        if (p.getFila() < 0 || p.getFila() > 2 || p.getColumna() < 0 || p.getColumna() > 2) {
            System.out.println("Invalid per posició");
            return false;

        }

        ok = this.casillas[p.getFila()][p.getColumna()].equals("_");
        if (!ok) {
            System.out.println("F: " + p.getFila() + " C: " + p.getColumna());
            System.out.println(this.casillas[p.getFila()][p.getColumna()]);
            System.out.println("Invalid casella ocupada");
        }
        return ok;
    }
}
