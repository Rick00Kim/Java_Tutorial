package basic.frame;
import java.awt.*;
class Frame_03_Sub extends Frame{
	public Frame_03_Sub(String title){
		setTitle(title);// ���� ����
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
	public void init(){ // �ʱ�ȭ : ��(Frame)�� ���� ȯ�漳��
		
	}
	public void start(){ // Event�� Thread�� ����
		
	}
}
public class Frame_03 {
	public static void main(String[] ar){
		Frame_03_Sub ex=new Frame_03_Sub("1123123");
	}
}
