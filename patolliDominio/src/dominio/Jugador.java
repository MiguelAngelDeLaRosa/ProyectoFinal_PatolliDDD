/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package dominio;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author edw_v
 */
public class Jugador {

    private int idDeJugador;
    private String nombreDelJugador;
    private Color colorDeLasFichas;
    private int puntosParaApostar;
    private Casilla casillaDeEntrada;
    private Casilla casillaDeSalida;
    private List<Ficha> listaDeFichasDelJugador;

    
    public Jugador() {

    }

    public Jugador(int idJugador, String nombreDelJugador, Color colorDeLasFichas, int puntosParaApostar) {
        this.idDeJugador = idJugador;
        this.nombreDelJugador = nombreDelJugador;
        this.colorDeLasFichas = colorDeLasFichas;
        this.puntosParaApostar = puntosParaApostar;
        this.listaDeFichasDelJugador = new ArrayList<>();
    }

    public int getIdDeJugador() {
        return idDeJugador;
    }

    public void setIdDeJugador(int idDeJugador) {
        this.idDeJugador = idDeJugador;
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

    public Casilla getCasillaDeEntrada() {
        return casillaDeEntrada;
    }

    public void setCasillaDeEntrada(Casilla casillaDeEntrada) {
        this.casillaDeEntrada = casillaDeEntrada;
    }

    public Casilla getCasillaDeSalida() {
        return casillaDeSalida;
    }

    public void setCasillaDeSalida(Casilla casillaDeSalida) {
        this.casillaDeSalida = casillaDeSalida;
    }

    public List<Ficha> getListaDeFichasDelJugador() {
        return listaDeFichasDelJugador;
    }

    public void setListaDeFichasDelJugador(List<Ficha> listaDeFichasDelJugador) {
        this.listaDeFichasDelJugador = listaDeFichasDelJugador;
    }
    
    public void llenarListaDeFichas(){
        int numeroDeFicha = 1;
        for (int i = 0; i < 5; i++) {
            Ficha ficha = new Ficha(numeroDeFicha, idDeJugador, colorDeLasFichas, true, false);
            listaDeFichasDelJugador.add(ficha);
            numeroDeFicha ++;
        }
    }
    

}
