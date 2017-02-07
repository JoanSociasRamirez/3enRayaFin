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
public class JugadorIA extends Jugador {

    private Tablero tablero;
    private Posicion p;

    public void setP(Posicion p) {
        this.p = p;
    }

    public Posicion getP() {
        return p;
    }

    public JugadorIA(String tipoFicha, String nombre) {
        super(tipoFicha, nombre);
    }

    public JugadorIA() {
    }

    public Tablero getTablero() {
        return tablero;
    }

    public void setTablero(Tablero tablero) {
        this.tablero = tablero;
    }

    @Override
    public Posicion movimiento() { //IA pone ficha
        p = new Posicion();

        for (int i = 0; i < 3; i++) {
            p.setFila(i);
            for (int j = 0; j < 3; j++) {
                p.setColumna(j);
                //System.out.println("Consultar F: " + p.getFila() + " C: " + p.getColumna());
                if ("_".equals(tablero.consultar(p))) {
                    //System.out.println("Moviment F: " + p.getFila() + " C: " + p.getColumna());
                    //System.out.println("Moviment Fitxa: " + this.tablero.consultar(p));
                    return p;
                }
            }
        }
        return null;
    }
    /* Movimiento random de la IA
        int fila, columna;
        fila=(int)(Math.random()*100)%3;
        columna=(int)(Math.random()*100)%3;
        System.out.println("Fila -->"+fila);
        System.out.println("Columna -->"+columna);
        return new Posicion(fila,columna);
        }*/

}
