/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author edw_v
 */
public class Centro {

    private List<Casilla> listaDeCasillasCentrales;
    private int numeroDeCasillasPorAspa;
    private int casillaSuperiorDerecha;
    private int casillaSuperiorIzquierda;
    private int casillaInferiorIzquierda;
    private int casillaInferiorDerecha;

    /**
     * Constructor por omisión.
     */
    public Centro() {
    }

    /**
     * Constructor que inicializa el atributo numeroDeCasillasPorAspa al valor
     * del parámetro recibido.
     *
     * @param numeroDeCasillasPorAspa parámetro con un valor int el cual indica
     * el número de casillas por aspa.
     */
    public Centro(int numeroDeCasillasPorAspa) {
        this.numeroDeCasillasPorAspa = numeroDeCasillasPorAspa;
        asignarValoresDeIdDeCasillasCentrales();
        llenarListaDeCasillasCentrales();
    }

    /**
     * Método utilizado para crear las casillas centrales del tablero e
     * ingresarlas en la lista de casillas centrales.
     */
    public void llenarListaDeCasillasCentrales() {
        listaDeCasillasCentrales = new ArrayList<>();
        listaDeCasillasCentrales.add(new Casilla(casillaSuperiorDerecha, 480, 410, 1, 488, 420));
        listaDeCasillasCentrales.add(new Casilla(casillaSuperiorIzquierda, 430, 410, 1, 438, 420));
        listaDeCasillasCentrales.add(new Casilla(casillaInferiorIzquierda, 430, 460, 1, 438, 470));
        listaDeCasillasCentrales.add(new Casilla(casillaInferiorDerecha, 480, 460, 1, 488, 470));
    }

    /**
     * Asigna el valor del Id de las casillas centrales de acuerdo al número de
     * casillas por aspa.
     */
    public void asignarValoresDeIdDeCasillasCentrales() {

        switch (this.numeroDeCasillasPorAspa) {
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
     * Retorna una lista de casillas.
     *
     * @return lista de tipo Casilla que incluye las 4 casillas centrales del
     * tablero.
     */
    public List<Casilla> getListaDeCasillasCentrales() {
        return listaDeCasillasCentrales;
    }

    /**
     * Establece la lista de tipo Casilla del atributo de la clase al valor del
     * parámetro recibido.
     *
     * @param listaDeCasillasCentrales lista de casillas a igualar en el
     * parámetro de la clase.
     */
    public void setListaDeCasillasCentrales(List<Casilla> listaDeCasillasCentrales) {
        this.listaDeCasillasCentrales = listaDeCasillasCentrales;
    }

}
