import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class NewNote extends WindowAdapter implements ActionListener 
{
	Frame f;
	static JTextArea ta;
	Button b;
	
	NewNote()
	{
	f=new Frame("Notepad");
	ta=new JTextArea();
	b=new Button("Change");
	b.addActionListener(this);
	f.add(ta);
	f.add(b,BorderLayout.SOUTH);
	f.addWindowListener(this);
	f.setSize(400, 400);
	f.setVisible(true);
	}
	
	public static void main(String ar[])
	{
	NewNote n=new NewNote();
	}
	
	public void actionPerformed(ActionEvent e)
	{
		MyFont mf=new MyFont();
	}
	
	public void windowClosing(WindowEvent e)
	{
		System.exit(0);
	}
}