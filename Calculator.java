import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class simpleCalculator extends JFrame {
    JLabel l1 ,l2;
    JTextField t1,t2;
    JButton b1,b2,b3,b4;

    simpleCalculator(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        l1=new JLabel("Simple Calculator");
        l1.setFont(new Font("Times New Roman", Font.BOLD,30));
        l1.setForeground(Color.BLUE);
        l1.setBounds(60, 10, 300, 30);
        add(l1);


        t1=new JTextField(60);
        t2=new JTextField(60);
        b1=new JButton("Add");
        b2=new JButton("Sub");
        b3=new JButton("mult");
        b4=new JButton("DIV");

        t1.setBounds(100, 60, 120, 30);
        t2.setBounds(100, 100, 120, 30);

        b1.setBounds(100,140,60,30);
        b2.setBounds(160,140,60,30);

        b3.setBounds(100,180,60,30);
        b4.setBounds(160,180,60,30);

        l2=new JLabel("ANS");
        l2.setBounds(250,80,200,30);
        add(l2);

        
        





        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(t1);
        add(t2);

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae){
                int no1=Integer.parseInt(t1.getText());
                int no2=Integer.parseInt(t2.getText());
                l2.setText("sum of two nos=" +(no1+no2));

            
            }
        });


        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae){
                int no1=Integer.parseInt(t1.getText());
                int no2=Integer.parseInt(t2.getText());
                l2.setText("subtraction of two nos=" +(no1-no2));

            
            }
        });

        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae){
                int no1=Integer.parseInt(t1.getText());
                int no2=Integer.parseInt(t2.getText());
                l2.setText("Mul of two nos=" +(no1*no2));

            
            }
        });


        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae){
                int no1=Integer.parseInt(t1.getText());
                int no2=Integer.parseInt(t2.getText());
                l2.setText("div of two nos=" +(no1/no2));

            
            }
        });



        
        
    }
}


public class Calculator {
    public static void main(String[] args){
        simpleCalculator c1=new simpleCalculator();
        c1.setBounds(400,200,400,300);
        c1.setVisible(true);
    }

    
}
