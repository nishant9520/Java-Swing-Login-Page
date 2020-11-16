

import java.awt.Color;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Container; 
import java.awt.Font;

public final class Login extends JFrame implements ActionListener {
 
     
    Container container = getContentPane();
    JLabel userLabel = new JLabel("USERNAME");
    JLabel passwordLabel = new JLabel("PASSWORD");
    JTextField userTextField = new JTextField();
    JPasswordField passwordField = new JPasswordField();
    JButton loginButton = new JButton("LOGIN");
    JButton resetButton = new JButton("RESET");
    JCheckBox showPassword = new JCheckBox("Show Password");
    Font  f1  = new Font(Font.SERIF, Font.BOLD,  15);
    Font  f2  = new Font(Font.SERIF, Font.BOLD,  20);
 
    Login() {
        setLayout(null);
        setTitle("Login Form");
        setVisible(true);
        setSize(370,400);
        setLocation(500,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false); 
        //   Method 
        addLocationAndSize();
        addComponentsToContainer();
        addActionEvent();
        addComponentsFont();
        addContainerMethod();
    }
   public  void addContainerMethod(){
       container.setBackground(Color.yellow); 
   }
    public void addLocationAndSize() {
        userLabel.setBounds(50, 50, 100, 30);
        passwordLabel.setBounds(50, 100, 100, 30);
        userTextField.setBounds(150, 50, 150, 30);
        passwordField.setBounds(150, 100, 150, 30);
        showPassword.setBounds(150, 140, 150, 30);
        loginButton.setBounds(50, 200, 100, 30);
        resetButton.setBounds(200, 200, 100, 30);
    }
 
    public void addComponentsToContainer() {
        container.add(userLabel);
        container.add(passwordLabel);
        container.add(userTextField);
        container.add(passwordField);
        container.add(showPassword);
        container.add(loginButton);
        container.add(resetButton);
    }
 
    public void addActionEvent() {
        loginButton.addActionListener(this);
        resetButton.addActionListener(this);
        showPassword.addActionListener(this);
    }
  public void addComponentsFont(){
      userLabel.setFont(f1);
      passwordLabel.setFont(f1);
      userTextField.setFont(f1);
      passwordField.setFont(f1);
      showPassword.setFont(f1);
      loginButton.setFont(f2);
      resetButton.setFont(f2);
  }
 
    @Override
    public void actionPerformed(ActionEvent e) {
        //Coding Part of LOGIN button
        if (e.getSource() == loginButton) {
            String userText =userTextField.getText();
            String pwdText =passwordField.getText();
   
            if (userText.equalsIgnoreCase("a") && pwdText.equalsIgnoreCase("a")) {
                    JOptionPane.showMessageDialog(null, "Login Successful"); 
    
                      setVisible(false);
              } else {   JOptionPane.showMessageDialog(null, "Invalid Username or Password");  }
        }

        //Coding Part of RESET button
        if (e.getSource() == resetButton) {  userTextField.setText("");   passwordField.setText("");   }
       //Coding Part of showPassword JCheckBox
        if (e.getSource() == showPassword) {   if (showPassword.isSelected()) {   passwordField.setEchoChar((char) 0);
              } else {    passwordField.setEchoChar('*');  }
        }
    }
}