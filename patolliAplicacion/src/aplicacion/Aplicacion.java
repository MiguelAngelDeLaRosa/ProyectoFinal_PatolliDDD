/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacion;

import dominio.Tablero;
import java.awt.Color;
import servicios.Servicios;

/**
 * Esta clase hace uso de los casos de uso detectados en el proyecto y que
 * comunica a la capa de presentación con la capa de servicios de dominio.
 *
 * @author edw_v
 */
public class Aplicacion {

    private int idCasosDeUso;
    private Servicios servicios;
    private final int idServicio = 2001;

    /**
     * Constructor que inicializa el atributo idCasosDeUso al valor del
     * parámetro recibido.
     *
     * @param idCasosDeUso entero que indica el id de la instancia.
     */
    public Aplicacion(int idCasosDeUso) {
        this.idCasosDeUso = idCasosDeUso;
        servicios = new Servicios(idServicio);
    }

    /**
     * Llama al método crearPartida, del proyecto de servicios, para crear la
     * partida con los valors recibidos en los parámetros.
     *
     * @param cantidadDeCasillas entero que indica la cantidad de casillas por
     * aspa.
     * @param cantidadDeJugadores entero que indica el número de jugadores que
     * debe haber en la partida.
     * @param cantidadDePuntosPorJugador entero que indica la cantidad de puntos
     * que tendrá cada jugador para apostar.
     * @param montoPorApuesta entero que indica la cantidad de puntos que tendrá
     * cada apuesta.
     * @param nombreDelJugador String que indica el nombre del jugador que crea
     * la partida.
     * @param colorDeFichaDelJugador Color que tendrá el jugador que se crea al
     * inicializar la partida.
     */
    public void crearPartida(int cantidadDeCasillas, int cantidadDeJugadores, int cantidadDePuntosPorJugador, int montoPorApuesta, String nombreDelJugador, Color colorDeFichaDelJugador) {
        servicios.crearPartida(cantidadDeCasillas, cantidadDeJugadores, cantidadDePuntosPorJugador, montoPorApuesta, nombreDelJugador, colorDeFichaDelJugador);
    }

    /**
     * Llama al método unirseAPartida() del proyecto de servicios, para unir a
     * un jugador a una partida ya creada.
     *
     * @param nombreDelJugador String que indica el nombre del jugador.
     * @param colorDeFichaDelJugador Color que indica el color que tendrán las
     * fichas del jugador.
     */
    public void unirseAPartida(String nombreDelJugador, Color colorDeFichaDelJugador) {
        servicios.unirseAPartida(nombreDelJugador, colorDeFichaDelJugador);
    }

    /**
     * Llama al método iniciarPartida() de la clase servicios y obtenemos un
     * valor booleano que indica si se puede o no iniciar la partida.
     */
    public boolean iniciarPartida() {
        boolean sePuedeIniciarPartida = servicios.iniciarPartida();

        return sePuedeIniciarPartida;
    }

    public void salirDePartida() {

    }

    public void ejercerTurno(int valorObtenidoAlLanzarCañas) {

    }

    /**
     * Llama al método enviarTableroAAplicacion() del proyecto de servicios, que
     * devuelve el tablero de la partida.
     *
     * @return tablero de la partida.
     */
    public Tablero enviarTableroAPresentacion() {
        return servicios.enviarTableroAAplicacion();
    }
}
