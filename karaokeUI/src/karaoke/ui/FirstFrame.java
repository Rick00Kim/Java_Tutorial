package karaoke.ui;

import javax.swing.*;

public class FirstFrame extends JFrame{
	String[] column={"�̸�","����","�������","��ȭ��ȣ"};
	JPanel firstMain=null;
	JTable studentTable=null;
	public FirstFrame(){
		this.setTitle("�����Դϴ�.");
		this.setSize(1000,500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		makeTable();
		
		this.setResizable(false); //������ ũ�� ����
		this.setVisible(true);
	}
	public void makeTable(){
		studentTable=new JTable();
		
	}
	public static void main(String[] ar){
		new FirstFrame();
	}
}