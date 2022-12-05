/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composite;

import dominio.Aspa;
import dominio.Casilla;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author edw_v
 */
public class AspaGraphic implements Graphic {

    private Aspa aspa;
    private List<Graphic> listaDeCasillasGraphic;

    /**
     * Constructor que inicializa el atributo aspa de la clase al valor del
     * parámetro recibido e inicializa la lista como un ArrayList y después
     * llama al método llenarListaDeCasillasGraphic() para llenar la lista.
     *
     * @param aspa parámetro con un objeto de tipo aspa.
     */
    public AspaGraphic(Aspa aspa) {
        this.aspa = aspa;
        listaDeCasillasGraphic = new ArrayList<>();
        llenarListaDeCasillasGraphic();
    }

    /**
     * Utiliza la lista de casillas que tiene el aspa para crear una lista de
     * Graphic en donde se guardarán CasillasGraphic.
     */
    public void llenarListaDeCasillasGraphic() {
        for (Casilla c : aspa.getListaDeCasillas()) {
            CasillaGraphic casillaGraphic = new CasillaGraphic(c);
            listaDeCasillasGraphic.add(casillaGraphic);
        }
    }

    /**
     * Retorna el objeto de tipo aspa almacenado en el atributo de la clase.
     *
     * @return objeto de tipo aspa.
     */
    public Aspa getAspa() {
        return aspa;
    }

    /**
     * Establece el atributo de la clase al valor del parámetro recibido.
     *
     * @param aspa parámetro con un objeto de tipo aspa.
     */
    public void setAspa(Aspa aspa) {
        this.aspa = aspa;
    }

    /**
     * Retorna la lista almacenada en el atributo de la clase.
     *
     * @return una lista de tipo Graphic.
     */
    public List<Graphic> getListaDeCasillasGraphic() {
        return listaDeCasillasGraphic;
    }

    /**
     * Establece el atributo de la clase al valor del parámetro recibido.
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
        for (Graphic casillaGraphic : listaDeCasillasGraphic) {
            casillaGraphic.dibujar(g);
        }
    }

}
