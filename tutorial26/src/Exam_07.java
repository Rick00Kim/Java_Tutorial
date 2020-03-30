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

	// 생성자
	Exam_07(){
		setTitle("체크박스 만들기");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//프레임의 펜 얻어오기
		setSize(300,200);
		//컨텐트 펜 얻어오기
		c=getContentPane();
		c.setBackground(new Color(255,236,133));
		//배치관리자 설정
		c.setLayout(new FlowLayout());
		//컴퍼넌트 - 이미지 체크박스를 만들기 위해 2개의 객체생성
		lb=new JLabel("Apple - 1000, Pear - 2500, Strawberry - 11000");
		c.add(lb);
		//3개의 체크박스 생성한 후 각 객체에 이름을 담고 컨텐트팬에 부착 시키는 작업
		ButtonGroup bg=new ButtonGroup();
		for(int i=0;i<fruits.length;i++){
			fruits[i]=new JRadioButton(names[i]);
			fruits[i].setBackground(new Color(255,236,133));
			c.add(fruits[i]);
			bg.add(fruits[i]);
			fruits[i].addItemListener(new ItemAc());
		}
		
		c.add(lb2);
		sum=new JLabel("현재 금액- "+tot);
		c.add(sum);
		// event 발생
		
		//프레임을 화면에 출력
		this.setVisible(true);
	}
	public static void main(String[] ar){
		new Exam_07();
	}
	//Event Handler...
	class ItemAc implements ItemListener{
		//체크박스의 상태가 변하면
		public void itemStateChanged(ItemEvent e) {
			//선택되면 금액이 증가, 선택되지 않으면 금액 감소
			int selected=1;//1이면 선택, -1이면 선택되지 않음
			if(e.getStateChange()==ItemEvent.SELECTED){//선택상태일때
				selected = 1;
			}else{
				selected=-1;
			}
			//선택된 아이템이 무엇인지 판별하는 작업
			if(e.getItem()==fruits[0]){
				tot+=1000*selected;	
			}else if(e.getItem()==fruits[1]){
				tot+=2500*selected;
			}else
				tot+=11000*selected;
			
			sum.setText("현재 금액- "+tot);
		}
		
	}
}
