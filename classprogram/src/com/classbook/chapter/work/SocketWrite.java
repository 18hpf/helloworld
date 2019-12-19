package com.classbook.chapter.work;

import java.io.PrintWriter;
import java.util.Scanner;

public class SocketWrite extends Thread{

    private Scanner scanner;
    private PrintWriter out;
    private Scanner get_key = null;
    public SocketWrite(PrintWriter out){
        this.out=out;
    }
    public void  run(){
        out.println("已成功连接到远程服务器！");
        out.flush();//将缓冲流中的数据全部输出
        while(true){
            try{
                get_key = new Scanner(System.in);
                String msg=get_key .nextLine();
                out.println(msg);
                out.flush();
                //    System.out.println("请输入消息：");
            }catch(Exception e){
                System.out.println("连接已断开！");
                return;
            }
        }
    }
}

