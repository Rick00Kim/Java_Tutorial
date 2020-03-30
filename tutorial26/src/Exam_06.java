import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Exam_06 extends JFrame{
	//����ʵ�
	JLabel lb;
	//�����ڸ޼���
	public Exam_06() {
		setTitle("�̹��� ���̺�");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//������ ����
		setSize(500,500);
		//�ʱ� ��ġ ����
		Dimension scn=Toolkit.getDefaultToolkit().getScreenSize();
		Dimension frm=getSize();
		int x=(int)(scn.getWidth()/2-frm.getWidth()/2);
		int y=(int)(scn.getHeight()/2-frm.getHeight()/2);
		setLocation(x,y);
		//����Ʈ �� ������, �ʱ�ȭ
		Container c=getContentPane();
		c.setBackground(Color.BLACK);
		
		//��ġ������ ����
		c.setLayout(new FlowLayout());
		//���۳�Ʈ
		lb=new JLabel("Shoot");
		//�̹��� ���̺��� ���� ������Ʈ ����
		ImageIcon iron = new ImageIcon("images/ironMan_01.jpg");
		JLabel image = new JLabel(iron);
		//�̺�Ʈ ��� : ���ü.add ~ Listener()
		c.addMouseListener(new MyMouse());
		c.addMouseMotionListener(new MyMouse());
		
		//���۳�Ʈ ����
		c.add(lb);
		c.add(image);
		
		//������ ���
		setVisible(true);
	}
	//����޼���
	public static void main(String[] ar){//�ݹ�޼���
		new Exam_06();
	}
	class MyMouse implements MouseListener, MouseMotionListener{
		int cnt=0;
		@Override
		public void mouseDragged(MouseEvent e) {
			lb.setText("Dragged : ("+e.getX()+", "+e.getY()+")");
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			lb.setText("Moved : ("+e.getX()+", "+e.getY()+")");
		}

		@Override
		public void mouseClicked(MouseEvent e) {
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			JPanel p=(JPanel)e.getSource();//���콺�� �ö� ����Ʈ���� ���� ������ ����
			p.setBackground(new Color(255,236,133));
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			JPanel p=(JPanel)e.getSource();//���콺�� �ö� ����Ʈ���� ���� ������ ����
			int r=(int)(Math.random()*256);
			int g=(int)(Math.random()*256);
			int b=(int)(Math.random()*256);
			p.setBackground(new Color(r,g,b));
		}

		@Override
		public void mousePressed(MouseEvent e) {
			
			lb.setText("Pressed : ("+e.getX()+", "+e.getY()+")");
			cnt++;
			if(cnt==10)
				System.exit(0);
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			lb.setText("Released : ("+e.getX()+", "+e.getY()+")");
		}
		
	}
}
