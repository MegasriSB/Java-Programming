package Lab;
import javax.swing.*;
import java.awt.event.*;
public class LoginPage implements ActionListener{
    JFrame f;
    JButton b1;
    JLabel l1,l2,l3;
    JTextArea f1,f2;
    LoginPage(){
        f = new JFrame();
        b1 = new JButton("Login");
        l1 = new JLabel("User Name:");
        l2 = new JLabel("Password:");
        l3 = new JLabel();
        f1 = new JTextArea();
        f2 = new JTextArea();
        f.add(l1);
        f.add(f1);
        f.add(l2);
        f.add(f2);
        f.add(b1);
        f.add(l3);
        l1.setBounds(50,50,150,20);
        f1.setBounds(50,75,150,20);
        l2.setBounds(50,100,150,40);
        f2.setBounds(50,150,150,20);
        b1.setBounds(50,200,150,40);
        l3.setBounds(20,75,100,20);
        b1.addActionListener(this);
        f.setSize(700,700);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        String s1 = f1.getText();
        String s2 = f2.getText();
        String s3 = "Megasri";
        String s4 = "123456";
        if(s1.equals(s3)){
            if(s2.equals(s4))
            l3.setText("Authorized User");
        }
        else
            l3.setText("Denied Access!!!");
    }
    public static void main(String[] args){
        new LoginPage();
    }
}
