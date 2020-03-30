package layoutFlow;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Ex_01 extends JFrame{
	//��ü
	JCheckBox jb;
	JPanel p2;
	public Ex_01(){
		//������ ���� ����
		setTitle("Ex_01");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//�������� ũ�⼳��
		setSize(300,300);
		//�������� ����� ���߾ӿ� ��ġ�ϴ� �۾�
		Dimension scn=Toolkit.getDefaultToolkit().getScreenSize();
		Dimension frm=getSize();
		int x=(int)(scn.getWidth()/2-frm.getWidth()/2);
		int y=(int)(scn.getHeight()/2-frm.getHeight()/2);
		setLocation(x, y);
		//�������� ȭ�� ������ �����ϴ� �޼���
		init();
		//Thread�� Event ó���� ����ϴ� �޼���
		start();
		//ȭ�鿡 ǥ��
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