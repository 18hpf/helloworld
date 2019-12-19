package com.network;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

//字节流，服务端
public class TCPServer {
    public static void main(String[] args) {
        int port = 9998;
        String message = "回复成功\n";
        try {
            //创建 ServerSocket对象，绑定端口，开始等待连接
            ServerSocket serverSocket = new ServerSocket(port);
            //设置监听，接收连接accept方法,返回socket对象.
            Socket socket = serverSocket.accept();

            InputStream is = socket.getInputStream();
            byte[] b = new byte[1024];
            int len = is.read(b);
            System.out.println(new String(b,0,len));

            OutputStream os = socket.getOutputStream();
            os.write(message.getBytes());
            //关闭资源
            is.close();
            os.close();
            socket.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
