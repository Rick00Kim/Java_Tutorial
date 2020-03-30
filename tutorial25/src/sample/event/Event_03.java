package sample.event;

import java.awt.*;
import java.awt.event.*;

// 3. Listener를 구현하는 방법
class MyAction implements MouseListener{

	@Override
	public void mouseClicked(MouseEvent e) {
		Button b=(Button)e.getSource();
		if(b.getLabel().equals("クリック")){
			b.setLabel("클릭");
		}else{
			b.setLabel("クリック");
		}
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
class Event_03_sub extends Frame{
	private Button btn1=new Button("クリック");
	public Event_03_sub(String title){
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
		btn1.addMouseListener(new MyAction());
	}
}

public class Event_03 {
	public static void main(String[] ar){
		Event_03_sub ex=new Event_03_sub("ActionListener 실습");
	}
}