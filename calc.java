import javax.swing.*;
import java.awt.event.*;
public class calc extends JFrame implements ActionListener
{
JButton b, b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;
JTextField tf, tf2;

final JTextField  tf3;
JLabel l;
calc()
{
    tf = new JTextField();
    tf2 = new JTextField();
    
    b=  new JButton("+");
    b1=  new JButton("-");
    b2=  new JButton("/");
    b3=  new JButton("*");
    b4=  new JButton("%");
    b5=  new JButton("sin(a)");
    b6=  new JButton("cos(a)");
    b7=  new JButton("tan(a)");
    b8=  new JButton("cosec(a)");
    b9=  new JButton("sec(a)");
    b10=  new JButton("cot(a)");
    tf3 = new JTextField();
    l=   new JLabel("result");
tf.setBounds(20,20,150,50);
tf2.setBounds(20,70,150,50);
tf3.setBounds(90,120,150,50);
tf3.setEditable(false);

l.setBounds(10,130,150,50);
b.setBounds(270,20,50,50);
b1.setBounds(270,120,50,50);
b2.setBounds(270,220,50,50);
b3.setBounds(270,320,50,50);
b4.setBounds(270,420,50,50);
b5.setBounds(20,320,50,50);
b6.setBounds(80,320,60,50);
b7.setBounds(140,320,60,50);
b8.setBounds(20,400,60,50);
b9.setBounds(80,400,60,50);
b10.setBounds(140,400,60,50);


b.addActionListener(this);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);
b7.addActionListener(this);
b8.addActionListener(this);
b9.addActionListener(this);
b10.addActionListener(this);

add(b);
add(b1);
add(b2);
add(b3);
add(b4);
add(b5);
add(b6);
add(b7);
add(b8);
add(b9);
add(b10);




add(tf);
add(tf2);
add(tf3);
add(l);
setSize(1000,1000);
setLayout(null);
setVisible(true);
}
public void actionPerformed(ActionEvent e) 
{
    String ip= tf.getText();
    String ip2 = tf2.getText();
   double a= Double.parseDouble(ip);           
    double k= Double.parseDouble(ip2);
    double c=0;
    if(e.getSource()==b)
    { c=a+k;}
else if (e.getSource()==b1)
{ c=a-k;}
else if (e.getSource()==b2)
{ c=a/k;}
else if (e.getSource()==b3)
{ c=a%k;}
else if (e.getSource()==b4)
{ c=a*k;}

else if (e.getSource()==b5)
{ a=Math.toRadians(a);
    c= Math.sin(a);}
else if (e.getSource()==b6)
{ a=Math.toRadians(a);
    c= Math.cos(a);}
else if (e.getSource()==b7)
{ a=Math.toRadians(a);
    c= Math.tan(a);}
else if (e.getSource()==b8)
{ a=Math.toRadians(a);
    c= 1/Math.sin(a);}
else if (e.getSource()==b9)
{ a=Math.toRadians(a);
    c= 1/Math.cos(a);}
    else if (e.getSource()==b10)
{ a=Math.toRadians(a);
    c= 1/Math.tan(a);}



String result=String.valueOf(c);
tf3.setText(result);
}

public static void main(String args[])
{
   calc obj = new calc();
}


}

