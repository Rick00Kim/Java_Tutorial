package tutorial10;
/*
 * 다음 주어진 프로그램이 동작하도록 구현하시오.
 * <입력 및 출력형식>
 * 도형(1.점 2.원 3.사각형 4.종료)
 * 선택  =1
 * x=5
 * y=5
 * 점(x,y) = (5,5)
 *	
 * 도형(1.점 2.워 3.사각형 4.종료)
 * 선택 2
 * r=10
 * 반지름(r)=10
 * 
 * 도형(1.점 2.원 3.사각형 4.종료)
 * 선택 =3
 * h=7
 * w=8
 * 폭(w)=8, 높이(h)=7
 * 
 * 도형(1.점 2.원 3.사각형 4.종료)
 * 선택=4
 * 프로그램을 종료합니다.
 */
import java.io.*;

class MyPoint{
	private int x;
	private int y;
	private BufferedReader in;
	//생성자 메서드
	public MyPoint()throws IOException{
		in=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("x= ");
		x=Integer.parseInt(in.readLine());
		System.out.print("y= ");
		y=Integer.parseInt(in.readLine());
	}
	public void disp(){
		System.out.println("점(x, y) = ("+x+" , "+y+")");
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
		System.out.println("반지름(r) = "+ban);
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
		System.out.println("폭(w); = "+weight+" , 높이(h) = "+height);
	}
}
public class Exam_05 {
	public static void main(String[] ar)throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int chk=0;
		boolean isStop=false;
		do{
			System.out.println("도형(1.점 2.원 3.사각형 4.종료)");
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
				System.out.println("선택이 올바르지 않습니다.");
			}
			System.out.println();
		}while(!isStop);
		System.out.println("Exit Program.....");
		
		
		
		
		
		/*char cli=0;
		while(cli!='4'){
			System.out.println("도형(1.점 2.원 3.사각형 4.종료)");
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
				System.out.println("종료 합니다");
			}
		}*/
	}
}
