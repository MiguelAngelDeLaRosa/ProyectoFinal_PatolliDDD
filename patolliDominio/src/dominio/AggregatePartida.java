/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import dto.DTOAspa;
import dto.DTOCasilla;
import dto.DTOCentro;
import dto.DTOTablero;
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
    private int asignadorDeIdDeJugador = 1;
    private Casilla[][] arregloParaAsignarCasillasEntradaSalida;

    /**
     * Constructor que inicializa algunos atributos de la clase al valor de los
     * parámetros recibidos. Este constructor no recibe una lista de jugadores y
     * será usado cuando se requiera asignar desde 0 a un jugador a la lista,
     * por lo que solo inicializará la lista de jugadores a un ArrayList. Crea
     * un jugador con los parámetros recibidos y llama al método de asignación
     * de casillas.
     *
     * @param idPartida parámetro con el id de la partida para asignarlo al
     * atributo de la clase.
     * @param numeroDeCasillasPorAspa
     * @param laPartidaHaIniciado parámetro que indica si la partida ha iniciado
     * y se lo asigna al atributo de la clase.
     * @param cantidadDePuntosPorJugador
     * @param nombreDelJugador
     * @param colorDeFichaDelJugador
     */
    public AggregatePartida(int idPartida, int numeroDeCasillasPorAspa, boolean laPartidaHaIniciado, int cantidadDePuntosPorJugador, int montoPorApuesta, String nombreDelJugador, Color colorDeFichaDelJugador) {
        this.idPartida = idPartida;
        tablero = new Tablero(numeroDeCasillasPorAspa);
        this.laPartidaHaIniciado = laPartidaHaIniciado;
        this.montoPorApuesta = montoPorApuesta;
        listaDeJugadores = new ArrayList<>();
        agregarJugador(nombreDelJugador, colorDeFichaDelJugador, cantidadDePuntosPorJugador);
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
     * @param montoPorApuesta entero con el valor a asignar al atributo
     * montoPorApuesta de la clase.
     */
    public AggregatePartida(int idPartida, List<Jugador> listaDeJugadores, Tablero tablero, boolean laPartidaHaIniciado, int montoPorApuesta) {
        this.montoPorApuesta = montoPorApuesta;
        this.idPartida = idPartida;
        this.listaDeJugadores = listaDeJugadores;
        this.tablero = tablero;
        this.laPartidaHaIniciado = laPartidaHaIniciado;
    }

    /**
     * Agrega un jugador a la lista de jugadores.
     *
     * @param nombreDelJugador String con el nombre del jugador.
     * @param colorDeFicha color de ficha del jugador.
     * @param puntosParaApostar puntos para apostar que tendrá el jugador.
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
     * Retorna el tableroDTO de la partida.
     *
     * @return instancia de tipo Tablero con el tablero de la partida.
     */
    public DTOTablero getTablero() {
        DTOCentro dtoCentro = crearDTOCentro();
        List<DTOAspa> listaDeAspasDTO = crearListaAspasDTO();
        DTOTablero dtoTablero = new DTOTablero(dtoCentro, listaDeAspasDTO);
        return dtoTablero;
//        DTOAspa aspa0 = new DTOAspa(tablero.getListaDTOAspas().get(0).getTipoDeAspa(),
//            tablero.getNumeroDeCasillasPorAspa(), tablero.getListaDTOAspas().get(0).getListaDeCasillas());
//        DTOAspa aspa1 = new DTOAspa(tablero.getListaDTOAspas().get(1).getTipoDeAspa(),
//            tablero.getNumeroDeCasillasPorAspa(), tablero.getListaDTOAspas().get(1).getListaDeCasillas());
//        DTOAspa aspa2 = new DTOAspa(tablero.getListaDTOAspas().get(2).getTipoDeAspa(),
//            tablero.getNumeroDeCasillasPorAspa(), tablero.getListaDTOAspas().get(2).getListaDeCasillas());
//        DTOAspa aspa3 = new DTOAspa(tablero.getListaDTOAspas().get(3).getTipoDeAspa(),
//            tablero.getNumeroDeCasillasPorAspa(), tablero.getListaDTOAspas().get(3).getListaDeCasillas());
//        List<DTOAspa> listaDTOAspas = new ArrayList<>();
//        listaDTOAspas.add(aspa0);
//        listaDTOAspas.add(aspa1);
//        listaDTOAspas.add(aspa2);
//        listaDTOAspas.add(aspa3);
//        DTOCentro centro = new DTOCentro(tablero.getCentroDTO().getListaDeCasillasCentrales(), tablero.getNumeroDeCasillasPorAspa());
//        DTOTablero tableroDTO = new DTOTablero(centro, listaDTOAspas);
//        return tableroDTO;
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

    public int getMontoPorApuesta() {
        return montoPorApuesta;
    }

    public void setMontoPorApuesta(int montoPorApuesta) {
        this.montoPorApuesta = montoPorApuesta;
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
    public boolean verificarNumeroDeJugadores(int numeroDeJugadores) {
        return true;
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

    /**
     * Crea un DTOTablero con la información del tablero y lo retorna.
     *
     * @return instancia de DTOTablero.
     */
    @Override
    public DTOTablero obtenerTablero() {
        DTOCentro dtoCentro = crearDTOCentro();
        List<DTOAspa> listaDeAspasDTO = crearListaAspasDTO();
        DTOTablero dtoTablero = new DTOTablero(dtoCentro, listaDeAspasDTO);
        return dtoTablero;
    }

    /**
     * Asigna las casillas de entrada y salida de cada jugador.
     */
    public void asignarCasillasDeEntradaYSalidaAJugadores() {
        for (int i = 0; i < listaDeJugadores.size(); i++) {
            listaDeJugadores.get(i).setCasillaDeEntrada(arregloParaAsignarCasillasEntradaSalida[i][0]);
            listaDeJugadores.get(i).setCasillaDeSalida(arregloParaAsignarCasillasEntradaSalida[i][1]);
        }
    }

    /**
     * Crea una instancia de DTOCentro con los valores del centro del tablero y
     * la retorna.
     *
     * @return instancia de DTOCentro.
     */
    public DTOCentro crearDTOCentro() {
        List<DTOCasilla> listaDeDTOCasillas = new ArrayList<>();
        for (Casilla c : tablero.getCentroDelTablero().getListaDeCasillasCentrales()) {
            DTOCasilla dtoCasilla = new DTOCasilla(c.getTipoDeCasilla(), c.getNumeroDeCasilla(), c.isCasillaTieneFicha());
            listaDeDTOCasillas.add(dtoCasilla);
        }
        DTOCentro dtoCentro = new DTOCentro(listaDeDTOCasillas, tablero.getNumeroDeCasillasPorAspa());
//        DTOCentro dtoCentro = tablero.getCentroDTO();
//        dtoCentro.setListaDeCasillasCentrales(listaDeDTOCasillas);
        return dtoCentro;
    }

    /**
     * Crea una lista de DTOAspa con los valores obtenidos de las aspas del
     * tablero.
     *
     * @return ArrayList de DTOAspas.
     */
    public List<DTOAspa> crearListaAspasDTO() {
        List<DTOAspa> listaDeAspasDTO = new ArrayList<>();
        for (Aspa aspa : tablero.getListaDeAspas()) {
            List<DTOCasilla> listaDTOCasillas = new ArrayList<>();
            for (Casilla c : aspa.getListaDeCasillas()) {
                DTOCasilla dtoCasilla = new DTOCasilla(c.getTipoDeCasilla(), c.getNumeroDeCasilla(), c.isCasillaTieneFicha());
                listaDTOCasillas.add(dtoCasilla);
            }
            DTOAspa dtoAspa = new DTOAspa(aspa.getTipoDeAspa(), aspa.getNumeroDeCasillasPorAspa(), listaDTOCasillas);
            listaDeAspasDTO.add(dtoAspa);
        }

        return listaDeAspasDTO;
    }

    /**
     * Verifica si la casilla que coincida con el id recibido tiene ficha.
     *
     * @param numeroDeCasilla id de la ficha.
     * @return booleano que indica si la casilla tiene o no una ficha.
     */
    public boolean verificarSiCasillaEstaOcupada(int numeroDeCasilla) {

        boolean respuesta = false;
        Casilla casilla = new Casilla(numeroDeCasilla);

        /*
        El ciclo se detendrá cuando se encuentre la casilla que coincida con el id de casilla recibido en el parámetro. 
        Si no lo encuentra, pasará a recorrer la lista de casillas de cada aspa.
         */
        for (Casilla c : tablero.getCentroDelTablero().getListaDeCasillasCentrales()) {
            if (casilla.getNumeroDeCasilla() == c.getNumeroDeCasilla()) {
                respuesta = c.isCasillaTieneFicha();
                return respuesta;
            }
        }

        //El ciclo se detendrá cuando se encuentre la casilla que coincida con el id de casilla recibido en el parámetro.
        for (Aspa a : tablero.getListaDeAspas()) {
            for (Casilla c : a.getListaDeCasillas()) {
                if (casilla.getNumeroDeCasilla() == c.getNumeroDeCasilla()) {
                    respuesta = c.isCasillaTieneFicha();
                    return respuesta;
                }
            }
        }

        return respuesta;
    }
}
