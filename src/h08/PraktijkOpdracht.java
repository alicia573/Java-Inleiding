package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class PraktijkOpdracht extends Applet {
    Button maal, plus, delen, aftrekken;
    TextField invoervak1, invoervak2, resultaat;
    double invoergetal1, invoergetal2, resultaatgetal;



    public void init() {
        invoervak1 = new TextField( 12 );
        invoervak2 = new TextField( 12 );
        resultaat = new TextField( 12 );

        delen = new Button("/");
        delen.addActionListener( new delenHandler () );

        maal = new Button("*");
        maal.addActionListener( new maalHandler () );

        aftrekken = new Button("-");
        aftrekken.addActionListener( new aftrekkenHandler ());

        plus = new Button("+");
        plus.addActionListener( new plusHandler () );

        add(delen);
        add(maal);
        add(aftrekken);
        add(plus);
        add( invoervak1 );
        add( invoervak2 );
        add (resultaat);

    }
    class maalHandler implements ActionListener
    {

        public void actionPerformed( ActionEvent e )
        {
            String invoer1 = invoervak1.getText();
            invoergetal1 = Double.parseDouble( invoer1 );

            String invoer2 = invoervak2.getText();
            invoergetal2 = Double.parseDouble( invoer2 );

            resultaatgetal = invoergetal1 * invoergetal2;
            resultaat.setText( "" + resultaatgetal );
        }
    }
    class plusHandler implements ActionListener
    {
        public void actionPerformed( ActionEvent e )
        {
            String invoer1 = invoervak1.getText();
            invoergetal1 = Double.parseDouble( invoer1 );

            String invoer2 = invoervak2.getText();
            invoergetal2 = Double.parseDouble( invoer2 );

            resultaatgetal = invoergetal1 + invoergetal2;
            resultaat.setText( "" + resultaatgetal );
        }

    }
    class delenHandler implements ActionListener
    {
        public void actionPerformed( ActionEvent e )
        {
            String invoer1 = invoervak1.getText();
            invoergetal1 = Double.parseDouble( invoer1 );

            String invoer2 = invoervak2.getText();
            invoergetal2 = Double.parseDouble( invoer2 );

            resultaatgetal = invoergetal1 / invoergetal2;
            resultaat.setText( "" + resultaatgetal );
        }

    }
    class aftrekkenHandler implements ActionListener
    {
        public void actionPerformed( ActionEvent e )
        {
            String invoer1 = invoervak1.getText();
            invoergetal1 = Double.parseDouble( invoer1 );

            String invoer2 = invoervak2.getText();
            invoergetal2 = Double.parseDouble( invoer2 );

            resultaatgetal = invoergetal1 - invoergetal2;
            resultaat.setText( "" + resultaatgetal );
        }

    }


















}


