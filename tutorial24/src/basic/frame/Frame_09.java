package basic.frame;

import java.awt.*;
class Frame_09_Sub extends Frame{
	
	private Button btn1=new Button("AAA");
	private Button btn2=new Button("BBB");
	private Button btn3=new Button("CCC");
	private Button btn4=new Button("DDD");
	private Button btn5=new Button("EEE");
	private Button btn6=new Button("HHH");
	private Button btn7=new Button("GGG");
	
	private GridBagLayout gbl=new GridBagLayout();
	private GridBagConstraints gc=new GridBagConstraints();
	
	public Frame_09_Sub(String title){
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
		this.setLayout(gbl);
		gc.gridx=0;
		gc.gridy=0;
		gbl.setConstraints(btn1, gc);
		add(btn1);
		
		gc.gridx=1;
		gc.gridy=1;
		gbl.setConstraints(btn2, gc);
		add(btn2);
	}
	public void start(){ // Event나 Thread를 구현
		
	}
}
public class Frame_09 {
	public static void main(String[] ar){
		Frame_09_Sub ex=new Frame_09_Sub("1123123");
	}
}
