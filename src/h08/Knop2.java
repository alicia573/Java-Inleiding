package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Knop2 extends Applet {

    public Button man,vrouw,jongeman,jongevrouw;
    int totaalMan = 0, totaalVrouw = 0, totaalJongevrouw = 0, totaalJongeman = 0, totaal = 0;
    public void init() {
        setSize (500, 300);

        man = new Button ("Mannen");
        man.addActionListener (new manListener ());
        add (man);

        vrouw = new Button ("Vrouwen");
        vrouw.addActionListener (new vrouwListener ());
        add (vrouw);

        jongeman = new Button ("jongemannen");
        jongeman.addActionListener (new jongemanListener ());
        add (jongeman);

        jongevrouw = new Button ("Jongevrouwen");
        jongevrouw.addActionListener (new jongevrouwListener ());
        add (jongevrouw);


    }
        public void paint(Graphics g) {
            g.drawString("Aantal Mannen:"+ totaalMan, 50, 120 );
            g.drawString("Aantal Vrouwen:"+ totaalVrouw, 50, 140 );
            g.drawString("Aantal Jongevrouwen:"+ totaalJongevrouw, 50, 160 );
            g.drawString("Aantal Jongemannen:"+ totaalJongeman, 50, 180 );
            g.drawString("Totaal Bezoekers:"+ totaal, 50, 200 );
        }


    class manListener implements ActionListener{
        public void actionPerformed (ActionEvent e) {
            totaal++;
            totaalMan++;
            repaint();


        }
    }
        class vrouwListener implements ActionListener{
            public void actionPerformed (ActionEvent e) {
                totaal++;
                totaalVrouw++;
                repaint();

            }
        }
        class jongemanListener implements ActionListener{
            public void actionPerformed (ActionEvent e) {
                totaal++;
                totaalJongeman++;
                repaint();

            }
        }
        class jongevrouwListener implements ActionListener{
            public void actionPerformed (ActionEvent e) {
                totaal++;
                totaalJongevrouw++;
                repaint();


            }
        }
        class ResetListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                totaalMan = 0;
                totaalVrouw = 0;
                totaalJongevrouw = 0;
                totaalJongeman = 0;
                totaal = 0;
                repaint();
            }
        }


















    }













































