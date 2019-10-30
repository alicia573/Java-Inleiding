package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Knop1 extends Applet{
    public Button knop;
    public Button knop2;
    public TextField tekstvak;
    public String OK,Reset;
    String schermtekst;
    public void init() {
        tekstvak = new TextField("OK ", 40);
        knop = new Button("Reset");
        knop.addActionListener( new KnopListener() );
        knop2 = new Button("Ok");
        knop2.addActionListener( new Knop2Listener() );
        add(knop);
        add(knop2);
        OK ="";
        Reset = "";
        tekstvak = new TextField("Type een verhaal.", 20);
        add(tekstvak);



    }


    public void paint(Graphics g) {
        g.drawString ("" + OK, 100, 100);
    }

    class KnopListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            tekstvak.setText(" ");
            OK= tekstvak.getText();

            repaint();
        }
    }

    class Knop2Listener implements ActionListener {
        public void actionPerformed( ActionEvent e) {

            schermtekst = "Ja, deze knop doet wel iets";
            Reset = tekstvak.getText();
            repaint();
        }
    }


}