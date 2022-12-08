/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import interfaces_dominio.IAggregateRoot;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author edw_v
 */
public class AggregatePartida implements IAggregateRoot {

    private int idPartida;
    private List<Jugador> listaDeJugadores;
    private Tablero tablero;
    private boolean laPartidaHaIniciado;
    private int montoPorApuesta;
    private int asignadorDeIdDeJugador;
    private Casilla[][] arregloParaAsignarCasillasEntradaSalida;

    public AggregatePartida(int idPartida) {
        this.idPartida = idPartida;
        arregloParaAsignarCasillasEntradaSalida = new Casilla[4][2];
        llenarArregloDeAsignacionDeCasillas();
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
    public AggregatePartida(int idPartida, Tablero tablero, boolean laPartidaHaIniciado, int montoPorApuesta) {
        this.montoPorApuesta = montoPorApuesta;
        this.idPartida = idPartida;
        this.tablero = tablero;
        this.laPartidaHaIniciado = laPartidaHaIniciado;
        listaDeJugadores = new ArrayList<>();
        arregloParaAsignarCasillasEntradaSalida = new Casilla[4][2];
        llenarArregloDeAsignacionDeCasillas();
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
    public AggregatePartida(int idPartida, List<Jugador> listaDeJugadores, Tablero tablero, boolean laPartidaHaIniciado, int montoPorApuesta) {
        this.montoPorApuesta = montoPorApuesta;
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
    public void agregarJugador(String nombreDelJugador, Color colorDeFicha, int puntosParaApostar) {
        Jugador jugador = new Jugador(asignadorDeIdDeJugador, nombreDelJugador, colorDeFicha, puntosParaApostar);
        asignadorDeIdDeJugador++;
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

    public Casilla[][] getArregloParaAsignarCasillasEntradaSalida() {
        return arregloParaAsignarCasillasEntradaSalida;
    }

    public void setArregloParaAsignarCasillasEntradaSalida(Casilla[][] arregloParaAsignarCasillasEntradaSalida) {
        this.arregloParaAsignarCasillasEntradaSalida = arregloParaAsignarCasillasEntradaSalida;
    }

    
    /**
     * Construye el arreglo con las casillas de entrada y salida para cada
     * jugador.
     */
    public void llenarArregloDeAsignacionDeCasillas() {
        Aspa aspaSuperior = tablero.getListaDeAspas().get(0);
        Aspa aspaIzquierda = tablero.getListaDeAspas().get(1);
        Aspa aspaInferior = tablero.getListaDeAspas().get(2);
        Aspa aspaDerecha = tablero.getListaDeAspas().get(3);

        int c = aspaSuperior.getCasillaInicial().getNumeroDeCasilla();
        arregloParaAsignarCasillasEntradaSalida[0][0] = aspaSuperior.getCasillaInicial();
        arregloParaAsignarCasillasEntradaSalida[0][1] = aspaDerecha.getCasillaInicial();

        arregloParaAsignarCasillasEntradaSalida[1][0] = aspaInferior.getCasillaInicial();
        arregloParaAsignarCasillasEntradaSalida[1][1] = aspaIzquierda.getCasillaInicial();

        arregloParaAsignarCasillasEntradaSalida[2][0] = aspaIzquierda.getCasillaInicial();
        arregloParaAsignarCasillasEntradaSalida[2][1] = aspaSuperior.getCasillaInicial();

        arregloParaAsignarCasillasEntradaSalida[3][0] = aspaDerecha.getCasillaInicial();
        arregloParaAsignarCasillasEntradaSalida[3][1] = aspaInferior.getCasillaInicial();
    }

    @Override
    public void crearTablero(int numeroDeCasillasPorAspa) {
        this.tablero = new Tablero(numeroDeCasillasPorAspa);
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
