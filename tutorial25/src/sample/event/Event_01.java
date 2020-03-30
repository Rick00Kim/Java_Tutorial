package sample.event;
import java.awt.*; // 컴포넌트 - 버튼, 레이블, 체크박스 등등
import java.awt.event.*; 
class Event_01_sub extends Frame{
	private Button btn1=new Button("クリック");
	public Event_01_sub(String title){
		super(title);
		//프레임의 크기설정
		this.setSize(300,200);
		//프레임을 모니터 정중앙에 배치하는 작업
		Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
		Dimension frm=this.getSize();
		int x=(int)(screen.getWidth()/2-frm.getWidth()/2);
		int y=(int)(screen.getHeight()/2-frm.getHeight()/2);
		this.setLocation(x, y);
		//프레임의 화면 구성을 설정하는 메서드
		init();
		//Thread나 Event 처리를 담당하는 메서드
		start();
		//화면에 표시
		this.setResizable(false);
		
		this.setVisible(true);
	}
	private void init(){
		this.setLayout(new GridBagLayout()); // 배치관리자 설정
		this.setBackground(Color.blue);
		btn1.setBackground(Color.green);
		btn1.setForeground(Color.RED);
		add(btn1);
		
	}
	private void start(){
		//1.익명의 중첩 클래스를 이용하는 방법
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Button b=(Button)e.getSource(); //선택된 버튼에 대한 모든 정보를 얻어온다.
				if(b.getLabel().equals("クリック"))
						b.setLabel("클릭");
				else
					b.setLabel("クリック");			
			}
		});
	}
}
public class Event_01 {
	public static void main(String[] ar){
		Event_01_sub ex=new Event_01_sub("ActionListener 실습");
	}
}
