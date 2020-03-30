package mms.karaoke.ui;

import java.awt.*;
import java.awt.event.*;
import java.util.TimerTask;
import java.util.ArrayList;
import java.util.Timer;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

import mms.karaoke.model.Person;
import mms.karaoke.service.*;
import mms.karaoke.util.*;

public class Choose_Frame extends JFrame {
	static int x, y;
	static ArrayList<Person> personArr;
	private JLabel showImage = new JLabel();
	private JButton[] jbutton = new JButton[2];
	private JButton personSelectButton = new JButton("추첨하기");
	private JLabel message = null;
	JPanel center; // toString활용
	private ImageIcon[] ic = new ImageIcon[4];
	private JTable table;
	private JLabel[] personInfoL;
	private JTextField[] personInfoT;
	Border rb = new LineBorder(new Color(247, 153, 23), 3);

	public Choose_Frame() {
		setTitle("KARAOKE Plan.B");
		setSize(1000, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension frm = getSize();

		x = (int) (screen.getWidth() / 2 - frm.getWidth() / 2);
		y = (int) (screen.getHeight() / 2 - frm.getHeight() / 2);
		setLocation(x, y);

		init(x, y);

		setResizable(true);
		setVisible(true);
	}

	public void init(int x, int y) {
		// 레이아웃
		new AudioManager("Sound/3.wav");
		center = new JPanel(); // 바탕
		center.setLayout(null);
		center.setBackground(new Color(70, 70, 70)); // 기본 화면 색

		JPanel p_Title = new JPanel(); // 타이틀
		p_Title.setLayout(new GridLayout());
		JPanel p_Bottom = new JPanel(); // 하단 바
		// 이미지 삽입!
		showImage = new JLabel(ic[0] = new ImageIcon("image/ready.jpg")); // 준비상태
		// 이미지
		ic[1] = new ImageIcon("image/choose_success.gif");
		ic[2] = new ImageIcon("image/jackson.jpg");
		ic[3] = new ImageIcon("image/choose_ing.gif");
		showImage.setBounds(650, 70, 250, 330);
		center.add(showImage);
		initTable();
		add("Center", center);
		jbutton[0] = new JButton();
		jbutton[1] = new JButton();
		for (int i = 0; i < jbutton.length; i++) {
			jbutton[i].setBackground(new Color(50, 50, 50)); // 상단 버튼 배경
			jbutton[i].setForeground(new Color(220, 220, 220)); // 글씨 색
			jbutton[i].setFont(new Font("", Font.BOLD, 40));
			jbutton[i].setFocusPainted(false);
			jbutton[i].setBorder(rb);
			p_Title.add(jbutton[i]);
		}
		jbutton[0].setText("도전 천곡");
		jbutton[1].setText("다시 시작");
		jbutton[1].addActionListener(new ResetAction());
		p_Title.setBackground(new Color(50, 50, 50)); // 상단 바
		add("North", p_Title);
		// 이미지 삽입 끝!
		personSelectButton.setBackground(new Color(50, 50, 50));
		personSelectButton.setForeground(new Color(220, 220, 220));
		personSelectButton.setFocusPainted(false);
		personSelectButton.setBorder(rb);
		personSelectButton.addActionListener(new ButtonAction());
		p_Bottom.setLayout(new GridLayout());
		p_Bottom.add(personSelectButton); // 하단바 삽입
		p_Bottom.setBackground(new Color(50, 50, 50));
		personSelectButton.setFont(new Font("", Font.BOLD, 30));
		message = new JLabel();
		message.setHorizontalAlignment(SwingConstants.CENTER);
		message.setVerticalTextPosition(SwingConstants.CENTER);
		message.setFont(new Font("", Font.BOLD, 30));
		message.setForeground(Color.CYAN);
		message.setBounds(540, 0, 400, 60);
		center.add(message);
		add("South", p_Bottom);
	}

	public void initTable() {
		JLabel[] dmlController = new JLabel[3];
		ImageIcon[] dmlIcon = new ImageIcon[3];
		personInfoL = new JLabel[3];
		JTextField[] personInfoT = new JTextField[3];
		PersonListService ps = new PersonListService();
		personArr = ps.loadPersonInfo();
		
		String[] header = { "이름", "성별", "반" };
		String[][] contents = new String[personArr.size()][3];
		for (int i = 0; i < contents.length; i++) {
			for (int j = 0; j < contents[i].length; j++) {
				switch (j) {
				case 0:
					contents[i][j] = personArr.get(i).getName();
					break;
				case 1:
					contents[i][j] = personArr.get(i).getGender();
					break;
				case 2:
					contents[i][j] = personArr.get(i).getRoom();
					break;
				}
			}
		}
		table = new JTable(contents, header);
		table.setRowHeight(30);
		table.setBackground(Color.LIGHT_GRAY);
		table.setFont(new Font("", Font.BOLD, 18));
		table.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				personInfoT[0].setText(personArr.get(table.getSelectedRow()).getName());
				personInfoT[1].setText(personArr.get(table.getSelectedRow()).getGender());
				personInfoT[2].setText(personArr.get(table.getSelectedRow()).getRoom());
			}
		});
		JScrollPane scrollpane = new JScrollPane(table);
		scrollpane.setBounds(20, 20, 400, 350);
		for (int i = 0; i < personInfoL.length; i++) {
			personInfoL[i] = new JLabel(header[i] + " : ");
			personInfoL[i].setForeground(Color.YELLOW);
			personInfoL[i].setFont(new Font("", Font.BOLD, 17));
			personInfoT[i] = new JTextField();
		}
		personInfoL[0].setBounds(20, 400, 80, 30);
		personInfoT[0].setBounds(70, 400, 80, 30);
		personInfoL[1].setBounds(160, 400, 80, 30);
		personInfoT[1].setBounds(210, 400, 80, 30);
		personInfoL[2].setBounds(300, 400, 80, 30);
		personInfoT[2].setBounds(330, 400, 80, 30);
		String[] iconPath = { "+", "-", "^" };
		for (int i = 0; i < dmlController.length; i++) {
			dmlController[i] = new JLabel(iconPath[i]);
			dmlController[i].setFont(new Font("", Font.BOLD, 40));
			dmlController[i].setForeground(Color.GREEN);
			dmlController[i].setBackground(Color.WHITE);
			dmlController[i].addMouseListener(new DmlAction());
		}
		dmlController[0].setBounds(440, 400, 50, 30);
		dmlController[1].setBounds(500, 400, 50, 30);
		dmlController[2].setBounds(550, 400, 50, 30);

		for (int i = 0; i < dmlController.length; i++)
			center.add(dmlController[i]);

		for (int i = 0; i < personInfoL.length; i++) {
			center.add(personInfoL[i]);
			center.add(personInfoT[i]);
		}
		center.add(scrollpane);
	}

	class DmlAction extends MouseAdapter {
		public void mouseClicked(MouseEvent e) {
			JLabel tmp = (JLabel) e.getComponent();
			if (tmp.getText().equals("+")) {
				
			} else if (tmp.getText().equals("-")) {
				
			} else if (tmp.getText().equals("^")) {

			}
		}
	}

	class ResetAction implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			personSelectButton.setText("추첨하기");
			showImage.setIcon(ic[0]);
			message.setText("");
		}
	}

	class ButtonAction implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JButton temp = (JButton) e.getSource();
			if (temp.getText().equals("추첨하기")) {
				showImage.setIcon(ic[3]);
				personSelectButton.setText("당첨자 확인");
				try {// 타이머로 choose_ing.gif가 재생되는 시간을 조절
					Timer timer = new Timer();
					TimerTask task = new TimerTask() {
						public void run() {
							showImage.setIcon(ic[1]);
						}
					};
					timer.schedule(task, 4000);
				} catch (Exception e1) {
					e1.printStackTrace();
				}

			} else if (temp.getText().equals("당첨자 확인")) {
				showImage.setIcon(ic[2]);
				MakeRandom r = new MakeRandom();
				int random = r.getRan(personArr.size());
				GetOneService gos = new GetOneService();
				Person seleted = gos.getOnePerson(random);
				String[] lucky = { seleted.getName(), "씨 당첨입니다." };
				message.setText(lucky[0] + lucky[1]);
				new AudioManager("Sound/1.wav");
				personSelectButton.setText("다음으로");
			} else if (temp.getText().equals("다음으로")) {
				new MyFrame(x, y);
			}
		}
	}
}