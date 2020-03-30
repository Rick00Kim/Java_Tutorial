package basic.frame;
//add Component
import java.awt.*;

class Frame_04_Sub extends Frame{
	//멤버필드
	Label lb=new Label("ようこそ!!",Label.CENTER);
	public Frame_04_Sub(String title){
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
		this.add(lb);
	}
	public void start(){ // Event나 Thread를 구현
		
	}
}
public class Frame_04 {
	public static void main(String[] ar){
		Frame_04_Sub ex = new Frame_04_Sub("HELLO_JAVA");
	}
}