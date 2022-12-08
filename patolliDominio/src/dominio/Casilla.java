/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import java.awt.Color;

/**
 *
 * @author edw_v
 */
public class Casilla {

    private int numeroDeCasilla;
    private int tipoDeCasilla;
    private boolean casillaTieneFicha;

    /**
     * Constructor que inicializa el atributo tipoDeCasilla al valor del
     * parámetro recibido.
     *
     * @param tipoDeCasilla entero que indica el tipo de casilla.
     */
    public Casilla(int tipoDeCasilla) {
        this.tipoDeCasilla = tipoDeCasilla;
    }

    /**
     * Constructor que inicializa los atributos de la clase al valor de los
     * parámetros recibidos.
     *
     * @param numeroDeCasilla número de casilla que se le ha asignado.
     * @param tipoDeCasilla entero que indica el tipo de casilla.
     * @param casillaTieneFicha booleano que indica si la casilla tiene ficha.
     */
    public Casilla(int numeroDeCasilla, int tipoDeCasilla, boolean casillaTieneFicha) {
        this.numeroDeCasilla = numeroDeCasilla;
        this.tipoDeCasilla = tipoDeCasilla;
        this.casillaTieneFicha = casillaTieneFicha;
    }

    /**
     * Retorna el número de casilla.
     * @return entero con el número de casilla.
     */
    public int getNumeroDeCasilla() {
        return numeroDeCasilla;
    }

    /**
     * Establece el atributo numeroDeCasilla al valor del parámetro recibido.
     * @param numeroDeCasilla entero que indica el número de casilla.
     */
    public void setNumeroDeCasilla(int numeroDeCasilla) {
        this.numeroDeCasilla = numeroDeCasilla;
    }

    /**
     * Retorna el tipo de casilla.
     *
     * @return entero que indica el tipo de casilla.
     */
    public int getTipoDeCasilla() {
        return tipoDeCasilla;
    }

    /**
     * Establece el atributo tipoDeCasilla al valor del parámetro recibido.
     *
     * @param tipoDeCasilla entero que indica el tipo de casilla.
     */
    public void setTipoDeCasilla(int tipoDeCasilla) {
        this.tipoDeCasilla = tipoDeCasilla;
    }

    /**
     * Retorna booleano indicando si la casilla tiene ficha.
     *
     * @return true si la casilla tiene ficha, false en caso contrario.
     */
    public boolean isCasillaTieneFicha() {
        return casillaTieneFicha;
    }

    /**
     * Establece el atributo casillaTieneFicha al valor del parámetro recibido.
     *
     * @param casillaTieneFicha booleano que indica si la casilla tiene o no una
     * ficha.
     */
    public void setCasillaTieneFicha(boolean casillaTieneFicha) {
        this.casillaTieneFicha = casillaTieneFicha;
    }

}
