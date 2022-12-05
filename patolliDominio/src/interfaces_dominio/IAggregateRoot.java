/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces_dominio;

import dominio.Jugador;
import dominio.Tablero;

/**
 *
 * @author Miguel
 */
public interface IAggregateRoot {
    
    public void crearTablero(int numCasillas);
    
    public boolean verificarNumeroDeJugadores();
    
    public void agregarJugador(Jugador jugador);
    
    public void moverFichaDeJugador(int idJugador, int numeroDeCasillasPorAvanzar);
    
    public void ingresarFichaDeJugador(int idJugador);
    
    public Jugador obtenerJugador(int idJugador);
    
    public Tablero obtenerTablero();
}