package basic.frame;
import java.awt.*;


public class Frame_01 {
	public static void main(String[] ar){
		Frame f1=new Frame("Hello_JAVA(�ڹ� GUI��)");
//		Frame f2= new Frame("Hello_JAVA(�ڹ� GUI��)");
		
		f1.setSize(300,200);
		//������ ������ ��ġ ����
		Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
		Dimension f_size=f1.getSize();
		int x=(int)(screen.getWidth()/2-f_size.getWidth()/2);
		int y=(int)(screen.getHeight()/2-f_size.getHeight()/2);
		f1.setLocation(x,y);
		//������ Frame ������ ���� ���� Default : true
		f1.setResizable(false);
		f1.setVisible(true);
	}
}
