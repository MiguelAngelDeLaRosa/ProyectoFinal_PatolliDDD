/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package dto;

import java.util.List;

/**
 *
 * @author edw_v
 */
public class DTOTablero {
    private DTOCentro centroDeTablero;
    private List<DTOAspa> listaDeAspas;

    public DTOTablero(DTOCentro centroDeTablero, List<DTOAspa> listaDeAspas) {
        this.centroDeTablero = centroDeTablero;
        this.listaDeAspas = listaDeAspas;
    }

    public DTOCentro getCentroDeTablero() {
        return centroDeTablero;
    }

    public List<DTOAspa> getListaDeAspas() {
        return listaDeAspas;
    }
    
    
}
