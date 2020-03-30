package basic.frame;
import java.awt.*;

public class Frame_02 extends Frame{
	public Frame_02(){//default생성자(기본 생성자) : 멤버필드를 초기화하는 역할을 수행.
		super("HELLO_JAVA");
		this.setSize(300, 200);
		Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
		Dimension frm=this.getSize();
		int x=(int)(screen.getWidth()/2-frm.getWidth()/2);
		int y=(int)(screen.getHeight()/2-frm.getHeight()/2);
		this.setLocation(x, y); //좌표값위치로 이동
		this.setResizable(false);//크기 고정
		this.setVisible(true);// 보이기
	}
	public static void main(String[] ar){
		new Frame_02();
	}
}
