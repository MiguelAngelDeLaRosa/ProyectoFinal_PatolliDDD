/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package dominio;

import java.awt.Color;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author edw_v
 */
public class Jugador {

    private int idJugador;
    private String nombreDelJugador;
    private Color colorDeLasFichas;
    private int puntosParaApostar;
    private int numeroDeCasillaDeEntrada;
    private int numeroDeCasillaDeSalida;
    private Queue<Ficha> colaDeFichas;

    
    public Jugador() {

    }

    public Jugador(int idJugador, String nombreDelJugador, Color colorDeLasFichas, int puntosParaApostar) {
        this.idJugador = idJugador;
        this.nombreDelJugador = nombreDelJugador;
        this.colorDeLasFichas = colorDeLasFichas;
        this.puntosParaApostar = puntosParaApostar;
        this.colaDeFichas = new LinkedList<>();
        llenarColaDeFichas();
    }

    public int getIdJugador() {
        return idJugador;
    }

    public void setIdJugador(int idJugador) {
        this.idJugador = idJugador;
    }

    public String getNombreDelJugador() {
        return nombreDelJugador;
    }

    public void setNombreDelJugador(String nombreDelJugador) {
        this.nombreDelJugador = nombreDelJugador;
    }

    public Color getColorDeLasFichas() {
        return colorDeLasFichas;
    }

    public void setColorDeLasFichas(Color colorDeLasFichas) {
        this.colorDeLasFichas = colorDeLasFichas;
    }

    public int getPuntosParaApostar() {
        return puntosParaApostar;
    }

    public void setPuntosParaApostar(int puntosParaApostar) {
        this.puntosParaApostar = puntosParaApostar;
    }

    public int getNumeroDeCasillaDeEntrada() {
        return numeroDeCasillaDeEntrada;
    }

    public void setNumeroDeCasillaDeEntrada(int numeroDeCasillaDeEntrada) {
        this.numeroDeCasillaDeEntrada = numeroDeCasillaDeEntrada;
    }

    public int getNumeroDeCasillaDeSalida() {
        return numeroDeCasillaDeSalida;
    }

    public void setNumeroDeCasillaDeSalida(int numeroDeCasillaDeSalida) {
        this.numeroDeCasillaDeSalida = numeroDeCasillaDeSalida;
    }

    public Queue<Ficha> getColaDeFichas() {
        return colaDeFichas;
    }

    public void setColaDeFichas(Queue<Ficha> colaDeFichas) {
        this.colaDeFichas = colaDeFichas;
    }

    public void llenarColaDeFichas(){
        int contadorParaAsignarId = 1;
        
        for (int i = 0; i < 5; i++) {
            Ficha ficha = new Ficha(contadorParaAsignarId, this.idJugador, this.colorDeLasFichas, true, false);
            colaDeFichas.offer(ficha);
            contadorParaAsignarId ++;
        }
    }
    
    

}
