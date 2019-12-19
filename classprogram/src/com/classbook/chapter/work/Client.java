package com.classbook.chapter.work;

import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws Exception{
        PrintWriter out=null;
        Scanner get = null;
        Socket client=new Socket("192.168.43.4",8888);
        get = new Scanner(client.getInputStream());
        out = new PrintWriter(client.getOutputStream());
        new SocketReader(get).start();
        new SocketWrite(out).start();

    }
}

