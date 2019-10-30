package h13;

import java.applet.Applet;
import java.awt.*;

public class PraktijkOpdracht2 extends Applet {

    public void init(){
        setSize(580,600);

    }
    public void paint(Graphics g){
        int y1=100, width= 70, height=70 ;
        for (int i = 0; i < 20; i++){
            bomen (g, y1, width, height );

        }
        bomen (g, y1, width,height);

    }
        void bomen (Graphics g, int y1, int height, int width){
        g.setColor(new Color(127, 51, 0));
        g.fillRect (y1,y1,20,y1);
        g.fillRect (200,y1,20,y1);
        g.fillRect (300,y1,20,y1);
        g.fillRect (400,y1,20,y1);
        g.fillRect (500,y1,20,y1);

        g.fillRect (y1,350,20,y1);
        g.fillRect (200,350,20,y1);
        g.fillRect (300,350,20,y1);
        g.fillRect (400,350,20,y1);
        g.fillRect (500,350,20,y1);

        g.setColor(Color.GREEN);
        g.fillOval (75, 70 ,width, height);
        g.fillOval (175, 70 ,width, height);
        g.fillOval (275, 70 ,width, height);
        g.fillOval (375, 70 ,width, height);
        g.fillOval (475, 70 ,width, height);

        g.fillOval (75, 300 ,width, height);
        g.fillOval (175, 300 ,width, height);
        g.fillOval (275, 300 ,width, height);
        g.fillOval (375, 300 ,width, height);
        g.fillOval (475, 300 ,width, height);
    }
}
