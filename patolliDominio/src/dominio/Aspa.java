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
public class Aspa {

    private int contadorCasillas;
    private int x;
    private int y;
    private int numCasillas;
    private String tipoAspa;
    //Lista de casillas por las que se encuentra compuesta un aspa.
    private List<Casilla> listaDeCasillas;

    /**
     * Constructor por omisión.
     */
    public Aspa() {
    } 
    
    /**
     * Constructor que iguala el valor de los atributos de la clase al valor de
     * sus parámetros e inicializa la lista de casillas como un arraylist.
     *
     * @param x valor de la coordenada inicial del eje de las X por donde se
     * iniciará a dibujar toda el aspa.
     * @param y valor de la coordenada inicial del eje de las Y por donde se
     * iniciará a dibujar toda el aspa.
     * @param numCasillas cantidad de casillas que debe tener un lado del aspa.
     * @param tipoAspa variable que define el lado por donde se construirá el
     * aspa.
     */
    public Aspa(int contadorCasillas, int x, int y, int numCasillas, String tipoAspa) {
        this.contadorCasillas = contadorCasillas;
        this.x = x;
        this.y = y;
        this.numCasillas = numCasillas;
        this.tipoAspa = tipoAspa;
        listaDeCasillas = new ArrayList<Casilla>();
    }

    /**
     * Retorna una lista de casillas.
     *
     * @return lista con las casillas que contiene el aspa.
     */
    public List<Casilla> getListaDeCasillas() {
        return listaDeCasillas;
    }

    /**
     * Establece el atributo de la clase al valor del parámetro recibido.
     * @param listaDeCasillas lista de casillas a igualar en el parámetro de la clase.
     */
    public void setListaDeCasillas(List<Casilla> listaDeCasillas) {
        this.listaDeCasillas = listaDeCasillas;
    }

    /**
     * Método utilizado para llenar cada aspa del tablero con una lista de
     * casillas.
     */
    public void llenarListaDeCasillasDeAspa() {
        switch (tipoAspa) {
            case ("superior"):
                llenarListaDeCasillasDeAspaSuperior();
                break;
            case ("inferior"):
                llenarListaDeCasillasDeAspaInferior();
                break;
            case ("derecha"):
                llenarListaDeCasillasDeAspaDerecha();
                break;
            case ("izquierda"):
                llenarListaDeCasillasDeAspaIzquierda();
                break;
        }
    }

    /**
     * Método que crea la lista con las casillas que contiene el aspa superior
     * del tablero.
     */
    public void llenarListaDeCasillasDeAspaSuperior() {
        listaDeCasillas = new ArrayList<Casilla>();

        int auxX = x;
        int auxY = y;

        //Ciclo para crear las casillas del lado derecho
        for (int i = 0; i < numCasillas - 1; i++) {
            //Si las casillas son las últimas dos, de abajo hacia arriba, antes de la casilla circular
            if (i == numCasillas - 2 || i == numCasillas - 3) {
                listaDeCasillas.add(new Casilla(contadorCasillas, x, y, 3, x + 8, y + 10));
                y -= 50;
                contadorCasillas++;
            } else {
                listaDeCasillas.add(new Casilla(contadorCasillas, x, y, 2, x + 8, y + 10));
                y -= 50;
                contadorCasillas++;
            }
        }

        //Creamos la casilla redonda del lado derecho
        listaDeCasillas.add(new Casilla(contadorCasillas, x - 50, y, 0, 90, 4, x + 8, y + 10));

        //Igualamos nuestras variables auxiliares auxX y auxY a los valores de X y Y para comenzar el siguiente ciclo.
        auxY = y;

        //A auxX se le restarán 50 para iniciar a construir las casillas del lado izquierdo
        auxX -= 50;
        contadorCasillas++;

        //Creamos la casilla redonda del lado izquierdo
        listaDeCasillas.add(new Casilla(contadorCasillas, x - 50, y, 90, 90, 4, x - 37, y + 10));
        contadorCasillas++;

        //Aumentamos en 50 el valor de auxY para continuar con las casillas cuadradas.
        auxY += 50;

        //Ciclo para crear las casillas del lado izquierdo
        for (int j = 0; j < numCasillas - 1; j++) {
            //Si las casillas son la primera o la segunda, después de la casilla circular izquierda
            if (j == 0 || j == 1) {
                listaDeCasillas.add(new Casilla(contadorCasillas, auxX, auxY, 3, x - 42, auxY + 10));
                //Se utiliza el auxY para no modificar la variable y, pues será utilizada para la creación de los triángulos
                auxY += 50;
                contadorCasillas++;
            } else {
                listaDeCasillas.add(new Casilla(contadorCasillas, auxX, auxY, 2, x - 42, auxY + 10));
                //Se utiliza el auxY para no modificar la variable y, pues será utilizada para la creación de los triángulos
                auxY += 50;
                contadorCasillas++;
            }
        }

        //Creamos las casillas triangulares a partir de coordenadas.
        int[] xT = {x, x + 50, x + 50};
        int[] yT = {y + 101, y + 130, y + 70};
        listaDeCasillas.add(new Casilla(xT, yT, 5));

        int[] xT2 = {x, x - 50, x - 50};
        int[] yT2 = {y + 101, y + 130, y + 70};
        listaDeCasillas.add(new Casilla(xT2, yT2, 5));
    }

