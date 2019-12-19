package com.work.wechat.utils;

import java.io.*;

//用户名密码正确返回1，用户名错误返回0，密码错误返回2
public class WechatUtils {
    public int loginStatus(String username,String userPassword){
        int result = 1 ;
        String filename = "./users/" + username + ".txt";
        File file = new File(filename);
        if (file.exists()){
            try {
                BufferedReader br = new BufferedReader(new FileReader(file));
                String name = br.readLine();
                String password = br.readLine();
                br.close();
                if (!username.equals(name)){
                    return 0;
                }
                if (!userPassword.equals(password)) {
                    return 2;
                }
                if (username.equals(name) && userPassword.equals(password)){
                    return 1;
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        return 0;
    }
}
