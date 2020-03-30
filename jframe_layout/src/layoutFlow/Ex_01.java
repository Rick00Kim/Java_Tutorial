package layoutFlow;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Ex_01 extends JFrame{
	//객체
	JCheckBox jb;
	JPanel p2;
	public Ex_01(){
		//프레임 제목 설정
		setTitle("Ex_01");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//프레임의 크기설정
		setSize(300,300);
		//프레임을 모니터 정중앙에 배치하는 작업
		Dimension scn=Toolkit.getDefaultToolkit().getScreenSize();
		Dimension frm=getSize();
		int x=(int)(scn.getWidth()/2-frm.getWidth()/2);
		int y=(int)(scn.getHeight()/2-frm.getHeight()/2);
		setLocation(x, y);
		//프레임의 화면 구성을 설정하는 메서드
		init();
		//Thread나 Event 처리를 담당하는 메서드
		start();
		//화면에 표시
		setVisible(true);
	}
	public void init(){
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		for(int i=0;i<4;i++){
			c.add(new JButton("AAA"));
		}
		JPanel p=new JPanel();
		p.setLayout(new FlowLayout());
		for(int i=0;i<4;i++){
			p.add(new JLabel("BBB"));
		}
		c.add(p);
		p2=new JPanel();
		p2.setLayout(new FlowLayout());
		for(int i=0;i<4;i++)
			p2.add(new JButton("CCC"));
		c.add(p2);
		JPanel p3=new JPanel();
		p3.setLayout(new FlowLayout());
		jb=new JCheckBox();
		jb.addActionListener(new Ac());
		p3.add(jb);
		c.add(p3);
	}
	
	public void start(){
		
	}
	class Ac implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			if(jb.isSelected()){
				p2.setVisible(false);
			}else
				p2.setVisible(true);
		}
	}
	public static void main(String[] ar){
		new Ex_01();
	}
}