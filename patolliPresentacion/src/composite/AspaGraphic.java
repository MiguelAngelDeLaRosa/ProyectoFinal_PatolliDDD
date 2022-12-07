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
    private int contadorCasillas;
    private int x;
    private int y;
    private List<Graphic> listaDeCasillas;

    public AspaGraphic() {
    }

    public AspaGraphic(Aspa aspa, int contadorCasillas, int x, int y) {
        this.aspa = aspa;
        this.contadorCasillas = contadorCasillas;
        this.x = x;
        this.y = y;
        listaDeCasillas = new ArrayList<>();
    }

    public List<Graphic> getListaDeCasillas() {
        return listaDeCasillas;
    }

    public void setListaDeCasillas(List<Graphic> listaDeCasillas) {
        this.listaDeCasillas = listaDeCasillas;
    }

    public void paint(Graphics g) {
        dibujar(g);
    }

    /**
     * Método el cual define de que lado vamos a dibujar el aspa y manda a
     * llamar al método paint para pintar el aspa en el JPanel.
     *
     * @param g instancia de tipo Graphics para poder dibujar en el JPanel.
     */
    @Override
    public void dibujar(Graphics g) {
        switch (aspa.getTipoDeAspa()) {
            case ("superior"):
                llenarListaDeCasillasDeAspaSuperior(g);
                break;
            case ("inferior"):
                llenarListaDeCasillasDeAspaInferior(g);
                break;
            case ("derecha"):
                llenarListaDeCasillasDeAspaDerecha(g);
                break;
            case ("izquierda"):
                llenarListaDeCasillasDeAspaIzquierda(g);
                break;
        }
    }

    public void llenarListaDeCasillasDeAspaSuperior(Graphics g) {

        int numeroDeCasillasPorAspa = aspa.getNumeroDeCasillasPorAspa();
        int auxX = x;
        int auxY = y;
        int contadorParaObtenerCasillas = 0;
        Casilla casilla;

        //Ciclo para crear las casillas del lado derecho
        for (int i = 0; i < numeroDeCasillasPorAspa - 1; i++) {
            casilla = aspa.getListaDeCasillas().get(contadorParaObtenerCasillas);
            listaDeCasillas.add(new CasillaGraphic(casilla, contadorCasillas, x, y, x + 8, y + 10));
            y -= 50;
            contadorCasillas++;
            contadorParaObtenerCasillas++;
        }

        casilla = aspa.getListaDeCasillas().get(contadorParaObtenerCasillas);
        //Creamos la casilla redonda del lado derecho
        listaDeCasillas.add(new CasillaGraphic(casilla, contadorCasillas, x - 50, y, 0, 90, x + 8, y + 10));
        contadorParaObtenerCasillas++;
        contadorCasillas++;
        
        //Igualamos nuestras variables auxiliares auxX y auxY a los valores de X y Y para comenzar el siguiente ciclo.
        auxY = y;

        //A auxX se le restarán 50 para iniciar a construir las casillas del lado izquierdo
        auxX -= 50;

        casilla = aspa.getListaDeCasillas().get(contadorParaObtenerCasillas);
        //Creamos la casilla redonda del lado izquierdo
        listaDeCasillas.add(new CasillaGraphic(casilla, contadorCasillas, x - 50, y, 90, 90, x - 37, y + 10));
        contadorParaObtenerCasillas++;
        contadorCasillas++;
        
        //Aumentamos en 50 el valor de auxY para continuar con las casillas cuadradas.
        auxY += 50;

        //Ciclo para crear las casillas del lado izquierdo
        for (int j = 0; j < numeroDeCasillasPorAspa - 1; j++) {
            casilla = aspa.getListaDeCasillas().get(contadorParaObtenerCasillas);
            listaDeCasillas.add(new CasillaGraphic(casilla, contadorCasillas, auxX, auxY, x - 42, auxY + 10));
            //Se utiliza el auxY para no modificar la variable y, pues será utilizada para la creación de los triángulos
            auxY += 50;
            contadorCasillas++;
            contadorParaObtenerCasillas++;
        }

        casilla = aspa.getListaDeCasillas().get(contadorParaObtenerCasillas);
        contadorParaObtenerCasillas++;
        //Creamos las casillas triangulares a partir de coordenadas.
        int[] xT = {x, x + 50, x + 50};
        int[] yT = {y + 101, y + 130, y + 70};
        listaDeCasillas.add(new CasillaGraphic(casilla, xT, yT));

        casilla = aspa.getListaDeCasillas().get(contadorParaObtenerCasillas);
        int[] xT2 = {x, x - 50, x - 50};
        int[] yT2 = {y + 101, y + 130, y + 70};
        listaDeCasillas.add(new CasillaGraphic(casilla, xT2, yT2));

        //Llamada al método de impresión.
        imprimirListaDeCasillas(g);
    }

    public void llenarListaDeCasillasDeAspaIzquierda(Graphics g) {
        int numeroDeCasillasPorAspa = aspa.getNumeroDeCasillasPorAspa();
        int auxX = x;
        int auxY = y;
        int contadorParaObtenerCasillas = 0;
        Casilla casilla;

        //Ciclo para crear las casillas superiores
        for (int i = 0; i < numeroDeCasillasPorAspa - 1; i++) {
            casilla = aspa.getListaDeCasillas().get(contadorParaObtenerCasillas);
            listaDeCasillas.add(new CasillaGraphic(casilla, contadorCasillas, x, y, x + 8, y + 10));
            x -= 50;
            contadorCasillas++;
            contadorParaObtenerCasillas++;
        }

        casilla = aspa.getListaDeCasillas().get(contadorParaObtenerCasillas);
        listaDeCasillas.add(new CasillaGraphic(casilla, contadorCasillas, x, y, 90, 90, x + 14, y + 10));
        contadorParaObtenerCasillas++;
        //Igualamos nuestras variables auxiliares auxX y auxY a los valores de X y Y para comenzar el siguiente ciclo.

        auxX = x;
        //A auxY se le sumarán 50 para iniciar a construir las casillas inferiores
        auxY += 50;
        contadorCasillas++;

        casilla = aspa.getListaDeCasillas().get(contadorParaObtenerCasillas);
        listaDeCasillas.add(new CasillaGraphic(casilla, contadorCasillas, x, y, 180, 90, x + 14, auxY + 10));
        contadorCasillas++;
        contadorParaObtenerCasillas++;
        auxX += 50;

        //Ciclo para rear las casillas inferiores
        for (int j = 0; j < numeroDeCasillasPorAspa - 1; j++) {
            casilla = aspa.getListaDeCasillas().get(contadorParaObtenerCasillas);
            listaDeCasillas.add(new CasillaGraphic(casilla, contadorCasillas, auxX, auxY, auxX + 8, auxY + 10));
            //Se utiliza el auxX para no modificar la variable x, pues será utilizada para la creación de los triángulos
            auxX += 50;
            contadorCasillas++;
            contadorParaObtenerCasillas++;
        }

        casilla = aspa.getListaDeCasillas().get(contadorParaObtenerCasillas);
        contadorParaObtenerCasillas++;
        //Creamos las casillas triangulares a partir de coordenadas.
        int[] xT = {x + 70, x + 100, x + 130};
        int[] yT = {y, y + 50, y};
        listaDeCasillas.add(new CasillaGraphic(casilla, xT, yT));

        casilla = aspa.getListaDeCasillas().get(contadorParaObtenerCasillas);
        int[] xT2 = {x + 70, x + 100, x + 130};
        int[] yT2 = {y + 100, y + 50, y + 100};
        listaDeCasillas.add(new CasillaGraphic(casilla, xT2, yT2));
        
        //Llamada al método de impresión.
        imprimirListaDeCasillas(g);
    }
    
    public void llenarListaDeCasillasDeAspaInferior(Graphics g) {

        int numeroDeCasillasPorAspa = aspa.getNumeroDeCasillasPorAspa();
        int auxX = x;
        int auxY = y;
        int contadorParaObtenerCasillas = 0;
        Casilla casilla;

        //Ciclo para crear las casillas del lado derecho
        for (int i = 0; i < numeroDeCasillasPorAspa - 1; i++) {
            casilla = aspa.getListaDeCasillas().get(contadorParaObtenerCasillas);
            listaDeCasillas.add(new CasillaGraphic(casilla, contadorCasillas, x, y, x + 8, y + 10));
            y += 50;
            contadorCasillas++;
            contadorParaObtenerCasillas++;
        }

        casilla = aspa.getListaDeCasillas().get(contadorParaObtenerCasillas);
        //Creamos la casilla redonda del lado derecho
        listaDeCasillas.add(new CasillaGraphic(casilla, contadorCasillas, x, y - 50, 180, 90, x + 10, y + 10));
        contadorParaObtenerCasillas++;
        contadorCasillas++;
        
        //Igualamos nuestras variables auxiliares auxX y auxY a los valores de X y Y para comenzar el siguiente ciclo.
        auxY = y;
        //A auxX se le sumarán 50 para iniciar a construir las casillas del lado derecho
        auxX += 50;

        casilla = aspa.getListaDeCasillas().get(contadorParaObtenerCasillas);
        //Creamos la casilla redonda del lado izquierdo
        listaDeCasillas.add(new CasillaGraphic(casilla, contadorCasillas, x, y - 50, 270, 90, auxX + 5, auxY + 10));
        contadorParaObtenerCasillas++;
        contadorCasillas++;
        
        //Disminuimos en 50 el valor de auxY para continuar con las casillas cuadradas.
        auxY -= 50;

        //Ciclo para crear las casillas del lado izquierdo
        for (int j = 0; j < numeroDeCasillasPorAspa - 1; j++) {
            casilla = aspa.getListaDeCasillas().get(contadorParaObtenerCasillas);
            listaDeCasillas.add(new CasillaGraphic(casilla, contadorCasillas, auxX, auxY, auxX + 8, auxY + 10));
            //Se utiliza el auxY para no modificar la variable y, pues será utilizada para la creación de los triángulos
            auxY -= 50;
            contadorCasillas++;
            contadorParaObtenerCasillas++;
        }

        casilla = aspa.getListaDeCasillas().get(contadorParaObtenerCasillas);
        contadorParaObtenerCasillas++;
        //Creamos las casillas triangulares a partir de coordenadas.
        int[] xT = {x + 50, x + 100, x + 100};
        int[] yT = {y - 50, y - 80, y - 20};
        listaDeCasillas.add(new CasillaGraphic(casilla, xT, yT));
        
        casilla = aspa.getListaDeCasillas().get(contadorParaObtenerCasillas);
        int[] xT2 = {x + 50, x, x};
        int[] yT2 = {y - 50, y - 80, y - 20};
        listaDeCasillas.add(new CasillaGraphic(casilla, xT2, yT2));

        //Llamada al método de impresión.
        imprimirListaDeCasillas(g);
    }
    
    public void llenarListaDeCasillasDeAspaDerecha(Graphics g) {
        int numeroDeCasillasPorAspa = aspa.getNumeroDeCasillasPorAspa();
        int auxX = x;
        int auxY = y;
        int contadorParaObtenerCasillas = 0;
        Casilla casilla;

        //Ciclo para crear las casillas superiores
        for (int i = 0; i < numeroDeCasillasPorAspa - 1; i++) {
            casilla = aspa.getListaDeCasillas().get(contadorParaObtenerCasillas);
            listaDeCasillas.add(new CasillaGraphic(casilla, contadorCasillas, x, y, x + 8, y + 10));
            x += 50;
            contadorCasillas++;
            contadorParaObtenerCasillas++;
        }

        casilla = aspa.getListaDeCasillas().get(contadorParaObtenerCasillas);
        listaDeCasillas.add(new CasillaGraphic(casilla, contadorCasillas, x - 50, y - 50, 270, 90, x + 8, y + 10));
        contadorParaObtenerCasillas++;
        //Igualamos nuestras variables auxiliares auxX y auxY a los valores de X y Y para comenzar el siguiente ciclo.

        auxX = x;
        //A auxY se le sumarán 50 para iniciar a construir las casillas superiores
        auxY -= 50;
        contadorCasillas++;

        casilla = aspa.getListaDeCasillas().get(contadorParaObtenerCasillas);
        listaDeCasillas.add(new CasillaGraphic(casilla, contadorCasillas, x - 50, y - 50, 360, 90, x + 8, auxY + 10));
        contadorCasillas++;
        contadorParaObtenerCasillas++;
        auxX -= 50;

        //Ciclo para rear las casillas inferiores
        for (int j = 0; j < numeroDeCasillasPorAspa - 1; j++) {
            casilla = aspa.getListaDeCasillas().get(contadorParaObtenerCasillas);
            listaDeCasillas.add(new CasillaGraphic(casilla, contadorCasillas, auxX, auxY, auxX + 8, auxY + 10));
            //Se utiliza el auxX para no modificar la variable x, pues será utilizada para la creación de los triángulos
            auxX -= 50;
            contadorCasillas++;
            contadorParaObtenerCasillas++;
        }

        casilla = aspa.getListaDeCasillas().get(contadorParaObtenerCasillas);
        contadorParaObtenerCasillas++;
        //Creamos las casillas triangulares a partir de coordenadas.
        int[] xT = {x - 80, x - 50, x - 20};
        int[] yT = {y - 50, y, y - 50};
        listaDeCasillas.add(new CasillaGraphic(casilla, xT, yT));
        
        casilla = aspa.getListaDeCasillas().get(contadorParaObtenerCasillas);
        int[] xT2 = {x - 80, x - 50, x - 20};
        int[] yT2 = {y + 50, y, y + 50};
        listaDeCasillas.add(new CasillaGraphic(casilla, xT2, yT2));
        
        //Llamada al método de impresión.
        imprimirListaDeCasillas(g);
    }

    /**
     * Recorre la lista de tipo Graphic e imprime cada casilla que se encuentra
     * dentro de la lista.
     *
     * @param g parámetro de tipo Graphics utilizado para pintar las casillas.
     */
    public void imprimirListaDeCasillas(Graphics g) {
        for (Graphic c : listaDeCasillas) {
            c.dibujar(g);
        }
    }

}
