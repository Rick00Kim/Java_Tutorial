package basic.frame;
import java.awt.*;
class Frame_08_Sub extends Frame{
	private Button btn1=new Button("1");
	private Button btn2=new Button("2");
	private Button btn3=new Button("3");
	CardLayout cl=new CardLayout();
	public Frame_08_Sub(String title){
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
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		cl.show(this, "aa");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		cl.show(this, "bb");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		cl.show(this, "cc");
	}
	public void init(){ // 초기화 : 폼(Frame)의 구성 환경설정
		setLayout(cl);
		btn1.setBackground(Color.RED);
		add("aa",btn1);
		btn2.setBackground(Color.GREEN);
		add("bb",btn2);
		btn3.setBackground(Color.BLUE);
		add("cc",btn3);
	}
	public void start(){ // Event나 Thread를 구현
		
	}
}
public class Frame_08 {
	public static void main(String[] ar){
		Frame_08_Sub ex=new Frame_08_Sub("1123123");
	}
}
