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

    /**
     * Método constructor que recibe una casilla como parámetro y la iguala al
     * valor de su atributo.
     *
     * @param casilla parámetro con un objeto de tipo casilla.
     */
    public CasillaGraphic(Casilla casilla) {
        this.casilla = casilla;
    }

    /**
     * Retorna el objeto de tipo casilla almacenado en el atributo de la clase.
     *
     * @return objeto de tipo casilla.
     */
    public Casilla getCasilla() {
        return casilla;
    }

    /**
     * Establece el atributo de la clase al valor del parámetro recibido.
     *
     * @param casilla parámetro con un objeto de tipo casilla.
     */
    public void setCasilla(Casilla casilla) {
        this.casilla = casilla;
    }

    /**
     * Método que llama a un método en específico para dibujar un tipo de
     * casilla definido por la variable tipoDeCasilla.
     *
     * @param g parámetro que permite el dibujo de la casilla.
     */
    @Override
    public void dibujar(Graphics g) {
        int tipoDeCasilla = casilla.getTipoCasilla();

        if (tipoDeCasilla == 1 || tipoDeCasilla == 2 || tipoDeCasilla == 3) {
            dibujarCasillaCuadrada(g);
        }
        if (tipoDeCasilla == 4) {
            dibujarCasillaCircular(g);
        }
        if (tipoDeCasilla == 5) {
            dibujarCasillaTriangular(g);
        }
    }

    /**
     * Método para dibujar una casilla cuadrada
     *
     * @param g instancia de tipo Graphics para poder dibujar una casilla.
     */
    public void dibujarCasillaCuadrada(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.white);
        g2.fillRect(casilla.getPuntoEnEjeX(), casilla.getPuntoEnEjeY(), 50, 50);
        g2.setStroke(new BasicStroke(2.0f));
        g2.setColor(Color.black);
        g2.drawRect(casilla.getPuntoEnEjeX(), casilla.getPuntoEnEjeY(), 50, 50);
    }

    /**
     * Método para dibujar una casilla circular
     *
     * @param g instancia de tipo Graphics para poder dibujar una casilla.
     */
    public void dibujarCasillaCircular(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(2.0f));
        g2.setColor(new Color(188, 156, 37));
        g2.fill(new Arc2D.Double(casilla.getPuntoEnEjeX(), casilla.getPuntoEnEjeY(), 100, 100, casilla.getAnguloInicial(), casilla.getAnguloFinal(), Arc2D.PIE));
        g2.setColor(Color.black);
        g2.draw(new Arc2D.Double(casilla.getPuntoEnEjeX(), casilla.getPuntoEnEjeY(), 100, 100, casilla.getAnguloInicial(), casilla.getAnguloFinal(), Arc2D.PIE));
    }

    /**
     * Método para dibujar una casilla triangular
     *
     * @param g instancia de tipo Graphics para poder dibujar una casilla.
     */
    public void dibujarCasillaTriangular(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.RED);
        g2.fillPolygon(casilla.getArregloDePuntosEnEjeX(), casilla.getArregloDePuntosEnEjeY(), 3);
    }

}
