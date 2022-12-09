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
    
    public DTOCasilla (int tipoDeCasilla){
        this.tipoDeCasilla = tipoDeCasilla;
    }
    
    public int getTipoDeCasilla(){
        return tipoDeCasilla;
    }

    
}
