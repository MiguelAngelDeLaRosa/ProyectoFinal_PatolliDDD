/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composite;

import dominio.Casilla;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Arc2D;

/**
 *
 * @author edw_v
 */
public class CasillaGraphic implements Graphic {

    private Casilla casilla;
    private int numeroDeCasilla;

    //Coordenadas de los ejes en donde se va a dibujar la casilla.
    private int puntoEnEjeX;
    private int puntoEnEjeY;

    //Atributos utilizados para dibujar casillas triangulares.
    private int[] arregloDePuntosEnEjeX;
    private int[] arregloDePuntosEnEjeY;

    //Atributos que guardan las coordenadas de dibujado de las fichas en la casilla.
    private int puntoEnEjeXDeFicha;
    private int puntoEnEjeYDeFicha;

    //Atributos utilizados para dibujar casillas circulares.
    private double anguloInicial;
    private double anguloFinal;

    /**
     * Constructor utilizado para crear una casilla cuadrada.
     *
     * @param casilla contiene una casilla de dominio.
     * @param numeroDeCasilla número que identifica el número de la casilla en
     * el tablero.
     * @param puntoEnEjeX coordenada del eje X en donde se comenzará a dibujar
     * la casilla.
     * @param puntoEnEjeY coordenada del eje Y en donde se comenzará a dibujar
     * la casilla.
     * @param puntoEnEjeXDeFicha coordenada del eje X en donde se comenzará a
     * dibujar la ficha dentro de esta casilla.
     * @param puntoEnEjeYDeFicha coordenada del eje Y en donde se comenzará a
     * dibujar la ficha dentro de esta casilla.
     */
    public CasillaGraphic(Casilla casilla, int numeroDeCasilla, int puntoEnEjeX, int puntoEnEjeY, int puntoEnEjeXDeFicha, int puntoEnEjeYDeFicha) {
        this.casilla = casilla;
        this.numeroDeCasilla = numeroDeCasilla;
        this.puntoEnEjeX = puntoEnEjeX;
        this.puntoEnEjeY = puntoEnEjeY;
        this.arregloDePuntosEnEjeX = null;
        this.arregloDePuntosEnEjeY = null;
        this.puntoEnEjeXDeFicha = puntoEnEjeXDeFicha;
        this.puntoEnEjeYDeFicha = puntoEnEjeYDeFicha;
    }

    /**
     * Constructor utilizado para crear una casilla de tipo triangular.
     *
     * @param arregloDePuntosEnEjeX arreglo de puntos en el eje de las X para el
     * dibujado de las casillas triangulares.
     * @param arregloDePuntosEnEjeY arreglo de puntos en el eje de las Y para el
     * dibujado de las casillas triangulares.
     */
    public CasillaGraphic(Casilla casilla, int[] arregloDePuntosEnEjeX, int[] arregloDePuntosEnEjeY) {
        this.casilla = casilla;
        this.arregloDePuntosEnEjeX = arregloDePuntosEnEjeX;
        this.arregloDePuntosEnEjeY = arregloDePuntosEnEjeY;
    }

    /**
     * Constructor utilizado para crear una casilla de tipo circular.
     *
     * @param casilla contiene una casilla de dominio.
     * @param numeroDeCasilla número que identifica el número de la casilla en
     * el tablero.
     * @param puntoEnEjeX coordenada del eje X en donde se comenzará a dibujar
     * la casilla.
     * @param puntoEnEjeY coordenada del eje Y en donde se comenzará a dibujar
     * la casilla.
     * @param anguloInicial ángulo inicial para el dibujado de la casilla
     * circular.
     * @param anguloFinal ángulo en donde debe terminar el dibujado de la
     * casilla circular.
     * @param puntoEnEjeXDeFicha coordenada del eje X en donde se comenzará a
     * dibujar la ficha dentro de esta casilla.
     * @param puntoEnEjeYDeFicha coordenada del eje Y en donde se comenzará a
     * dibujar la ficha dentro de esta casilla.
     */
    public CasillaGraphic(Casilla casilla, int numeroDeCasilla, int puntoEnEjeX, int puntoEnEjeY, double anguloInicial, double anguloFinal, int puntoEnEjeXDeFicha, int puntoEnEjeYDeFicha) {
        this.casilla = casilla;
        this.numeroDeCasilla = numeroDeCasilla;
        this.puntoEnEjeX = puntoEnEjeX;
        this.puntoEnEjeY = puntoEnEjeY;
        this.anguloInicial = anguloInicial;
        this.anguloFinal = anguloFinal;
        this.puntoEnEjeXDeFicha = puntoEnEjeXDeFicha;
        this.puntoEnEjeYDeFicha = puntoEnEjeYDeFicha;
    }

    @Override
    public void dibujar(Graphics g) {
        if (casilla.getTipoDeCasilla() == 1 || casilla.getTipoDeCasilla() == 2 || casilla.getTipoDeCasilla() == 3) {
            casillaCuadrada(g);
        }
        if (casilla.getTipoDeCasilla() == 4) {
            casillaCircular(g);
        }
        if (casilla.getTipoDeCasilla() == 5) {
            casillaTriangular(g);
        }
    }

    /**
     * Método para dibujar una casilla cuadrada
     *
     * @param g instancia de tipo Graphics para poder dibujar en el JPanel.
     */
    public void casillaCuadrada(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.white);
        g2.fillRect(puntoEnEjeX, puntoEnEjeY, 50, 50);
        g2.setStroke(new BasicStroke(2.0f));
        g2.setColor(Color.black);
        g2.drawRect(puntoEnEjeX, puntoEnEjeY, 50, 50);
    }

    /**
     * Método para dibujar una casilla triangular
     *
     * @param g instancia de tipo Graphics para poder dibujar en el JPanel.
     */
    public void casillaTriangular(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.RED);
        g2.fillPolygon(arregloDePuntosEnEjeX, arregloDePuntosEnEjeY, 3);

    }

    /**
     * Método para dibujar una casilla circular
     *
     * @param g instancia de tipo Graphics para poder dibujar en el JPanel.
     */
    public void casillaCircular(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(2.0f));
        g2.setColor(new Color(188, 156, 37));
        g2.fill(new Arc2D.Double(puntoEnEjeX, puntoEnEjeY, 100, 100, anguloInicial, anguloFinal, Arc2D.PIE));
        g2.setColor(Color.black);
        g2.draw(new Arc2D.Double(puntoEnEjeX, puntoEnEjeY, 100, 100, anguloInicial, anguloFinal, Arc2D.PIE));
    }

    public Casilla getCasilla() {
        return casilla;
    }

    public void setCasilla(Casilla casilla) {
        this.casilla = casilla;
    }

    public int getNumeroDeCasilla() {
        return numeroDeCasilla;
    }

    public void setNumeroDeCasilla(int numeroDeCasilla) {
        this.numeroDeCasilla = numeroDeCasilla;
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
}
