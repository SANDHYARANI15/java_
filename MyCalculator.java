import java.awt.*;
import java.awt.event.*;
class MyCalculator extends Frame implements ActionListener
{
Frame fr=new Frame("MyCalculator");
TextField tf=new TextField();
int num1,num2,result;
char opt;
Button b1=new Button("1");
Button b2=new Button("2");
Button b3=new Button("3");
Button b4=new Button("4");
Button b5=new Button("5");
Button b6=new Button("6");
Button b7=new Button("7");
Button b8=new Button("8");
Button b9=new Button("9");
Button b0=new Button("0");
Button bc=new Button("C");
Button bp=new Button("+");
Button bs=new Button("-");
Button bm=new Button("*");
Button bd=new Button("/");
Button bq=new Button("=");
Panel pn=new Panel();
MyCalculator()
{
fr.add(tf,"North");
fr.add(pn,"Center");
addWindowListener(new WindowAdapter(){
   public void windowClosing(WindowEvent we) {
System.exit(0);
   }
  });
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);
b7.addActionListener(this);
b8.addActionListener(this);
b9.addActionListener(this);
b0.addActionListener(this);
bc.addActionListener(this);
bp.addActionListener(this);
bs.addActionListener(this);
bm.addActionListener(this);
bd.addActionListener(this);
bq.addActionListener(this);
pn.add(b7);
pn.add(b8);
pn.add(b9);
pn.add(bp);
pn.add(b6);
pn.add(b5);
pn.add(b4);
pn.add(bs);
pn.add(b1);
pn.add(b2);
pn.add(b3);
pn.add(bm);
pn.add(bc);
pn.add(b0);
pn.add(bq);
pn.add(bd);
pn.setLayout(new GridLayout(4,4));
fr.setVisible(true);
fr.setSize(350,450);
}
public void windowClosing(WindowEvent e) 
{
           dispose();}
public void actionPerformed(ActionEvent ae)
{
String str=ae.getActionCommand();
if(str.equals("+"))
{
opt=str.charAt(0);
num1=Integer.parseInt(tf.getText());
System.out.println(num1);
tf.setText("");
}
else if(str.equals("-"))
{
opt=str.charAt(0);
num1=Integer.parseInt(tf.getText());
System.out.println(num1);
tf.setText("");
}
else if(str.equals("*"))
{
opt=str.charAt(0);
num1=Integer.parseInt(tf.getText());
System.out.println(num1);
tf.setText("");
}
else if(str.equals("/"))
{
opt=str.charAt(0);
num1=Integer.parseInt(tf.getText());
System.out.println(num1);
tf.setText("");
}
else if(str.equals("="))
{
String exp="";
num2=Integer.parseInt(tf.getText());
System.out.println(num2);
switch(opt)
{
case '+': result=num1+num2;
		tf.setText(result+"");
          break;
case '-': result=num1-num2;
	tf.setText(result+"");
          break;
case '*': result=num1*num2;
        tf.setText(result+"");
          break;
case '/': 
 try
	{
	  result = num1 / num2;
tf.setText(result+"");
                    }
	        catch(ArithmeticException aex)
                                    {
			result=0;
			exp=exp.concat(aex.getMessage());
			tf.setText(result+exp);
		       	       }
	        catch(NumberFormatException nfe)
                                    {
		result=0;
		exp=exp.concat(nfe.getMessage());
     tf.setText(result+exp);
                                   }
          break;
}
}
else if(str.equals("C"))
{
num1=num2=result=0;
tf.setText("");
}
else
{
tf.setText(tf.getText()+str);
}
}
public static void main(String arg[])
{
new MyCalculator();
}
}
