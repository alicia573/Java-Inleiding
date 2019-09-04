package h02;

//Voorbeeld 2.2

import java.awt.*;
import java.applet.*;

    public class Show2 extends Applet {

        public void init() {
            setBackground(Color.blue);
        }

        public void paint(Graphics g) {
            g.setColor(Color.green);
            g.drawString("Welcome to Java!!", 50, 60 );
        }
    }

