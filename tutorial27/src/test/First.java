package test;
/*
 * �ݾ��� �Է¹޾� ȭ��ż��� ����Ͽ� ����ϴ� ���α׷��� ����
 * <�����>
 * �ݾ�=2558164
 * 
 * ������
 * �ϸ�����
 * ��õ����
 * ��õ����
 * �����
 * ���
 * ���ʿ�
 * �ʿ�
 * ����
 * �Ͽ�
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class First extends JFrame{
	JTextField cli_tx=new JTextField(9);
	JLabel[] jb=new JLabel[10];
	JButton button=new JButton("����ϱ�");
	Container c;
	First(){
		setTitle("ȭ��ż���");
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
