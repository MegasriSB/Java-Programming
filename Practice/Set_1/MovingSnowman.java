package Set_1;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class MovingSnowman extends JPanel{
    int midX = 220;
    int midY = 280;
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        setBackground(new Color(40,144,0));
        g.setColor (Color.white);
        g.fillOval (midX-20, midY-60, 40, 40); // head
        g.fillOval (midX-35, midY-25, 70, 50); // upper body
        g.fillOval (midX-50, midY+20, 100, 60); // lower body
        g.setColor (Color.black);
        g.fillOval (midX-10, midY-50, 5, 5); // left eye
        g.fillOval (midX+5, midY-50, 5, 5); // right eye
        g.drawArc (midX-10, midY-40, 20, 10, 190, 160); // smile
    }
    public static void main(String args[]){
        JFrame f = new JFrame("Moving Snowman");
        f.add(new MovingSnowman());
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(500,500);
        f.setVisible(true);
    }
}