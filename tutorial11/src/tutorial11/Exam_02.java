package tutorial11;
/*
 * static : 공유필드를 위한 지정예약어
 * 			- 데이터값을 공유하기 위해 사용되는 지정예약어
 * 			- 멤버필드만 가능하다.
 * 			- 클래스 이름으로 접근이 가능하다.
 * 			- 객체 발생전에 메모리에 할당된다.
 * 			- 별도로 초기화영역을 이용할 수 있다.
 * 			  형식
 * 			 static{
 * 				초기화구문;
 * 			 }
 * static 메서드 : static 필드를 제어할 목적으로 사용되는 메서드로 static만 담을 수 있다.
 * 
 */
class B{
	private static int x;
	private int y;
	
	public void aaa(){
		x=0;
		y=0;
		x++;
		y++;
		System.out.println("x= "+x+" , y="+y);
	}
}
public class Exam_02 {
	public static void main(String[] ar){
		B ap=new B();
		B bp=new B();
		for(int i=0;i<10;i++){
			ap.aaa();
		}
	}
}