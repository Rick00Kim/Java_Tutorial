package basic.frame;

import java.awt.*;
class Frame_10_Sub extends Frame{
	Button btn1 =new Button("Okay");
	Button btn2 =new Button("Cancle1");
	Button btn3 =new Button("Cancle2");
	BorderLayout bl=new BorderLayout();
	
	Panel p=new Panel();
	GridLayout gl=new GridLayout(1,2);
	
	Panel p2=new Panel();
	GridLayout gl2=new GridLayout(2,1);
	
	public Frame_10_Sub(String title){
		setTitle(title);// 제목 설정
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
		setLayout(bl);
		
		p.setLayout(new GridLayout(1,2));
		p.add(btn1);
		p2.setLayout(new GridLayout(2,1));
		p2.add(btn2);
		p2.add(btn3);
		p.add(p2);
		 
		add("South",p);
	}
	public void start(){ // Event나 Thread를 구현
		
	}
}
public class Frame_10 {
	public static void main(String[] ar){
		Frame_10_Sub ex=new Frame_10_Sub("HELLO_JAVA");
	}
}