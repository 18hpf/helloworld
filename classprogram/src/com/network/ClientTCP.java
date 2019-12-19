package com.network;

import java.io.*;
import java.net.Socket;

public class ClientTCP {
    public static void main(String[] args) {
        String message = "访问服务端\n";
        String ip = "192.168.43.4";
        int port = 7777;
        try {
            Socket socket = new Socket(ip,port);
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            bw.write(message);

            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            System.out.println(br.readLine());
            br.close();

            bw.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
