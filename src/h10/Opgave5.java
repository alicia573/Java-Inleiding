package h10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Opgave5 extends Applet {

     double cijfer;
    TextField tekstvak;
    Label label;
    String tekst;



    public void init() {
        tekstvak = new TextField("", 5);
        tekstvak.addActionListener( new VakListener() );
        tekst = "";

        label = new Label("Wat is je cijfer? " );

        add( label );
        add( tekstvak );
    }

    public void paint(Graphics g) {
        g.drawString(tekst, 50, 45 );
    }

    class VakListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            String s;

            s = tekstvak.getText();
            cijfer = Integer.parseInt( s );
            if ( cijfer > 5 ) {
                tekst = "voldoende";
                repaint();
            }
            if ( cijfer  < 5 ) {
                tekst = "onvoldoende";
                repaint();
            }
        }
    }


}