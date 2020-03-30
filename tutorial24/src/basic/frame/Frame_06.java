package basic.frame;

import java.awt.*;
class Frame_06_Sub extends Frame{
	
	Button btn1=new Button("いち");
	Button btn2=new Button("に");
	Button btn3=new Button("さん");
	Button btn4=new Button("よん");
	Button btn5=new Button("ご");
	Button btn6=new Button("ろく");
	GridLayout gr=new GridLayout(3,2,10,10);
	public Frame_06_Sub(String title){
		super(title);// 제목 설정
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
		setLayout(gr);
		add(btn1);add(btn2);add(btn3);
		add(btn4);add(btn5);add(btn6);
	}
	public void start(){ // Event나 Thread를 구현
		
	}
}
public class Frame_06 {
	public static void main(String[] ar){
		Frame_06_Sub ex=new Frame_06_Sub("1123123");
	}
}

