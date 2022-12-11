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
public class DTOCentro {

    private List<DTOCasilla> listaDeCasillasCentrales;

    public DTOCentro(List<DTOCasilla> listaDeCasillasCentrales) {
        this.listaDeCasillasCentrales = listaDeCasillasCentrales;
    }

    public List<DTOCasilla> getListaDeCasillasCentrales() {
        return listaDeCasillasCentrales;
    }
}
