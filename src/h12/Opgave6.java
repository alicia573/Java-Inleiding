package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Opgave6 extends Applet{
    boolean found  ;
    int [] salary = {100,400,200,300,200,500,300,100,100,200,};
    int find, salaryamount;
    Button okButton;
    TextField text;
    public void init(){
        setSize (500,300);
        salaryamount = 0;
        find = 0;
        found = false;
        okButton = new Button ("OK");
        add (okButton);
        okButton.addActionListener (new okButtonListener());
        text = new TextField ("",10);
        add(text);

    }
    public void paint (Graphics g){
        if (found){
            g.drawString (" The value " + find + " was found. "+ salaryamount +" times ", 20,60);
            found = false;
            salaryamount = 0;
        } else{
            g.drawString (" the value " + find + " was not found." , 20, 60);
        }

    }
    class okButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            String number = text.getText ();
            find = Integer.parseInt (number);
            int index = 0;
            while (index < salary.length){
                if (salary[index] == find ){
                    found = true;
                    salaryamount ++;
                }
                index++;
            }
          text.setText ("");
            repaint ();
        }
    }
}