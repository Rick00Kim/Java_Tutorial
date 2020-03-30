import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Exam_10 extends JFrame {
	JLabel lb1;
	
	public Exam_10(){
		setTitle("TextField");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(250,150);
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		c.add(new JLabel("Name     "));
		c.add(new TextField(15));
		c.add(new JLabel("Address  "));
		c.add(new TextField(15));
		c.add(new JLabel("TelePhone"));
		c.add(new TextField(15));
		
		setVisible(true);
	}
	public static void main(String[] ar){
		new Exam_10();
	}
}
