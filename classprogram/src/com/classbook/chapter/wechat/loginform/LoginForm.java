package com.classbook.chapter.wechat.loginform;

import com.classbook.chapter.eight.Register;

import javax.swing.*;

//登录的窗口类
public class LoginForm extends JFrame {

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
    public LoginForm() {
        final String COMMAND_LOGIN = "LOGIN";
        final String COMMAND_REGISTER = "REGISTER";
        setTitle("Login Form");
        setSize(350,180);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panelLogin = new JPanel();
        panelLogin.setLayout(null);

        userLable = new JLabel("User:");
        userLable.setBounds(10,20,80,25);
        panelLogin.add(userLable);

        userText = new JPasswordField();
        userText.setBounds(100,20,165,25);
        panelLogin.add(userText);

        passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(10,50,80,25);
        panelLogin.add(passwordLabel);

        passwordText = new JPasswordField();
        passwordText.setBounds(100,50,165,25);
        panelLogin.add(passwordText);

        loginButton = new JButton("Login");
        loginButton.setBounds(10,80,100,25);
        //loginButton.setActionCommand(COMMAND_LOGIN);
        panelLogin.add(loginButton);

        registerButton = new JButton("Register");
        registerButton.setBounds(150,80,100,25);
        //registerButton.setActionCommand(COMMAND_REGISTER);
        panelLogin.add(registerButton);

        /*
        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //获取动作命令
                String command = e.getActionCommand();
                if(command.equals(COMMAND_LOGIN)){
                    System.out.println("OK 登录按钮被点击");
                    //JOptionPane.showMessageDialog(null,"请输入账号密码","出错了",JOptionPane.ERROR_MESSAGE);
                    //创建一个新的窗口
                    WeCherForm loginSucceed = new WeCherForm();
                }
                else if(command.equals(COMMAND_REGISTER)){
                    System.out.println("OK 注册按钮被点击");
                    //创建一个注册的新窗口
                    Register registerForm = new Register();
                }
                else{
                    System.out.println("Cancel 按钮被点击");
                }
            }
        };
        loginButton.addActionListener(actionListener);
        registerButton.addActionListener(actionListener);
        */
        add(panelLogin);

    }

    /**
     * Description:设置界面可见
     * @param visible
     * Author: HuangPeiFeng
     * Date:2019/11/11 7:41 下午
     */
    public void setFrameLoginVisible(boolean visible) {
        setVisible(visible);
    }
}
