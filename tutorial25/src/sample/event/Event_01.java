package sample.event;
import java.awt.*; // ������Ʈ - ��ư, ���̺�, üũ�ڽ� ���
import java.awt.event.*; 
class Event_01_sub extends Frame{
	private Button btn1=new Button("����ë�");
	public Event_01_sub(String title){
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
		//1.�͸��� ��ø Ŭ������ �̿��ϴ� ���
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Button b=(Button)e.getSource(); //���õ� ��ư�� ���� ��� ������ ���´�.
				if(b.getLabel().equals("����ë�"))
						b.setLabel("Ŭ��");
				else
					b.setLabel("����ë�");			
			}
		});
	}
}
public class Event_01 {
	public static void main(String[] ar){
		Event_01_sub ex=new Event_01_sub("ActionListener �ǽ�");
	}
}
