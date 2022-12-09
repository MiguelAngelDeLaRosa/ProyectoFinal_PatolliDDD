/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import dominio.AggregatePartida;
import dominio.Casilla;
import dominio.Tablero;
import dto.DTOTablero;
import java.awt.Color;

/**
 *
 * @author edw_v
 */
public class Servicios {

    private int idServicio;
    private AggregatePartida partida;
    private final int idDePartida = 3001;
    private int cantidadDeJugadores;
    private int cantidadDePuntosPorJugador;

    /**
     * Constructor que inicializa el atributo idServicio al valor del parámetro
     * recibido.
     *
     * @param idServicio entero con el id del servicio.
     */
    public Servicios(int idServicio) {
        this.idServicio = idServicio;
    }

    /**
     * Inicializa algunos atributos de la clase al valor de sus parámetros y
     * crea una instancia de partida para asignarla al atributo de la clase.
     *
     * @param numeroDeCasillasPorAspa entero con el número de casillas por aspa.
     * @param cantidadDeJugadores entero que indica la cantidad de jugadores que
     * tendrá la partida.
     * @param cantidadDePuntosPorJugador entero que indica la cantidad de puntos
     * que tendrá cada jugador.
     * @param montoPorApuesta entero que indica el monto que se cobrará por
     * apuesta.
     * @param nombreDelJugador String que indica el nombre del jugador.
     * @param colorDeFichaDelJugador Color que indica el color de la ficha del
     * jugador.
     */
    public void crearPartida(int numeroDeCasillasPorAspa, int cantidadDeJugadores, int cantidadDePuntosPorJugador, int montoPorApuesta, String nombreDelJugador, Color colorDeFichaDelJugador) {
        partida = new AggregatePartida(idDePartida, numeroDeCasillasPorAspa, false, cantidadDePuntosPorJugador, montoPorApuesta, nombreDelJugador, colorDeFichaDelJugador);
        this.cantidadDeJugadores = cantidadDeJugadores;
        this.cantidadDePuntosPorJugador = cantidadDePuntosPorJugador;
    }

    /**
     * Llama al método para agregar a un jugador en el AggregatePartida.
     *
     * @param nombreDelJugador String que indica el nombre del jugador.
     * @param colorDeFichaDelJugador Color que indica el color de la ficha del
     * jugador.
     */
    public void unirseAPartida(String nombreDelJugador, Color colorDeFichaDelJugador) {
        partida.agregarJugador(nombreDelJugador, colorDeFichaDelJugador, cantidadDePuntosPorJugador);
    }

    /**
     * Llama al método sePuedeIniciarPartida() para corroborar que se pueda
     * iniciar la partida. En caso de poderse, establece el atributo
     * laPartidaHaIniciado del tablero de la partida y llama al método para
     * asignar las casillas de entrada y salida de la lista de jugadores
     * guardada en la partida.
     *
     * @return true en caso de iniciarse la partida, false en caso contrario.
     */
    public boolean iniciarPartida() {
        boolean sePuedeIniciarPartida = coincideCantidadDeJugadoresConJugadoresAgregados();

        if (sePuedeIniciarPartida) {
            partida.setLaPartidaHaIniciado(true);
            partida.asignarCasillasDeEntradaYSalidaAJugadores();
        }

        return sePuedeIniciarPartida;
    }

    /**
     *
     */
    public void salirDePartida() {

    }

    /**
     *
     * @param valorObtenidoAlLanzarCañas
     * @param casilla
     */
    public void ejercerTurno(int valorObtenidoAlLanzarCañas, Casilla casilla) {

    }

    /**
     *
     * @param casilla
     */
    private void asignarFichaACasilla(Casilla casilla) {

    }

    /**
     * Indica si la cantidad de jugadores que se encuentran en la lista coincide
     * con la cantidad de jugadores que debe haber en la partida para poder
     * iniciar la partida.
     *
     * @return true en caso de coincidir, false en caso contrario.
     */
    public boolean coincideCantidadDeJugadoresConJugadoresAgregados() {
        boolean respuesta = false;

        if (cantidadDeJugadores == partida.getListaDeJugadores().size()) {
            respuesta = true;
        }
        return respuesta;
    }

    /**
     * Retorna el tablero de la partida.
     *
     * @return tablero de la partida.
     */
    public DTOTablero enviarTableroAAplicacion() {
        return partida.getTablero();
    }

    /**
     * Retorna el AggregatePartida.
     *
     * @return AggregatePartida con los datos de la partida.
     */
    public AggregatePartida getPartida() {
        return partida;
    }

    /**
     * Establece el AggregatePartida.
     *
     * @param partida AggregatePartida a establecer en el atributo de la clase.
     */
    public void setPartida(AggregatePartida partida) {
        this.partida = partida;
    }

    /**
     * Retorna la cantida de jugadores que debe haber en la partida.
     *
     * @return entero con la cantidad de jugadores que debe haber en la partida.
     */
    public int getCantidadDeJugadores() {
        return cantidadDeJugadores;
    }

    /**
     * Establece la cantidad de jugadores que debe haber en la partida.
     *
     * @param cantidadDeJugadores entero que indica la cantidad de jugadores que
     * debe haber en la partida.
     */
    public void setCantidadDeJugadores(int cantidadDeJugadores) {
        this.cantidadDeJugadores = cantidadDeJugadores;
    }
}
