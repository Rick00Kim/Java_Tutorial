import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Exam_01 extends JFrame {
	//멤버필드
	JLabel lb;
	//생성자메서드
	public Exam_01(){
		setTitle("마우스로 문자열 이동");
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
		Container c=getContentPane();
		//배치관리자 설정
		/*c.setLayout(new FlowLayout());*/
		c.setLayout(null); // 배치관리자 제거 - 컴포넌트 크기나 위치 변경용도
		//컴퍼넌트
		lb= new JLabel("Hello~");
		lb.setSize(50,20);
		lb.setLocation(30,30);
		//이벤트 등록 : 대상객체.add ~ Listener()
		c.addMouseListener(new MouseAction());
		//컴퍼넌트 부착
		c.add(lb);
		//프레임 출력
		setVisible(true);
	}
	//멤버메서드
	public static void main(String[] ar){//콜백메서드
		new Exam_01();
	}
	//중첩클래스 - Event Handler : 이벤트를 처리를 하기 위한 클래스(어댑터-추상클래스)
	class MouseAction implements MouseListener{
		@Override
		public void mouseClicked(MouseEvent e) {
			int x = e.getX();//마우스를 클릭한 위치의 x좌표
			int y = e.getY();//마우스를 클릭한 위치의 y좌표
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
