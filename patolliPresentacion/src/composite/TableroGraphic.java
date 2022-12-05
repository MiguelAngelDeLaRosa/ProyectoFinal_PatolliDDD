/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composite;

import dominio.Aspa;
import dominio.Tablero;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author edw_v
 */
public class TableroGraphic implements Graphic {

    private Tablero tablero;
    private List<Graphic> listaDeGraficosDelTablero;

    /**
     * Constructor que inicializa el atributo tablero de la clase al valor del
     * parámetro recibido e inicializa la lista como un ArrayList y después
     * llama al método llenarListaDeGraficosDelTablero() para llenar la lista.
     *
     * @param tablero parámetro con un objeto de tipo Tablero.
     */
    public TableroGraphic(Tablero tablero) {
        this.tablero = tablero;
        listaDeGraficosDelTablero = new ArrayList<>();
        llenarListaDeGraficosDelTablero();
    }

    /**
     * Utiliza la lista de aspas y el centro que se encuentran dentro del objeto
     * de tipo Tablero para crear una lista de tipo Graphic en donde se
     * guardarán los gráficos del tablero.
     */
    public void llenarListaDeGraficosDelTablero() {
        CentroGraphic centroDelTablero = new CentroGraphic(tablero.getCentroDelTablero());
        listaDeGraficosDelTablero.add(centroDelTablero);
        for (Aspa aspa : tablero.getListaDeAspas()) {
            AspaGraphic aspaGraphic = new AspaGraphic(aspa);
            listaDeGraficosDelTablero.add(aspaGraphic);
        }
    }

    /**
     * Método obligatorio que utiliza el panel para dibujar un componente.
     *
     * @param g instancia de tipo Graphics para poder dibujar los gráficos de la
     * lista.
     */
    public void paint(Graphics g) {
        dibujar(g);
    }

    /**
     * Método que recorre y dibuja todos los elementos de la lista de gráficos
     *
     * @param g instancia de tipo Graphics para poder dibujar los gráficos de la
     * lista.
     */
    @Override
    public void dibujar(Graphics g) {
        for (Graphic graphic : listaDeGraficosDelTablero) {
            graphic.dibujar(g);
        }
    }

}
