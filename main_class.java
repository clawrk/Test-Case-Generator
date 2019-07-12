package testcasegenerator;
import javax.swing.*;
import java.awt.*;
import static java.awt.PageAttributes.ColorType.COLOR;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

public class TestCaseGenerator {
    public static void main(String[] args) {
        window obj=new window();
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.setSize(300,400);
        obj.setLayout(null);
        obj.setVisible(true);
    }  
}
/*
class window extends JFrame{

    private final Button b1;
    private Button b2,b3,b4,b5;
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
        add(b1); add(b2) ; add(b3) ; add(b4) ; add(b5);
        thehandler handler=new thehandler();
        b1.addActionListener(handler);
    }
    private class thehandler implements ActionListener
    {
        //@Override
        public void actionPerformed(ActionEvent event)
        {
            if(event.getSource()==b1)
            {
                JFrame arr=new JFrame("ARRAY");
                Button b1=new Button("Generate");
                JTextField tf1,tf2,tf3,tf4,tf5,tf6;
                JTextArea area=new JTextArea();
                JLabel l1,l2,l3,l4,l5;
                tf1=new JTextField("");  l1=new JLabel("Enter T");
                tf2=new JTextField(""); l2=new JLabel("<=  N  <=");
                l5=new JLabel("<=  arr[i]  <=");
                l3=new JLabel("Range of N :");
                l4=new JLabel("Range of each element :");
                tf3=new JTextField("1");
                tf5=new JTextField("1");
                tf6=new JTextField("2000");
                tf4=new JTextField("100000");
                l1.setBounds(20,40,50,30);
                l4.setBounds(20,170,140,30);
                tf1.setBounds(65,40,50,30);
                l3.setBounds(20,90,70,30);
                l5.setBounds(70,210,80,30);
                l2.setBounds(70,130,80,30);
                area.setBounds(220,40,550,450);
                tf3.setBounds(20,130,50,30); tf4.setBounds(130,130,50,30);
                tf5.setBounds(20,210,50,30); tf6.setBounds(145,210,50,30);
                b1.setBounds(20,270,80,30);
                arr.add(tf1); arr.add(l2); arr.add(l1); arr.add(l3);  arr.add(tf2); arr.add(l4);
                arr.add(tf3); arr.add(tf4); 
                arr.add(b1);
                arr.add(tf5); arr.add(tf6); arr.add(l4); arr.add(l5); 
                arr.add(area);
                arr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                arr.setLayout(null);
                arr.setSize(800,550);
                arr.setVisible(true);
        }
    }
}
}

*/