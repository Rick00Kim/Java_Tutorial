package karaoke.ui;

import javax.swing.*;

public class FirstFrame extends JFrame{
	String[] column={"이름","나이","출신지역","전화번호"};
	JPanel firstMain=null;
	JTable studentTable=null;
	public FirstFrame(){
		this.setTitle("연습입니다.");
		this.setSize(1000,500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		makeTable();
		
		this.setResizable(false); //프레임 크기 고정
		this.setVisible(true);
	}
	public void makeTable(){
		studentTable=new JTable();
		
	}
	public static void main(String[] ar){
		new FirstFrame();
	}
}