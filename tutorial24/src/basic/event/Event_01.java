package basic.event;

import java.awt.*;
import java.awt.event.*;

class Event_01_sub extends Frame{
	
	private Button close =new Button("Close");
	
	public Event_01_sub(String title){
		super(title);
		this.setSize(300, 200);
		init();
		start();
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension frm=this.getSize();
		int x=(int)(screen.getWidth()/2-frm.getWidth()/2);
		int y=(int)(screen.getHeight()/2-frm.getHeight()/2);
		this.setResizable(false);
		this.setLocation(x, y);
		this.setVisible(true);
		
	}
	public void init(){ // 초기화 : 폼(Frame)의 구성 환경설정
		setLayout(new GridBagLayout());
		
		//버튼 객체에 이벤트 등록(중첩클래스)
		close.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);	
			}
		});
		add(close);
	}
	public void start(){ // Event나 Thread를 구현
		
	}
}
public class Event_01 {
	public static void main(String[] ar){
		Event_01_sub ex=new Event_01_sub("이벤트 처리");
	}
}
