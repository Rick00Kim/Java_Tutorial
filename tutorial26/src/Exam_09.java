import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Exam_09 extends JFrame{
	Container c;
	String[] names={"Iron Man","Captain America","Hulk"};
	JRadioButton[] jb=new JRadioButton[3];
	ButtonGroup bg=new ButtonGroup();
	JLabel lb=new JLabel();
	ImageIcon[] image=new ImageIcon[3];
		public Exam_09(){
		setTitle("Event 활용");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		c=getContentPane();
		c.setLayout(new BorderLayout());

		JPanel p=new JPanel();
		p.setBackground(Color.GRAY);
		for(int i=0;i<jb.length;i++){
			jb[i]=new JRadioButton(names[i]);
			bg.add(jb[i]);
			p.add(jb[i]);
			jb[i].addItemListener(new Action());
		}
		image[0]=new ImageIcon("images/ironMan_01.jpg");
		image[1]=new ImageIcon("images/captain_01.jpg");
		image[2]=new ImageIcon("images/hulk_01.jpeg");
		jb[2].setSelected(true);
		c.add(p,BorderLayout.NORTH);
		c.add(lb,BorderLayout.CENTER);
		lb.setHorizontalAlignment(SwingConstants.CENTER);
		setSize(400,400);
		
		setVisible(true);
	}
	public static void main(String[] ar){
		new Exam_09();
	}
	class Action implements ItemListener{
		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange()==ItemEvent.DESELECTED){
				lb.setIcon(image[2]);
				return;
			}//선택된 상태라면 어떤항목이 선택되었느나에 따라 보여줄 이미지가 달라진다.
			if(jb[0].isSelected()){
				lb.setIcon(image[0]);
			}else if(jb[1].isSelected()){
				lb.setIcon(image[1]);
			}else{
				lb.setIcon(image[2]);
			}
		}
		
	}
}