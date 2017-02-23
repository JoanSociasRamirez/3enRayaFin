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
public class Jugador2 extends JugadorIA{
    
private String nombre,tipoFicha;

    public Jugador2(String tipoFicha, String nombre) {
        this.tipoFicha = tipoFicha;
        this.nombre = nombre;
    }

    public Jugador2() {
    }

    @Override
    public String getTipoFicha() {
        return tipoFicha;
    }

    @Override
    public String getNombre() {
        return nombre;
    }
    @Override
    public Posicion movimiento(){ //El jugador2 pone ficha en una casilla
        int fila, columna;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Fila -->");
        fila = sc.nextInt();
        System.out.println("Columna -->");
        columna = sc.nextInt();        
        return new Posicion(fila, columna);        
    }
    
}
