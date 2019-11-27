package com.wechat;

import com.wechat.loginform.LoginForm;
import com.wechat.registerform.RegisterForm;
import com.wechat.registerform.RegisterSucceed;
import com.wechat.wecharform.WeCherForm;

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

        //以下为各按钮的监听
        //点击登录跳到登陆成功界面
//        loginForm.getLoginButton().addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                //WeCherForm weCherForm = new WeCherForm();
//                weCherForm.setFrameWeCherVisible(true);
//                loginForm.setFrameLoginVisible(false);
//            }
//        });
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
        //点击注册跳到注册成功页面
//        registerForm.getregisterButton().addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                //RegisterSucceed registerSucceed = new RegisterSucceed();
//                registerSucceed.setFrameRegisterSucceedVisible(true);
//                registerForm.dispose();
//            }
//        });
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
