package java_basic;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Cal extends JFrame{
	
	JButton button = new JButton("���"); //�Է¹��� ���� ����ϴ� �̺�Ʈ�� ���� ��ư
	int[] money = {50000,10000,5000,1000,500,100,50,10,5,1}; // 5����~1�������� int �迭
	JTextField inputMoney = new JTextField(""); //���� �Է¹��� JTextField
	JTextField[] outputMoney = new JTextField[10]; //�Է¹��� ���� ����Ͽ� ����� JTextField �迭
	
	public Cal() {
		setTitle("�� ��� ���α׷�");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setSize(500, 600);
		Container c = getContentPane();
		c.setLayout(new GridLayout(11, 3, 10, 10)); // ǥ�������� ��ġ�ϱ� ���ϹǷ� GridLayout�� ���
		
		c.add(new JLabel("��"));
		c.add(inputMoney); //���� �Է¹��� ������ contentpane�� ����
		button.addActionListener(new ButtonAction()); //��ư Ŭ���� �̺�Ʈ �߻�
		c.add(button); //��ư ����
		
		for(int i = 0; i < money.length; i++) { //5����~1������ �ݺ������� �����ϹǷ� �ݺ��� ���
			outputMoney[i] = new JTextField(""); //�Է¹��� ���� ����� ���� ����
			outputMoney[i].setEditable(false); //���� �Ұ����ϵ��� ����
			c.add(new JLabel(money[i] + "����")); //5����~1������ ǥ��
			c.add(outputMoney[i]); //5����~1������ ����Ͽ� ǥ���� ���� ����
			c.add(new JLabel("")); //ǥ �����̹Ƿ� ����� �ʿ�
		}
		
		setResizable(false);
		setVisible(true);
	}
	
	public static void main(String[] ar) {
		new Cal();
	}
	
	class ButtonAction implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			int x = Integer.parseInt(inputMoney.getText()); //�Է¹��� ���� ����
			
			for(int i = 0; i < money.length; i++) {
				outputMoney[i].setText(Integer.toString(x / money[i])); //5����~1������ ����Ͽ� ǥ��
				if(x > 0) {
					x = x % money[i]; //��� �� ���� ���� ��� �����ϸ� ����
				}
			}
		}
	}
}

