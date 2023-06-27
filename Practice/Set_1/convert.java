package Set_1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class convert implements ActionListener
{
    JFrame f;
    JLabel L1, L2;
    JTextField tf1, tf2;
    JButton b1;
    Font f1 = new Font(Font.SERIF, Font.BOLD, 20);
    convert()
    {
        f = new JFrame("Converter");
        L1 = new JLabel("Enter the Miles");
        L2 = new JLabel("Kilometers");
        L1.setFont(f1);
        L2.setFont(f1);
        tf1=new JTextField(15);
        tf2=new JTextField(15);
        tf1.setFont(f1);
        tf2.setFont(f1);
        b1 = new JButton("Convert");
        b1.setFont(f1);
        f.add(L1);
        f.add(tf1);
        f.add(L2);
        f.add(tf2);
        f.add(b1);
        f.setLayout( new FlowLayout());
        b1.addActionListener(this);
        f.setSize(1000,1000);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    @Override
    public void actionPerformed(ActionEvent ae)
    {
        double m = Double.parseDouble(tf1.getText());
        double km = m*1.609;
        tf2.setText(Double.toString(km));
    }
    public static void main(String args[])
    {
        new convert();
    }
}


