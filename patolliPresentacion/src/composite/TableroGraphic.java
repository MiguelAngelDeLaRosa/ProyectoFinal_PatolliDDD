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

    public Tablero getTablero() {
        return tablero;
    }

    public void setTablero(Tablero tablero) {
        this.tablero = tablero;
    }

    public List<Graphic> getListaDeGraficosDelTablero() {
        return listaDeGraficosDelTablero;
    }

    public void setListaDeGraficosDelTablero(List<Graphic> listaDeGraficosDelTablero) {
        this.listaDeGraficosDelTablero = listaDeGraficosDelTablero;
    }

    
    /**
     * Utiliza la lista de aspas y el centro que se encuentran dentro del objeto
     * de tipo Tablero para crear una lista de tipo Graphic en donde se
     * guardarán los gráficos del tablero.
     */
    public void llenarListaDeGraficosDelTablero() {
        CentroGraphic centroDelTablero = new CentroGraphic(tablero.getCentroDelTablero());
        listaDeGraficosDelTablero.add(centroDelTablero);
        
        listaDeGraficosDelTablero.add(new AspaGraphic(tablero.getListaDeAspas().get(0), 480, 360));
        listaDeGraficosDelTablero.add(new AspaGraphic(tablero.getListaDeAspas().get(1), 380, 410));
        listaDeGraficosDelTablero.add(new AspaGraphic(tablero.getListaDeAspas().get(2), 430, 510));
        listaDeGraficosDelTablero.add(new AspaGraphic(tablero.getListaDeAspas().get(3), 530, 460));
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
