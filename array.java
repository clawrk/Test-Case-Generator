/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testcasegenerator;

import java.awt.Button;
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


public class myarr {
    JFrame arr=new JFrame("ARRAY");
    Button b1=new Button("Generate");
    JTextField tf1,tf2,tf3,tf4,tf5,tf6;
    JLabel l1,l2,l3,l4,l5;
    myarr()
    {
        /*
        jsp=new JScrollPane(area);
        //arr.setLayout(new FlowLayout());  
        jsp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);  
        jsp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        jsp.getViewport().setOpaque(false);
        jsp.setOpaque(false);*/
        tf1=new JTextField("1");  l1=new JLabel("Enter T");
         l2=new JLabel("<=  N  <=");
        l5=new JLabel("<=  arr[i]  <=");
        l3=new JLabel("Range of N :");
        l4=new JLabel("Range of each element :");
        tf3=new JTextField("1");
        tf5=new JTextField("1");
        tf6=new JTextField("2000");
        tf4=new JTextField("10000"); 
        l1.setBounds(20,40,50,30);
        l4.setBounds(20,170,140,30);
        tf1.setBounds(65,40,50,30);
        l3.setBounds(20,90,70,30);
        l5.setBounds(70,210,80,30);
        l2.setBounds(70,130,80,30);
        tf3.setBounds(20,130,50,30); tf4.setBounds(130,130,50,30);
        tf5.setBounds(20,210,50,30); tf6.setBounds(145,210,50,30);
        b1.setBounds(210,210,80,30);
        arr.add(tf1); arr.add(l2); arr.add(l1); arr.add(l3); arr.add(l4);
        arr.add(tf3); arr.add(tf4); 
        arr.add(b1);
        arr.add(tf5); arr.add(tf6); arr.add(l4); arr.add(l5); 
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
            boolean c1=tf3.getText().isEmpty(), c2=tf4.getText().isEmpty();
            boolean c3=tf5.getText().isEmpty(), c4=tf6.getText().isEmpty();
            boolean c5=tf1.getText().isEmpty();
            if(c1||c2||c3||c4||c5 )
            {
                JOptionPane.showMessageDialog(null,"Don't leave any field empty!");  return;             
            }
            c1=isNumeric(tf1.getText());
            c2=isNumeric(tf6.getText());
            c3=isNumeric(tf3.getText());
            c4=isNumeric(tf4.getText());
            c5=isNumeric(tf5.getText());

            if(!c1 || !c2 || !c3 || !c4 || !c5)
            {
                JOptionPane.showMessageDialog(null,"Enter Valid Data."); 
            }
            
            runalgorithm();          
        }
    }
    
    public void runalgorithm()
    {
        int t,nl,nh ,n ,i,low,high;
        t=Integer.parseInt(tf1.getText());
        nl=Integer.parseInt(tf3.getText());
        nh=Integer.parseInt(tf4.getText());
        low=Integer.parseInt(tf5.getText());
        high = Integer.parseInt(tf6.getText());
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
        try
        {
            FileWriter fw=new FileWriter("D:\\testcase_arr.txt");
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
      
    }
}
