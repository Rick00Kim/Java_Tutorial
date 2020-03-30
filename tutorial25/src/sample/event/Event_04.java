package sample.event;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*; // JFC(Swing) - �淮 ������Ʈ

class Event_04_sub extends JFrame{
	private JButton btn1=new JButton("����ë�");
	public Event_04_sub(String title){
		super(title);
		//�������� ũ�⼳��
		this.setSize(300,200);
		//�������� ����� ���߾ӿ� ��ġ�ϴ� �۾�
		Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
		Dimension frm=this.getSize();
		int x=(int)(screen.getWidth()/2-frm.getWidth()/2);
		int y=(int)(screen.getHeight()/2-frm.getHeight()/2);
		this.setLocation(x, y);
		//�������� ȭ�� ������ �����ϴ� �޼���
		init();
		//Thread�� Event ó���� ����ϴ� �޼���
		start();
		//ȭ�鿡 ǥ��
		this.setResizable(false);
		this.setVisible(true);
	}
	private void init(){
		this.setLayout(new GridBagLayout()); // ��ġ������ ����
//		setBackground(Color.BLACK);
		Container c = getContentPane();
		c.setBackground(Color.BLUE);
		btn1.setBackground(Color.green);
		btn1.setForeground(Color.RED);
		add(btn1);
		
	}
	private void start(){
		//4.
		MouseAdapter ma=new MouseAdapter(){//������øŬ����
			@Override
			public void mouseClicked(MouseEvent e) {
				JButton b=(JButton)e.getSource();
				if(b.getText().equals("����ë�")){
					b.setText("Ŭ��");
				}else{
					b.setText("����ë�");
				}
			}
		};
		btn1.addMouseListener(ma);
	}
}
public class Event_04 {
	public static void main(String[] ar){
		Event_04_sub ex=new Event_04_sub("ActionListener �ǽ�");
	}
}