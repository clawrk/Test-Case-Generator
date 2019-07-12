/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testcasegenerator;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class mygraph {
    JFrame arr=new JFrame("GRAPH");
    Button b1=new Button("Generate");
    JTextField tf1,tf2,tf3,tf4,tf5,tf6;
    JLabel l1,l2,l3,l4,l5;
    mygraph()
    {
        tf1=new JTextField("1");  
        l1=new JLabel(" Enter T ");
        l2=new JLabel(" Vertices ");
        l3=new JLabel("  Edges  ");
        tf2=new JTextField("1");
        tf3=new JTextField("1");
        b1.setBounds(210,210,80,30);
        
        l1.setBounds(20,40,50,30);
        tf1.setBounds(65,40,50,30);
        l2.setBounds(20,90,50,30);
        tf2.setBounds(65,90,50,30);
        l3.setBounds(20,140,50,30);
        tf3.setBounds(65,140,50,30);
        
        arr.add(l2); arr.add(l1); arr.add(l3);
        arr.add(tf1); arr.add(tf2); arr.add(tf3);  arr.add(b1);

        arr.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        arr.setLayout(null);
        arr.setSize(350,300);
        arr.setVisible(true);
        thehandler handler=new thehandler();
        b1.addActionListener(handler);
    }
public static boolean isNumeric(String str)
{
    for (char c : str.toCharArray())
    {
        if (!Character.isDigit(c)) return false;
    }
    return true;
}

    private class thehandler implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            //JOptionPane.showMessageDialog(null,"Hey there");
            boolean c1=tf2.getText().isEmpty();
            boolean c2=tf3.getText().isEmpty();
            boolean c3=tf1.getText().isEmpty();
            if(c1||c2||c3)
            {
                JOptionPane.showMessageDialog(null,"Don't leave any field empty!");  return;             
            }
            c1=isNumeric(tf1.getText());
            c2=isNumeric(tf2.getText());
            c3=isNumeric(tf3.getText());
            if(!c1 || !c2 || !c3 )
            {
                JOptionPane.showMessageDialog(null,"Enter Valid Data."); 
            }
            
            runalgorithm();          
        }
    }

    
    public void runalgorithm()
    {
        int t,nl,nh ,n ,i,V,E;
        t=Integer.parseInt(tf1.getText());
        V=Integer.parseInt(tf2.getText());
        E=Integer.parseInt(tf3.getText());
        Random rand=new Random();
        
        final JFrame frame = new JFrame("Generated Array Testcases");  
        frame.setSize(900, 800);  
        frame.setVisible(true);  
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);  
        frame.getContentPane().setLayout(new FlowLayout());  
  
        JTextArea textArea = new JTextArea(40, 60);  
        JScrollPane scrollableTextArea = new JScrollPane(textArea);  
  
        scrollableTextArea.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);  
        scrollableTextArea.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);  
  
        frame.getContentPane().add(scrollableTextArea);
       /*
        try
        {
            FileWriter fw=new FileWriter("D:\\testcase_graph.txt");
            String ans= Integer.toString(t) ,ans2=ans,nln=" " ;
            fw.write(ans); fw.write(nln); 
            int T=0;
            while(T<t)
            {
                T++;        
                n=nl + rand.nextInt(nh-nl);
                String strn=Integer.toString(n);
                if(n*t>100000)
                {
                    JOptionPane.showMessageDialog(null, "The amount of data is huge!");
                    return;
                }
                fw.write(strn); fw.write(nln); 
                if(T<20) {ans2+="\n";ans2+=strn; ans2+="\n";}
                for(i=0;i<n;i++)
                {
                    int gen=low + rand.nextInt(high-low);
                    String tmp=Integer.toString(gen); 
                    fw.write(tmp); fw.write(nln); 
                    if(i%51==0)
                    {
                        fw.write("\n");
                        if(i<500 && T<20) 
                        {
                            ans2+="\n";
                        }
                    }
                    if(i<500 && T<20) 
                    {
                        ans2+=tmp; ans2+=" ";
                    }
                }         
            }
            textArea.append(ans2);
        }
        catch (Exception e){System.out.println(e);}
      */
    }
}
