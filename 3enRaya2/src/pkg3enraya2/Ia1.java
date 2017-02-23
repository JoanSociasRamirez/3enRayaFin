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
public class Ia1 extends JugadorIA {

    public Ia1(String tipoFicha, String nombre) {
        super(tipoFicha, nombre);
    }

    public Ia1() {
    }
    @Override
    public Posicion movimiento(){
        return this.movimientoEstrategico();
    }
    
    public Posicion movimientoEstrategico() {
        if (super.getTablero().consultar(new Posicion(1, 1)).equals("_")) {
            return new Posicion(1, 1);
        }
        if (super.getTablero().consultar(new Posicion(0, 0)).equals("_")) {
            return new Posicion(0, 0);

        }
        if (super.getTablero().consultar(new Posicion(0, 2)).equals("_")) {
            return new Posicion(0, 2);

        }
        if (super.getTablero().consultar(new Posicion(2, 0)).equals("_")) {
            return new Posicion(2, 0);

        }
        if (super.getTablero().consultar(new Posicion(2, 2)).equals("_")) {
            return new Posicion(2, 2);

        }
        if (super.getTablero().consultar(new Posicion(0, 1)).equals("_")) {
            return new Posicion(0, 1);

        }
        if (super.getTablero().consultar(new Posicion(1, 0)).equals("_")) {
            return new Posicion(1, 0);

        }
        if (super.getTablero().consultar(new Posicion(1, 2)).equals("_")) {
            return new Posicion(1, 2);

        }
        if (super.getTablero().consultar(new Posicion(2, 1)).equals("_")) {
            return new Posicion(2, 1);

        }
        return null;
    }
}
