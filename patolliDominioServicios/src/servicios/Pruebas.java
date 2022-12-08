/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package servicios;

import java.awt.Color;

/**
 *
 * @author edw_v
 */
public class Pruebas {

    public static void main(String[] args) {
        Servicios servicios = new Servicios();
        servicios.crearPartida(7, 4, 5000, 500, "Edwing", Color.lightGray);
        System.out.println(servicios.getPartida().getIdPartida());
    }
}
