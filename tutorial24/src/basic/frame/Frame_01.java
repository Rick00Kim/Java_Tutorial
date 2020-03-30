package basic.frame;
import java.awt.*;


public class Frame_01 {
	public static void main(String[] ar){
		Frame f1=new Frame("Hello_JAVA(자바 GUI폼)");
//		Frame f2= new Frame("Hello_JAVA(자바 GUI폼)");
		
		f1.setSize(300,200);
		//사이즈 조정과 위치 조정
		Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
		Dimension f_size=f1.getSize();
		int x=(int)(screen.getWidth()/2-f_size.getWidth()/2);
		int y=(int)(screen.getHeight()/2-f_size.getHeight()/2);
		f1.setLocation(x,y);
		//생성된 Frame 사이즈 조정 막기 Default : true
		f1.setResizable(false);
		f1.setVisible(true);
	}
}
