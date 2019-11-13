package com.classbook.chapter.wechat.registerform;

import javax.swing.*;

//注册成功的窗口类
public class RegisterSucceed extends JFrame {
    private JPanel registersucceed;
    private JButton ToLoginButton;

    public JButton getToLoginButton() {
        return ToLoginButton;
    }

    public RegisterSucceed(){
        setTitle("Register Succeed");
        setSize(300,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        registersucceed = new JPanel();
        registersucceed.setLayout(null);

        ToLoginButton = new JButton("go login");
        ToLoginButton.setBounds(50,50,120,30);
        registersucceed.add(ToLoginButton);

        add(registersucceed);
    }
    public void setFrameRegisterSucceedVisible(boolean visible) {
        setVisible(visible);
    }
}
