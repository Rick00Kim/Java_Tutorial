import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ExLayout extends JFrame{
	Container c;
	JPanel mainPanel=null;
	JPanel karaokeDevice=null;
	ImageIcon icon=new ImageIcon("kara-iloveimg-resized.jpg");
	ImageIcon iconMain=new ImageIcon("Ironman.jpg");
	JButton movieInfo=new JButton(icon);
	JTextField musinNum=new JTextField();
	public ExLayout(){
		this.setTitle("연습입니다.");
		this.setSize(1300,700);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		mainPanel= new JPanel(){
			public void paintComponent(Graphics g){
				g.drawImage(iconMain.getImage(), 0, 0, null);
				setOpaque(false);
				super.paintComponent(g);
			}
		};
		mainPanel.setLayout(null);
		setKaraoke(10,50);
		mainPanel.add(karaokeDevice);
		setContentPane(mainPanel);
		this.setResizable(false); //프레임 크기 고정
		this.setVisible(true);
	}
	public void setKaraoke(int x,int y){
		karaokeDevice=new JPanel(){
			public void paintComponent(Graphics g){
				g.drawImage(icon.getImage(),0,0, null);
				setOpaque(false);
				super.paintComponent(g);
			}
		};
		karaokeDevice.setLayout(null);
		JLabel number=new JLabel();
		number.setText("0000");
		number.setFont(new Font("Consolas",Font.BOLD, 80));
		number.setBounds(40, 10, 300, 150);
		number.setHorizontalAlignment(JLabel.RIGHT);
		karaokeDevice.add(number);
		JLabel[] bango=new JLabel[12];
//		for(int i=0;i<bango.length;i++){
//			bango[i]=new JLabel();
//			bango[i].setText("1");
//			bango[i].setBounds(i*20, 50, 100, 100);	
//			bango[i].setOpaque(false);
//			karaokeDevice.add(bango[i]);
//		}
		bango[0]=new JLabel();
		bango[0].setText("1");
		bango[0].setHorizontalAlignment(JLabel.CENTER);
		bango[0].setBounds(491, 29, 70, 40);
		bango[0].setOpaque(false);
		bango[0].addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e) {
				JLabel temp=(JLabel)e.getSource();
				String numTemp=number.getText();
				numTemp+=temp.getText();
				if(numTemp.length()>4){
					String temp2=numTemp.substring(1,4);
					numTemp=temp2;
				}
				System.out.println(numTemp);
				number.setText(numTemp);
			}
		});
		karaokeDevice.add(bango[0]);
		
		karaokeDevice.setBounds(x, y, 800, 400);
	}
	public static void main(String[] ar){
		new ExLayout();
	}
}
