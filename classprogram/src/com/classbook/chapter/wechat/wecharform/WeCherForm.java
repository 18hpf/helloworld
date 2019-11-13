package com.classbook.chapter.wechat.wecharform;

import javax.swing.*;

//登录成功的窗口类
public class WeCherForm extends JFrame {

    //构造方法
    public WeCherForm(){
        setTitle("Login Succeed");
        setSize(450,250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void setFrameWeCherVisible(boolean visible) {
        setVisible(visible);
    }
}
