package com.work.wechat.utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class RegisterUtils {
    public boolean registerStatus(String username, String e_mail , String password ){
        boolean result = false;
        String filename = "./users/" + username + ".txt";
        File file = new File(filename);
        try {
            file.createNewFile();
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            String message = username + "\n" + password + "\n" + e_mail;
            bw.write(message);
            bw.close();
            result = true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}
