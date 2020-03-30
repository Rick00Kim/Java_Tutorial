import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Exam_07 extends JFrame{
	JLabel lb, lb2;
	Container c;
	JRadioButton[] fruits=new JRadioButton[3];
	String[] names={"Apple","Pear","Strawberry"};
	JLabel sum;
	
	int tot=0;

	// ������
	Exam_07(){
		setTitle("üũ�ڽ� �����");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//�������� �� ������
		setSize(300,200);
		//����Ʈ �� ������
		c=getContentPane();
		c.setBackground(new Color(255,236,133));
		//��ġ������ ����
		c.setLayout(new FlowLayout());
		//���۳�Ʈ - �̹��� üũ�ڽ��� ����� ���� 2���� ��ü����
		lb=new JLabel("Apple - 1000, Pear - 2500, Strawberry - 11000");
		c.add(lb);
		//3���� üũ�ڽ� ������ �� �� ��ü�� �̸��� ��� ����Ʈ�ҿ� ���� ��Ű�� �۾�
		ButtonGroup bg=new ButtonGroup();
		for(int i=0;i<fruits.length;i++){
			fruits[i]=new JRadioButton(names[i]);
			fruits[i].setBackground(new Color(255,236,133));
			c.add(fruits[i]);
			bg.add(fruits[i]);
			fruits[i].addItemListener(new ItemAc());
		}
		
		c.add(lb2);
		sum=new JLabel("���� �ݾ�- "+tot);
		c.add(sum);
		// event �߻�
		
		//�������� ȭ�鿡 ���
		this.setVisible(true);
	}
	public static void main(String[] ar){
		new Exam_07();
	}
	//Event Handler...
	class ItemAc implements ItemListener{
		//üũ�ڽ��� ���°� ���ϸ�
		public void itemStateChanged(ItemEvent e) {
			//���õǸ� �ݾ��� ����, ���õ��� ������ �ݾ� ����
			int selected=1;//1�̸� ����, -1�̸� ���õ��� ����
			if(e.getStateChange()==ItemEvent.SELECTED){//���û����϶�
				selected = 1;
			}else{
				selected=-1;
			}
			//���õ� �������� �������� �Ǻ��ϴ� �۾�
			if(e.getItem()==fruits[0]){
				tot+=1000*selected;	
			}else if(e.getItem()==fruits[1]){
				tot+=2500*selected;
			}else
				tot+=11000*selected;
			
			sum.setText("���� �ݾ�- "+tot);
		}
		
	}
}
