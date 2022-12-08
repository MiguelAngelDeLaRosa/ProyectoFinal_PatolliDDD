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
    
    /**
     * Se conecta con el servidor
     */
    public void iniciar() {
        try {
            socket = new Socket(this.ipDelServidor, 6000);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    /**
     * Ejerce turno
     */
    public void ejercerTurno(){
        
    }
    
    /**
     * El cliente se desconecta del servidor
     * @param socket 
     */
    public void salirDePartida(Socket socket){
        try {
            if (socket != null){
                socket.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
