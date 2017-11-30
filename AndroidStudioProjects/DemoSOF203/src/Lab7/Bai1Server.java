/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab7;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Administrator
 */
public class Bai1Server {
    public static void main(String[] args) {
         try {
            ServerSocket serverSocket = new ServerSocket(8888);
            System.out.println("Server is connecting....");
            Socket socket = serverSocket.accept();
            System.out.println("Server is connect");
            DataInputStream inputStream = new DataInputStream(
                    socket.getInputStream());
            DataOutputStream outputStream = new DataOutputStream(
                    socket.getOutputStream());
            while (true) {
                double number1 = inputStream.readDouble();
                double number2 = inputStream.readDouble();
                System.out.println("2 Số nhận được từ Client là "+ number1+ " "
                        +number2);
                double sum = number1+number2;
                outputStream.writeDouble(sum);
                outputStream.flush();
                System.out.println("Tong 2 so la: "+ sum);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
