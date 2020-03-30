package sample.event;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*
 * �����̳ʿ� ��ġ������
 *  - �ϳ��� �����̳ʴ� �ݵ�� �ϳ��� ��ġ�����ڸ� ������.
 *  - ��ġ�����ڴ� �����̳ʿ� ���۳�Ʈ�� ������ ������ ���۳�Ʈ�� ��ġ�� ũ�⸦ �����Ѵ�.
 *  - ��ġ�����ڴ� �����̳��� ũ�Ⱑ ����Ǹ� �����̳� ������ ��� ������Ʈ�� ��ġ�� ũ�⸦ �������Ѵ�.
 *  1) FlowLayout : �����̳ʿ� ���۳�Ʈ�� ������ ������� ���ʿ��� ���������� ��ġ�ϸ�,
 *                  �� �̻� ������ ���� ��� �Ʒ��� ������ ��ġ�Ѵ�.
 *                   - ���۳�Ʈ�� ũ��� ȭ�鿡 ������ ��µ� �� �ִ� ũ��� �����Ѵ�.
 *  2) BorderLayout : �����̳��� ������ ��, ��, ��, ��, �߾��� 5�� �������� ������ ��ġ�Ѵ�.
 *                   - ���۳�Ʈ�� ũ��� ������ ũ�⿡ ���߾� �����ȴ�.
 *  3) GridLayout : ǥ���·� ���۳�Ʈ�� ��ġ�Ѵ�.
 *                  - �����̳ʿ� ���۳�Ʈ�� ������ ������� �¿��� ���, �ٽ� ������ �Ʒ��� ������� ��ġ
 *                  - ���۳�Ʈ�� ũ��� ���� ũ��� ��ġ(��-cell, ǥ�� �簢���� ���Ѵ�.)
 *  4) CardLayout : ���۳�Ʈ�� ������ ��ġ�Ѵ�.
 *                  - ���۳�Ʈ�� ũ��� �����̳��� ũ��� ��ġ.
 */
public class Event_08 extends JFrame{
	public Event_08(){
		this.setTitle("Make JFrame");
		//�������� ������ ���α׷��� ����ǵ��� �ϴ� �ɼ�
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// �������۳�Ʈ�� �����ϱ� ���ؼ��� ����Ʈ ���� ���� �Ѵ�.
		Container c=getContentPane();
		c.setBackground(Color.CYAN); //��漳��
		c.setLayout(new GridLayout(5,2)); //��ġ������ ����
		c.add(new JLabel("�̸�"));
		c.add(new JTextField(""));
		c.add(new JLabel("�ּ�"));
		c.add(new JTextField(""));
		c.add(new JLabel("��ȭ"));
		c.add(new JTextField(""));
		c.add(new JLabel("����"));
		c.add(new JTextField(""));
		c.add(new JButton("Input"));
		
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
		new Event_08();
	}
}
