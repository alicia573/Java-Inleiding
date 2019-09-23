package h13;

import java.applet.Applet;
import java.awt.*;

public class Praktijkopdracht1 extends Applet {

    public void init(){
        setSize(500,300);

    }
    public void paint(Graphics g){
        g.setColor(new Color(127, 51, 0));
        g.fillRect (100,100,20,100);
        g.fillRect (200,100,20,100);
        g.fillRect (300,100,20,100);
        g.fillRect (400,100,20,100);

        g.setColor(Color.GREEN);
        g.fillOval (75, 70 ,70, 70);
        g.fillOval (175, 70 ,70, 70);
        g.fillOval (275, 70 ,70, 70);
        g.fillOval (375, 70 ,70, 70);

    }
}
