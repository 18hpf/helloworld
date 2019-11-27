package com.wechat.registerform;

import com.wechat.utils.RegisterUtils;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//注册的窗口类
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

        setTitle("Register Form");
        setSize(380,250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        registerPanel = new JPanel();
        registerPanel.setLayout(null);

        usernameLabel = new JLabel("username:");
        usernameLabel.setBounds(10,20,80,25);
        registerPanel.add(usernameLabel);

        usernameTextField = new JTextField();
        usernameTextField.setBounds(120,20,165,25);
        registerPanel.add(usernameTextField);

        emailLabel = new JLabel("e-mail:");
        emailLabel.setBounds(10,50,80,25);
        registerPanel.add(emailLabel);

        emailTextField = new JTextField();
        emailTextField.setBounds(120,50,165,25);
        registerPanel.add(emailTextField);

        passwordLable = new JLabel("password:");
        passwordLable.setBounds(10,80,80,25);
        registerPanel.add(passwordLable);

        passwordTextField = new JTextField();
        passwordTextField.setBounds(120,80,165,25);
        registerPanel.add(passwordTextField);

        otarizePasswordLable = new JLabel("otarize-password:");
        otarizePasswordLable.setBounds(10,110,120,25);
        registerPanel.add(otarizePasswordLable);

        otarizePasswordTextField = new JTextField();
        otarizePasswordTextField.setBounds(120,110,165,25);
        registerPanel.add(otarizePasswordTextField);

        registerButton = new JButton("Register");
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
                System.out.println("注册成功");
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
