package h14;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PraktijkOpdracht extends Applet {
    Button speelButton;
    TextField numbersfield;
    Label label;
    boolean foutmelding;
    


    public void init (){
        setSize(900,700);
        label= new Label("Welke nummer kies je(1, 2 of 3)?");
        add(label);
        numbersfield= new TextField ("     ");
        add(numbersfield);
        speelButton= new Button("Speel");
        speelButton.addActionListener (new speelButtonListener ());
        add(speelButton);

    }
    public void paint (Graphics g){

        for( int numbersfield=0; numbersfield<4; numbersfield++){


        }

    }
    class speelButtonListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {



        }
    }

}
