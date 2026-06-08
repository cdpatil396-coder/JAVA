import java.swing.*;
import jaa.awt.event.*;

class Demmoo
{
	public static void main(String args[])
	{
		JFrame f = new JFrame("Swing Example");

		JLabel l = new JLabel("Press Button");
		l.setBounds(100,50,150,30);

		JButton b = new JButton("Click");
		b.setBounds(100,100,100,30);

		b.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				l.setText("Button Clicked");
			}
			});

		f.add(l);
		f.add(b);

		f.setSize(300,300);
		f.setLayout(null);
		f.setVisible(true);
	}
}