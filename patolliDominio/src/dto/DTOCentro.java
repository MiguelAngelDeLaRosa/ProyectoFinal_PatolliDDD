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
    private int numeroDeCasillasPorAspa;

    public DTOCentro(int numeroDeCasillasPorAspa) {
        this.numeroDeCasillasPorAspa = numeroDeCasillasPorAspa;
    }

    public DTOCentro(List<DTOCasilla> listaDeCasillasCentrales, int numeroDeCasillasPorAspa) {
        this.listaDeCasillasCentrales = listaDeCasillasCentrales;
        this.numeroDeCasillasPorAspa = numeroDeCasillasPorAspa;
    }

    public List<DTOCasilla> getListaDeCasillasCentrales() {
        return listaDeCasillasCentrales;
    }
    
    public int getNumeroDeCasillasPorAspa(){
        return numeroDeCasillasPorAspa;
    }

    public void setListaDeCasillasCentrales(List<DTOCasilla> listaDeCasillasCentrales) {
        this.listaDeCasillasCentrales = listaDeCasillasCentrales;
    }
    
}
