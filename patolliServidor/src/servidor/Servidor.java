/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servidor;

import com.sun.corba.se.spi.activation.Server;
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

    public Servidor() {
        try {
            socketServidor = new ServerSocket(6000);
        } catch (IOException e) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, e);
            cerrarServerSocket();
        }
    }
    
    public void iniciarServidor(){
        try {
            while (!socketServidor.isClosed()){
                Socket socket = socketServidor.accept();
                ClienteHilo clienteHilo = new ClienteHilo(socket);
                Thread thread = new Thread(clienteHilo);
                thread.run();
            }
        } catch (Exception e) {
        }
    }

    private void cerrarServerSocket() {
        try {
            if (socketServidor != null) {
                socketServidor.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        Servidor s = new Servidor();
        s.iniciarServidor();
    }

}
