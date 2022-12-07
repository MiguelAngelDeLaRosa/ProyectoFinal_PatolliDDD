/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composite;

import dominio.Tablero;

/**
 *
 * @author edw_v
 */
public class Pruebas {

    public static void main(String[] args) {
        Tablero tablero = new Tablero(7);
        TableroGraphic tableroGraphic = new TableroGraphic(tablero);

        CentroGraphic centro = (CentroGraphic)tableroGraphic.getListaDeGraficosDelTablero().get(0);
        AspaGraphic aspa = (AspaGraphic) tableroGraphic.getListaDeGraficosDelTablero().get(2);
        
        for (int i = 0; i < aspa.getListaDeCasillas().size(); i++) {
            CasillaGraphic c = (CasillaGraphic)aspa.getListaDeCasillas().get(i);
            System.out.println("Número de gráfico: " + c.getNumeroDeCasilla());
            System.out.println("Número de casilla: " + c.getCasilla().getNumeroDeCasilla());
        }
        
        
        
        
        
    }
}
