/*
 * 객체지향적인 프로그래밍 : JAVA
 * 객체 : 현실세계의 유형, 무형의 모든 물질
 * 1. 클래스(Class) : 객체를 프로그래밍 하는 구조(틀). <=객체 모델링
 *    - 속성(Attribute) - 필드(Field = Variable = 변수, 기억공간)
 *    - 기능(Function) - 함수 = 메서드, 명령어의 집합, 기능의 묶음
 *                       행위나 동작 등을 기술하는 영역
 *    1) 형식
 *       - 접근제한자(접근지정자) [지정예약어], Class 클래스명(...)
 *    2) 구성요소(포함멤버)
 *       - 멤버필드(변수) : Member Field
 *       - 생성자 메서드 : Constructor
 *       - 멤버 메서드 : Member Method
 *       - 중첩 클래스 : Nested Class = Inner class
 *    3) 객체 생성하는 방법
 *       클래스명 객체명 = new 생성자메서드(매개변수);
 *       - 객체명은 Reference 영역에 할당된다.
 *       - 객체명은 4Byte 객체이다.
 *    4) 객체를 통해 멤버에 접근하는 방법 : direct연산자(.)
 *       객체명.멤버필드 or 객체명.멤버메서드();
 */

class Person{
	//멤버 필드
	String name;
	/* 생성자 메서드
	 * 1. 객체를 생성할 때 호출되는 메서드
	 *   생성자 메서드가 존재하지 않으면 default 생성자가 생략되어 있는 걸로 간주한다.
	 * 2. 메서드이긴 하지만 결과형리턴값을 담고 있지 않다. 심지어 void조차 쓰면 안된다.
	 * 3. 멤버필드를 초기화시킬 목적으로 구현된 메서드이다.
	 * 4. 객체가 생성된 후 처음으로 해야할 작업을 기술할 목적으로 구현한다.
	 * 5. 생성자 메서드는 반드시 클래스명과 동일하게 작성된다.
	 * 6. 생성자도 오버로딩이 가능하다.
	 *    ※오버로딩 -> 동일한 이름을 가진 메서드를 여러개 만들어서 사용하는 기능
	 *    ※단! 매개변수의 개수가 다르거나, 데이터타입(자료형)이 달라야 한다.
	 * this키워드, this()메서드의 구현이 가능하다.
	 * this : 클래스내에 자기 자신의 객체를 가르킨다.
	 * this() : 클래스내의 자신의 또 다른 생성자를 가르킨다.
	 */
	public Person(){
		
	}
	public Person(String irum){
		name=irum;
	}
	
	//멤버 메서드 : 객체가 하는 행위나 동작 등을 기술하는 영역
	public void init(String irum){
		name=irum;
	}
	public void walk(int speed){
		System.out.println(name+"이 "+speed+"km/s의 속도로 걸어 갑니다.");
	}
	public void run(int speed){
		System.out.println(name+"이 "+speed+"km/s의 속도로 뛰어 갑니다.");
	}
	//중첩 클래스
	class Baby{
		String left_leg;
		String right_leg;
	}
	
}
public class Exam_01 {
	public static void main(String[] ar){
		//객체생성 : instance 생성
		Person cl01=new Person("장보고");
//		cl01.init("홍길동");
//		cl01.name="aaa";
		
		cl01.walk(30);
		cl01.run(80);
	}
}