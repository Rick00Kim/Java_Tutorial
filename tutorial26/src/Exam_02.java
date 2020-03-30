import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Exam_02 extends JFrame{
	JLabel lb;
	int cnt=0;
	Exam_02(){
		setTitle("마우스클릭 움직이기");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,300);
		Container c=getContentPane();
		c.setLayout(null);
		
		lb=new JLabel("Kururu....");
		lb.setSize(100,20);
		lb.setLocation(30,30);
		c.addMouseListener(new MouseAc());
		
		c.add(lb);

		this.setVisible(true);		
	}
	
	public static void main(String[] ar){
		new Exam_02();
	}
	class MouseAc extends MouseAdapter{
		@Override
		public void mouseClicked(MouseEvent e) {
			int x=e.getX();
			int y=e.getY();
			lb.setLocation(x,y);
		}

	}
}
