/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package aplicacion;

import dominio.Tablero;
import java.awt.Color;
import servicios.Servicios;

/**
 *
 * @author edw_v
 */
public class CasosDeUso {

    private int idCasosDeUso;
    private Servicios servicios;
    private final int idServicio = 2001;

    public CasosDeUso(int idCasosDeUso) {
        this.idCasosDeUso = idCasosDeUso;
        servicios = new Servicios(idServicio);
    }
    
    
    public void crearPartida(int cantidadDeCasillas, int cantidadDeJugadores, int cantidadDePuntosPorJugador, int montoPorApuesta, String nombreDelJugador, Color colorDeFichaDelJugador){
        
        
    }
    
    public void unirseAPartida(){
        
    }
    
    public void iniciarPartida(){
        
    }
    
    public void salirDePartida(){
        
    }
    
    public void ejercerTurno(int valorObtenidoAlLanzarCañas){
        
    }
    
    public Tablero enviarTableroAPresentacion(){
        return servicios.enviarTableroAAplicacion();
    }
}
