package Set_3;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Traffic implements ActionListener{
    JFrame f;
    JRadioButtonMenuItem r1, r2, r3;
    JLabel L1;
    Font f1 = new Font(Font.SERIF, Font.BOLD, 30);
    Font f2 = new Font(Font.SERIF, Font.BOLD, 20);
    Traffic(){
        f = new JFrame("Traffic Lights");
        L1 = new JLabel();
        L1.setFont(f1);
        r1 = new JRadioButtonMenuItem("Red");
        r2 = new JRadioButtonMenuItem("Yellow");
        r3 = new JRadioButtonMenuItem("Green");  
        r1.setFont(f2);
        r2.setFont(f2);
        r3.setFont(f2);
        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        bg.add(r3);
        f.add(L1);
        f.add(r1);
        f.add(r2);
        f.add(r3);
        r1.addActionListener(this);
        r2.addActionListener(this);
        r3.addActionListener(this);
        f.setSize(1000,1000);
        f.setLayout(new FlowLayout());        
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        Color c= Color.black;
        String s = "";          
        if(e.getSource()==r1){  
            s= "Stop";
            c= Color.red;
        }
        if(e.getSource()==r2){
            s = "Ready";
            c = Color.yellow;
        }
        if(e.getSource()==r3){
            s = "Go";
            c = Color.green;
        }      
        L1.setText(s);
        L1.setForeground(c);  
    }
    public static void main(String as[]){
        new Traffic();
    }
}
