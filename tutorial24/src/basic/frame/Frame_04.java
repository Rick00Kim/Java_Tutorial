package basic.frame;
//add Component
import java.awt.*;

class Frame_04_Sub extends Frame{
	//����ʵ�
	Label lb=new Label("�誦����!!",Label.CENTER);
	public Frame_04_Sub(String title){
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
		this.add(lb);
	}
	public void start(){ // Event�� Thread�� ����
		
	}
}
public class Frame_04 {
	public static void main(String[] ar){
		Frame_04_Sub ex = new Frame_04_Sub("HELLO_JAVA");
	}
}