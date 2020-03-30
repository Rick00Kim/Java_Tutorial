package tutorial10;
/*
 * 원을 추상화하는 클래스 Circle을 구현하시오.
 * 속성 : 반지름을 담을 공간
 * 기능  : 원의 반지름을 입력받고, 출력할 수 있도록 구현할 것.
 *        원의 면적을 계산하여 되돌려줄 수 있도록 구현할 것.
 */
import java.io.*;
class Circle{
	//멤버 필드
	private int ban;
	public Circle(){
		ban=0;
	}
	public Circle(int r){
		ban=r;
	}
	public double myunJeok(){
		return 3.14*ban*ban;
	}
	public void setBan(int x){
		ban=x;
	}
	public int getBan() {
		return ban;
	}
}

public class Exam_04 {
	public static void main()throws IOException{
		//객체 생성
		Circle op=new Circle();
		op.setBan(1);
		System.out.println("op 객체의 면적 = "+op.myunJeok());
		Circle bp=new Circle(10);
		System.out.println("bp 객체의 면적 = "+bp.myunJeok());
	}
}
