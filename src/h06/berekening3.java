package h06;


import java.awt.*;
import java.applet.*;

public class berekening3 extends Applet {
    int a;
    int b;



    int uitkomst;

    public void init () {

        a= 9;
        b= 16;

        uitkomst= (9-16);
    }
    public void paint(Graphics g) {
        g.drawString("Antwoord= "+uitkomst, 50, 50);



    }






}
