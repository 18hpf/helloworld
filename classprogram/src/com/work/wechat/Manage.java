package com.work.wechat;

import com.work.wechat.loginform.LoginForm;
import com.work.wechat.registerform.RegisterForm;
import com.work.wechat.registerform.RegisterSucceed;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//主函数
public class Manage {

    public static void main(String[] args) {
        //四个窗口对象
        final LoginForm loginForm = new LoginForm();
        final RegisterForm registerForm = new RegisterForm();
        final RegisterSucceed registerSucceed = new RegisterSucceed();
        //final WeCherForm weCherForm = new WeCherForm();
        loginForm.setFrameLoginVisible(true);
        //点击注册跳到注册界面
        loginForm.getRegisterButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //loginForm.dispose();
                registerForm.setFrameRegisterVisible(true);
            }
        });
        //点击back返回登录界面
        registerForm.getBackButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                registerForm.setFrameRegisterVisible(false);
                loginForm.setFrameLoginVisible(true);
            }
        });

        //点击go login 返回登录界面
       registerSucceed.getToLoginButton().addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               loginForm.setFrameLoginVisible(true);
               registerSucceed.setFrameRegisterSucceedVisible(false);
           }
       });

    }

}
