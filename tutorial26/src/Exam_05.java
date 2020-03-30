import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Exam_05 extends JFrame {
	//����ʵ�
	JButton[] btn=new JButton[4];
	Container c;
	//�����ڸ޼���
	public Exam_05(){
		setTitle("JComponent�� ���� �޼���");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//������ ����
		setSize(250,200);
		//�ʱ� ��ġ ����
		Dimension scn=Toolkit.getDefaultToolkit().getScreenSize();
		Dimension frm=getSize();
		int x=(int)(scn.getWidth()/2-frm.getWidth()/2);
		int y=(int)(scn.getHeight()/2-frm.getHeight()/2);
		setLocation(x,y);
		//����Ʈ �� ������, �ʱ�ȭ
		c=getContentPane();
		c.setBackground(new Color(255,236,133));
		
		//��ġ������ ����
		c.setLayout(new FlowLayout());
		//���۳�Ʈ
		btn[0]=new JButton("��ġ�� ũ�� ����");
		btn[0].addActionListener(new ButtonAction());
		c.add(btn[0]);
		
		btn[1]=new JButton("��� ����");
		btn[1].setOpaque(true);
		btn[1].setBackground(Color.YELLOW);
		btn[1].setForeground(Color.BLACK);
		btn[1].setFont(new Font("���ü",Font.ITALIC,15));
		btn[1].addActionListener(new ButtonAction());
		c.add(btn[1]);
		
		btn[2]=new JButton("Ȱ��ȭ���� ���� ��ư");
		btn[2].setEnabled(false);
		btn[2].addActionListener(new ButtonAction());
		c.add(btn[2]);
		
		btn[3]=new JButton("�����/���̱�");
		btn[3].addActionListener(new ButtonAction());
		c.add(btn[3]);
		
		//�̺�Ʈ ��� : ���ü.add ~ Listener()
		
		//���۳�Ʈ ����
		
		//������ ���
		setVisible(true);
	}
	//����޼���
	public static void main(String[] ar){//�ݹ�޼���
		new Exam_05();
	}
	//��ø Ŭ����
	class ButtonAction implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			//���õ� ��ư�� �˾Ƴ��� �۾�
			JButton tmp=(JButton)e.getSource();
			
			// Button�̶�� ������ ������ �ִ� ���� � ��ư���� �����Ͽ� �̺�Ʈ�� ó���Ѵ�.
			if(tmp==btn[0]){
				System.out.println(tmp.getText());
				System.out.println("Location : ("+tmp.getX()+", "+tmp.getY()+")");
				System.out.println("Size : "+tmp.getWidth()+", "+tmp.getHeight());
			}else if(tmp==btn[1]){
				System.out.println(tmp.getText());
				System.out.println("Background : "+tmp.getBackground());
				System.out.println("Foreground : "+tmp.getForeground());
				System.out.println("Font : "+tmp.getFont());
			}else{
				if(btn[0].isVisible()){
					btn[0].setVisible(false);
					btn[1].setVisible(false);
					btn[2].setVisible(false);
				}else{
					btn[0].setVisible(true);
					btn[1].setVisible(true);
					btn[2].setVisible(true);
					
				}
			}
		}
		
	}
}