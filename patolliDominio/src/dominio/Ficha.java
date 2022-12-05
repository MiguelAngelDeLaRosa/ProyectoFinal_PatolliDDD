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
public class Ficha {

    private int numeroDeFicha;
    private int idJugador;
    private Color colorDeFicha;
    private int puntoEnEjeX;
    private int puntoEnEjeY;
    private boolean fichaEstaEnJuego;
    private boolean fichaYaEntroATablero;

    
    public Ficha() {

    }

    public Ficha(int numeroDeFicha, int idJugador, Color colorDeFicha, boolean fichaEstaEnJuego, boolean fichaYaEntroATablero) {
        this.numeroDeFicha = numeroDeFicha;
        this.idJugador = idJugador;
        this.colorDeFicha = colorDeFicha;
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

    public Color getColorDeFicha() {
        return colorDeFicha;
    }

    public void setColorDeFicha(Color colorDeFicha) {
        this.colorDeFicha = colorDeFicha;
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

    public boolean isFichaEstaEnJuego() {
        return fichaEstaEnJuego;
    }

    public void setFichaEstaEnJuego(boolean fichaEstaEnJuego) {
        this.fichaEstaEnJuego = fichaEstaEnJuego;
    }
}
