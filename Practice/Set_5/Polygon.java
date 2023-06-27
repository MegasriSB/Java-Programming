package Set_5;
import java.awt.*;
import javax.swing.*;
public class Polygon extends JApplet {
    @Override
    public void init(){
	setSize(200, 200);
	show();
    }
    @Override
    public void start(){}
    @Override
    public void stop(){}
    @Override
    public void paint(Graphics g){
        int x[] = { 10, 30, 40, 50, 110, 140 };
        int y[] = { 140, 110, 50, 40, 30, 10 };
        int numberofpoints = 6;
        g.setColor(Color.blue);
        g.drawPolygon(x, y, numberofpoints);
    }
}
