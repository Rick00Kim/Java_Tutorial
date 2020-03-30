package sample.event;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*
 * 컨테이너와 배치관리자
 *  - 하나의 컨테이너는 반드시 하나의 배치관리자를 가진다.
 *  - 배치관리자는 컨테이너에 컴퍼넌트가 들어오는 시점에 컴퍼넌트의 위치와 크기를 지정한다.
 *  - 배치관리자는 컨테이너의 크기가 변경되면 컨테이너 내부의 모든 컴포넌트의 위치와 크기를 재조정한다.
 *  1) FlowLayout : 컨테이너에 컴퍼넌트가 들어오는 순서대로 왼쪽에서 오른쪽으로 배치하며,
 *                  더 이상 공간이 없을 경우 아래로 내려서 배치한다.
 *                   - 컴퍼넌트의 크기는 화면에 적당히 출력될 수 있는 크기로 설정한다.
 *  2) BorderLayout : 컨테이너의 공간을 동, 서, 남, 북, 중앙의 5개 영역으로 나누어 배치한다.
 *                   - 컴퍼넌트의 크기는 영역의 크기에 맞추어 설정된다.
 *  3) GridLayout : 표형태로 컴퍼넌트를 배치한다.
 *                  - 컨테이너에 컴퍼넌트가 들어오는 순서대로 좌에서 우로, 다시 위에서 아래로 순서대로 배치
 *                  - 컴퍼넌트의 크기는 셀의 크기와 일치(셀-cell, 표의 사각형을 뜻한다.)
 *  4) CardLayout : 컴퍼넌트를 포개어 배치한다.
 *                  - 컴퍼넌트의 크기는 컨테이너의 크기와 일치.
 */
public class Event_08 extends JFrame{
	public Event_08(){
		this.setTitle("Make JFrame");
		//프레임을 닫으면 프로그램도 종료되도록 하는 옵션
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 스윙컴퍼넌트를 부착하기 위해서는 컨텐트 팬을 얻어야 한다.
		Container c=getContentPane();
		c.setBackground(Color.CYAN); //배경설정
		c.setLayout(new GridLayout(5,2)); //배치관리자 설정
		c.add(new JLabel("이름"));
		c.add(new JTextField(""));
		c.add(new JLabel("주소"));
		c.add(new JTextField(""));
		c.add(new JLabel("전화"));
		c.add(new JTextField(""));
		c.add(new JLabel("전공"));
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
