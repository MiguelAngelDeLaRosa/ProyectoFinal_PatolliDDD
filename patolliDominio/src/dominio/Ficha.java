/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

/**
 *
 * @author edw_v
 */
public class Ficha {

    private int numeroDeFicha;
    private int idJugador;
    private boolean fichaEstaEnJuego;
    private boolean fichaYaEntroATablero;

    /**
     * Constructor por omisión
     */
    public Ficha() {

    }

    /**
     * Constructor que inicializa los atributos de la clase al valor de los
     * parámetros recibidos.
     *
     * @param numeroDeFicha entero que indica el número de ficha a asignar al
     * atributo de la clase.
     * @param idJugador entero que indica el is del jugador a asignar al
     * atributo de la clae.
     * @param fichaEstaEnJuego boolenao que indica si la ficha sigue en juego.
     * @param fichaYaEntroATablero boolean que indica si la ficha ya entró al
     * tablero.
     */
    public Ficha(int numeroDeFicha, int idJugador, boolean fichaEstaEnJuego, boolean fichaYaEntroATablero) {
        this.numeroDeFicha = numeroDeFicha;
        this.idJugador = idJugador;
        this.fichaEstaEnJuego = fichaEstaEnJuego;
        this.fichaYaEntroATablero = fichaYaEntroATablero;
    }

    public int getNumeroDeFicha() {
        return numeroDeFicha;
    }

    public void setNumeroDeFicha(int numeroDeFicha) {
        this.numeroDeFicha = numeroDeFicha;
    }

    public int getIdJugador() {
        return idJugador;
    }

    public void setIdJugador(int idJugador) {
        this.idJugador = idJugador;
    }

    public boolean isFichaEstaEnJuego() {
        return fichaEstaEnJuego;
    }

    public void setFichaEstaEnJuego(boolean fichaEstaEnJuego) {
        this.fichaEstaEnJuego = fichaEstaEnJuego;
    }

    public boolean isFichaYaEntroATablero() {
        return fichaYaEntroATablero;
    }

    public void setFichaYaEntroATablero(boolean fichaYaEntroATablero) {
        this.fichaYaEntroATablero = fichaYaEntroATablero;
    }

}
