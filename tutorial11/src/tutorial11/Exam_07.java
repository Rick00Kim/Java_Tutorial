package tutorial11;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class MyFrame extends JFrame {
//	implements ActionListener
	JButton btn =new JButton("�ݱ�");
	public MyFrame(){
		setTitle("�ڹ� ������");
		setSize(300,200);
		
		setLayout(new FlowLayout());
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		this.add(btn);
		
		this.setResizable(false);
		this.setVisible(true);
		
	}
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		System.exit(0);
//		
//	}
	
}
public class Exam_07 {
	public static void main(String[] ar){
		MyFrame f=new MyFrame();
	}
}
