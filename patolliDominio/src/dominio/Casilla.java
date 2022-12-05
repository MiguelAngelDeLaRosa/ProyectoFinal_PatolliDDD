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

    private int numeroCasilla;

    //Coordenadas de los ejes en donde se va a dibujar la casilla.
    private int puntoEnEjeX;
    private int puntoEnEjeY;

    //Atributos utilizados para dibujar casillas triangulares solamente.
    private int[] arregloDePuntosEnEjeX;
    private int[] arregloDePuntosEnEjeY;

    //Atributos que guardan las coordenadas de dibujado de las fichas en la casilla.
    private int puntoEnEjeXDeFicha;
    private int puntoEnEjeYDeFicha;

    //Atributos utilizados para dibujar casillas circulares solamente.
    private double anguloInicial;
    private double anguloFinal;

    //Atributo utilizado para definir el tipo de casilla que se va a utilizar.
    private int tipoCasilla;

    public Casilla() {
    }

    /**
     * Constructor que inicializa los atributos de la clase al valor de sus
     * parámetros.
     *
     * @param puntoEnEjeX coordenada en el eje de las X en donde se va a iniciar
     * el dibujo de la casilla.
     * @param puntoEnEjeY coordenada en el eje de las Y en donde se va a iniciar
     * el dibujo de la casilla.
     * @param tipoCasilla identificador del tipo de casilla que se va a crear. 1
     * = casilla central. 2 = casilla cuadrada. 3 = casilla cuadrada con
     * castigo. 4 = casilla redonda. 5 = casilla triangular.
     */
    public Casilla(int numeroCasilla, int puntoEnEjeX, int puntoEnEjeY, int tipoCasilla, int puntoEnEjeXDeFicha, int puntoEnEjeYDeFicha) {
        this.numeroCasilla = numeroCasilla;
        this.puntoEnEjeX = puntoEnEjeX;
        this.puntoEnEjeY = puntoEnEjeY;
        this.arregloDePuntosEnEjeX = null;
        this.arregloDePuntosEnEjeY = null;
        this.tipoCasilla = tipoCasilla;
        this.puntoEnEjeXDeFicha = puntoEnEjeXDeFicha;
        this.puntoEnEjeYDeFicha = puntoEnEjeYDeFicha;
    }

    /**
     * Constructor que inicializa los atributos de la clase al valor de sus
     * parámetros.
     *
     * @param arregloDePuntosEnEjeX arreglo con las coordenadas en puntoEnEjeX
     * para dibujar el triángulo.
     * @param arregloDePuntosEnEjeY arreglo con las coordenadas en puntoEnEjeY
     * para dibujar el triángulo
     * @param tipoCasilla identificador del tipo de casilla que se va a crear. 1
     * = casilla central. 2 = casilla cuadrada. 3 = casilla cuadrada con
     * castigo. 4 = casilla redonda. 5 = casilla triangular.
     */
    public Casilla(int[] arregloDePuntosEnEjeX, int[] arregloDePuntosEnEjeY, int tipoCasilla) {
        this.arregloDePuntosEnEjeX = arregloDePuntosEnEjeX;
        this.arregloDePuntosEnEjeY = arregloDePuntosEnEjeY;
        this.tipoCasilla = tipoCasilla;
    }

    /**
     *
     * @param puntoEnEjeX coordenada en el eje de las X en donde se va a iniciar
     * el dibujo de la casilla.
     * @param puntoEnEjeY coordenada en el eje de las Y en donde se va a iniciar
     * el dibujo de la casilla.
     * @param anguloInicial valor en donde se va a iniciar a dibujar el ángulo.
     * @param anguloFinal valor del ángulo.
     * @param tipoCasilla identificador del tipo de casilla que se va a crear. 1
     * = casilla central. 2 = casilla cuadrada. 3 = casilla cuadrada con
     * castigo. 4 = casilla redonda. 5 = casilla triangular.
     */
    public Casilla(int numeroCasilla, int puntoEnEjeX, int puntoEnEjeY, double anguloInicial, double anguloFinal, int tipoCasilla, int puntoEnEjeXDeFicha, int puntoEnEjeYDeFicha) {
        this.numeroCasilla = numeroCasilla;
        this.puntoEnEjeX = puntoEnEjeX;
        this.puntoEnEjeY = puntoEnEjeY;
        this.anguloInicial = anguloInicial;
        this.anguloFinal = anguloFinal;
        this.tipoCasilla = tipoCasilla;
        this.puntoEnEjeXDeFicha = puntoEnEjeXDeFicha;
        this.puntoEnEjeYDeFicha = puntoEnEjeYDeFicha;
    }

    
    public int getNumeroCasilla() {
        return numeroCasilla;
    }

    public void setNumeroCasilla(int numeroCasilla) {
        this.numeroCasilla = numeroCasilla;
    }

    public int getPuntoEnEjeX() {
        return puntoEnEjeX;
    }

    public void setPuntoEnEjeX(int puntoEnEjeX) {
        this.puntoEnEjeX = puntoEnEjeX;
    }

    public int getPuntoEnEjeY() {
        return puntoEnEjeY;
    }

    public void setPuntoEnEjeY(int puntoEnEjeY) {
        this.puntoEnEjeY = puntoEnEjeY;
    }

    public int[] getArregloDePuntosEnEjeX() {
        return arregloDePuntosEnEjeX;
    }

    public void setArregloDePuntosEnEjeX(int[] arregloDePuntosEnEjeX) {
        this.arregloDePuntosEnEjeX = arregloDePuntosEnEjeX;
    }

    public int[] getArregloDePuntosEnEjeY() {
        return arregloDePuntosEnEjeY;
    }

    public void setArregloDePuntosEnEjeY(int[] arregloDePuntosEnEjeY) {
        this.arregloDePuntosEnEjeY = arregloDePuntosEnEjeY;
    }

    public int getPuntoEnEjeXDeFicha() {
        return puntoEnEjeXDeFicha;
    }

    public void setPuntoEnEjeXDeFicha(int puntoEnEjeXDeFicha) {
        this.puntoEnEjeXDeFicha = puntoEnEjeXDeFicha;
    }

    public int getPuntoEnEjeYDeFicha() {
        return puntoEnEjeYDeFicha;
    }

    public void setPuntoEnEjeYDeFicha(int puntoEnEjeYDeFicha) {
        this.puntoEnEjeYDeFicha = puntoEnEjeYDeFicha;
    }

    public double getAnguloInicial() {
        return anguloInicial;
    }

    public void setAnguloInicial(double anguloInicial) {
        this.anguloInicial = anguloInicial;
    }

    public double getAnguloFinal() {
        return anguloFinal;
    }

    public void setAnguloFinal(double anguloFinal) {
        this.anguloFinal = anguloFinal;
    }

    public int getTipoCasilla() {
        return tipoCasilla;
    }

    public void setTipoCasilla(int tipoCasilla) {
        this.tipoCasilla = tipoCasilla;
    }

}
