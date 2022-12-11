/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package dto;

import dominio.Casilla;

/**
 *
 * @author edw_v
 */
public class DTOCasilla {

    private int tipoDeCasilla;
    private int numeroDeCasilla;
    private boolean isCasillaOcupada;

    public DTOCasilla(int tipoDeCasilla) {
        this.tipoDeCasilla = tipoDeCasilla;
    }
    
    public DTOCasilla (int numeroDeCasilla, int tipoDeCasilla, boolean isCasillaOcupada){
        this.tipoDeCasilla = tipoDeCasilla;
        this.numeroDeCasilla = numeroDeCasilla;
        this.isCasillaOcupada = isCasillaOcupada;
    }
    
    public int getTipoDeCasilla(){
        return tipoDeCasilla;
    }

    public int getNumeroDeCasilla() {
        return numeroDeCasilla;
    }

    
}
