package sample.event;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*
 * ���� GUI ���α׷� ����� ����
 * 1. �����Ӹ����
 * 2. �����ӿ� ���� ���۳�Ʈ ���̱�
 * 3. main() �޼��� �ۼ�
 * 4. 
 * 
 */
public class Event_05 extends JFrame{
	public Event_05(){
		this.setTitle("JFC �⺻ ������"); //������
		
		this.setSize(300,200);// �������� ũ�⼳��, ��-����
		Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
		Dimension frm=this.getSize();
		
		this.setVisible(true);//�������� ȭ�鿡 ��Ÿ������ ����
	}
	
	public static void main(String[] ar){
		new Event_05();
	}
}
