package basic.frame;
//Border
import java.awt.*;
class Frame_07_Sub extends Frame{
	Button btn1=new Button("Straight");
	Button btn2=new Button("Left");
	Button btn3=new Button("Back");
	Button btn4=new Button("Right");
	Button btn5=new Button("Stop");
	BorderLayout bl=new BorderLayout(10,10);
	public Frame_07_Sub(String title){
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
//		add("NORTH",btn1);
//		add("WEST",btn2);
//		add("SOUTH",btn3);
//		add("EAST",btn4);
//		add("CENTER",btn5);
		add(btn1,BorderLayout.NORTH);
		add(btn2,BorderLayout.WEST);
		add(btn3,BorderLayout.SOUTH);
		add(btn4,BorderLayout.EAST);
		add(btn5,BorderLayout.CENTER);
		
	}
	public void start(){ // Event나 Thread를 구현
		
	}
}
public class Frame_07 {
	public static void main(String[] ar){
		Frame_07_Sub ex=new Frame_07_Sub("1123123");
	}
}
