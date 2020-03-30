package tutorial10;
/*
 * ���� �־��� ���α׷��� �����ϵ��� �����Ͻÿ�.
 * <�Է� �� �������>
 * ����(1.�� 2.�� 3.�簢�� 4.����)
 * ����  =1
 * x=5
 * y=5
 * ��(x,y) = (5,5)
 *	
 * ����(1.�� 2.�� 3.�簢�� 4.����)
 * ���� 2
 * r=10
 * ������(r)=10
 * 
 * ����(1.�� 2.�� 3.�簢�� 4.����)
 * ���� =3
 * h=7
 * w=8
 * ��(w)=8, ����(h)=7
 * 
 * ����(1.�� 2.�� 3.�簢�� 4.����)
 * ����=4
 * ���α׷��� �����մϴ�.
 */
import java.io.*;

class MyPoint{
	private int x;
	private int y;
	private BufferedReader in;
	//������ �޼���
	public MyPoint()throws IOException{
		in=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("x= ");
		x=Integer.parseInt(in.readLine());
		System.out.print("y= ");
		y=Integer.parseInt(in.readLine());
	}
	public void disp(){
		System.out.println("��(x, y) = ("+x+" , "+y+")");
	}
}
class MyCircle{
	private int ban;
	private BufferedReader in;
	public MyCircle()throws IOException{
		in=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("r= ");
		ban=Integer.parseInt(in.readLine());
	}
	public void disp(){
		System.out.println("������(r) = "+ban);
	}
}
class MyRect{
	private int weight;
	private int height;
	private BufferedReader in;
	public MyRect()throws IOException{
		in=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Height= ");
		height=Integer.parseInt(in.readLine());
		System.out.print("Weight= ");
		weight=Integer.parseInt(in.readLine());
	}
	public void disp(){
		System.out.println("��(w); = "+weight+" , ����(h) = "+height);
	}
}
public class Exam_05 {
	public static void main(String[] ar)throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int chk=0;
		boolean isStop=false;
		do{
			System.out.println("����(1.�� 2.�� 3.�簢�� 4.����)");
			System.out.print("Select = ");
			chk=Integer.parseInt(in.readLine());
			switch(chk)
			{
			case 1:
				MyPoint mp=new MyPoint();
				mp.disp();
				break;
			case 2:
				MyCircle mc=new MyCircle();
				mc.disp();
				break;
			case 3:
				MyRect mr=new MyRect();
				mr.disp();
				break;
			case 4 :
				isStop=!isStop;
				break;
			default:
				System.out.println("������ �ùٸ��� �ʽ��ϴ�.");
			}
			System.out.println();
		}while(!isStop);
		System.out.println("Exit Program.....");
		
		
		
		
		
		/*char cli=0;
		while(cli!='4'){
			System.out.println("����(1.�� 2.�� 3.�簢�� 4.����)");
			cli=(char)System.in.read();
			System.in.read();
			System.in.read();
			switch(cli)
			{
			case '1':
				MyPoint p1=new MyPoint();
				p1.disp();
				break;
			
			case '2':
				MyCircle p2=new MyCircle();
				p2.disp();
				break;
			case '3':
				MyRect p3=new MyRect();
				p3.disp();
				break;
			case '4':
				System.out.println("���� �մϴ�");
			}
		}*/
	}
}
