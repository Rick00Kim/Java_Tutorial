package basic.frame;
//Button
import java.awt.*;

class Frame_05_Sub extends Frame{
	
	//멤버필드
	Button btn1=new Button("1");
	Button btn2=new Button("2");
	Button btn3=new Button("3");
	Button btn4=new Button("4");
	Button btn5=new Button("5");
	Button btn6=new Button("6");
	FlowLayout fl=new FlowLayout(FlowLayout.RIGHT);
	public Frame_05_Sub(String title){
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
		this.setLayout(fl);
		add(btn1);add(btn2);
		add(btn3);add(btn4);
		add(btn5);add(btn6);
		
	}
	public void start(){ // Event나 Thread를 구현
		
	}
}
public class Frame_05 {
	public static void main(String[] ar){
		Frame_05_Sub ex = new Frame_05_Sub("HELLO_JAVA");
	}
}