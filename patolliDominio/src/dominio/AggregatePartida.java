/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package dominio;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 *
 * @author edw_v
 */
public class AggregatePartida {

    private int idPartida;
    private List<Jugador> listaDeJugadores;
    private Queue<Integer> ordenDeTurnos;
    private Tablero tablero;
    private boolean laPartidaHaIniciado;

    public AggregatePartida() {
    }

    public AggregatePartida(int idPartida, List<Jugador> listaDeJugadores, Tablero tablero, boolean laPartidaHaIniciado) {
        this.idPartida = idPartida;
        this.listaDeJugadores = listaDeJugadores;
        this.ordenDeTurnos = new LinkedList<>();
        this.tablero = tablero;
        this.laPartidaHaIniciado = laPartidaHaIniciado;
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
    
    
}
