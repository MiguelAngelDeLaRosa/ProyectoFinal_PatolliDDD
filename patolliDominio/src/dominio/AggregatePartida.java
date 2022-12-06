/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package dominio;

import interfaces_dominio.IAggregateRoot;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 *
 * @author edw_v
 */
public class AggregatePartida implements IAggregateRoot {

    private int idPartida;
    private List<Jugador> listaDeJugadores;
    private Tablero tablero;
    private boolean laPartidaHaIniciado;

    /**
     * Constructor por omisión.
     */
    public AggregatePartida() {
    }

    /**
     * Constructor que inicializa algunos atributos de la clase al valor de los
     * parámetros recibidos. Este constructor no recibe una lista de jugadores y
     * será usado cuando se requiera asignar desde 0 a un jugador a la lista,
     * por lo que solo inicializará la lista de jugadores a un ArrayList.
     *
     * @param idPartida entero con el valor a asignar al atributo idPartida de
     * la clase.
     * @param tablero instancia de tipo Tablero a asignar al atributo tablero de
     * la clase.
     * @param laPartidaHaIniciado booleano a asignar al atributo
     * laPartidaHaIniciado de la clase.
     */
    public AggregatePartida(int idPartida, Tablero tablero, boolean laPartidaHaIniciado) {
        this.idPartida = idPartida;
        this.tablero = tablero;
        this.laPartidaHaIniciado = laPartidaHaIniciado;
        listaDeJugadores = new ArrayList<>();
    }

    /**
     * Constructor que inicializa algunos atributos de la clase al valor de los
     * parámetros recibidos.
     *
     * @param idPartida entero con el valor a asignar al atributo idPartida de
     * la clase.
     * @param listaDeJugadores ArrayList a asignar al atributo listaDeJugadores
     * de la clase.
     * @param tablero instancia de tipo Tablero a asignar al atributo tablero de
     * la clase.
     * @param laPartidaHaIniciado booleano a asignar al atributo
     * laPartidaHaIniciado de la clase.
     */
    public AggregatePartida(int idPartida, List<Jugador> listaDeJugadores, Tablero tablero, boolean laPartidaHaIniciado) {
        this.idPartida = idPartida;
        this.listaDeJugadores = listaDeJugadores;
        this.tablero = tablero;
        this.laPartidaHaIniciado = laPartidaHaIniciado;
    }

    /**
     * Agrega un jugador a la lista de jugadores
     *
     * @param jugador instancia de tipo jugador a agregar a la lista de
     * jugadores.
     */
    public void agregarJugador(Jugador jugador) {
        this.listaDeJugadores.add(jugador);
    }

    /**
     * Retorna el iD de la partida.
     *
     * @return entero con el iD de la partida.
     */
    public int getIdPartida() {
        return idPartida;
    }

    /**
     * Establece el atributo idPartida al valor del parámetro recibido.
     *
     * @param idPartida entero con el valor a asignar al atributo idPartida de
     * la clase.
     */
    public void setIdPartida(int idPartida) {
        this.idPartida = idPartida;
    }

    /**
     * Retorna la lista de jugadores de la partida.
     *
     * @return ArrayList con los jugadores de la partida.
     */
    public List<Jugador> getListaDeJugadores() {
        return listaDeJugadores;
    }

    /**
     * Establece el atributo listaDeJugadores al valor del parámetro recibido.
     *
     * @param listaDeJugadores ArrayList a asignar al atributo listaDeJugadores
     * de la clase.
     */
    public void setListaDeJugadores(List<Jugador> listaDeJugadores) {
        this.listaDeJugadores = listaDeJugadores;
    }

    /**
     * Retorna el tablero de la partida.
     *
     * @return instancia de tipo Tablero con el tablero de la partida.
     */
    public Tablero getTablero() {
        return tablero;
    }

    /**
     * Establece el atributo tablero al valor del parámetro recibido.
     *
     * @param tablero instancia de tipo Tablero a asignar al atributo tablero de
     * la clase.
     */
    public void setTablero(Tablero tablero) {
        this.tablero = tablero;
    }

    /**
     * Retorna un valor booleano que indica si la partida ha iniciado.
     *
     * @return booleano indicando si la partida ha iniciado.
     */
    public boolean isLaPartidaHaIniciado() {
        return laPartidaHaIniciado;
    }

    /**
     * Establece el atributo laPartidaHaIniciado al valor del parámetro
     * recibido.
     *
     * @param laPartidaHaIniciado booleano a asignar al atributo
     * laPartidaHaIniciado de la clase.
     */
    public void setLaPartidaHaIniciado(boolean laPartidaHaIniciado) {
        this.laPartidaHaIniciado = laPartidaHaIniciado;
    }

    @Override
    public void crearTablero(int numCasillas) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean verificarNumeroDeJugadores() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void moverFichaDeJugador(int idJugador, int numeroDeCasillasPorAvanzar) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ingresarFichaDeJugador(int idJugador) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Jugador obtenerJugador(int idJugador) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Tablero obtenerTablero() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
