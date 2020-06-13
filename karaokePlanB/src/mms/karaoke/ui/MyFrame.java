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

	private static final long serialVersionUID = 1L;

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
		this.setTitle("Song number");
		this.setLocation(x + 10, y + 40);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setLayout(new BorderLayout());

		displayPanel = new JPanel();
		buttonPanel = new JPanel();
		startPanel = new JPanel();

		displayPanel.setLayout(new FlowLayout());
		buttonPanel.setLayout(new GridLayout(4, 3, 20, 20));
		startPanel.setLayout(new FlowLayout());
		startPanel.setSize(300, 300);

		display = new JTextArea(1, 5);
		display.setEditable(false);
		display.setText("0");
		Font font = new Font("Blippo Blk Bt", Font.BOLD, 50);
		display.setFont(font);

		displayPanel.add(display);

		Font fontBtn = new Font("sans serif", Font.BOLD, 30);

		buttons = new JButton[12];

		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton(Integer.toString(i));
			buttons[i].setFont(fontBtn);
			buttons[i].setBackground(new Color(255, 228, 0));
			buttons[i].setForeground(new Color(43, 82, 25));
			buttons[i].addActionListener(new MyButtonAction());
			buttons[i].addMouseListener(new MouseAdapter() {
				public void mouseEntered(MouseEvent e) {
					for (int i = 0; i < buttons.length; i++) {
						JButton tmp = (JButton) e.getSource();
						if (tmp.getText().equals(buttons[i].getText())) {
							buttons[i].setBackground(new Color(43, 82, 25));
							buttons[i].setForeground(new Color(255, 228, 0));
						}
					}
				}

				public void mouseExited(MouseEvent e) {
					for (int i = 0; i < buttons.length; i++) {
						buttons[i].setBackground(new Color(255, 228, 0));
						buttons[i].setForeground(new Color(43, 82, 25));
					}
				}
			});
			buttons[i].setFocusPainted(false);
			buttons[i].setBorder(rb);
		}

		btnreset = new JButton("RESET");
		btnreset.setFont(new Font("sans serif", Font.BOLD, 20));
		btnreset.setBackground(new Color(43, 82, 25));
		btnreset.setForeground(new Color(220, 220, 220));
		btnreset.addActionListener(new MyButtonAction());
		btnreset.setFocusPainted(false);
		btnreset.setBorder(rb);

		btnback = new JButton("<-");
		btnback.setBackground(new Color(43, 82, 25));
		btnback.setForeground(new Color(220, 220, 220));
		btnback.setFont(new Font("sans serif", Font.BOLD, 20));
		btnback.addActionListener(new MyButtonAction());
		btnback.setFocusPainted(false);
		btnback.setBorder(rb);

		for (int i = 1; i <= 9; i++) {
			buttonPanel.add(buttons[i]);
		}
		buttonPanel.add(btnreset);
		buttonPanel.add(buttons[0]);
		buttonPanel.add(btnback);

		btnstart = new JButton("    SELECT    ");
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
		buttonPanel.setBackground(new Color(50, 50, 50));
		displayPanel.setBackground(new Color(50, 50, 50));
		startPanel.setBackground(new Color(50, 50, 50));

		this.add(displayPanel, BorderLayout.NORTH);
		this.add(buttonPanel, BorderLayout.CENTER);
		this.add(startPanel, BorderLayout.SOUTH);

		this.setResizable(false);
		this.setVisible(true);
	}
}