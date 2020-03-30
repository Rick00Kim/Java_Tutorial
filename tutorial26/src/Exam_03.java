import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Exam_03 extends JFrame{
	//����ʵ�
	public static final int MV=10;
	JLabel lb;
	//�����ڸ޼���
	public Exam_03() {
		setTitle("����Ű�� ���ڿ� �̵���Ű��");
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
		c.setBackground(new Color(255,236,133));
		
		//��ġ������ ����
		/*c.setLayout(new FlowLayout());*/
		c.setLayout(null); // ��ġ������ ���� - ������Ʈ ũ�⳪ ��ġ ����뵵
		
		//���۳�Ʈ
		lb= new JLabel("������������");
		lb.setFont(new Font(Font.SERIF,Font.BOLD,26));
		lb.setForeground(new Color(58,77,127));
		lb.setSize(240,30);
		lb.setLocation(30,30);
		
		//�̺�Ʈ ��� : ���ü.add ~ Listener()
		c.addKeyListener(new MyKeyAction());
		//���۳�Ʈ ����
		c.add(lb);
		//������ ���
		setVisible(true);
		
		// ����Ʈ���� Ű�� �Է¹��� �� �ֵ��� ��Ŀ���� ������ ����������Ѵ�.
		c.requestFocus();
	}
	//����޼���
	public static void main(String[] ar){//�ݹ�޼���
		new Exam_03();
	}
	class MyKeyAction implements KeyListener{

		@Override
		public void keyPressed(KeyEvent e) {
			int cli=e.getKeyCode();
			switch(cli)
			{
			case KeyEvent.VK_UP: 
				lb.setLocation(lb.getX(),lb.getY()-MV);
				break;
			case KeyEvent.VK_DOWN:
				lb.setLocation(lb.getX(),lb.getY()+MV);
				break;
			case KeyEvent.VK_LEFT:
				lb.setLocation(lb.getX()-MV,lb.getY());
				break;
			case KeyEvent.VK_RIGHT:
				lb.setLocation(lb.getX()+MV,lb.getY());
				break;
			}
		}

		@Override
		public void keyReleased(KeyEvent e) {}

		@Override
		public void keyTyped(KeyEvent e) {}

		
	}
}
