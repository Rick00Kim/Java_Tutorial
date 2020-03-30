package sample.event;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Event_07 extends JFrame{
	public Event_07(){
		this.setTitle("Make JFrame");
		//�������� ������ ���α׷��� ����ǵ��� �ϴ� �ɼ�
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// �������۳�Ʈ�� �����ϱ� ���ؼ��� ����Ʈ ���� ���� �Ѵ�.
		Container c=getContentPane();
		c.setBackground(Color.BLUE); //��漳��
		c.setLayout(new FlowLayout()); //��ġ������ ����
		c.add(new JButton("HIGH"));
		c.add(new JButton("MIDDLE"));
		c.add(new JButton("LOW"));
		
		this.setSize(300,200);
		Dimension scn=Toolkit.getDefaultToolkit().getScreenSize();
		Dimension frm=getSize();
		int x=(int)(scn.getWidth()/2-frm.getWidth()/2);
		int y=(int)(scn.getHeight()/2-frm.getHeight()/2);
		this.setLocation(x,y);
		this.setResizable(false);
		this.setVisible(true);
	}
	public static void main(String[] ar){
		new Event_07();
	}
}
