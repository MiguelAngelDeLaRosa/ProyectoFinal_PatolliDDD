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

    /**
     * Constructor por omisión
     */
    public Jugador() {

    }

    /**
     * constructor que inicializa los atributos de la clase al valor de los
     * parámetros recibidos. Inicializa la lista de fichas a un ArrayList.
     *
     * @param idJugador entero que indica el id del jugador.
     * @param nombreDelJugador String que indica el nombre del jugador.
     * @param colorDeLasFichas Color que indica el color de las fichas del
     * jugador.
     * @param puntosParaApostar entero que indica la cantidad de puntos que
     * tiene el jugador para apostar.
     */
    public Jugador(int idJugador, String nombreDelJugador, Color colorDeLasFichas, int puntosParaApostar) {
        this.idDeJugador = idJugador;
        this.nombreDelJugador = nombreDelJugador;
        this.colorDeLasFichas = colorDeLasFichas;
        this.puntosParaApostar = puntosParaApostar;
        this.listaDeFichasDelJugador = new ArrayList<>();
    }

    /**
     * Retorna el id del jugador.
     *
     * @return entero que indica el id del jugador.
     */
    public int getIdDeJugador() {
        return idDeJugador;
    }

    /**
     * Establece el atributo idDeJugador al valor del parámetro recibido.
     *
     * @param idDeJugador entero que indica el id del jugador.
     */
    public void setIdDeJugador(int idDeJugador) {
        this.idDeJugador = idDeJugador;
    }

    /**
     * Retorna el nombre del jugador.
     *
     * @return String que indica el nombre del jugador.
     */
    public String getNombreDelJugador() {
        return nombreDelJugador;
    }

    /**
     * Establece el atributo nombreDelJugador al valor del parámetro recibido.
     *
     * @param nombreDelJugador String que indica el nombre del jugador.
     */
    public void setNombreDelJugador(String nombreDelJugador) {
        this.nombreDelJugador = nombreDelJugador;
    }

    /**
     * Retorna el color de las fichas del jugador.
     *
     * @return Color que indica el color de las fichas.
     */
    public Color getColorDeLasFichas() {
        return colorDeLasFichas;
    }

    /**
     * Establece el atributo colorDeLasFichas al valor del parámetro recibido.
     *
     * @param colorDeLasFichas Color que indica el color de las fichas del
     * jugador.
     */
    public void setColorDeLasFichas(Color colorDeLasFichas) {
        this.colorDeLasFichas = colorDeLasFichas;
    }

    /**
     * Retorna la cantidad de puntos para apostar que tiene el jugador.
     *
     * @return entero con la cantidad de puntos para apostar que tiene el
     * jugador.
     */
    public int getPuntosParaApostar() {
        return puntosParaApostar;
    }

    /**
     * Establece la cantidad de puntos que el jugador tiene para apostar.
     *
     * @param puntosParaApostar entero que indica el número de puntos que el
     * jugador tiene para apostar.
     */
    public void setPuntosParaApostar(int puntosParaApostar) {
        this.puntosParaApostar = puntosParaApostar;
    }

    /**
     * Retorna la casilla de entrada que tiene asignada el jugador.
     *
     * @return Casilla de entrada del jugador.
     */
    public Casilla getCasillaDeEntrada() {
        return casillaDeEntrada;
    }

    /**
     * Establece la casilla de entrada del jugador.
     *
     * @param casillaDeEntrada Casilla de entrada a asignarle al jugador.
     */
    public void setCasillaDeEntrada(Casilla casillaDeEntrada) {
        this.casillaDeEntrada = casillaDeEntrada;
    }

    /**
     * Retorna la casilla de salida que tiene asignada el jugador.
     *
     * @return Casilla de salida del jugador.
     */
    public Casilla getCasillaDeSalida() {
        return casillaDeSalida;
    }

    /**
     * Establece la casilla de salida del jugador.
     *
     * @param casillaDeSalida Casilla de salida a asignarle al jugador.
     */
    public void setCasillaDeSalida(Casilla casillaDeSalida) {
        this.casillaDeSalida = casillaDeSalida;
    }

    /**
     * Retorna la lista de fichas del jugador.
     *
     * @return ArrayList con la lista de fichas del jugador.
     */
    public List<Ficha> getListaDeFichasDelJugador() {
        return listaDeFichasDelJugador;
    }

    /**
     * Establece la lista de fichas del jugador.
     *
     * @param listaDeFichasDelJugador ArrayList con la lista de fichas del
     * jugador.
     */
    public void setListaDeFichasDelJugador(List<Ficha> listaDeFichasDelJugador) {
        this.listaDeFichasDelJugador = listaDeFichasDelJugador;
    }

    /**
     * Llena la lista de fichas del jugador cuando un jugador es creado.
     */
    public void llenarListaDeFichas() {
        int numeroDeFicha = 1;
        for (int i = 0; i < 5; i++) {
            Ficha ficha = new Ficha(numeroDeFicha, idDeJugador, true, false);
            listaDeFichasDelJugador.add(ficha);
            numeroDeFicha++;
        }
    }

}
