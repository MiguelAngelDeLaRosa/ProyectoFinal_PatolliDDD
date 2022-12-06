/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author edw_v
 */
public class Centro {

    private int numeroDeCasillasPorAspa;
    private List<Casilla> listaDeCasillasCentrales;

    /**
     * Constructor por omisión.
     */
    public Centro() {
    }

    /**
     * Inicializa el atributo listaDeCasillas a un ArrayList y llama al método
     * llenarListaDeCasillasCentrales() para llenarla.
     *
     * @param numeroDeCasillasPorAspa parámetro con un valor int el cual indica
     * el número de casillas por aspa.
     */
    public Centro(int numeroDeCasillasPorAspa) {
        this.numeroDeCasillasPorAspa = numeroDeCasillasPorAspa;
        listaDeCasillasCentrales = new ArrayList<>();
        llenarListaDeCasillasCentrales();
    }

    /**
     * Método utilizado para crear las casillas centrales del tablero e
     * ingresarlas en la lista de casillas centrales.
     */
    public void llenarListaDeCasillasCentrales() {
        listaDeCasillasCentrales.add(new Casilla(1, false));
        listaDeCasillasCentrales.add(new Casilla(1, false));
        listaDeCasillasCentrales.add(new Casilla(1, false));
        listaDeCasillasCentrales.add(new Casilla(1, false));
    }

    /**
     * Retorna el número de casillas por aspa.
     * @return entero que indica el número de casillas por aspa.
     */
    public int getNumeroDeCasillasPorAspa() {
        return numeroDeCasillasPorAspa;
    }

    /**
     * Establece el atributo numeroDeCasillasPorAspa al valor del parámetro recibido.
     * @param numeroDeCasillasPorAspa entero que indica el número de casillas por aspa.
     */
    public void setNumeroDeCasillasPorAspa(int numeroDeCasillasPorAspa) {
        this.numeroDeCasillasPorAspa = numeroDeCasillasPorAspa;
    }

    /**
     * Retorna la lista de casillas.
     * @return ArrayList con la lista de casillas centrales.
     */
    public List<Casilla> getListaDeCasillasCentrales() {
        return listaDeCasillasCentrales;
    }

    /**
     * Establece la lista de casillas al valor recibido en el parámetro.
     * @param listaDeCasillasCentrales ArrayList con la lista de casillas centrales.
     */
    public void setListaDeCasillasCentrales(List<Casilla> listaDeCasillasCentrales) {
        this.listaDeCasillasCentrales = listaDeCasillasCentrales;
    }

}
