package tutorial20;
/*
 * 인터페이스(Interface) : 추상메서드만 존재한다.
 *                       - 클래스를 만들기위한 완전한 설계도
 *                       - 상수멤버변수, 추상메서드
 *                       - 다중상속이 가능한 유일한 클래스
 * 추상클래스(abstract class) : 일반메서드+추상메서드 공존
 *                            - 클래스를 만들기위한 미완성된 설계도
 *                            - 일반멤버변수, 일반메서드, 추상메서드
 * 공통점 : 객체를 생성할 수 없다. - 다형성적인 표현(자식객체를 부모객체에 담아서 사용)
 * 차이점 : ~~
 */
abstract class A{
	public void disp(){
		System.out.println("일반메서드");
	}
}
class B extends A{
	public void disp(){
		System.out.println("오버라이딩메서드");
	}
}
public class Exam_01{
	public static void main(String[] ar){
//		A ap=new A(); 추상클래스를 객체를 생성할 수 없다.
		A bp=new B(); //다형성적인 표현, 업캐스팅 객체 생성
		
		bp.disp();
	}
}