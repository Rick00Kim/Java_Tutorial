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
		this.setTitle("노래방번호");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		this.setLayout(new BorderLayout());
		
		//3개의 패널객체를 만들고 각자 레이아웃 설정
		displayPanel = new JPanel();
		buttonPanel = new JPanel();
		startPanel = new JPanel();
		
		displayPanel.setLayout(new FlowLayout());
		buttonPanel.setLayout(new GridLayout(4,3,5,5));
		startPanel.setLayout(new FlowLayout());
		startPanel.setSize(300, 300);
		
		/*display 관련*/
		display = new JTextField(5);//칸의길이
		display.setText("0"); //초기화면 0
		display.setHorizontalAlignment(JTextField.CENTER); //필드 내 글씨 가운데정렬
		Font font = new Font("sans serif", Font.BOLD, 30); //폰트설정
		display.setFont(font);
		
		
		displayPanel.add(display); //display패널에 컴포넌트 만들고 붙이기
		
		/*버튼 관련*/
		Font fontBtn = new Font("sans serif", Font.BOLD, 30);
		
		buttons = new JButton[12]; //버튼개수
		
		for(int i=0; i<buttons.length; i++){
			buttons[i] = new JButton(Integer.toString(i)); //i를 스트링값으로 받음
			buttons[i].setFont(fontBtn); //버튼의 폰트에 대한 지정
			buttons[i].setBackground(new Color(255,228,0)); //버튼 색 
			buttons[i].setForeground(new Color(0,0,0)); //숫자 색
		}
		
		btnreset = new JButton("RESET");
		btnreset.setFont(new Font("sans serif", Font.BOLD, 20));
		btnreset.setBackground(new Color(255,228,0));
		btnreset.setForeground(new Color(0,0,0));
		
		btnback = new JButton("←");
		btnback.setBackground(new Color(255,228,0));
		btnback.setForeground(new Color(0,0,0));
		btnback.setFont(new Font("sans serif", Font.BOLD, 20));
		
		
		//버튼에 마우스오버하면 색이 변하게끔 만들어 주세요. 
		//버튼을 클릭하면 텍스트필드에 숫자가 뜨게끔 만들어 주세요. 
		//버튼을 radius(동그랗게) 만들어주세요.
		buttonPanel.add(buttons[1]);
		buttonPanel.add(buttons[2]);
		buttonPanel.add(buttons[3]);
		buttonPanel.add(buttons[4]);
		buttonPanel.add(buttons[5]);
		buttonPanel.add(buttons[6]);
		buttonPanel.add(buttons[7]);
		buttonPanel.add(buttons[8]);
		buttonPanel.add(buttons[9]);
		buttonPanel.add(btnreset); //완전삭제해주세요
		buttonPanel.add(buttons[0]);
		buttonPanel.add(btnback); //한칸 한칸 지워지는거 만들어주세요
		
		//startPanel에 btnstart를 만들어 붙임
		btnstart = new JButton("선    택"); //선택버튼을 누르면 곡 실행하게 해주세요.
		btnstart.setSize(300, 300);
		btnstart.setBackground(new Color(255,228,0));
		btnstart.setForeground(new Color(0,0,0));
		
		startPanel.add(btnstart);
		
		//각 배경화면 색상
		buttonPanel.setBackground(new Color(255,228,0));  
		displayPanel.setBackground(new Color(255,228,0));
		startPanel.setBackground(new Color(255,228,0));
		
		//프레임에다 패널붙이기
		this.add(displayPanel, BorderLayout.NORTH);
		this.add(buttonPanel, BorderLayout.CENTER);
		this.add(startPanel, BorderLayout.SOUTH);
		
		this.setResizable(false); //프레임 크기 고정
		this.setVisible(true);
		
	}
}

