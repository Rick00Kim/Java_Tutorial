import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Exam_04 extends JFrame {
	//����ʵ�
	JPanel p=new JPanel();
	JLabel lb;
	JLabel txt;
	//�����ڸ޼���
	public Exam_04(){
		setTitle("MouseListener Method");
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
//		Container c=getContentPane();
		setContentPane(p);
		//��ġ������ ����
		
		//���۳�Ʈ
		lb= new JLabel("No Mouse Event");
		lb.setSize(50,20);
		lb.setLocation(30,30);
		//�̺�Ʈ ��� : ���ü.add ~ Listener()
		p.addMouseListener(new MyMouseAc());
		p.addMouseMotionListener(new MyMouseAc());
		//���۳�Ʈ ����
		p.add(lb);
		//������ ���
		setVisible(true);
	}
	//����޼���
	public static void main(String[] ar){//�ݹ�޼���
		new Exam_04();
	}
	class MyMouseAc implements MouseListener, MouseMotionListener{

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
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			lb.setText("Released : ("+e.getX()+", "+e.getY()+")");
		}
		
	}
}