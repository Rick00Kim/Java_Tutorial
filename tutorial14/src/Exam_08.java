/*
 * 평면 위의 한 점을 추상화한 클래스 Point, 반지름을 필드로 담고 있는 원을 추상화하는 클래스 (Circle)
 * 폭과 높이를 필드로담고있는 사각형을 추상화하는 클래스 Rect를 이용하여 다음과 같은 작업이 수행되도록 구현하시오.
 * 
 * 입력 및 출력형식
 * x=5
 * y=5
 * r=5
 * 점(x,y) = (5,5)
 * 반지름(r)=5
 * 
 * x=10
 * y=10
 * h=7
 * w=9
 * 점(x,y) = (10,10)
 * 폭(w) = 9, 높이(h)=7
 */
import java.io.*;

class Point {
	protected int x;
	protected int y;
	
	Point(int x, int y){
		this.x=x;
		this.y=y;
	}
	public void show(){
		System.out.println("x = "+x);
		System.out.println("y = "+y);
	}
}
class Circle extends Point{
	private int r;
	
	Circle(int x,int y, int r){
		super(x,y);
		this.r=r;
	}
	public void show(){
		super.show();
		System.out.println("r = "+r);
	}
}
class Rect extends Point{
	private int w;
	private int h;
	
	Rect(int x,int y,int w,int h){
		super(x,y);
		this.w=w;
		this.h=h;
	}
	public void show(){
		super.show();
		System.out.println("w - "+w+", h - "+h);
	}
}
public class Exam_08 {
	public static void main(String[] ar)throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		char cli=0;
		int x,y,r,w,h;
		Point p1;
		Circle c1;
		Rect r1;
		view_menu();
		do{
			System.out.print("Choose function(Menu:h) - ");
			cli=(char)System.in.read();
			in.readLine();
			switch(cli)
			{
			case '1':
				System.out.print("x = ");
				x=Integer.parseInt(in.readLine());
				System.out.print("y = ");
				y=Integer.parseInt(in.readLine());
				p1=new Point(x,y);
				System.out.println("---------------");
				p1.show();
				break;
			case '2':
				System.out.print("x = ");
				x=Integer.parseInt(in.readLine());
				System.out.print("y = ");
				y=Integer.parseInt(in.readLine());				
				System.out.print("r = ");
				r=Integer.parseInt(in.readLine());
				c1=new Circle(x,y,r);
				System.out.println("---------------");
				c1.show();
				break;
			case '3':
				System.out.print("x = ");
				x=Integer.parseInt(in.readLine());
				System.out.print("y = ");
				y=Integer.parseInt(in.readLine());
				System.out.print("w = ");
				w=Integer.parseInt(in.readLine());
				System.out.print("h = ");
				h=Integer.parseInt(in.readLine());
				r1=new Rect(x,y,w,h);
				System.out.println("---------------");
				r1.show();
				break;
			case 'h':
				view_menu();
				break;
			case '4':
				break;
			default:
				System.out.println("1 ~ 4");
			}
		}while(cli!='4');
		System.out.println("Exit Program....");
	}
	public static void view_menu(){
		System.out.println("====Menu====");
		System.out.println("1. Point");
		System.out.println("2. Circle");
		System.out.println("3. Rect");
		System.out.println("4. Exit....");
		System.out.println("============");
	}
}
