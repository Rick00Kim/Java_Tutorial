/*
 * Wrapper 클래스
 *  - 8개의 기본 데이터를 클래스 객체로 만드는 클래스
 *  - 공통메서드
 *    ParseXXX() : String형을 원하는 기본 자료형으로 변화할 때 사용하는 메서드
 *    XXXvalue() : 자신이 가진 값을 기본데이터형으로 변환할 때 사용하는 메서드
 *    
 *  - 오토박싱, 오토언박싱
 *    스택영역 : 기본 변수가 저장된다.
 *    힙 영역 : new연산자
 *    오토박싱 : 스택영역 -> 힙영역
 *    오토언박싱 : 힙영역 -> 스택영역
 */
public class Exam_06 {
	public static void main(String[] ar){
		//parseXXX : String형을 원하는 기본 자료형으로 변환
		String str="123";
		int x=Integer.parseInt(str);
		String str1="3.14f";
		float y=Float.parseFloat(str1);
		//XXXvalue();
		Integer num1=new Integer(10);
		int z=num1.intValue();
		Float num2=new Float(3.14f);
		float w=num2.floatValue();
	}
}