    /**
     * Método que crea la lista con las casillas que contiene el aspa izquierda
     * del tablero.
     */
    public void llenarListaDeCasillasDeAspaIzquierda() {
        listaDeCasillas = new ArrayList<Casilla>();

        int auxX = x;
        int auxY = y;

        //Ciclo para crear las casillas superiores
        for (int i = 0; i < numCasillas - 1; i++) {
            //Si las casillas son las últimas dos, de derecha a izquierda, antes de la casilla circular
            if (i == numCasillas - 2 || i == numCasillas - 3) {
                listaDeCasillas.add(new Casilla(contadorCasillas, x, y, 3, x + 8, y + 10));
                x -= 50;
                contadorCasillas++;
            } else {
                listaDeCasillas.add(new Casilla(contadorCasillas, x, y, 2, x + 8, y + 10));
                x -= 50;
                contadorCasillas++;
            }
        }

        //Creamos la casilla redonda superior
        listaDeCasillas.add(new Casilla(contadorCasillas, x, y, 90, 90, 4, x + 14, y + 10));
        //Igualamos nuestras variables auxiliares auxX y auxY a los valores de X y Y para comenzar el siguiente ciclo.

        auxX = x;
        //A auxY se le sumarán 50 para iniciar a construir las casillas inferiores
        auxY += 50;
        contadorCasillas++;

        //Creamos la casilla redonda inferior
        listaDeCasillas.add(new Casilla(contadorCasillas, x, y, 180, 90, 4, x + 14, auxY + 10));
        contadorCasillas++;
        auxX += 50;

        //Ciclo para rear las casillas inferiores
        for (int j = 0; j < numCasillas - 1; j++) {
            //Si las casillas son la primera o la segunda, después de la casilla circular inferior
            if (j == 0 || j == 1) {
                listaDeCasillas.add(new Casilla(contadorCasillas, auxX, auxY, 3, auxX + 8, auxY + 10));
                //Se utiliza el auxX para no modificar la variable x, pues será utilizada para la creación de los triángulos
                auxX += 50;
                contadorCasillas++;
            } else {
                listaDeCasillas.add(new Casilla(contadorCasillas, auxX, auxY, 2, auxX + 8, auxY + 10));
                //Se utiliza el auxX para no modificar la variable x, pues será utilizada para la creación de los triángulos
                auxX += 50;
                contadorCasillas++;
            }
        }

        //Creamos las casillas triangulares a partir de coordenadas.
        int[] xT = {x + 70, x + 100, x + 130};
        int[] yT = {y, y + 50, y};
        listaDeCasillas.add(new Casilla(xT, yT, 5));

        int[] xT2 = {x + 70, x + 100, x + 130};
        int[] yT2 = {y + 100, y + 50, y + 100};
        listaDeCasillas.add(new Casilla(xT2, yT2, 5));

    }

