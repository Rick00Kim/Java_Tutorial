package calculator;
/*
 * 인터페이스(Interface)
 *   - 다중 상속을 목적으로 만들어진 클래스
 *   - 포함멤버에 제약을 갖는다.
 *     public static final 멤버필드
 *     public abstract 멤버메서드
 *     public static Inner class 정적중첩클래스
 *   - abstract : 추상
 *     abstract class(추상클래스) : abstract 메서드를 관리할 목적으로 생성
 *                                일반클래스와 동일, abstract 메서드를 포함할 수 있는것
 *     abstract method(추상메서드) : 내용부를 가지고 있지 않은 메서드로 반드시 재정의
 *     
 */
public interface Calculator {
	public int add(int x,int y);
	public int sub(int x,int y);
	public int multi(int x,int y);
	public int div(int x, int y);
}
