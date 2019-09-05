package h04;

import java.awt.*;
import java.applet.*;

public class ellips extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.YELLOW);
        g.fillArc(600, 200, 600, 600, 360, 360);



    }

}