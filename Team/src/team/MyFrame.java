package team;

import java.awt.*;

import javax.swing.*;

public class MyFrame extends JFrame{
	JPanel displayPanel;
	JPanel buttonPanel;
	JPanel startPanel;
	
	JTextField display;
	
	JButton[] buttons;
	JButton btnreset;
	JButton btnback;
	
	JButton btnstart;
	
	public MyFrame(){
		this.setSize(800,800);
		this.setTitle("�뷡���ȣ");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		this.setLayout(new BorderLayout());
		
		//3���� �гΰ�ü�� ����� ���� ���̾ƿ� ����
		displayPanel = new JPanel();
		buttonPanel = new JPanel();
		startPanel = new JPanel();
		
		displayPanel.setLayout(new FlowLayout());
		buttonPanel.setLayout(new GridLayout(4,3,5,5));
		startPanel.setLayout(new FlowLayout());
		startPanel.setSize(300, 300);
		
		/*display ����*/
		display = new JTextField(5);//ĭ�Ǳ���
		display.setText("0"); //�ʱ�ȭ�� 0
		display.setHorizontalAlignment(JTextField.CENTER); //�ʵ� �� �۾� �������
		Font font = new Font("sans serif", Font.BOLD, 30); //��Ʈ����
		display.setFont(font);
		
		
		displayPanel.add(display); //display�гο� ������Ʈ ����� ���̱�
		
		/*��ư ����*/
		Font fontBtn = new Font("sans serif", Font.BOLD, 30);
		
		buttons = new JButton[12]; //��ư����
		
		for(int i=0; i<buttons.length; i++){
			buttons[i] = new JButton(Integer.toString(i)); //i�� ��Ʈ�������� ����
			buttons[i].setFont(fontBtn); //��ư�� ��Ʈ�� ���� ����
			buttons[i].setBackground(new Color(255,228,0)); //��ư �� 
			buttons[i].setForeground(new Color(0,0,0)); //���� ��
		}
		
		btnreset = new JButton("RESET");
		btnreset.setFont(new Font("sans serif", Font.BOLD, 20));
		btnreset.setBackground(new Color(255,228,0));
		btnreset.setForeground(new Color(0,0,0));
		
		btnback = new JButton("��");
		btnback.setBackground(new Color(255,228,0));
		btnback.setForeground(new Color(0,0,0));
		btnback.setFont(new Font("sans serif", Font.BOLD, 20));
		
		
		//��ư�� ���콺�����ϸ� ���� ���ϰԲ� ����� �ּ���. 
		//��ư�� Ŭ���ϸ� �ؽ�Ʈ�ʵ忡 ���ڰ� �߰Բ� ����� �ּ���. 
		//��ư�� radius(���׶���) ������ּ���.
		buttonPanel.add(buttons[1]);
		buttonPanel.add(buttons[2]);
		buttonPanel.add(buttons[3]);
		buttonPanel.add(buttons[4]);
		buttonPanel.add(buttons[5]);
		buttonPanel.add(buttons[6]);
		buttonPanel.add(buttons[7]);
		buttonPanel.add(buttons[8]);
		buttonPanel.add(buttons[9]);
		buttonPanel.add(btnreset); //�����������ּ���
		buttonPanel.add(buttons[0]);
		buttonPanel.add(btnback); //��ĭ ��ĭ �������°� ������ּ���
		
		//startPanel�� btnstart�� ����� ����
		btnstart = new JButton("��    ��"); //���ù�ư�� ������ �� �����ϰ� ���ּ���.
		btnstart.setSize(300, 300);
		btnstart.setBackground(new Color(255,228,0));
		btnstart.setForeground(new Color(0,0,0));
		
		startPanel.add(btnstart);
		
		//�� ���ȭ�� ����
		buttonPanel.setBackground(new Color(255,228,0));  
		displayPanel.setBackground(new Color(255,228,0));
		startPanel.setBackground(new Color(255,228,0));
		
		//�����ӿ��� �гκ��̱�
		this.add(displayPanel, BorderLayout.NORTH);
		this.add(buttonPanel, BorderLayout.CENTER);
		this.add(startPanel, BorderLayout.SOUTH);
		
		this.setResizable(false); //������ ũ�� ����
		this.setVisible(true);
		
	}
}

