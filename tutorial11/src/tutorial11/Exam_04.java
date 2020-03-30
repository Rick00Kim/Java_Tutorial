package tutorial11;
/*
 * 상수필드와 변수를 위한 final
 * 1. final 필드 : 상수 값을 저장하기위한 공간으로 값이 변경되지 않는다.
 * 				- 지역변수나 멤버 필드 모두 가능하다.
 * 2. final 메서드  : 상속시 오버라이딩(재정의)되지 않아야 할 메서드에 지정하는 예약어
 * 
 * 3. 
 */
class Circle{
	private final double PI=3.141592;

	public double getPI() {
		return PI;
	}
	
}
public class Exam_04 {
	public static void main(String[] ar){
		Circle c=new Circle();
		System.out.println("pi= "+c.getPI());
		final int x=100;
		System.out.println("x = "+x);
		//x=20;
		System.out.println("x = "+x);
	}
}
