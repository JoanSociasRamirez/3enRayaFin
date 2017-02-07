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
public class Jugador {
    
private String nombre,tipoFicha;

    public Jugador(String tipoFicha, String nombre) {
        this.tipoFicha = tipoFicha;
        this.nombre = nombre;
    }

    public Jugador() {
    }

    public String getTipoFicha() {
        return tipoFicha;
    }

    public String getNombre() {
        return nombre;
    }

    public Posicion movimiento(){ //El jugador pone ficha en una casilla
        int fila, columna;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Fila -->");
        fila = sc.nextInt();
        System.out.println("Columna -->");
        columna = sc.nextInt();        
        return new Posicion(fila, columna);        
    }
    
}
