/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package dominio;

import interfaces_dominio.IAggregateRoot;

/**
 *
 * @author edw_v
 */
public class Pruebas {

    public static void main(String[] args) {
        Tablero tablero = new Tablero(7);
//        for(Aspa a: tablero.getListaDeAspas()){
//            System.out.println(a.getTipoDeAspa());
//            for(Casilla c: a.getListaDeCasillas()){
//                System.out.println("Número: " + c.getNumeroDeCasilla());
//                System.out.println("Tipo: " + c.getTipoDeCasilla());
//                System.out.println("Tiene ficha: " + c.isCasillaTieneFicha());
//            }
//            System.out.println("--------------------------------------------");
//        }
//        
        AggregatePartida partida = new AggregatePartida(1001, tablero, false, 5000);
        Casilla[][] arregloDePrueba = new Casilla[4][2];
        arregloDePrueba = partida.getArregloParaAsignarCasillasEntradaSalida();
        
        for (int i = 0; i < arregloDePrueba.length; i++) {
            for (int j = 0; j < arregloDePrueba.length - 2; j++) {
                System.out.print(arregloDePrueba[i][j].getNumeroDeCasilla() + ", ");
            }
            System.out.println("");
        }
        
    }
}
