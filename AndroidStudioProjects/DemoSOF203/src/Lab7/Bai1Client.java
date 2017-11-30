/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab7;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Bai1Client {
    public static void main(String[] args) {
        try {
            System.out.println("Client is Connecting....");
            Socket socket = new Socket("localhost", 8888);
            System.out.println("Client is Connect");
            DataOutputStream outputStream = new DataOutputStream(
                    socket.getOutputStream());
            DataInputStream inputStream = new DataInputStream(
                    socket.getInputStream());
            while (true) {
                System.out.print("Nhap vao so thu 1: ");
                outputStream.writeDouble(new Scanner(System.in).nextDouble());
                outputStream.flush();
                System.out.print("Nhap vao so thu 2: ");
                outputStream.writeDouble(new Scanner(System.in).nextDouble());
                outputStream.flush();
                System.out.println("Tong 2 so: "+ inputStream.readDouble());
                System.out.print("Tiep tuc?(y/n): ");      
                String traloi = new Scanner(System.in).nextLine();
                if(traloi.equals("n") || traloi.equals("N")){
                    break;
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } 
    }
}
