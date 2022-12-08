/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import dominio.Aspa;
import dominio.Casilla;
import dominio.Centro;
import java.awt.Color;
import java.util.List;

/**
 *
 * @author edw_v
 */
public class Pruebas {

    public static void main(String[] args) {
        Servicios servicios = new Servicios(1001);
        servicios.crearPartida(7, 4, 5000, 500, "Edwing", Color.lightGray);
        System.out.println(servicios.getPartida().getIdPartida());
        Centro centro = servicios.getPartida().getTablero().getCentroDelTablero();
        List<Casilla> casillasCentrales = centro.getListaDeCasillasCentrales();
        System.out.println(servicios.getPartida().getListaDeJugadores().get(0).getIdDeJugador());
//        for (Casilla c : casillasCentrales) {
//            System.out.println("Número: " + c.getNumeroDeCasilla());
//            System.out.println("Tipo: " + c.getTipoDeCasilla());
//            System.out.println("--------------");
//        }
//        List<Aspa> lista = servicios.getPartida().getTablero().getListaDeAspas();
//        for (Aspa a : lista) {
//            for (Casilla casilla : a.getListaDeCasillas()) {
//                System.out.println("Número: " + casilla.getNumeroDeCasilla());
//                System.out.println("Tipo: " + casilla.getTipoDeCasilla());
//                System.out.println("--------------");
//            }
//        }
    }
}