    /**
     * Método que crea la lista con las casillas que contiene el aspa inferior
     * del tablero.
     */
    public void llenarListaDeCasillasDeAspaInferior() {
        listaDeCasillas = new ArrayList<Casilla>();

        int auxX = x;
        int auxY = y;

        //Ciclo para crear las casillas del lado izquierdo
        for (int i = 0; i < numCasillas - 1; i++) {
            //Si las casillas son las últimas dos, de arriba hacia abajo, antes de la casilla circular
            if (i == numCasillas - 2 || i == numCasillas - 3) {
                listaDeCasillas.add(new Casilla(contadorCasillas, x, y, 3, x + 8, y + 10));
                y += 50;
                contadorCasillas++;
            } else {
                listaDeCasillas.add(new Casilla(contadorCasillas, x, y, 2, x + 8, y + 10));
                y += 50;
                contadorCasillas++;
            }
        }

        //Creamos la casilla redonda del lado izquierdo
        listaDeCasillas.add(new Casilla(contadorCasillas, x, y - 50, 180, 90, 4, x + 10, y + 10));
        //Igualamos nuestras variables auxiliares auxX y auxY a los valores de X y Y para comenzar el siguiente ciclo.

        auxY = y;
        //A auxX se le sumarán 50 para iniciar a construir las casillas del lado derecho
        auxX += 50;
        contadorCasillas++;

        //Creamos la casilla redonda del lado derecho
        listaDeCasillas.add(new Casilla(contadorCasillas, x, y - 50, 270, 90, 4, auxX + 5, auxY + 10));
        contadorCasillas++;
        //Aumentamos en 50 el valor de auxY para continuar con las casillas cuadradas.
        auxY -= 50;

        //Ciclo para crear las casillas del lado derecho
        for (int j = 0; j < numCasillas - 1; j++) {
            //Si las casillas son la primera o la segunda, después de la casilla circular derecha
            if (j == 0 || j == 1) {
                listaDeCasillas.add(new Casilla(contadorCasillas, auxX, auxY, 3, auxX + 8, auxY + 10));
                //Se utiliza el auxY para no modificar la variable y, pues será utilizada para la creación de los triángulos
                auxY -= 50;
                contadorCasillas++;
            } else {
                listaDeCasillas.add(new Casilla(contadorCasillas, auxX, auxY, 2, auxX + 8, auxY + 10));
                //Se utiliza el auxY para no modificar la variable y, pues será utilizada para la creación de los triángulos
                auxY -= 50;
                contadorCasillas++;
            }
        }

        //Creamos las casillas triangulares a partir de coordenadas.
        int[] xT = {x + 50, x + 100, x + 100};
        int[] yT = {y - 50, y - 80, y - 20};
        listaDeCasillas.add(new Casilla(xT, yT, 5));
        int[] xT2 = {x + 50, x, x};
        int[] yT2 = {y - 50, y - 80, y - 20};
        listaDeCasillas.add(new Casilla(xT2, yT2, 5));

    }

    /**
     * Método que crea la lista con las casillas que contiene el aspa derecha
     * del tablero.
     */
    public void llenarListaDeCasillasDeAspaDerecha() {

        listaDeCasillas = new ArrayList<Casilla>();

        int auxX = x;
        int auxY = y;

        //Ciclo para crear las casillas inferiores
        for (int i = 0; i < numCasillas - 1; i++) {
            //Si las casillas son las últimas dos, de izquierda a derecha, antes de la casilla circular
            if (i == numCasillas - 2 || i == numCasillas - 3) {
                listaDeCasillas.add(new Casilla(contadorCasillas, x, y, 3, x + 8, y + 10));
                x += 50;
                contadorCasillas++;
            } else {
                listaDeCasillas.add(new Casilla(contadorCasillas, x, y, 2, x + 8, y + 10));
                x += 50;
                contadorCasillas++;
            }
        }

        //Creamos la casilla redonda del inferior
        listaDeCasillas.add(new Casilla(contadorCasillas, x - 50, y - 50, 270, 90, 4, x + 8, y + 10));
        //Igualamos nuestras variables auxiliares auxX y auxY a los valores de X y Y para comenzar el siguiente ciclo.

        auxX = x;
        //A auxY se le sumarán 50 para iniciar a construir las casillas superiores
        auxY -= 50;
        contadorCasillas++;

        listaDeCasillas.add(new Casilla(contadorCasillas, x - 50, y - 50, 360, 90, 4, x + 8, auxY + 10));
        contadorCasillas++;
        auxX -= 50;

        //Ciclo para rear las casillas superiores
        for (int j = 0; j < numCasillas - 1; j++) {
            //Si las casillas son la primera o la segunda, después de la casilla circular superior
            if (j == 0 || j == 1) {
                listaDeCasillas.add(new Casilla(contadorCasillas, auxX, auxY, 3, auxX + 8, auxY + 10));
                //Se utiliza el auxX para no modificar la variable x, pues será utilizada para la creación de los triángulos
                auxX -= 50;
                contadorCasillas++;
            } else {
                listaDeCasillas.add(new Casilla(contadorCasillas, auxX, auxY, 2, auxX + 8, auxY + 10));
                //Se utiliza el auxX para no modificar la variable x, pues será utilizada para la creación de los triángulos
                auxX -= 50;
                contadorCasillas++;
            }
        }

        //Creamos las casillas triangulares a partir de coordenadas.
        int[] xT = {x - 80, x - 50, x - 20};
        int[] yT = {y - 50, y, y - 50};
        listaDeCasillas.add(new Casilla(xT, yT, 5));
        int[] xT2 = {x - 80, x - 50, x - 20};
        int[] yT2 = {y + 50, y, y + 50};
        listaDeCasillas.add(new Casilla(xT2, yT2, 5));
    }
}
