package layoutBorder;
import java.awt.*;
import javax.swing.*;
public class Ex_01 extends JFrame{
	Container c;
	JComboBox<String> com=null;
	public Ex_01(){
		setTitle("Border_Ex");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(700,550);
		loca(Toolkit.getDefaultToolkit().getScreenSize(),this.getSize());
		init();
		start();
		setResizable(false);
		setVisible(true);
	}
	public void init(){
		JPanel[] p=new JPanel[3];
		String[] p_name={"File","Edit","View","Preference","Help"};
		c=getContentPane();
		c.setLayout(new BorderLayout(5,5));
		c.setBackground(Color.WHITE);
		
		// Make Menu_Side
		JButton b;
		p[0]=new JPanel();
		p[0].setLayout(new GridLayout(1,7));
		for(int i=0;i<p_name.length;i++){
			b=new JButton(p_name[i]);
			b.setBackground(Color.ORANGE);
			p[0].add(b);
		}
		c.add(p[0],BorderLayout.NORTH);
		
		//Make Directory_side
		String[] lst={"IronMan","CapTainAmerica","Hulk","Thor","WinterSoljer","HalkEye","Vision","BlackWidow"};
		JList<String> ls=new JList<String>(lst);
		JScrollBar bar;
		p[1]=new JPanel();
		p[1].setLayout(new BorderLayout());
		ls.setBackground(Color.WHITE);
		
		p[1].add(ls,BorderLayout.CENTER);
		bar=new JScrollBar();
		bar.setBackground(Color.WHITE);
		
		
		p[1].add(bar,BorderLayout.EAST);
		c.add(p[1], BorderLayout.WEST);
		
		//Make MainFrame
		p[2]=new JPanel();
		p[2].setLayout(new FlowLayout());
		p[2].setBackground(Color.WHITE);
		com=new JComboBox<String>();
		com.addItem("1");
		p[2].add(com);
		ImageIcon ic=new ImageIcon("images/ironMan_01.jpg");
		JLabel jlb=new JLabel();
		jlb.setIcon(ic);
		p[2].add(jlb);
		c.add(p[2],BorderLayout.CENTER);
		
	}
	public void start(){
		
	}
	public void loca(Dimension scn,Dimension frm){
		int x=(int)(scn.getWidth()/2-frm.getWidth()/2);
		int y=(int)(scn.getHeight()/2-frm.getHeight()/2);
		this.setLocation(x, y);
	}
	public static void main(String[] ar){
		new Ex_01();
	}
}
