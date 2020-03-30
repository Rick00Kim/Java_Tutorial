package test;
/*
 * 금액을 입력받아 화폐매수를 계산하여 출력하는 프로그램을 구현
 * <입출력>
 * 금액=2558164
 * 
 * 오만원
 * 일만원권
 * 오천원권
 * 일천원권
 * 오백원
 * 백원
 * 오십원
 * 십원
 * 오원
 * 일원
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class First extends JFrame{
	JTextField cli_tx=new JTextField(9);
	JLabel[] jb=new JLabel[10];
	JButton button=new JButton("계산하기");
	Container c;
	First(){
		setTitle("화폐매수기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,300);
		init();
		setVisible(true);
	}
	public void init(){
		c=getContentPane();
		c.setLayout(new BorderLayout());
		JPanel cli_b = new JPanel();
		cli_b.setLayout(new FlowLayout());
		cli_b.add(cli_tx);
		cli_b.add(button);
		c.add(cli_b);
	}
	public void start(){
		
	}
	public static void main(String[] ar){
		new First();
	}
	class Action{
		
	}
}
