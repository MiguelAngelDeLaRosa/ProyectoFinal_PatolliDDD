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
public class DTOAspa {

    private String tipoDeAspa;
    private int numeroDeCasillasPorAspa;
    private List<DTOCasilla> listaDeCasillas;

    public DTOAspa(String tipoDeAspa, int numeroDeCasillasPorAspa, List<DTOCasilla> listaDeCasillas) {
        this.tipoDeAspa = tipoDeAspa;
        this.numeroDeCasillasPorAspa = numeroDeCasillasPorAspa;
        this.listaDeCasillas = listaDeCasillas;
    }

    public String getTipoDeAspa() {
        return tipoDeAspa;
    }

    public int getNumeroDeCasillasPorAspa() {
        return numeroDeCasillasPorAspa;
    }

    public List<DTOCasilla> getListaDeCasillas() {
        return listaDeCasillas;
    }    
    
}
