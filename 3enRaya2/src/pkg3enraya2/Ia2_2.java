package pkg3enraya2;

/**
 *
 * @author dam1a26
 */
public class Ia2_2 extends Ia1 {

    public Ia2_2(String tipoFicha, String nombre) {
        super(tipoFicha, nombre);
    }

    public Ia2_2() {
    }

    @Override
    public Posicion movimiento() {
        int x = 0, y;
        while (x < 3) {
            y = 0;
            while (y < 3) {
                if (super.getTablero().consultar(new Posicion(x, y)).equals("X")) {
                    y = 5;
                }
                y++;
            }
            if (y != 6) {
                if (super.getTablero().consultar(new Posicion(x, 0)).equals("O") && super.getTablero().consultar(new Posicion(x, 1)).equals("O")) {
                    System.out.println(".a1");
                    return new Posicion(x, 2);
                }
                if (super.getTablero().consultar(new Posicion(x, 1)).equals("O") && super.getTablero().consultar(new Posicion(x, 2)).equals("O")) {
                    System.out.println(".a2");
                    return new Posicion(x, 0);
                }
                if (super.getTablero().consultar(new Posicion(x, 2)).equals("O") && super.getTablero().consultar(new Posicion(x, 0)).equals("O")) {
                    System.out.println(".a3");
                    return new Posicion(x, 1);
                }
            }
            x++;
        }

        //Evaluar horizontal
        for (y = 0; y < 3; y++) {
            for (x = 0; x < 3; x++) {
                if (super.getTablero().consultar(new Posicion(x, y)).equals("X")) {
                    x = 5;
                }
            }
            if (x != 6) {
                if (super.getTablero().consultar(new Posicion(0, y)).equals("O") && super.getTablero().consultar(new Posicion(1, y)).equals("O")) {
                    return new Posicion(2, y);
                }
                if (super.getTablero().consultar(new Posicion(1, y)).equals("O") && super.getTablero().consultar(new Posicion(2, y)).equals("O")) {
                    return new Posicion(0, y);
                }
                if (super.getTablero().consultar(new Posicion(2, y)).equals("O") && super.getTablero().consultar(new Posicion(0, y)).equals("O")) {
                    return new Posicion(1, y);
                }
            }
        }

        //Evaluar diagonal 1
        for (x = 0; x < 3; x++) {
            if (super.getTablero().consultar(new Posicion(x, x)).equals("X")) {
                x = 5;
            }
        }
        if (x != 6) {
            if (super.getTablero().consultar(new Posicion(0, 0)).equals("O") && super.getTablero().consultar(new Posicion(1, 1)).equals("O")) {
                return new Posicion(2, 2);
            }
            if (super.getTablero().consultar(new Posicion(0, 0)).equals("O") && super.getTablero().consultar(new Posicion(2, 2)).equals("O")) {
                return new Posicion(1, 1);
            }
            if (super.getTablero().consultar(new Posicion(2, 2)).equals("O") && super.getTablero().consultar(new Posicion(1, 1)).equals("O")) {
                return new Posicion(0, 0);
            }
        }

        //Evaluar diagonal 2
        for (x = 0, y = 2; x < 3; x++, y--) {
            if (super.getTablero().consultar(new Posicion(x, y)).equals("X")) {
                x = 5;
            }
        }
        if (x != 6) {
            if (super.getTablero().consultar(new Posicion(0, 2)).equals("O") && super.getTablero().consultar(new Posicion(1, 1)).equals("O")) {
            }
            if (super.getTablero().consultar(new Posicion(0, 2)).equals("O") && super.getTablero().consultar(new Posicion(2, 0)).equals("O")) {
                return new Posicion(1, 1);
            }
            if (super.getTablero().consultar(new Posicion(2, 0)).equals("O") && super.getTablero().consultar(new Posicion(1, 1)).equals("O")) {
                System.out.println(super.getTablero().consultar(new Posicion(0, 2)));
                return new Posicion(0, 2);
            }
        }
        return super.movimiento();
    }
}
