package com.work.wechat.registerform;

import com.work.wechat.utils.RegisterUtils;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//登录成功的窗口类
public class RegisterForm extends JFrame{
    private JPanel registerPanel;
    private JLabel usernameLabel;
    private JTextField usernameTextField;
    private JLabel emailLabel;
    private JTextField emailTextField;
    private JLabel passwordLable;
    private JTextField passwordTextField;
    private JLabel otarizePasswordLable;
    private JTextField otarizePasswordTextField;

    private JButton registerButton;
    private JButton backButton;

    public JButton getBackButton() {
        return backButton;
    }
    public JButton getregisterButton(){
        return registerButton;
    }
    //构造方法
    public RegisterForm(){
        setTitle("Login Form");
        setSize(380,250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        registerPanel = new JPanel();
        registerPanel.setLayout(null);
        usernameLabel = new JLabel("Change administrator password:");
        usernameLabel.setBounds(30,20,250,25);
        registerPanel.add(usernameLabel);
        emailLabel = new JLabel("password:");
        emailLabel.setBounds(10,50,80,25);
        registerPanel.add(emailLabel);
        emailTextField = new JTextField();
        emailTextField.setBounds(120,50,165,25);
        registerPanel.add(emailTextField);
        registerButton = new JButton("modification");
        registerButton.setBounds(20,140,110,25);
        registerPanel.add(registerButton);
        registerButton.addActionListener(new RegisterAction());
        backButton = new JButton("back");
        backButton.setBounds(160,140,110,25);
        registerPanel.add(backButton);
        add(registerPanel);
    }
    class RegisterAction implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            boolean result;
            String name, e_mail ,password ,otarizePassword;
            name = usernameTextField.getText();
            e_mail = emailTextField.getText();
            password = passwordTextField.getText();
            otarizePassword = otarizePasswordTextField.getText();
            if(password.equals(otarizePassword)){
                RegisterUtils registerUtils = new RegisterUtils();
                result = registerUtils.registerStatus(name,e_mail,password);
                System.out.println("修改成功");
                setFrameRegisterVisible(false);
            }
            else{
                System.out.println("两次密码不一致，请重新输入");
            }
        }
    }
    public void setFrameRegisterVisible(boolean visible) {
        setVisible(visible);
    }
}
