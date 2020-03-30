/*
 * 다음 입출력 형식대로
 * 도형(1.원 2.사각형 3. 종료) - 
 */
import java.io.*;

class Point{
	private int x;
	private int y;
	protected BufferedReader in;
	
	public Point() throws IOException{
		in=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("x = ");
		x=Integer.parseInt(in.readLine());
		System.out.print("y = ");
		y=Integer.parseInt(in.readLine());
	}
	public void disp(){
		System.out.println("점(x, y) = ("+x+", "+y+")");
		
	}
}

class Circle extends Point{
	private int r;
	
	public Circle()throws IOException{
		in=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("r = ");
		r=Integer.parseInt(in.readLine());
		
	}
	public void disp(){
		super.disp();
		System.out.println("반지름(r) ="+r);
	}
	
}

class Rect extends Point{
	private int w;
	private int h;
	public Rect()throws IOException{
		in=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("h = ");
		h=Integer.parseInt(in.readLine());
		System.out.print("w = ");
		w=Integer.parseInt(in.readLine());
	}
	public void disp(){
		super.disp();
		System.out.println("(W) - "+w+", (H) - "+h);
	}
}

public class Exam_03 {
	public static void main(String[] ar)throws IOException{
		Circle c1;
		Rect r1;
		char cli=0;
		do{
			System.out.print("도형(1.원 2.사각형 3.종료) -> ");
			cli=(char)System.in.read();
			System.in.read();System.in.read();
			switch(cli)
			{
			case '1':
				c1=new Circle();
				c1.disp();
				break;
			case '2':
				r1=new Rect();
				r1.disp();
				break;
			case '3':
				break;
			default:
				System.out.println("잘못입력하였습니다.");
			}
		}while(cli!='3');
		System.out.println("Exit Program.....");
	}
}
