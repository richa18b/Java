import java.awt.*;
import java.awt.Image;

import javax.swing.*;
import javax.imageio.ImageIO;

import java.awt.event.*;

class Calculator1 implements ActionListener,WindowListener//,MouseListener
{

String op[]=new String[2];
float r1,r2,r3,r4,plus,minus,into,divide;
float o1[]=new float[2];
int flag,i,j,count;
String str;

JFrame f;
JPanel p;
JMenuBar mb;
JMenu m1,m2,m3,t8,t11;
JMenuItem t1,t2,t5,t6,t7,t9,t10,t12,t13,t81,t82,t83,t84,t111,t112,t113,t114;
JCheckBoxMenuItem t3,t4;
Color c,c1,c2,c3;
JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24,b25,b26,b27,b28;
JLabel l;

Calculator1()
{
f=new JFrame("Calculator");
f.setLayout(null);
f.addWindowListener(this);

p=new JPanel();
p.setLayout(null);

l=new JLabel("0");
l.setBounds(13,10,187,50);
f.getContentPane().setBackground(Color.white);
l.setOpaque(true);

m1=new JMenu("View");
m2=new JMenu("Edit");
m3=new JMenu("Help");

t8=new JMenu("Worksheets");
t11=new JMenu("History");

t81=new JRadioButtonMenuItem("Mortgage");
t82=new JRadioButtonMenuItem("Vehicle Lease");
t83=new JRadioButtonMenuItem("Fuel economy(mpg)");
t84=new JRadioButtonMenuItem("Fuel economy(L/100 km)");
ButtonGroup g3=new ButtonGroup();
g3.add(t81);
g3.add(t82);
g3.add(t83);
g3.add(t84);

t111=new JMenuItem("Copy History");
t112=new JMenuItem("Edit");
t113=new JMenuItem("Cancel edit");
t114=new JMenuItem("Clear");

t8.add(t81);
t8.add(t82);
t8.add(t83);
t8.add(t84);

t11.add(t111);
t11.add(t112);
t11.add(t113);
t11.add(t114);

t1=new JRadioButtonMenuItem("Standarad");
t1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F1,InputEvent.ALT_MASK));
t2=new JRadioButtonMenuItem("Scientific");
t2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F2,InputEvent.ALT_MASK));
ButtonGroup g1=new ButtonGroup();
g1.add(t1);
g1.add(t2);

t3=new JCheckBoxMenuItem("History");
t3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H,InputEvent.CTRL_MASK));
t4=new JCheckBoxMenuItem("Digit grouping");

t5=new JRadioButtonMenuItem("Basic");
t5.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B,InputEvent.CTRL_MASK));
t6=new JRadioButtonMenuItem("Unit conversion");
t6.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_U,InputEvent.CTRL_MASK));
t7=new JRadioButtonMenuItem("Date calculation");
t7.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D,InputEvent.CTRL_MASK));
ButtonGroup g2=new ButtonGroup();
g2.add(t5);
g2.add(t6);
g2.add(t7);

t9=new JMenuItem("Copy");
t9.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C,InputEvent.CTRL_MASK));
t10=new JMenuItem("Paste");
t10.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V,InputEvent.CTRL_MASK));
t12=new JMenuItem("View Help");
t12.setMnemonic(KeyEvent.VK_F1);
t13=new JMenuItem("About Calculator");

m1.add(t1);
m1.add(t2);
m1.addSeparator();
m1.add(t3);
m1.add(t4);
m1.addSeparator();
m1.add(t5);
m1.add(t6);
m1.add(t7);
m1.add(t8);

m2.add(t9);
m2.add(t10);
m2.add(t11);

m3.add(t12);
m3.add(t13);

mb=new JMenuBar();
mb.add(m1);
mb.add(m2);
mb.add(m3);

c2=new Color(230,230,250);
c3=new Color(152,251,152);

b1=new JButton("MC");
b1.setBackground(c2);
b1.setBounds(0,0,34,28);

b2=new JButton("MR");
b2.setBackground(c2);
b2.setBounds(38,0,34,28);

b3=new JButton("MS");
b3.setBackground(c2);
b3.setBounds(76,0,34,28);

b4=new JButton("M+");
b4.setBackground(c2);
b4.setBounds(114,0,34,28);

b5=new JButton("M-");
b5.setBackground(c2);
b5.setBounds(152,0,34,28);

b6=new JButton("←");//Alt+27
b6.setFont(new Font("",1,12));
b6.setBackground(c2);
b6.setBounds(0,32,34,28);

b7=new JButton("CE");
b7.setBackground(c2);
b7.setBounds(38,32,34,28);

b8=new JButton("C");
b8.setBackground(c2);
b8.setBounds(76,32,34,28);

b9=new JButton("±");//Alt+0177
b9.setBackground(c2);
b9.setBounds(114,32,34,28);

b10=new JButton("√");//Alt+251
b10.setBackground(c2);
b10.setBounds(152,32,34,28);

c1=new Color(245,255,250);

