
import javax.swing.*;

import java.awt.Button;
import java.awt.event.*;

public class huzaifa extends JFrame implements ActionListener{
    JTextField tf1,tf2,tf3;
    Button b1,b2;
    huzaifa(){
        tf1=new JTextField();
        tf1.setBounds(50,50,150,20);
        tf2=new JTextField();
        tf2.setBounds(50,100,150,20);
      tf3=new JTextField();
      tf3.setBounds(50,150,150,20);
      tf3.setEditable(false);
      b1=new Button("+");
      b1.setBounds(50,200,50,50);
      b2=new Button("-");
      b2.setBounds(120,200,50,50);
      b1.addActionListener(this);
      b2.addActionListener(this);
      add(tf1);
      add(tf2);
      add(tf3);
      add(b1);
      add(b2);
      setSize(300,300);
      setLayout(null);
      setVisible(true);


    }
    public void actionPerformed(ActionEvent e){
        String s1=tf1.getText();
        String s2=tf2.getText();
        int a=Integer.parseInt(s1);
        int b=Integer.parseInt(s2);
        int c=0;
        if(e.getSource()==b1){
            c=a+b;
        }
        else if(e.getSource()==b2){
            c=a-b;
        }
        String result = Stringvalueof(c);
        tf3.setText(result);
    }
    private String Stringvalueof(int c) {
        return null;
    }
    public static void main(String[] args){
        new huzaifa();

    }
    
}
