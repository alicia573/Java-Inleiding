package h13;

import java.applet.Applet;
import java.awt.*;

public class Praktijkopdracht2 extends Applet {

    public void init(){
        setSize(580,600);

    }
    public void paint(Graphics g){
        g.setColor(new Color(127, 51, 0));
        g.fillRect (100,100,20,100);
        g.fillRect (200,100,20,100);
        g.fillRect (300,100,20,100);
        g.fillRect (400,100,20,100);
        g.fillRect (500,100,20,100);

        g.fillRect (100,350,20,100);
        g.fillRect (200,350,20,100);
        g.fillRect (300,350,20,100);
        g.fillRect (400,350,20,100);
        g.fillRect (500,350,20,100);

        g.setColor(Color.GREEN);
        g.fillOval (75, 70 ,70, 70);
        g.fillOval (175, 70 ,70, 70);
        g.fillOval (275, 70 ,70, 70);
        g.fillOval (375, 70 ,70, 70);
        g.fillOval (475, 70 ,70, 70);

        g.fillOval (75, 300 ,70, 70);
        g.fillOval (175, 300 ,70, 70);
        g.fillOval (275, 300 ,70, 70);
        g.fillOval (375, 300 ,70, 70);
        g.fillOval (475, 300 ,70, 70);
    }
}
