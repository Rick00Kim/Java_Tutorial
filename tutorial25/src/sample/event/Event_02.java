package sample.event;

import java.awt.*;
import java.awt.event.*;
//2. 해당프레임클래스에 Listener를 상속받아 구현하는 방법
class Event_02_sub extends Frame implements ActionListener{
	private Button btn1=new Button("クリック");
	public Event_02_sub(String title){
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
		this.setBackground(Color.blue);
		btn1.setBackground(Color.green);
		btn1.setForeground(Color.RED);
		add(btn1);
		
	}
	private void start(){
		// 이벤트 등록 : 대상객체.add~Listener()
		btn1.addActionListener(this);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Button b=(Button)e.getSource();//다운 캐스팅
		if(b.getLabel().equals("クリック")){
			b.setLabel("클릭");
		}else{
			b.setLabel("クリック");
		}
	}
}
public class Event_02 {
	public static void main(String[] ar){
		Event_02_sub ex=new Event_02_sub("ActionListener 실습");
	}
}