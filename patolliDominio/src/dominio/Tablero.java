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
    private int contadorInferior;
    private int contadorIzquierdo;
    private int contadorDerecho;

    /**
     * Constructor que inicializa los atributos de la clase al valor de los
     * parámetros recibidos. Llena la lista de gráficos con los gráficos
     * necesarios para dibujar el tablero.
     *
     * @param numeroDeCasillasPorAspa
     */
    public Tablero(int numeroDeCasillasPorAspa) {
        this.numeroDeCasillasPorAspa = numeroDeCasillasPorAspa;

        asignarValoresDeContadores();

        listaDeAspas = new ArrayList<>();
        centroDelTablero = new Centro(this.numeroDeCasillasPorAspa);
        listaDeAspas.add(new Aspa(contadorSuperior, 480, 360, numeroDeCasillasPorAspa, "superior"));
        listaDeAspas.add(new Aspa(contadorIzquierdo, 380, 410, numeroDeCasillasPorAspa, "izquierda"));
        listaDeAspas.add(new Aspa(contadorInferior, 430, 510, numeroDeCasillasPorAspa, "inferior"));
        listaDeAspas.add(new Aspa(contadorDerecho, 530, 460, numeroDeCasillasPorAspa, "derecha"));
    }

    /**
     * Método que asigna el valor de los contadores para la creación de
     * casillas, de acuerdo al número de casillas por aspa.
     */
    public void asignarValoresDeContadores() {
        switch (this.numeroDeCasillasPorAspa) {
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
                this.contadorIzquierdo = 15;
                this.contadorInferior = 28;
                this.contadorDerecho = 41;
                break;
        }
    }

    public List<Aspa> getListaDeAspas() {
        return listaDeAspas;
    }

    public void setListaDeAspas(List<Aspa> listaDeAspas) {
        this.listaDeAspas = listaDeAspas;
    }

    public Centro getCentroDelTablero() {
        return centroDelTablero;
    }

    public void setCentroDelTablero(Centro centroDelTablero) {
        this.centroDelTablero = centroDelTablero;
    }

    public void moverFichaJugador(Jugador jugador, int numCasillasPorAvanzar){
        // TODO: programar movimiento de la ficha
    }
    
    public void ingresarFichaDeJugador(Jugador jugador){
        // TODO: programar ingreso de la ficha en el tablero
    }
}
