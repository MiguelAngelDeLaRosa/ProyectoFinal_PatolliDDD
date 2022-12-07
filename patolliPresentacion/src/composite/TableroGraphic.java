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
    private int contadorSuperior;
    private int contadorInferior;
    private int contadorIzquierdo;
    private int contadorDerecho;

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
        asignarValorAContadores();
        CentroGraphic centroDelTablero = new CentroGraphic(tablero.getCentroDelTablero());
        listaDeGraficosDelTablero.add(centroDelTablero);
        
        listaDeGraficosDelTablero.add(new AspaGraphic(tablero.getListaDeAspas().get(0), contadorSuperior, 480, 360));
        listaDeGraficosDelTablero.add(new AspaGraphic(tablero.getListaDeAspas().get(1), contadorIzquierdo, 380, 410));
        listaDeGraficosDelTablero.add(new AspaGraphic(tablero.getListaDeAspas().get(2), contadorInferior, 430, 510));
        listaDeGraficosDelTablero.add(new AspaGraphic(tablero.getListaDeAspas().get(3), contadorDerecho, 530, 460));
    }

    public void asignarValorAContadores() {
        int numeroDeCasillasPorAspa = tablero.getNumeroDeCasillasPorAspa();

        switch (numeroDeCasillasPorAspa) {

            case 5:
                this.contadorSuperior = 2;
                this.contadorIzquierdo = 13;
                this.contadorInferior = 24;
                this.contadorDerecho = 35;
                break;

            case 6:
                this.contadorSuperior = 2;
                this.contadorIzquierdo = 15;
                this.contadorInferior = 28;
                this.contadorDerecho = 41;
                break;

            case 7:
                this.contadorSuperior = 2;
                this.contadorIzquierdo = 17;
                this.contadorInferior = 32;
                this.contadorDerecho = 47;
                break;
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
