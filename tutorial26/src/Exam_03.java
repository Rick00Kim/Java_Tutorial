import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Exam_03 extends JFrame{
	//멤버필드
	public static final int MV=10;
	JLabel lb;
	//생성자메서드
	public Exam_03() {
		setTitle("방향키로 문자열 이동시키기");
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
		c.setBackground(new Color(255,236,133));
		
		//배치관리자 설정
		/*c.setLayout(new FlowLayout());*/
		c.setLayout(null); // 배치관리자 제거 - 컴포넌트 크기나 위치 변경용도
		
		//컴퍼넌트
		lb= new JLabel("いちごいちえ");
		lb.setFont(new Font(Font.SERIF,Font.BOLD,26));
		lb.setForeground(new Color(58,77,127));
		lb.setSize(240,30);
		lb.setLocation(30,30);
		
		//이벤트 등록 : 대상객체.add ~ Listener()
		c.addKeyListener(new MyKeyAction());
		//컴퍼넌트 부착
		c.add(lb);
		//프레임 출력
		setVisible(true);
		
		// 컨텐트팬이 키를 입력받을 수 있도록 포커스를 강제로 지정해줘야한다.
		c.requestFocus();
	}
	//멤버메서드
	public static void main(String[] ar){//콜백메서드
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
