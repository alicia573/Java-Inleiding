package h13;

import java.applet.Applet;
import java.awt.*;

public class Opgave1 extends Applet {

    public void paint (Graphics g ) {
        g.setColor (Color.pink);
        int x1, y1, x2, y2, x3,y3;
        x1 = x2 = x3 = 160;
        y1 = y2 = y3 = 120;
        for (int i = 0; i < 300; i++) {
            driehoek (g, x1, y1, x2, y2, x3, y3);
            x3++;
            x2--;
            y1--;
            y2++;
            y3++;


        }
        g.setColor (Color.black);
        driehoek (g, x1, y1, x2, y2, x3, y3);
    }
    void driehoek (Graphics g, int x1, int y1, int x2, int y2, int x3, int y3){
        g.drawLine (x1, y1, x2, y2);
        g.drawLine(x2,y2,x3,y3);
        g.drawLine(x3,y3,x1,y1);

    }
}
