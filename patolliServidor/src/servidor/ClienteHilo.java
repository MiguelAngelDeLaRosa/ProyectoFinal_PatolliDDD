/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servidor;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Observable;

/**
 *
 * @author Miguel
 */
public class ClienteHilo extends Observable implements Runnable  {
    
    private Socket socket;
    private String nombreDeUsuario;
    private DataInputStream in;

    public ClienteHilo(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            System.out.println("hola");
            String mensaje;
            in = new DataInputStream(socket.getInputStream());
            
            while(socket.isConnected()){
                mensaje = in.readUTF();
            }
            
        } catch (IOException e) {
            cerrarTodo(socket);
        }
    }
    
    public void cerrarTodo(Socket socket){
        try {
            if (socket != null){
                socket.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
