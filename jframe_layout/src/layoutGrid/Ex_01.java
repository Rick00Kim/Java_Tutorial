package layoutGrid;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ex_01 extends JFrame{
	Container c;
	JPanel[] p=new JPanel[6];
	public Ex_01(){
		setTitle("Border_Ex");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,400);
		init();
		start();
		setVisible(true);
	}
	public void init(){
		c=getContentPane();
		c.setLayout(new GridLayout(4,2));
		c.add(new JTextField(5));
		c.add(new JTextField(5));
		for(int i=0;i<p.length;i++){
			p[i]=new JPanel();
			p[i].setLayout(new GridLayout(1,2));
			p[i].add(new JTextField(10));
			p[i].add(new JButton("Input"));
			c.add(p[i]);
		}
	}
	public void start(){
		
	}
	public static void main(String[] ar){
		new Ex_01();
	}
}
