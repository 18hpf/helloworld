package com.work.wechat.registerform;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
        ToLoginButton.addActionListener(new RegisterAction());

        add(registersucceed);
    }

    class RegisterAction implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            setFrameRegisterSucceedVisible(false);
        }
    }

    public void setFrameRegisterSucceedVisible(boolean visible) {
        setVisible(visible);
    }
}
