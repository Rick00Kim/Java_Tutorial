import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Exam_01 extends JFrame {
	//����ʵ�
	JLabel lb;
	//�����ڸ޼���
	public Exam_01(){
		setTitle("���콺�� ���ڿ� �̵�");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//������ ����
		setSize(500,300);
		//�ʱ� ��ġ ����
		Dimension scn=Toolkit.getDefaultToolkit().getScreenSize();
		Dimension frm=getSize();
		int x=(int)(scn.getWidth()/2-frm.getWidth()/2);
		int y=(int)(scn.getHeight()/2-frm.getHeight()/2);
		setLocation(x,y);
		//����Ʈ �� ������, �ʱ�ȭ
		Container c=getContentPane();
		//��ġ������ ����
		/*c.setLayout(new FlowLayout());*/
		c.setLayout(null); // ��ġ������ ���� - ������Ʈ ũ�⳪ ��ġ ����뵵
		//���۳�Ʈ
		lb= new JLabel("Hello~");
		lb.setSize(50,20);
		lb.setLocation(30,30);
		//�̺�Ʈ ��� : ���ü.add ~ Listener()
		c.addMouseListener(new MouseAction());
		//���۳�Ʈ ����
		c.add(lb);
		//������ ���
		setVisible(true);
	}
	//����޼���
	public static void main(String[] ar){//�ݹ�޼���
		new Exam_01();
	}
	//��øŬ���� - Event Handler : �̺�Ʈ�� ó���� �ϱ� ���� Ŭ����(�����-�߻�Ŭ����)
	class MouseAction implements MouseListener{
		@Override
		public void mouseClicked(MouseEvent e) {
			int x = e.getX();//���콺�� Ŭ���� ��ġ�� x��ǥ
			int y = e.getY();//���콺�� Ŭ���� ��ġ�� y��ǥ
			lb.setLocation(x,y);
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
}
