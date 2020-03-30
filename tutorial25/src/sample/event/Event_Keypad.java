package sample.event;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Event_Keypad extends JFrame{
	public Event_Keypad(){
		
		this.setTitle("Make JFrame");
		//프레임을 닫으면 프로그램도 종료되도록 하는 옵션
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		init();
		start();
		this.setSize(200,300);
		Dimension scn=Toolkit.getDefaultToolkit().getScreenSize();
		Dimension frm=getSize();
		int x=(int)(scn.getWidth()/2-frm.getWidth()/2);
		int y=(int)(scn.getHeight()/2-frm.getHeight()/2);
		this.setLocation(x,y);
		this.setResizable(false);
		this.setVisible(true);
	}
	private void init(){
		// 스윙컴퍼넌트를 부착하기 위해서는 컨텐트 팬을 얻어야 한다.
		Container c=getContentPane();
		c.setBackground(Color.WHITE); //배경설정
//		c.setLayout(new GridLayout(4,3,5,5)); //배치관리자 설정
		JLabel lb=new JLabel("전화기",JLabel.CENTER);
		JPanel p=new JPanel();
		JButton[] bt=new JButton[12];
		String[] str=new String[]{"*","0","#"};

		c.add("North",lb);
		p.setLayout(new GridLayout(4,3,5,5));
		for(int i=0;i<bt.length;i++){
			if(i>=9){
				bt[i]=new JButton(str[i-9]);
			}else
				bt[i]=new JButton(String.valueOf(i+1));
			p.add(bt[i]);
		}
		c.add("Center", p);
	}
	private void start(){
		
	}
	
	public static void main(String[] ar){
		new Event_Keypad();
	}
}

