/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package infraestructura;

import java.io.IOException;
import java.net.Socket;

/**
 *
 * @author MIguel
 */
public class Cliente {

    private Socket socket;
    private String nombreDeUsuario;
    private String ipDelServidor;

    public Cliente(String nombreDeUsuario, String ipDelServidor) {
        this.nombreDeUsuario = nombreDeUsuario;
        this.ipDelServidor = ipDelServidor;
    }

    public void iniciar() {
        try {
            socket = new Socket(this.ipDelServidor, 6000);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        Cliente c = new Cliente("Miguel", "localhost");
        c.iniciar();
    }

}
