import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.List;
import java.util.Vector;
public class Exam_08 extends JFrame{
	String[] singer={"A","B","C","D"};
	
	
	JLabel lb;
	Vector<String> ls=new Vector<String>();
	JComboBox lst=new JComboBox(ls);
	
	public Exam_08(){
		setTitle("¾ËÆÄºª");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c= getContentPane();
		c.setLayout(new FlowLayout());
		ls.add("AAA");
		ls.add("BBB");
		ls.add("CCC");
		ls.add("DDD");
		ls.add("EEE");
		c.add(lst);
		
		setSize(300,200);
		
		setVisible(true);
		
	}
	public static void main(String[] ar){
		new Exam_08();
	}
	class MyAction implements ItemListener{
		@Override
		public void itemStateChanged(ItemEvent arg0) {

		}
		
	}
}
