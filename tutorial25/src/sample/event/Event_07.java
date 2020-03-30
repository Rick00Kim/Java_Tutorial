package sample.event;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Event_07 extends JFrame{
	public Event_07(){
		this.setTitle("Make JFrame");
		//프레임을 닫으면 프로그램도 종료되도록 하는 옵션
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 스윙컴퍼넌트를 부착하기 위해서는 컨텐트 팬을 얻어야 한다.
		Container c=getContentPane();
		c.setBackground(Color.BLUE); //배경설정
		c.setLayout(new FlowLayout()); //배치관리자 설정
		c.add(new JButton("HIGH"));
		c.add(new JButton("MIDDLE"));
		c.add(new JButton("LOW"));
		
		this.setSize(300,200);
		Dimension scn=Toolkit.getDefaultToolkit().getScreenSize();
		Dimension frm=getSize();
		int x=(int)(scn.getWidth()/2-frm.getWidth()/2);
		int y=(int)(scn.getHeight()/2-frm.getHeight()/2);
		this.setLocation(x,y);
		this.setResizable(false);
		this.setVisible(true);
	}
	public static void main(String[] ar){
		new Event_07();
	}
}
