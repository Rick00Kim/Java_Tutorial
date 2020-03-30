package sample.event;

import java.awt.*;
import java.awt.event.*;
//2. �ش�������Ŭ������ Listener�� ��ӹ޾� �����ϴ� ���
class Event_02_sub extends Frame implements ActionListener{
	private Button btn1=new Button("����ë�");
	public Event_02_sub(String title){
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
		// �̺�Ʈ ��� : ���ü.add~Listener()
		btn1.addActionListener(this);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Button b=(Button)e.getSource();//�ٿ� ĳ����
		if(b.getLabel().equals("����ë�")){
			b.setLabel("Ŭ��");
		}else{
			b.setLabel("����ë�");
		}
	}
}
public class Event_02 {
	public static void main(String[] ar){
		Event_02_sub ex=new Event_02_sub("ActionListener �ǽ�");
	}
}