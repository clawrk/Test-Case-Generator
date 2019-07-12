/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testcasegenerator;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class window extends JFrame{

    private Button b4;
    private Button b1,b2,b3,b5;
    window()
    {
        b1=new Button("    Arrays   ");
        b2=new Button("    Trees    ");
        b3=new Button("    Graphs    ");
        b4=new Button("    Strings    ");
        b5=new Button("    Random numbers    ");
        b1.setBounds(20,20,100,30);
        b2.setBounds(20,110,100,30);
        b3.setBounds(130,20,100,30);
        b4.setBounds(130,110,100,30);
        b5.setBounds(20,180,150,30);
        add(b4); add(b2) ; add(b3) ; add(b1) ; add(b5);
        thehandler handler=new thehandler();
        b1.addActionListener(handler); b2.addActionListener(handler);
        b3.addActionListener(handler); b4.addActionListener(handler);  b5.addActionListener(handler);
    }
    private class thehandler implements ActionListener
    {
        //@Override
        public void actionPerformed(ActionEvent event)
        {
            if(event.getSource()==b1)
            {
                myarr obj=new myarr();
            }
            else if(event.getSource()==b4){
                mystr obj=new mystr();
            }
            else if(event.getSource() == b3)
            {
                mygraph obj = new mygraph();
            }
        }
    }
}

