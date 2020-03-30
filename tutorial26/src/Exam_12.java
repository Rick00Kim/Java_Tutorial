import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
public class Exam_12 extends JFrame{
	Container c;
	JSlider[] sl=new JSlider[3];
	JLabel[] lbc=new JLabel[3];
	String[] names={"RED","GREEN","BLUE"};
	JLabel lb=new JLabel("Slider Example");
	JPanel[] p=new JPanel[3];
	int[] co={50000,10000,5000,1000,500,100,50,10,1};
	public Exam_12(){
		setTitle("JSlider02");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(700,700);
		c=getContentPane();
		c.setLayout(new GridLayout(4,1));
		
		init();
		start();
		setVisible(true);
	}
	public void init(){
		for(int i=0;i<sl.length;i++){
			sl[i]=new JSlider(JSlider.HORIZONTAL,0,255,180);
			sl[i].setPaintLabels(true);
			sl[i].setPaintTicks(true);
			sl[i].setPaintTrack(true);
			sl[i].setMajorTickSpacing(50);
			sl[i].setMinorTickSpacing(10);
			sl[i].addChangeListener(new SliderEvent());
			
			c.add(sl[i]);
		}
		
		
		sl[0].setForeground(Color.RED);
		sl[1].setForeground(Color.GREEN);
		sl[2].setForeground(Color.BLUE);
		lb.setOpaque(true);
		lb.setBackground(new Color(sl[0].getValue(),sl[1].getValue(),sl[2].getValue()));
		c.add(lb);
	}
	public void start(){
		
	}
	public void make_button(){
		
	}
	public static void main(String[] ar){
		new Exam_12();
	}
	class SliderEvent implements ChangeListener{

		@Override
		public void stateChanged(ChangeEvent e) {
			lb.setBackground(new Color(sl[0].getValue(),
					sl[1].getValue(),sl[2].getValue()));
			
		}
	}
	class SliderLabelEvent implements ChangeListener{

		@Override
		public void stateChanged(ChangeEvent e) {
			
		}
		
	}
	
}