b11=new JButton("7");
b11.setBackground(c1);
b11.setBounds(0,64,34,28);

b12=new JButton("8");
b12.setBackground(c1);
b12.setBounds(38,64,34,28);

b13=new JButton("9");
b13.setBackground(c1);
b13.setBounds(76,64,34,28);

b14=new JButton("/");
b14.setBackground(c2);
b14.setBounds(114,64,34,28);

b15=new JButton("%");
b15.setBackground(c2);
b15.setBounds(152,64,34,28);

b16=new JButton("4");
b16.setBackground(c1);
b16.setBounds(0,96,34,28);

b17=new JButton("5");
b17.setBackground(c1);
b17.setBounds(38,96,34,28);

b18=new JButton("6");
b18.setBackground(c1);
b18.setBounds(76,96,34,28);

b19=new JButton("*");
b19.setBackground(c2);
b19.setBounds(114,96,34,28);

b20=new JButton("1/x");
b20.setBackground(c2);
b20.setBounds(152,96,34,28);

b21=new JButton("1");
b21.setBackground(c1);
b21.setBounds(0,128,34,28);

b22=new JButton("2");
b22.setBackground(c1);
b22.setBounds(38,128,34,28);

b23=new JButton("3");
b23.setBackground(c1);
b23.setBounds(76,128,34,28);

b24=new JButton("-");
b24.setBackground(c2);
b24.setBounds(114,128,34,28);

b25=new JButton("=");
b25.setBackground(c2);
b25.setBounds(152,128,34,60);

b26=new JButton("0");
b26.setBackground(c1);
b26.setBounds(0,160,72,28);

b27=new JButton(".");
b27.setBackground(c1);
b27.setBounds(76,160,34,28);

b28=new JButton("+");
b28.setBackground(c2);
b28.setBounds(114,160,34,28);

b1.setBorder(null);
b2.setBorder(null);
b3.setBorder(null);
b4.setBorder(null);
b5.setBorder(null);
b6.setBorder(null);
b7.setBorder(null);
b8.setBorder(null);
b9.setBorder(null);
b10.setBorder(null);
b11.setBorder(null);
b12.setBorder(null);
b13.setBorder(null);
b14.setBorder(null);
b15.setBorder(null);
b16.setBorder(null);
b17.setBorder(null);
b18.setBorder(null);
b19.setBorder(null);
b20.setBorder(null);
b21.setBorder(null);
b22.setBorder(null);
b23.setBorder(null);
b24.setBorder(null);
b25.setBorder(null);
b26.setBorder(null);
b27.setBorder(null);
b28.setBorder(null);

b6.addActionListener(this);
b7.addActionListener(this);
b8.addActionListener(this);
b9.addActionListener(this);
b10.addActionListener(this);
b11.addActionListener(this);
b12.addActionListener(this);
b13.addActionListener(this);
b14.addActionListener(this);
b16.addActionListener(this);
b17.addActionListener(this);
b18.addActionListener(this);
b19.addActionListener(this);
b20.addActionListener(this);
b21.addActionListener(this);
b22.addActionListener(this);
b23.addActionListener(this);
b24.addActionListener(this);
b25.addActionListener(this);
b26.addActionListener(this);
b28.addActionListener(this);

/*b6.addMouseListener(this);
b7.addMouseListener(this);
b8.addMouseListener(this);
b9.addMouseListener(this);
b10.addMouseListener(this);
b11.addMouseListener(this);
b12.addMouseListener(this);
b13.addMouseListener(this);
b14.addMouseListener(this);
b16.addMouseListener(this);
b17.addMouseListener(this);
b18.addMouseListener(this);
b19.addMouseListener(this);
b20.addMouseListener(this);
b21.addMouseListener(this);
b22.addMouseListener(this);
b23.addMouseListener(this);
b24.addMouseListener(this);
b25.addMouseListener(this);
b26.addMouseListener(this);
b28.addMouseListener(this);*/

p.add(b1);
p.add(b2);
p.add(b3);
p.add(b4);
p.add(b5);
p.add(b6);
p.add(b7);
p.add(b8);
p.add(b9);
p.add(b10);
p.add(b11);
p.add(b12);
p.add(b13);
p.add(b14);
p.add(b15);
p.add(b16);
p.add(b17);
p.add(b18);
p.add(b19);
p.add(b20);
p.add(b21);
p.add(b22);
p.add(b23);
p.add(b24);
p.add(b25);
p.add(b26);
p.add(b27);
p.add(b28);

p.setBounds(13,65,187,190);

c=new Color(248,248,255);
f.setBackground(c);

f.add(l);
f.add(p);
f.setJMenuBar(mb);

ImageIcon icon=new ImageIcon("E:/My Pics/Calc.png");

f.setIconImage(icon.getImage());

f.setSize(218,312);
f.setVisible(true);
f.setResizable(false);
}

public static void main(String ar[])
{
Calculator1 cal=new Calculator1();
}

