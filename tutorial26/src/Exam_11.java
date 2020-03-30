import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Exam_11 extends JFrame {
	Container c;
	public Exam_11(){
		setTitle("Exam_11");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,300);
		c=getContentPane();
		c.setLayout(new BorderLayout());
		c.setBackground(new Color(255,244,145));
		init();
		start();
		setVisible(true);
	}
	public void init(){
		JSlider sl=new JSlider(JSlider.HORIZONTAL,0,200,100);
		sl.setPaintLabels(true);
		sl.setPaintTicks(true);
		sl.setPaintTrack(true);
		sl.setBackground(new Color(255,244,145));
		sl.setMajorTickSpacing(50);
		sl.setMinorTickSpacing(10);
		
		c.add("South",sl);
	}
	public void start(){
		
	}
	public static void main(String[] ar){
		new Exam_11();
	}
}
