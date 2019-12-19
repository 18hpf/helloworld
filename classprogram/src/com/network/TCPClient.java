package com.network;

import java.io.*;
import java.net.Socket;

//字节流，客户端
public class TCPClient {
    public static void main(String[] args) {
        //发送的字符串
        String message = "访问成功\n";
        //这是本机ip
        String serverAddress = "192.168.43.4";
        //端口
        int port = 9998;
        try {
            //新建Socket对象
            Socket socket = new Socket(serverAddress,port);
            //创建字节输出流
            OutputStream os = socket.getOutputStream();
            //写入数据，将字符串转换成字节
            os.write(message.getBytes());
            //创建字节输出流
            InputStream is = socket.getInputStream();
            //建立字节数组存放读取的数据
            byte[] b = new byte[1024];
            int len = is.read(b);
            System.out.println(new String(b,0,len));
            //关闭资源
            is.close();
            os.close();
            socket.shutdownOutput();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
