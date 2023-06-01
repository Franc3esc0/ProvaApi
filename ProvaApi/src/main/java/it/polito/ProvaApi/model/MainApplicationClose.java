package it.polito.ProvaApi.model;

import java.net.ServerSocket;

public class MainApplicationClose {

    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(8080);
            // ... esegui altre operazioni di inizializzazione

            // Termina la comunicazione sulla porta 8080
            serverSocket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
