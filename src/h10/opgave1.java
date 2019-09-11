//Voorbeeld 8.7
package h10;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class opgave1 extends Applet {
    TextField tekstvak;
    Label label;
    double getal;

    public void init() {
        tekstvak = new TextField ("", 20);
        label = new Label ("Type een getal");
        tekstvak.addActionListener (new TekstvakListener ());
        add (label);
        add (tekstvak);
    }

    public void paint(Graphics g) {
        g.drawString ("Het getal is " + getal, 50, 60);

        {
            g.drawString ("" + 6 + " is groter dan " + 5 + " en kleiner dan " +
                    8 + ": " + (6 > 5 && 6 < 8), 50, 60);
            g.drawString ("" + 6 + " is groter dan " + 5 + " en groter dan " +
                    8 + ": " + (6 > 5 && 6 > 8), 50, 80);
            g.drawString ("" + 6 + " is kleiner dan " + 5 + " en groter dan " +
                    8 + ": " + (6 < 5 && 6 > 8), 50, 100);
            g.drawString ("" + 6 + " is kleiner dan " + 5 + " en kleiner dan " +
                    8 + ": " + (6 < 5 && 6 < 8), 50, 120);
        }
    }


    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText ();
            getal = Double.parseDouble (s);

            repaint ();
        }
    }
}


