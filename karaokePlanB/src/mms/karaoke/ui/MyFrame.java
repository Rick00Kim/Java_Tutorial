package mms.karaoke.ui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.*;

import mms.karaoke.db.SongDB;
import mms.karaoke.util.AudioManager;
import mms.karaoke.util.MakeRandom;
import mms.karaoke.util.StartMusic;

public class MyFrame extends JFrame {

	JPanel displayPanel;
	JPanel buttonPanel;
	JPanel startPanel;

	static JTextArea display;

	static JButton[] buttons;
	JButton btnreset;
	JButton btnback;

	JButton btnstart;

	Border rb = new LineBorder(new Color(247, 153, 23), 3);

	public MyFrame() {
		
	}

	public MyFrame(int x, int y) {
		this.setSize(450, 500);
		this.setTitle("노래방번호");
		this.setLocation(x+10, y+40);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setLayout(new BorderLayout()); // 전체

		// 3개의 패널객체를 만들고 각자 레이아웃 설정
		displayPanel = new JPanel();
		buttonPanel = new JPanel();
		startPanel = new JPanel(); // 맨밑

		displayPanel.setLayout(new FlowLayout()); // 맨위
		buttonPanel.setLayout(new GridLayout(4, 3, 20, 20)); // 4행 3열에 간격 25
		startPanel.setLayout(new FlowLayout());
		startPanel.setSize(300, 300);

		/* display 관련 */
		display = new JTextArea(1, 5);// 칸의길이
		display.setEditable(false);
		display.setText("0"); // 초기화면 0
		// 필드 내 글씨 가운데정렬
		Font font = new Font("Blippo Blk Bt 보통", Font.BOLD, 50); // 폰트설정
		display.setFont(font);

		displayPanel.add(display); // display패널에 컴포넌트 만들고 붙이기

		/* 버튼 관련 */
		Font fontBtn = new Font("sans serif", Font.BOLD, 30);

		buttons = new JButton[12]; // 버튼개수

		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton(Integer.toString(i)); // i를 스트링값으로 받음
			buttons[i].setFont(fontBtn); // 버튼의 폰트에 대한 지정
			buttons[i].setBackground(new Color(255, 228, 0)); // 버튼 색
			buttons[i].setForeground(new Color(43, 82, 25)); // 숫자 색
			buttons[i].addActionListener(new MyButtonAction());
			buttons[i].addMouseListener(new MouseAdapter() {
				public void mouseEntered(MouseEvent e) {
					for (int i = 0; i < buttons.length; i++) {
						JButton tmp = (JButton) e.getSource();
						if (tmp.getText().equals(buttons[i].getText())) {
							buttons[i].setBackground(new Color(43, 82, 25)); // 버튼
							buttons[i].setForeground(new Color(255, 228, 0)); // 숫자
						}
					}
				}
				public void mouseExited(MouseEvent e) {
					for (int i = 0; i < buttons.length; i++) {
						buttons[i].setBackground(new Color(255, 228, 0)); // 버튼
						buttons[i].setForeground(new Color(43, 82, 25)); // 숫자 색
					}
				}
			});
			buttons[i].setFocusPainted(false); // 클릭후 네모난 상자 없애는거
			buttons[i].setBorder(rb);
		}

		btnreset = new JButton("RESET");
		btnreset.setFont(new Font("sans serif", Font.BOLD, 20));
		btnreset.setBackground(new Color(43, 82, 25));
		btnreset.setForeground(new Color(220, 220, 220));
		btnreset.addActionListener(new MyButtonAction());
		btnreset.setFocusPainted(false);
		btnreset.setBorder(rb);

		btnback = new JButton("←");
		btnback.setBackground(new Color(43, 82, 25));
		btnback.setForeground(new Color(220, 220, 220));
		btnback.setFont(new Font("sans serif", Font.BOLD, 20));
		btnback.addActionListener(new MyButtonAction());
		btnback.setFocusPainted(false);
		btnback.setBorder(rb);

		for (int i = 1; i <= 9; i++) {
			buttonPanel.add(buttons[i]);
		}
		buttonPanel.add(btnreset); // 완전삭제
		buttonPanel.add(buttons[0]);
		buttonPanel.add(btnback); // 한칸 한칸 지워지는거

		// startPanel에 btnstart를 만들어 붙임
		btnstart = new JButton("선    택"); // 선택버튼을 누르면 곡 실행
		btnstart.setSize(300, 300);
		btnstart.setBackground(new Color(247, 153, 23));
		btnstart.setForeground(new Color(0, 0, 0));
		btnstart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SongDB song = new SongDB();
				song.init();
				new AudioManager("Sound/start.wav");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				MakeRandom r = new MakeRandom();
				String temp = song.oneSelect(r.getRan(song.getSize()));
				StartMusic sm = new StartMusic();
				sm.processStart(temp);
				dispose();

			}
		});
		startPanel.add(btnstart);
		// 각 배경화면 색상
		buttonPanel.setBackground(new Color(50, 50, 50));
		displayPanel.setBackground(new Color(50, 50, 50));
		startPanel.setBackground(new Color(50, 50, 50));

		// 프레임에다 패널붙이기
		this.add(displayPanel, BorderLayout.NORTH);
		this.add(buttonPanel, BorderLayout.CENTER);
		this.add(startPanel, BorderLayout.SOUTH);

		this.setResizable(false); // 프레임 크기 고정
		this.setVisible(true);
	}
}