public void actionPerformed(ActionEvent e)
{
	

JButton b=(JButton)e.getSource();

if(b==b11||b==b12||b==b13||b==b16||b==b17||b==b18||b==b21||b==b22||b==b23||b==b26)
{
if(flag==0)
{
l.setText(b.getLabel());
flag=1;
}
else
l.setText(l.getText()+b.getLabel());
}

if(b==b14||b==b19||b==b24||b==b28)
{
op[i]=b.getLabel();
i++;
o1[j]=Float.parseFloat(l.getText());
j++;
flag=0;
if(i==2&&j==2)
calc();
}

if(b==b25)
{
flag=0;
if(i==1&&j==1)
{i--;
j--;

if(op[0]=="+")
{
r1=o1[0]+Float.parseFloat(l.getText());
l.setText(""+r1);
}

else if(op[0]=="-")
{
r2=o1[0]-Float.parseFloat(l.getText());
l.setText(""+r2);
}

else if(op[0]=="*")
{
r3=o1[0]*Float.parseFloat(l.getText());
l.setText(""+r3);
}

else if(op[0]=="/")
{
r4=o1[0]/Float.parseFloat(l.getText());
l.setText(""+r4);
}
}
}

if(b==b6)
{
	String txt=l.getText();
	if(txt!=null&&!txt.isEmpty())
		l.setText(txt.substring(0, txt.length()-1));
	
	/*StringBuilder sb=new StringBuilder(l.getText());
	sb.deleteCharAt(0);
	l.setText(sb.toString());*/
	
}

if(b==b7)
{
l.setText("0");
flag=0;
}

if(b==b8)
{
for(int k=0;k<2;k++)
{
op[k]=null;
o1[k]=0;
}
l.setText("0");
flag=0;
}

if(b==b9)
{
	if(count%2==0)
	{
		l.setText("-"+l.getText());
	    count++;
	}
	else
	{
		StringBuilder sb=new StringBuilder(l.getText());
		sb.deleteCharAt(0);
		l.setText(sb.toString());
		count++;
	}
		
	
}

if(b==b10)
{
	Double sq=Math.sqrt(Double.parseDouble(l.getText()));
	l.setText(sq.toString());
	flag=0;
}

if(b==b20)
{
	Float reciprocal=1/Float.parseFloat(l.getText());
	l.setText(reciprocal.toString());
	flag=0;
}

}

void calc()
{
i--;
j--;

if(op[0]=="+")
{
plus=o1[0]+o1[1];
o1[0]=plus;
l.setText(""+o1[0]);
op[0]=op[1];
}
else if(op[0]=="-")
{
minus=o1[0]-o1[1];
o1[0]=minus;
l.setText(""+o1[0]);
op[0]=op[1];
}
else if(op[0]=="*")
{
into=o1[0]*o1[1];
o1[0]=into;
l.setText(""+o1[0]);
op[0]=op[1];
}
else if(op[0]=="/")
{
if(o1[1]!=0)
{
divide=o1[0]/o1[1];
o1[0]=divide;
l.setText(""+o1[0]);
op[0]=op[1];
}
}
}

/*public void mouseEntered(MouseEvent e)
{
	b6.setBackground(c3);
	b7.setBackground(c3);
	b8.setBackground(c3);
	b9.setBackground(c3);
	b10.setBackground(c3);
	b11.setBackground(c3);
	b12.setBackground(c3);
	b13.setBackground(c3);
	b14.setBackground(c3);
	b16.setBackground(c3);
	b17.setBackground(c3);
	b18.setBackground(c3);
	b19.setBackground(c3);
	b20.setBackground(c3);
	b21.setBackground(c3);
	b22.setBackground(c3);
	b23.setBackground(c3);
	b24.setBackground(c3);
	b25.setBackground(c3);
	b26.setBackground(c3);
	b28.setBackground(c3);
}

public void mouseExited(MouseEvent e)
{
	b6.setBackground(c2);
	b7.setBackground(c2);
	b8.setBackground(c2);
	b9.setBackground(c2);
	b10.setBackground(c2);
	b11.setBackground(c1);
	b12.setBackground(c1);
	b13.setBackground(c1);
	b14.setBackground(c2);
	b16.setBackground(c1);
	b17.setBackground(c1);
	b18.setBackground(c1);
	b19.setBackground(c2);
	b20.setBackground(c2);
	b21.setBackground(c1);
	b22.setBackground(c1);
	b23.setBackground(c1);
	b24.setBackground(c2);
	b25.setBackground(c2);
	b26.setBackground(c1);
	b28.setBackground(c2);
}

public void mouseClicked(MouseEvent e)
{
}

public void mousePressed(MouseEvent e)
{
}

public void mouseReleased(MouseEvent e)
{
}*/

public void windowClosing(WindowEvent e)
{
f.dispose();
}

public void windowClosed(WindowEvent e)
{
System.exit(0);
}

public void windowOpened(WindowEvent e)
{
}

public void windowIconified(WindowEvent e)
{
}

public void windowDeiconified(WindowEvent e)
{
}

public void windowActivated(WindowEvent e)
{
}

public void windowDeactivated(WindowEvent e)
{
}

}