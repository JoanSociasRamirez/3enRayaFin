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
public class Partida {

    private Tablero t;
    private Marcador m;
    private int turnoActual;
    private Jugador[] jS;

    public Partida(Marcador m, Jugador jA, JugadorIA jIA) {
        this.t = new Tablero();
        this.jS = new Jugador[2];
        this.jS[0] = jA;
        this.jS[1] = jIA;

        this.turnoActual = 0;
        this.m = m;
        jIA.setTablero(t);
    }

    public int getTurnoActual() {
        return turnoActual;
    }

    public Tablero getTablero() {
        return t;
    }

    public Marcador getMarcador() {
        return m;
    }

    public void incrementarTurno() {
        this.turnoActual++;
    }

    public void iniciar() { //Metodo que inicia la partida.
        jugar();
    }

    private void jugar() { //??
        //Bucle HASTA partida finalizada. Cuando el tablero completo o hay gandor.
        Posicion p;

        boolean partidaFinalizada = false;

        while (!partidaFinalizada) {
            System.out.println("Turno actual: " + turnoActual);
            t.mostrar();
            p = this.jS[turnoActual % 2].movimiento();
            if (t.validarMovimiento(p)) {
                this.t.ponerFicha(p, this.jS[turnoActual % 2].getTipoFicha());
                if (comprobarGanador(this.jS[turnoActual % 2])) {
                    if (turnoActual % 2 == 0) {
                        m.ganarA();
                    } else {
                        m.ganarB();
                    }

                    partidaFinalizada = true;
                }
                incrementarTurno();
            } else {
                if (turnoActual % 2 == 0) {
                    m.ganarB();
                } else {
                    m.ganarA();
                }
                System.out.println("Movimiento invalido. Pierdes automaticamente");

                partidaFinalizada = true;
            }
            if (t.completo()) {
                partidaFinalizada = true;
                System.out.println("EMPATE");
                m.empatar();
            }
        }
        salir();
    }

    private void salir() { //para salir de la partida.
        t.mostrar();
        m.imprimirMarcador();
    }

    public boolean comprobarGanador(Jugador jugadorJ) {
        //Comprueba si hay ganador vertical horizontal y diagonalmente 8 posibilidades  

        if (validarMovimiento(new Posicion(0, 0), new Posicion(0, 1), new Posicion(0, 2), jugadorJ.getTipoFicha())) {
            return true;
        }
        if (validarMovimiento(new Posicion(1, 0), new Posicion(1, 1), new Posicion(1, 2), jugadorJ.getTipoFicha())) {
            return true;
        }
        if (validarMovimiento(new Posicion(2, 0), new Posicion(2, 1), new Posicion(2, 2), jugadorJ.getTipoFicha())) {
            return true;
        }
        if (validarMovimiento(new Posicion(0, 0), new Posicion(1, 0), new Posicion(2, 0), jugadorJ.getTipoFicha())) {
            return true;
        }
        if (validarMovimiento(new Posicion(0, 1), new Posicion(1, 1), new Posicion(2, 1), jugadorJ.getTipoFicha())) {
            return true;
        }
        if (validarMovimiento(new Posicion(0, 2), new Posicion(1, 2), new Posicion(2, 2), jugadorJ.getTipoFicha())) {
            return true;
        }
        if (validarMovimiento(new Posicion(0, 0), new Posicion(1, 1), new Posicion(2, 2), jugadorJ.getTipoFicha())) {
            return true;
        }
        if (validarMovimiento(new Posicion(0, 2), new Posicion(1, 1), new Posicion(2, 0), jugadorJ.getTipoFicha())) {
            return true;
        }
        return false;
    }

    private boolean validarMovimiento(Posicion p1, Posicion p2, Posicion p3, String tipoFicha) {
        return t.consultar(p1).equals(tipoFicha) && t.consultar(p2).equals(tipoFicha) && t.consultar(p3).equals(tipoFicha);
        /*  if(t.consultar(p1).equals(tipoFicha) && t.consultar(p2).equals(tipoFicha) && t.consultar(p3).equals(tipoFicha)){
            return true;
        }
        return false;   */
    }

}



/*
        Posicion p;
        int turnoActivo = 0;
        boolean partidaFinalizada=false;
        
        while (!partidaFinalizada){
            if(turnoActivo==0){
                p=this.j.movimiento();
                if(this.t.validarMovimiento(p)){
                    this.t.ponerFicha(p, this.j.getTipoFicha());
                    comprobarGanador();
                    turnoActivo++;
                }else{
                    partidaFinalizada=true;
                }
            }else{
                p=this.jIA.movimiento();
                if(this.t.validarMovimiento(p)){
                    this.t.ponerFicha(p, this.jIA.getTipoFicha());
                    comprobarGanador();
                    turnoActivo--;
                }
            }
*/
