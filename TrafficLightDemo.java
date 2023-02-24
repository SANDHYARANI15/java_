import java.awt.*;
import java.awt.event.*;
public class TrafficLightDemo extends Frame implements ActionListener
{
Button redbt,greenbt,yellowbt;
String msg="";
TrafficLightDemo()
{
setLayout(new FlowLayout());
redbt=new Button("RED");
yellowbt=new Button("YELLOW");
greenbt=new Button("GREEN");
add(redbt);
add(yellowbt);
add(greenbt);
redbt.addActionListener(this);
yellowbt.addActionListener(this);
greenbt.addActionListener(this);
addWindowListener(new WindowAdapter() {
public void windowClosing(WindowEvent we)
{
System.exit(0);
} });
}
public void actionPerformed(ActionEvent ae)
{
msg=ae.getActionCommand();
repaint();
}
public static void main(String args[])
{
TrafficLightDemo tf=new TrafficLightDemo();
tf.setTitle("Traffic Light Demo");
tf.setSize(320,350);
tf.setVisible(true);
}
public void paint(Graphics g)
 {
setBackground(Color.gray);
setForeground(Color.white);
g.setFont(new Font("Arial",Font.BOLD,25));
g.drawOval(110,80,50,50);
g.drawOval(110,180,50,50);
g.drawOval(110,280,50,50);
if(msg.equals("RED"))
{
g.setColor(Color.red);
g.fillOval(110,80,50,50);
g.drawString("---->STOP",160,110);
}
else if(msg.equals("YELLOW"))
{
g.setColor(Color.yellow);
g.fillOval(110,180,50,50);
g.drawString("---->READY",160,210);
}
else if(msg.equals("GREEN"))
{
g.setColor(Color.green);
g.fillOval(110,280,50,50);
g.drawString("---->GO",160,310);
}

}
}