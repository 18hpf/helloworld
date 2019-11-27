package com.gsjk.user;

import com.gsjk.DefaultValue.DefaultValue;

import java.io.*;


public class UserDaoImpl implements UserDao {

    public UserInfo findUserInfoByName(String username) {
        // get user information from the files
        UserInfo userInfo = new UserInfo();
        try {
            if (username == null || username.length() == 0) {
                throw new Exception();
            }
            String filename = DefaultValue.FILEPATH + username + DefaultValue.FILETYPE;
            File file =new File(filename);
            if(!file.exists()){
                throw new Exception();
            }
            BufferedReader in = new BufferedReader(new FileReader(file));
            String findName = in.readLine();
            String findPassword = in.readLine();
            userInfo.setUsername(findName);
            userInfo.setPassword(findPassword);
        }catch (IOException e){
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
        return userInfo;
    }

    public boolean saveUser(UserInfo userInfo) {
        // save user information in txt file which is named by user name
        boolean result = false;
        try {
            if (userInfo.getUsername() == null || userInfo.getUsername().length() == 0) {
                throw new Exception();
            }
            String filename = DefaultValue.FILEPATH + userInfo.getUsername() + DefaultValue.FILETYPE;
            String content = userInfo.getUsername() + "\n" + userInfo.getPassword();
            File file =new File(filename);
            if(file.exists()){
                throw new Exception();
            }
            file.createNewFile();//自动创建一个新的空文件命名的抽象路径名的当且仅当该文件不存在。
            BufferedWriter out = new BufferedWriter(new FileWriter(file,true));
            out.write(content);
            out.close();
            result = true;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
