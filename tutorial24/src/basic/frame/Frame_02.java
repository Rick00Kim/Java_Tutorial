package basic.frame;
import java.awt.*;

public class Frame_02 extends Frame{
	public Frame_02(){//default������(�⺻ ������) : ����ʵ带 �ʱ�ȭ�ϴ� ������ ����.
		super("HELLO_JAVA");
		this.setSize(300, 200);
		Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
		Dimension frm=this.getSize();
		int x=(int)(screen.getWidth()/2-frm.getWidth()/2);
		int y=(int)(screen.getHeight()/2-frm.getHeight()/2);
		this.setLocation(x, y); //��ǥ����ġ�� �̵�
		this.setResizable(false);//ũ�� ����
		this.setVisible(true);// ���̱�
	}
	public static void main(String[] ar){
		new Frame_02();
	}
}
