package mms.karaoke.ui;

import java.awt.event.ActionEvent;
import javax.swing.JButton;
import mms.karaoke.util.AudioManager;

public class MyButton {
	public void actionPerformed(ActionEvent e) {
		JButton temp = (JButton) e.getSource();
		int imsi = MyFrame.display.getText().length() + 1;
		int num = Integer.parseInt(temp.getText());
		
		
		
		switch (temp.getText()) {
		case "1":
			if (MyFrame.display.getText().equals("0")) { // �ؽ�Ʈ�� ������ �� 0�� ������?
				MyFrame.display.setText("1"); // 0�� ��� 1�� �����
				new AudioManager("Sound/num1.wav");
			} else if (imsi > 4) {
				MyFrame.display.setText(MyFrame.display.getText().substring(1) + "1");
				new AudioManager("Sound/num1.wav");
			} else {
				MyFrame.display.append("1"); // 0�� �ƴ� ��� ���ڵڿ� 1�� �Է�
				new AudioManager("Sound/num1.wav");
			}
			break;
		case "2":
			if (MyFrame.display.getText().equals("0")) {
				new AudioManager("Sound/num2.wav");
				MyFrame.display.setText("2");
			} else if (imsi > 4) {
				MyFrame.display.setText(MyFrame.display.getText().substring(1) + "2");
				new AudioManager("Sound/num2.wav");
			} else {
				MyFrame.display.append("2");
				new AudioManager("Sound/num2.wav");
			}
			break;
		case "3":
			if (MyFrame.display.getText().equals("0")) {
				MyFrame.display.setText("3");
				new AudioManager("Sound/num3.wav");
			} else if (imsi > 4) {
				MyFrame.display.setText(MyFrame.display.getText().substring(1) + "3");
				new AudioManager("Sound/num3.wav");
			} else {
				MyFrame.display.append("3");
				new AudioManager("Sound/num3.wav");
			}
			break;
		case "4":
			if (MyFrame.display.getText().equals("0")) {
				MyFrame.display.setText("4");
				new AudioManager("Sound/num4.wav");
			} else if (imsi > 4) {
				MyFrame.display.setText(MyFrame.display.getText().substring(1) + "4");
				new AudioManager("Sound/num4.wav");
			} else {
				MyFrame.display.append("4");
				new AudioManager("Sound/num4.wav");
			}
			break;
		case "5":
			if (MyFrame.display.getText().equals("0")) {
				MyFrame.display.setText("5");
				new AudioManager("Sound/num5.wav");
			} else if (imsi > 4) {
				MyFrame.display.setText(MyFrame.display.getText().substring(1) + "5");
				new AudioManager("Sound/num5.wav");
			} else {
				MyFrame.display.append("5");
				new AudioManager("Sound/num5.wav");
			}
			break;
		case "6":
			if (MyFrame.display.getText().equals("0")) {
				MyFrame.display.setText("6");
				new AudioManager("Sound/num6.wav");
			} else if (imsi > 4) {
				MyFrame.display.setText(MyFrame.display.getText().substring(1) + "6");
				new AudioManager("Sound/num6.wav");
			} else {
				MyFrame.display.append("6");
				new AudioManager("Sound/num6.wav");
			}
			break;
		case "7":
			if (MyFrame.display.getText().equals("0")) {	
				MyFrame.display.setText("7");
				new AudioManager("Sound/num7.wav");
			} else if (imsi > 4) {
				MyFrame.display.setText(MyFrame.display.getText().substring(1) + "7");
				new AudioManager("Sound/num7.wav");
			} else {
				MyFrame.display.append("7");
				new AudioManager("Sound/num7.wav");
			}
			break;
		case "8":
			if (MyFrame.display.getText().equals("0")) {
				MyFrame.display.setText("8");
				new AudioManager("Sound/num8.wav");
			} else if (imsi > 4) {
				MyFrame.display.setText(MyFrame.display.getText().substring(1) + "8");
				new AudioManager("Sound/num8.wav");
			} else {
				MyFrame.display.append("8");
				new AudioManager("Sound/num8.wav");
			}
			break;
		case "9":
			if (MyFrame.display.getText().equals("0")) {
				MyFrame.display.setText("9");
				new AudioManager("Sound/num9.wav");
			} else if (imsi > 4) {
				MyFrame.display.setText(MyFrame.display.getText().substring(1) + "9");
				new AudioManager("Sound/num9.wav");
			} else {
				MyFrame.display.append("9");
				new AudioManager("Sound/num9.wav");
			}
			break;
		case "0":
			if (MyFrame.display.getText().equals("0")) {
				MyFrame.display.setText("0");
				new AudioManager("Sound/num0.wav");
			} else if (imsi > 4) {
				MyFrame.display.setText(MyFrame.display.getText().substring(1) + "0");
				new AudioManager("Sound/num0.wav");
			} else {
				MyFrame.display.append("0");
				new AudioManager("Sound/num0.wav");
			}
			break;
		case "RESET":
			MyFrame.display.setText("0");
			new AudioManager("Sound/reset.wav");
			break;
		case "��":
			String back = MyFrame.display.getText();
			back = back.substring(0, back.length() - 1);
			if (back.length() > 0) {
				MyFrame.display.setText(back);
				new AudioManager("Sound/cancle.wav");
				break;
			} else {
				MyFrame.display.setText("0");
				new AudioManager("Sound/cancle.wav");
				break;
			}
		}
	}
}
