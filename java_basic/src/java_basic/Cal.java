package java_basic;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Cal extends JFrame{
	
	JButton button = new JButton("계산"); //입력받은 돈을 계산하는 이벤트를 담을 버튼
	int[] money = {50000,10000,5000,1000,500,100,50,10,5,1}; // 5만원~1원까지의 int 배열
	JTextField inputMoney = new JTextField(""); //돈을 입력받을 JTextField
	JTextField[] outputMoney = new JTextField[10]; //입력받은 돈을 계산하여 배분할 JTextField 배열
	
	public Cal() {
		setTitle("돈 계산 프로그램");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setSize(500, 600);
		Container c = getContentPane();
		c.setLayout(new GridLayout(11, 3, 10, 10)); // 표형식으로 배치하기 편하므로 GridLayout을 사용
		
		c.add(new JLabel("돈"));
		c.add(inputMoney); //돈을 입력받을 공간을 contentpane에 부착
		button.addActionListener(new ButtonAction()); //버튼 클릭시 이벤트 발생
		c.add(button); //버튼 부착
		
		for(int i = 0; i < money.length; i++) { //5만원~1원까지 반복적으로 부착하므로 반복문 사용
			outputMoney[i] = new JTextField(""); //입력받은 돈을 배분할 공간 생성
			outputMoney[i].setEditable(false); //수정 불가능하도록 설정
			c.add(new JLabel(money[i] + "원권")); //5만원~1원까지 표시
			c.add(outputMoney[i]); //5만원~1원까지 배분하여 표시할 공간 부착
			c.add(new JLabel("")); //표 형식이므로 빈공간 필요
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
			int x = Integer.parseInt(inputMoney.getText()); //입력받은 돈을 저장
			
			for(int i = 0; i < money.length; i++) {
				outputMoney[i].setText(Integer.toString(x / money[i])); //5만원~1원까지 계산하여 표시
				if(x > 0) {
					x = x % money[i]; //계산 후 남은 돈을 계속 저장하며 진행
				}
			}
		}
	}
}

