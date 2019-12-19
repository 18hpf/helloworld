package com.classbook.chapter.work;

import com.wechat.loginform.LoginForm;
import com.wechat.utils.WechatUtils;
import com.wechat.wecharform.WeCherForm;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginAdmin extends JFrame {
    private JPanel panelLogin;
    private JLabel userLable;
    private JTextField userText;
    private JLabel passwordLabel;
    private JPasswordField passwordText;
    private JButton loginButton;
    private JButton registerButton;

    public JButton getLoginButton() {
        return loginButton;
    }
    public JButton getRegisterButton(){
        return registerButton;
    }

    //构造方法
    public LoginAdmin() {
        final String COMMAND_LOGIN = "LOGIN";
        final String COMMAND_REGISTER = "REGISTER";
        setTitle("Login Form");
        setSize(350, 180);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panelLogin = new JPanel();
        panelLogin.setLayout(null);

        userLable = new JLabel("User:");
        userLable.setBounds(10, 20, 80, 25);
        panelLogin.add(userLable);

        userText = new JTextField();
        userText.setBounds(100, 20, 165, 25);
        panelLogin.add(userText);

        passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(10, 50, 80, 25);
        panelLogin.add(passwordLabel);

        passwordText = new JPasswordField();
        passwordText.setBounds(100, 50, 165, 25);
        panelLogin.add(passwordText);

        loginButton = new JButton("Login");
        loginButton.setBounds(10, 80, 100, 25);
        panelLogin.add(loginButton);
        loginButton.addActionListener(new LoginAdmin.LoginEventAction());

        registerButton = new JButton("Register");
        registerButton.setBounds(150, 80, 100, 25);
        panelLogin.add(registerButton);
    }
    class LoginEventAction implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            String username = userText.getText();
            //将字符数组转成字符串
            String password = String.valueOf(passwordText.getPassword());
            WechatUtils wechatUtils = new WechatUtils();
            int result = wechatUtils.loginStatus(username,password);
            switch (result){
                case 1 :
                    WeCherForm weCherForm = new WeCherForm();
                    weCherForm.setFrameWeCherVisible(true);
                    setFrameLoginVisible(false);
                    break;
                case 2 :
                    System.out.println("密码错误");
                    break;
                case 0 :
                    System.out.println("用户名错误，请先注册");
                    break;
            }

        }
    }
    public void setFrameLoginVisible(boolean visible) {
        setVisible(visible);
    }
}
