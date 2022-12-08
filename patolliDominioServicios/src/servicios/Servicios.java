/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import dominio.AggregatePartida;
import dominio.Casilla;
import dominio.Tablero;
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

    public Servicios(int idServicio) {
        this.idServicio = idServicio;
    }

    public void crearPartida(int numeroDeCasillasPorAspa, int cantidadDeJugadores, int cantidadDePuntosPorJugador, int montoPorApuesta, String nombreDelJugador, Color colorDeFichaDelJugador) {
        partida = new AggregatePartida(idDePartida, numeroDeCasillasPorAspa, false, cantidadDePuntosPorJugador, nombreDelJugador, colorDeFichaDelJugador);
        this.cantidadDeJugadores = cantidadDeJugadores;
        this.cantidadDePuntosPorJugador = cantidadDePuntosPorJugador;
    }

    public void unirseAPartida(String nombreDelJugador, Color colorDeFichaDelJugador) {
        partida.agregarJugador(nombreDelJugador, colorDeFichaDelJugador, cantidadDePuntosPorJugador);
    }

    public boolean iniciarPartida() {
        boolean sePuedeIniciarPartida = coincideCantidadDeJugadoresConJugadoresAgregados();

        if (sePuedeIniciarPartida) {
            partida.setLaPartidaHaIniciado(true);
            partida.asignarCasillasDeEntradaYSalidaAJugadores();
        }
        
        return sePuedeIniciarPartida;
    }

    public void salirDePartida() {

    }

    public void ejercerTurno(int valorObtenidoAlLanzarCañas, Casilla casilla) {

    }

    private void asignarFichaACasilla(Casilla casilla) {

    }

    public AggregatePartida getPartida() {
        return partida;
    }

    public void setPartida(AggregatePartida partida) {
        this.partida = partida;
    }

    public int getCantidadDeJugadores() {
        return cantidadDeJugadores;
    }

    public void setCantidadDeJugadores(int cantidadDeJugadores) {
        this.cantidadDeJugadores = cantidadDeJugadores;
    }

    public boolean coincideCantidadDeJugadoresConJugadoresAgregados() {
        boolean respuesta = false;

        if (cantidadDeJugadores == partida.getListaDeJugadores().size()) {
            respuesta = true;
        }
        return respuesta;
    }

    public Tablero enviarTableroAAplicacion() {
        return partida.getTablero();
    }
    
    
}
