/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package dominio;

import interfaces_dominio.IAggregateRoot;
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
    private Queue<Integer> ordenDeTurnos;
    private Tablero tablero;
    private boolean laPartidaHaIniciado;

    public AggregatePartida() {
        this.laPartidaHaIniciado = true;
    }

    public int getIdPartida() {
        return idPartida;
    }

    public void setIdPartida(int idPartida) {
        this.idPartida = idPartida;
    }

    public List<Jugador> getListaDeJugadores() {
        return listaDeJugadores;
    }

    public void setListaDeJugadores(List<Jugador> listaDeJugadores) {
        this.listaDeJugadores = listaDeJugadores;
    }

    public Queue<Integer> getOrdenDeTurnos() {
        return ordenDeTurnos;
    }

    public void setOrdenDeTurnos(Queue<Integer> ordenDeTurnos) {
        this.ordenDeTurnos = ordenDeTurnos;
    }

    public Tablero getTablero() {
        return tablero;
    }

    public void setTablero(Tablero tablero) {
        this.tablero = tablero;
    }

    public boolean isLaPartidaHaIniciado() {
        return laPartidaHaIniciado;
    }

    public void setLaPartidaHaIniciado(boolean laPartidaHaIniciado) {
        this.laPartidaHaIniciado = laPartidaHaIniciado;
    }
    
    public void asignarOrdenDeTurnos(){
        
    }
    
    /**
     * Crea el tablero del juego
     * @param numCasillas 
     */
    @Override
    public void crearTablero(int numCasillas) {
        tablero = new Tablero(numCasillas);
    }

    /**
     * Regresa el verdadero o falso si el numero de jugadores ya es de 4
     * @return 
     */
    @Override
    public boolean verificarNumeroDeJugadores() {
        boolean juegoLleno = false; 
        int numJugadores = 0;
        for (int i = 0; i < listaDeJugadores.size(); i++) {
            numJugadores++;
        }
        if (numJugadores == 4){
            return juegoLleno;
        }
        return juegoLleno;
    }

    /**
     * Agrega un jugador a la partida
     * @param jugador 
     */
    @Override
    public void agregarJugador(Jugador jugador) {
        listaDeJugadores.add(jugador);
    }

    /**
     * mueve la ficha de un jugador 
     * @param idJugador
     * @param numeroDeCasillasPorAvanzar 
     */
    @Override
    public void moverFichaDeJugador(int idJugador, int numeroDeCasillasPorAvanzar) {
        Jugador jugadorEscogido = null;
        for (int i = 0; i < listaDeJugadores.size(); i++) {
            if (listaDeJugadores.get(i).getIdJugador() == idJugador){
                jugadorEscogido = listaDeJugadores.get(i);
                tablero.moverFichaJugador(jugadorEscogido, numeroDeCasillasPorAvanzar);
                break;
            }
        }
    }

    /**
     * Ingresa una ficha en el tablero
     * @param idJugador 
     */
    @Override
    public void ingresarFichaDeJugador(int idJugador) {
        Jugador jugadorEscogido = null;
        for (int i = 0; i < listaDeJugadores.size(); i++) {
            if (listaDeJugadores.get(i).getIdJugador() == idJugador){
                jugadorEscogido = listaDeJugadores.get(i);
                tablero.ingresarFichaDeJugador(jugadorEscogido);
                break;
            }
        }
    }

    /**
     * Regresa el jugador que coincida con el id del parametro
     * @param idJugador que desea obetener
     * @return juagdor deseado
     */
    @Override
    public Jugador obtenerJugador(int idJugador) {
        Jugador jugadorEscogido = null;
        for (int i = 0; i < listaDeJugadores.size(); i++) {
            if (listaDeJugadores.get(i).getIdJugador() == idJugador){
                jugadorEscogido = listaDeJugadores.get(i);
                return jugadorEscogido;
            }
        }
        return jugadorEscogido;
    }

    /**
     * Retorna el tablero
     * @return tablero
     */
    @Override
    public Tablero obtenerTablero() {
        return tablero;
    }
    
    
}
