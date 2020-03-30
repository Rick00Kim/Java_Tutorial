package layoutNull;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Ex_01 extends JFrame{
	Container c;
	public Ex_01(){
		setTitle("Null_Ex");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(700,550);
		loca(Toolkit.getDefaultToolkit().getScreenSize(),this.getSize());
		init();
		start();
		setResizable(false);
		setVisible(true);
	}
	public void init(){
		c=getContentPane();
		c.setLayout(null);
		c.setBackground(Color.BLUE);
		JButton b=new JButton("1ST");
		b.setSize(90,90);
		b.setBackground(Color.GREEN);
		b.setLocation(50,50);
		c.add(b);
	}
	public void start(){
		
	}
	
	public void loca(Dimension scn,Dimension frm){
		int x=(int)(scn.getWidth()/2-frm.getWidth()/2);
		int y=(int)(scn.getHeight()/2-frm.getHeight()/2);
		this.setLocation(x, y);
	}
	public static void main(String[] ar){
		new Ex_01();
	}
}
