/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dominio;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author edw_v
 */
public class Tablero {

    private int numeroDeCasillasPorAspa;
    //El tablero contiene una lista<Graphic> que son las aspas y el centro.
    private List<Aspa> listaDeAspas;
    private Centro centroDelTablero;
    private int contadorSuperior;
    private int contadorIzquierdo;
    private int contadorInferior;
    private int contadorDerecho;
    
    /**
     * Constructor que inicializa los atributos de la clase al valor de los
     * parámetros recibidos. Inicializa la lista de aspas a un ArrayList y llama al método
     *
     * @param numeroDeCasillasPorAspa
     */
    public Tablero(int numeroDeCasillasPorAspa) {
        this.numeroDeCasillasPorAspa = numeroDeCasillasPorAspa;
        listaDeAspas = new ArrayList<>();
        centroDelTablero = new Centro(this.numeroDeCasillasPorAspa);
        asignarContadores();
        listaDeAspas.add(new Aspa(contadorSuperior, numeroDeCasillasPorAspa, "superior"));
        listaDeAspas.add(new Aspa(contadorIzquierdo, numeroDeCasillasPorAspa, "izquierda"));
        listaDeAspas.add(new Aspa(contadorInferior, numeroDeCasillasPorAspa, "inferior"));
        listaDeAspas.add(new Aspa(contadorDerecho, numeroDeCasillasPorAspa, "derecha"));
    }

    public void asignarContadores(){
        if(numeroDeCasillasPorAspa == 5){
            this.contadorSuperior = 2;
            this.contadorIzquierdo = 13;
            this.contadorInferior = 24;
            this.contadorDerecho = 35;
        }
        
        if(numeroDeCasillasPorAspa == 6){
            this.contadorSuperior = 2;
            this.contadorIzquierdo = 15;
            this.contadorInferior = 28;
            this.contadorDerecho = 41;
        }
        
        if(numeroDeCasillasPorAspa == 7){
            this.contadorSuperior = 2;
            this.contadorIzquierdo = 17;
            this.contadorInferior = 32;
            this.contadorDerecho = 47;
        }
    }
    /**
     * Retorna la lista de aspas.
     * @return ArrayList con las aspas del tablero.
     */
    public List<Aspa> getListaDeAspas() {
        return listaDeAspas;
    }

    /**
     * Establece el atributo listaDeAspas al valor del parámetro recibido.
     * @param listaDeAspas ArrayList con las aspas a asignarle al tablero.
     */
    public void setListaDeAspas(List<Aspa> listaDeAspas) {
        this.listaDeAspas = listaDeAspas;
    }

    /**
     * Retorna la instancia de tipo Centro del tablero.
     * @return instancia de tipo Centro que tiene establecida el tablero.
     */
    public Centro getCentroDelTablero() {
        return centroDelTablero;
    }

    /**
     * Establece el atributo centro al valor del parámetro recibido.
     * @param centroDelTablero isntancia de tipo Centro a establecer en el atributo.
     */
    public void setCentroDelTablero(Centro centroDelTablero) {
        this.centroDelTablero = centroDelTablero;
    }

    /**
     * Retorna el número de casillas por aspa.
     * @return entero que indica el número de casillas por aspa.
     */
    public int getNumeroDeCasillasPorAspa() {
        return numeroDeCasillasPorAspa;
    }

    /**
     * Establece el número de casillas por aspa.
     * @param numeroDeCasillasPorAspa entero que indica el número de casillas por aspa.
     */
    public void setNumeroDeCasillasPorAspa(int numeroDeCasillasPorAspa) {
        this.numeroDeCasillasPorAspa = numeroDeCasillasPorAspa;
    }
    
}
