/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package servicios;

import dominio.AggregatePartida;
import dominio.Jugador;
import dominio.Tablero;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author edw_v
 */
public class Servicios {
    
    private AggregatePartida partida;
    private final int idDePartida = 1001;
    private List<Jugador> listaDeJugadores;
    
    public void crearPartida(int numeroDeCasillasPorAspa, int cantidadDeJugadores, int cantidadDePuntosPorJugador, int montoPorApuesta, String nombreDelJugador, Color colorDeFichaDelJugador){
        listaDeJugadores = new ArrayList<>();
        Tablero tablero = new Tablero(numeroDeCasillasPorAspa);
    }
    
    public void unirseAPartida(){
        
    }
    
    public void iniciarPartida(){
        
    }
    
    public void salirDePartida(){
        
    }
    
    public void ejercerTurno(int valorObtenidoAlLanzarCañas){
        
    }
    
    private void asignarFichaACasilla(){

    }
}
