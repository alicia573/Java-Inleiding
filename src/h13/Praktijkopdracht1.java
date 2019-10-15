package h13;

import java.applet.Applet;
import java.awt.*;

public class Praktijkopdracht1 extends Applet {

    public void init(){

        setSize(500,300);


    }
    public void paint(Graphics g) {
        int y1=100, y2=70;
        for (int i = 0; i < 20; i++) {
            bomen (g,  y1,  y2 );
            y1++;
            y2++;

        }

        bomen  (g, y1, y2);
    }
        void bomen ( Graphics g,  int y1,int y2){
        g.setColor(new Color(127, 51, 0));
        g.fillRect (100,y1,20,100);
        g.fillRect (200,y1,20,100);
        g.fillRect (300,y1,20,100);
        g.fillRect (400,y1,20,100);

        g.setColor(Color.GREEN);
        g.fillOval (75, y2 ,70, 70);
        g.fillOval (175, y2 ,70, 70);
        g.fillOval (275, y2 ,70, 70);
        g.fillOval (375, y2 ,70, 70);

    }
}
