/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import dto.DTOCasilla;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author edw_v
 */
public class Aspa {

    private int asignadorDeNumeroDeCasilla;
    private int numeroDeCasillasPorAspa;
    private String tipoDeAspa;
    private List<Casilla> listaDeCasillas;
    private List<DTOCasilla> listaDTOCasillas;

    /**
     * Constructor por omisión.
     */
    public Aspa() {
    }

    /**
     * Constructor que inicializa los atributos numeroDeCasillasPorAspa y
     * tipoDeAspa al valor de los parámetros recibidos. Inicializa la lista de
     * casillas a un ArrayList y llama al método llenarListaDeCasillas(), para
     * llenar la lista.
     *
     * @param numeroDeCasillasPorAspa entero que indica el número de casilla por
     * aspa.
     * @param tipoDeAspa string que indica el tipo de aspa que será.
     * @param asignadorDeNumeroDeCasilla entero utilizado para asignarle un
     * número de casilla a cada casilla de la lista de casillas que tendrá el
     * aspa.
     */
    public Aspa(int asignadorDeNumeroDeCasilla, int numeroDeCasillasPorAspa, String tipoDeAspa) {
        this.asignadorDeNumeroDeCasilla = asignadorDeNumeroDeCasilla;
        this.numeroDeCasillasPorAspa = numeroDeCasillasPorAspa;
        this.tipoDeAspa = tipoDeAspa;
        this.listaDeCasillas = new ArrayList<>();
        this.listaDTOCasillas = new ArrayList<>();
        llenarListaDeCasillas();
    }

    /**
     * Llena la lista de casillas.
     */
    public void llenarListaDeCasillas() {

        //Ciclo para crear la primera hilera de casillas.
        for (int i = 0; i < numeroDeCasillasPorAspa - 1; i++) {
            //Si las casillas son las últimas dos, las cuales tendrán castigo.
            if (i == numeroDeCasillasPorAspa - 2 || i == numeroDeCasillasPorAspa - 3) {
                listaDeCasillas.add(new Casilla(asignadorDeNumeroDeCasilla, 3, false));
                listaDTOCasillas.add(new DTOCasilla(asignadorDeNumeroDeCasilla, 3));
            } else {
                listaDeCasillas.add(new Casilla(asignadorDeNumeroDeCasilla, 2, false));
                listaDTOCasillas.add(new DTOCasilla(asignadorDeNumeroDeCasilla, 2));
            }
            asignadorDeNumeroDeCasilla++;
        }

        //Se crean las dos casillas circulares.
        listaDeCasillas.add(new Casilla(asignadorDeNumeroDeCasilla, 4, false));
        listaDTOCasillas.add(new DTOCasilla(asignadorDeNumeroDeCasilla, 4));
        asignadorDeNumeroDeCasilla++;
        listaDeCasillas.add(new Casilla(asignadorDeNumeroDeCasilla, 4, false));
        listaDTOCasillas.add(new DTOCasilla(asignadorDeNumeroDeCasilla, 4));
        asignadorDeNumeroDeCasilla++;

        //Ciclo para crear la segunda hilera de casillas.
        for (int j = 0; j < numeroDeCasillasPorAspa - 1; j++) {
            //Si las casillas son las últimas dos, las cuales tendrán castigo.
            if (j == 0 || j == 1) {
                listaDeCasillas.add(new Casilla(asignadorDeNumeroDeCasilla, 3, false));
                listaDTOCasillas.add(new DTOCasilla(asignadorDeNumeroDeCasilla, 3));
            } else {
                listaDeCasillas.add(new Casilla(asignadorDeNumeroDeCasilla, 2, false));
                listaDTOCasillas.add(new DTOCasilla(asignadorDeNumeroDeCasilla, 2));
            }
            asignadorDeNumeroDeCasilla++;
        }

        //Se agregan las casillas triangulares
        listaDeCasillas.add(new Casilla(5));
        listaDeCasillas.add(new Casilla(5));
        listaDTOCasillas.add(new DTOCasilla(5));
        listaDTOCasillas.add(new DTOCasilla(5));
    }

    /**
     * Retorna el número de casillas por aspa.
     *
     * @return entero indicando el número de casillas por aspa.
     */
    public int getNumeroDeCasillasPorAspa() {
        return numeroDeCasillasPorAspa;
    }

    /**
     * Establece el atributo numeroDeCasillasPorAspa al valor del parámetro
     * recibido.
     *
     * @param numeroDeCasillasPorAspa entero indicando el número de casillas por
     * aspa.
     */
    public void setNumeroDeCasillasPorAspa(int numeroDeCasillasPorAspa) {
        this.numeroDeCasillasPorAspa = numeroDeCasillasPorAspa;
    }

    /**
     * Retorna el tipo de aspa.
     *
     * @return string indicando el tipo de aspa.
     */
    public String getTipoDeAspa() {
        return tipoDeAspa;
    }

    /**
     * Establece el atributo tipoDeAspa al valor del parámetro recibido.
     *
     * @param tipoDeAspa string que indica el tipo de aspa.
     */
    public void setTipoDeAspa(String tipoDeAspa) {
        this.tipoDeAspa = tipoDeAspa;
    }

    /**
     * Retorna la lista de casillas que tiene el aspa.
     *
     * @return ArrayList con la lista de casillas que tiene el aspa.
     */
    public List<Casilla> getListaDeCasillas() {
        return listaDeCasillas;
    }

    /**
     * Establece la lista de casillas de la clase al valor del parámetro
     * recibido.
     *
     * @param listaDeCasillas ArrayList con la lista de casillas.
     */
    public void setListaDeCasillas(List<Casilla> listaDeCasillas) {
        this.listaDeCasillas = listaDeCasillas;
    }

    /**
     * Retorna la primer casilla de la lista de casillas, la cual será usada
     * como casilla inicial para un jugador.
     *
     * @return casilla inicial
     */
    public Casilla getCasillaInicial() {
        return listaDeCasillas.get(0);
    }

    public List<DTOCasilla> getListaDTOCasillas() {
        return listaDTOCasillas;
    }
    
}
