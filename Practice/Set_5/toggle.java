package Set_5;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class toggle implements MouseListener
{
    JFrame f;
    toggle(){
        f=new JFrame("Toggle");
        f.getContentPane().setBackground(Color.black);
        f.setSize(300,300);
        f.setVisible(true);
        f.addMouseListener(this);
    }
    @Override
    public void mouseClicked(MouseEvent e){
        if(e.getClickCount()%2==0)
            f.getContentPane().setBackground(Color.red);  
        else
            f.getContentPane().setBackground(Color.CYAN);           
    }
    @Override
    public void mousePressed(MouseEvent e) {}
    @Override
    public void mouseReleased(MouseEvent e) {}
    @Override
    public void mouseEntered(MouseEvent e) {}
    @Override
    public void mouseExited(MouseEvent e) {}
    public static void main(String[] args){
        new toggle();
    }
}

