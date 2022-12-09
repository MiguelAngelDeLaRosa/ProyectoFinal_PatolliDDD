/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composite;

import dominio.Casilla;
import dominio.Centro;
import dto.DTOCasilla;
import dto.DTOCentro;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author edw_v
 */
public class CentroGraphic implements Graphic {

    private DTOCentro centro;
    private List<Graphic> listaDeCasillasCentrales;
    private int casillaSuperiorDerecha;
    private int casillaSuperiorIzquierda;
    private int casillaInferiorIzquierda;
    private int casillaInferiorDerecha;

    /**
     * Constructor que inicializa el atributo centro de la clase al valor del
     * parámetro recibido e inicializa la lista como un ArrayList y después
     * llama al método llenarListaDeCasillasGraphic() para llenar la lista.
     *
     * @param centro parámetro con un objeto de tipo centro.
     */
    public CentroGraphic(DTOCentro centro) {
        this.centro = centro;
        listaDeCasillasCentrales = new ArrayList<>();
        asignarValoresDeIdDeCasillasCentrales();
        llenarListaDeCasillasGraphic();
    }

    /**
     * Utiliza la lista de casillas que tiene el centro para crear una lista de
     * Graphic en donde se guardarán CasillasGraphic.
     */
    public void llenarListaDeCasillasGraphic() {
        List<DTOCasilla> listaDeCasillas = centro.getListaDeCasillasCentrales();
        listaDeCasillasCentrales.add(new CasillaGraphic(listaDeCasillas.get(0), casillaSuperiorDerecha, 480, 410, 488, 420));
        listaDeCasillasCentrales.add(new CasillaGraphic(listaDeCasillas.get(1),casillaSuperiorIzquierda, 430, 410, 438, 420));
        listaDeCasillasCentrales.add(new CasillaGraphic(listaDeCasillas.get(2),casillaInferiorIzquierda, 430, 460, 438, 470));
        listaDeCasillasCentrales.add(new CasillaGraphic(listaDeCasillas.get(3),casillaInferiorDerecha, 480, 460, 488, 470));
    }

    public void asignarValoresDeIdDeCasillasCentrales() {
        int numeroDeCasillasPorAspa = centro.getNumeroDeCasillasPorAspa();
        
        switch (numeroDeCasillasPorAspa) {
            case 5:
                this.casillaSuperiorDerecha = 1;
                this.casillaSuperiorIzquierda = 12;
                this.casillaInferiorIzquierda = 23;
                this.casillaInferiorDerecha = 34;
                break;

            case 6:
                this.casillaSuperiorDerecha = 1;
                this.casillaSuperiorIzquierda = 14;
                this.casillaInferiorIzquierda = 27;
                this.casillaInferiorDerecha = 40;
                break;

            case 7:
                this.casillaSuperiorDerecha = 1;
                this.casillaSuperiorIzquierda = 16;
                this.casillaInferiorIzquierda = 31;
                this.casillaInferiorDerecha = 46;
                break;
        }
    }
    
    /**
     * Retorna el objeto de tipo centro almacenado en el atributo de la clase.
     *
     * @return objeto de tipo Centro.
     */
    public DTOCentro getCentro() {
        return centro;
    }

    /**
     * Establece el atributo centro de la clase al valor del parámetro recibido.
     *
     * @param centro parámetro con un objeto de tipo Centro
     */
    public void setCentro(DTOCentro centro) {
        this.centro = centro;
    }

    /**
     * Retorna la lista de tipo Graphic almacenada en el atributo de la clase.
     *
     * @return una lista de tipo Graphic.
     */
    public List<Graphic> getListaDeCasillasGraphic() {
        return listaDeCasillasCentrales;
    }

    /**
     * Establece la lista de la clase al valor del parámetro recibido.
     *
     * @param listaDeCasillasGraphic parámetro una lista de tipo Graphic.
     */
    public void setListaDeCasillasGraphic(List<Graphic> listaDeCasillasCentrales) {
        this.listaDeCasillasCentrales = listaDeCasillasCentrales;
    }

    /**
     * Método que llama al método dibujar para dibujar las casillas centrales
     * almacenadas en la lista de la clase.
     *
     * @param g instancia de tipo Graphics para poder dibujar las casillas.
     */
    public void paint(Graphics g) {
        dibujar(g);
    }

    /**
     * Método utilizado para dibujar cada una de las CasillasGraphic que se
     * encuentran dentro de la lista listaDeCasillasGraphic.
     *
     * @param g instancia de tipo Graphics para poder dibujar las casillas.
     */
    @Override
    public void dibujar(Graphics g) {
        for (Graphic casilla: listaDeCasillasCentrales) {
            casilla.dibujar(g);
        }
    }

}
