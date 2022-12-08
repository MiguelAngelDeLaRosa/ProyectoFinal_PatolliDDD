/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servidor;

import com.sun.corba.se.spi.activation.Server;
import dominio.AggregatePartida;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Miguel
 */
public class Servidor {

    private ServerSocket socketServidor;
    private AggregatePartida partida;
    
    /**
     * Constructor que crea el servidor
     * @param partida 
     */
    public Servidor(AggregatePartida partida) {
        try {
            this.partida = partida;
            socketServidor = new ServerSocket(6000);
        } catch (IOException e) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, e);
            cerrarServerSocket();
        }
    }
    
    /**
     * Inicia el servidor para escuhar peticiones de los clientes
     */
    public void iniciarServidor(){
        try {
            while (!socketServidor.isClosed()){
                Socket socket = socketServidor.accept();
                ClienteHilo clienteHilo = new ClienteHilo(socket);
                Thread thread = new Thread(clienteHilo);
                thread.run();
            }
        } catch (IOException e) {
            cerrarServerSocket();
        }
    }
    
    /**
     * Cierra el servidor
     */
    private void cerrarServerSocket() {
        try {
            if (socketServidor != null) {
                socketServidor.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
