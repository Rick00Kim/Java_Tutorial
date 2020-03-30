import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Exam_04 extends JFrame {
	//멤버필드
	JPanel p=new JPanel();
	JLabel lb;
	JLabel txt;
	//생성자메서드
	public Exam_04(){
		setTitle("MouseListener Method");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//사이즈 설정
		setSize(500,300);
		//초기 위치 설정
		Dimension scn=Toolkit.getDefaultToolkit().getScreenSize();
		Dimension frm=getSize();
		int x=(int)(scn.getWidth()/2-frm.getWidth()/2);
		int y=(int)(scn.getHeight()/2-frm.getHeight()/2);
		setLocation(x,y);
		//컨텐트 팬 얻어오기, 초기화
//		Container c=getContentPane();
		setContentPane(p);
		//배치관리자 설정
		
		//컴퍼넌트
		lb= new JLabel("No Mouse Event");
		lb.setSize(50,20);
		lb.setLocation(30,30);
		//이벤트 등록 : 대상객체.add ~ Listener()
		p.addMouseListener(new MyMouseAc());
		p.addMouseMotionListener(new MyMouseAc());
		//컴퍼넌트 부착
		p.add(lb);
		//프레임 출력
		setVisible(true);
	}
	//멤버메서드
	public static void main(String[] ar){//콜백메서드
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
			JPanel p=(JPanel)e.getSource();//마우스가 올라간 컨텐트팬의 값을 얻어오는 행위
			p.setBackground(new Color(255,236,133));
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			JPanel p=(JPanel)e.getSource();//마우스가 올라간 컨텐트팬의 값을 얻어오는 행위
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