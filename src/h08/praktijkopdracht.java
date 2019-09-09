package h08;

import java.awt.*;
import java.applet.*;
import javax.swing.*;


public class praktijkopdracht extends Applet {
    double a,b,c,d,e, uitkomst;

    int decimaalgetal;
      public void init () {
          a = 59;
          b = 63;
          c = 69;
          d = 3;
          e = 10;


          uitkomst = (a + b + c)/e/d;


      }

      public void paint(Graphics g) {
          g.drawString("uitkomst = "+ uitkomst, 50, 50);






}

}
