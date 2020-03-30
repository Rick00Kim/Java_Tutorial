package sample.event;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*; // JFC(Swing) - 경량 컴포넌트

class Event_04_sub extends JFrame{
	private JButton btn1=new JButton("クリック");
	public Event_04_sub(String title){
		super(title);
		//프레임의 크기설정
		this.setSize(300,200);
		//프레임을 모니터 정중앙에 배치하는 작업
		Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
		Dimension frm=this.getSize();
		int x=(int)(screen.getWidth()/2-frm.getWidth()/2);
		int y=(int)(screen.getHeight()/2-frm.getHeight()/2);
		this.setLocation(x, y);
		//프레임의 화면 구성을 설정하는 메서드
		init();
		//Thread나 Event 처리를 담당하는 메서드
		start();
		//화면에 표시
		this.setResizable(false);
		this.setVisible(true);
	}
	private void init(){
		this.setLayout(new GridBagLayout()); // 배치관리자 설정
//		setBackground(Color.BLACK);
		Container c = getContentPane();
		c.setBackground(Color.BLUE);
		btn1.setBackground(Color.green);
		btn1.setForeground(Color.RED);
		add(btn1);
		
	}
	private void start(){
		//4.
		MouseAdapter ma=new MouseAdapter(){//지역중첩클래스
			@Override
			public void mouseClicked(MouseEvent e) {
				JButton b=(JButton)e.getSource();
				if(b.getText().equals("クリック")){
					b.setText("클릭");
				}else{
					b.setText("クリック");
				}
			}
		};
		btn1.addMouseListener(ma);
	}
}
public class Event_04 {
	public static void main(String[] ar){
		Event_04_sub ex=new Event_04_sub("ActionListener 실습");
	}
}