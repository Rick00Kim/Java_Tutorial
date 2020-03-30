import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Exam_05 extends JFrame {
	//멤버필드
	JButton[] btn=new JButton[4];
	Container c;
	//생성자메서드
	public Exam_05(){
		setTitle("JComponent의 공통 메서드");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//사이즈 설정
		setSize(250,200);
		//초기 위치 설정
		Dimension scn=Toolkit.getDefaultToolkit().getScreenSize();
		Dimension frm=getSize();
		int x=(int)(scn.getWidth()/2-frm.getWidth()/2);
		int y=(int)(scn.getHeight()/2-frm.getHeight()/2);
		setLocation(x,y);
		//컨텐트 팬 얻어오기, 초기화
		c=getContentPane();
		c.setBackground(new Color(255,236,133));
		
		//배치관리자 설정
		c.setLayout(new FlowLayout());
		//컴퍼넌트
		btn[0]=new JButton("위치와 크기 정보");
		btn[0].addActionListener(new ButtonAction());
		c.add(btn[0]);
		
		btn[1]=new JButton("모양 정보");
		btn[1].setOpaque(true);
		btn[1].setBackground(Color.YELLOW);
		btn[1].setForeground(Color.BLACK);
		btn[1].setFont(new Font("고딕체",Font.ITALIC,15));
		btn[1].addActionListener(new ButtonAction());
		c.add(btn[1]);
		
		btn[2]=new JButton("활성화되지 않은 버튼");
		btn[2].setEnabled(false);
		btn[2].addActionListener(new ButtonAction());
		c.add(btn[2]);
		
		btn[3]=new JButton("숨기기/보이기");
		btn[3].addActionListener(new ButtonAction());
		c.add(btn[3]);
		
		//이벤트 등록 : 대상객체.add ~ Listener()
		
		//컴퍼넌트 부착
		
		//프레임 출력
		setVisible(true);
	}
	//멤버메서드
	public static void main(String[] ar){//콜백메서드
		new Exam_05();
	}
	//중첩 클래스
	class ButtonAction implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			//선택된 버튼을 알아내는 작업
			JButton tmp=(JButton)e.getSource();
			
			// Button이라는 변수가 가지고 있는 값이 어떤 버튼인지 구분하여 이벤트를 처리한다.
			if(tmp==btn[0]){
				System.out.println(tmp.getText());
				System.out.println("Location : ("+tmp.getX()+", "+tmp.getY()+")");
				System.out.println("Size : "+tmp.getWidth()+", "+tmp.getHeight());
			}else if(tmp==btn[1]){
				System.out.println(tmp.getText());
				System.out.println("Background : "+tmp.getBackground());
				System.out.println("Foreground : "+tmp.getForeground());
				System.out.println("Font : "+tmp.getFont());
			}else{
				if(btn[0].isVisible()){
					btn[0].setVisible(false);
					btn[1].setVisible(false);
					btn[2].setVisible(false);
				}else{
					btn[0].setVisible(true);
					btn[1].setVisible(true);
					btn[2].setVisible(true);
					
				}
			}
		}
		
	}
}