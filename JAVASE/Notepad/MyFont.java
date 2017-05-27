import java.awt.*;
import java.awt.event.*;
public class MyFont implements ItemListener, ActionListener
{
	Frame f;
	Label la1,la2,la3,ll1,ll2,ll3;
    List l1,l2,l3;
    Button b;
MyFont()
{
	f=new Frame("Font");
	f.setLayout(null);
	
	la1=new Label("Font:");
	la1.setBounds(20,40,50,20);
	
	la2=new Label("Font Style:");
	la2.setBounds(140,40,100,20);
	
	la3=new Label("Size:");
	la3.setBounds(260,40,50,20);
	
	ll1=new Label();
	ll1.setBounds(20,60,110,20);
	ll1.setBackground(Color.green);
	
	ll2=new Label();
	ll2.setBounds(140,60,110,20);
	ll2.setBackground(Color.green);
	
	ll3=new Label();
	ll3.setBounds(260,60,110,20);
	ll3.setBackground(Color.green);
	
	l1=new List();
	l1.setBounds(20,80,110,100);
	
	l2=new List();
	l2.setBounds(140,80,110,100);
	
	l3=new List();
	l3.setBounds(260,80,110,100);
	
	l1.add("Arial");
	l1.add("Bradley Hand ITC");
	l1.add("Monotype Corsiva");
	l1.add("Giddyup Std");
	
	l2.add("Regular");
	l2.add("Oblique");
	l2.add("Bold");
	l2.add("Bold Oblique");
	
	
	l3.add("12");
	l3.add("14");
	l3.add("16");
	l3.add("18");
	l3.add("20");
	l3.add("22");
	l3.add("24");
	
	b=new Button("OK");
	b.setBounds(200,200,40,30);
	
	l1.addItemListener(this);
	l2.addItemListener(this);
	l3.addItemListener(this);
	b.addActionListener(this);
	
	f.add(la1);
	f.add(la2);
	f.add(la3);
	f.add(ll1);
	f.add(ll2);
	f.add(ll3);
	f.add(l1);
	f.add(l2);
	f.add(b);
	f.add(l3);
	
	
			f.setSize(400,400);
			f.setVisible(true);
}

public void itemStateChanged(ItemEvent e)
{
	ll1.setText(l1.getSelectedItem());
	ll2.setText(l2.getSelectedItem());
	ll3.setText(l3.getSelectedItem());
}



public void actionPerformed(ActionEvent e)
{
	int str3=Integer.parseInt(ll3.getText());
	if(ll1.getText()=="Arial")
	{
		if(ll2.getText()=="Regular")
		NewNote.ta.setFont(new Font("Arial",0,str3));
		
	    else if(ll2.getText()=="Oblique")
	    	NewNote.ta.setFont(new Font("Arial",2,str3));
	    else if(ll2.getText()=="Bold")
	    	NewNote.ta.setFont(new Font("Arial",1,str3));
	}
	else if(ll1.getText()=="Bradley Hand ITC")
	{
		if(ll2.getText()=="Regular")
			NewNote.ta.setFont(new Font("Bradley Hand ITC",0,str3));
			
		    else if(ll2.getText()=="Oblique")
		    	NewNote.ta.setFont(new Font("Bradley Hand ITC",2,str3));
		    else if(ll2.getText()=="Bold")
		    	NewNote.ta.setFont(new Font("Bradley Hand ITC",1,str3));
	}
	else if(ll1.getText()=="Monotype Corsiva")
	{
		if(ll2.getText()=="Regular")
			NewNote.ta.setFont(new Font("Monotype Corsiva",0,str3));
			
		    else if(ll2.getText()=="Oblique")
		    	NewNote.ta.setFont(new Font("Monotype Corsiva",2,str3));
		    else if(ll2.getText()=="Bold")
		    	NewNote.ta.setFont(new Font("Monotype Corsiva",1,str3));
	}
	
	else if(ll1.getText()=="Giddyup Std")
	{
		if(ll2.getText()=="Regular")
			NewNote.ta.setFont(new Font("Giddyup Std",0,str3));
			
		    else if(ll2.getText()=="Oblique")
		    	NewNote.ta.setFont(new Font("Giddyup Std",2,str3));
		    else if(ll2.getText()=="Bold")
		    	NewNote.ta.setFont(new Font("Giddyup Std",1,str3));
	}
	
    
    	
}
}

