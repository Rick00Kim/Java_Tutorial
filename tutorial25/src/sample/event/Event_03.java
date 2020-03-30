package sample.event;

import java.awt.*;
import java.awt.event.*;

// 3. Listener�� �����ϴ� ���
class MyAction implements MouseListener{

	@Override
	public void mouseClicked(MouseEvent e) {
		Button b=(Button)e.getSource();
		if(b.getLabel().equals("����ë�")){
			b.setLabel("Ŭ��");
		}else{
			b.setLabel("����ë�");
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		
	}
	
}
class Event_03_sub extends Frame{
	private Button btn1=new Button("����ë�");
	public Event_03_sub(String title){
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
		this.setBackground(Color.blue);
		btn1.setBackground(Color.green);
		btn1.setForeground(Color.RED);
		add(btn1);
		
	}
	private void start(){
		btn1.addMouseListener(new MyAction());
	}
}

public class Event_03 {
	public static void main(String[] ar){
		Event_03_sub ex=new Event_03_sub("ActionListener �ǽ�");
	}
}