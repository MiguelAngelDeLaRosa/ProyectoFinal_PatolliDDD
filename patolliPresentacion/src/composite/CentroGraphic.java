/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composite;

import dominio.Casilla;
import dominio.Centro;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author edw_v
 */
public class CentroGraphic implements Graphic {

    private Centro centro;
    private List<Graphic> listaDeCasillasGraphic;

    /**
     * Constructor que inicializa el atributo centro de la clase al valor del
     * parámetro recibido e inicializa la lista como un ArrayList y después
     * llama al método llenarListaDeCasillasGraphic() para llenar la lista.
     *
     * @param centro parámetro con un objeto de tipo centro.
     */
    public CentroGraphic(Centro centro) {
        this.centro = centro;
        listaDeCasillasGraphic = new ArrayList<>();
        llenarListaDeCasillasGraphic();
    }

    /**
     * Utiliza la lista de casillas que tiene el centro para crear una lista de
     * Graphic en donde se guardarán CasillasGraphic.
     */
    public void llenarListaDeCasillasGraphic() {
        for (Casilla c : centro.getListaDeCasillasCentrales()) {
            CasillaGraphic casillaGraphic = new CasillaGraphic(c);
            listaDeCasillasGraphic.add(casillaGraphic);
        }
    }

    /**
     * Retorna el objeto de tipo centro almacenado en el atributo de la clase.
     *
     * @return objeto de tipo Centro.
     */
    public Centro getCentro() {
        return centro;
    }

    /**
     * Establece el atributo centro de la clase al valor del parámetro recibido.
     *
     * @param centro parámetro con un objeto de tipo Centro
     */
    public void setCentro(Centro centro) {
        this.centro = centro;
    }

    /**
     * Retorna la lista de tipo Graphic almacenada en el atributo de la clase.
     *
     * @return una lista de tipo Graphic.
     */
    public List<Graphic> getListaDeCasillasGraphic() {
        return listaDeCasillasGraphic;
    }

    /**
     * Establece la lista de la clase al valor del parámetro recibido.
     *
     * @param listaDeCasillasGraphic parámetro una lista de tipo Graphic.
     */
    public void setListaDeCasillasGraphic(List<Graphic> listaDeCasillasGraphic) {
        this.listaDeCasillasGraphic = listaDeCasillasGraphic;
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
