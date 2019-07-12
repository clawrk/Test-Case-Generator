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
import static testcasegenerator.myarr.isNumeric;

public class mystr {
    JTextField tf; JLabel jl; Button b1;
    JFrame str=new JFrame();
    mystr(){
        tf=new JTextField(); 
        jl=new JLabel("Enter T:");
        b1=new Button("Generate");
        jl.setBounds(20,40,60,30);
        tf.setBounds(70,40,60,30);
        b1.setBounds(20,100,60,30);
        str.add(jl);  str.add(tf); str.add(b1); 
        str.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        str.setLayout(null);
        str.setSize(250,200);
        str.setVisible(true);
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
    private class thehandler implements ActionListener{
        public void actionPerformed(ActionEvent event){
            //JOptionPane.showMessageDialog(null,"Hi there ");
            boolean c1=tf.getText().isEmpty() , c2=isNumeric(tf.getText());;
            if(c1==true || c2==false){
                JOptionPane.showMessageDialog(null, "Enter some valid data sir");
            }
            runalgorithm();
        }
    }
    public void runalgorithm(){
        int t = Integer.parseInt(tf.getText());
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
            FileWriter fw2=new FileWriter("D:\\testcase_str.txt");
            String ans2= tf.getText() ,nln=" " ,ans=ans2+nln ; 
            ans2+="\n";
            ans+=nln;
            //fw2.write(ans2); fw2.write(nln); 
            int T=0,i,n;
            textArea.append(Integer.toString(t));  textArea.append("\n");
            while(T<t)
            {
                T++;
                n=1+rand.nextInt()%78; 
                if(n<0){
                    n*=-1;
                }
                String nstr = Integer.toString(n);
                textArea.append(nstr);
                textArea.append("\n");
                //fw2.write(nstr); fw2.write(nln);
                ans2+=nstr;  ans2+="\n";  ans+=nstr;  ans+=nln;
                String temp="" ;
                for(i=0;i<n;i++){
                    int ind=(rand.nextInt());  
                    if(ind<0) ind*=-1;
                    ind%=26;
                    char ch=(char) ('a'+ind);
                    temp+= ch;
                }
                
                textArea.append(temp);
                textArea.append("\n");
                
//                ans2+=temp; ans2+="\n";
//                ans+=temp; ans+=nln;
            }
//            textArea.append(ans2);
//            fw2.write(ans);
        }
        catch (Exception e){System.out.println(e);}
            
    }
}
