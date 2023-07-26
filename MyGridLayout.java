import java.awt.*;
import javax.swing.*;

public class MyGridLayout
{
		JFrame f;
	MyGridLayout()
	{
		f = new JFrame("Buttons");
		JButton b[]=new JButton[100];
		for(int i=1;i<=25;i++)	
		{
		b[i]=new JButton(i+"");
		f.add(b[i]);
		} 
		for(int i=1;i<=25;i=i+2)
		{
		b[i].setBackground(Color.BLACK);
		
		f.setLayout(new GridLayout(5,5));
		f.setSize(500,500);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args)
	{
		new MyGridLayout();
	}
}