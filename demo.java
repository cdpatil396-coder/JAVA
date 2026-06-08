import java.swing.*;
import jaa.awt.event.*;

class Demo
{
	public static void main(String args[])
	{
		JFrame f = new JFrame("Swing Example");

		JLabel l = new JLabel("Press Button");
		l.setBounds(100,50,150,30);

		f.add(l);

		f.setSize(300,300);
		f.setLayout(null);
		f.setVisible(true);
	}
}