/*
 * 자료구조(Data Structure)
 *  - 데이터를 효율적으로 관리하기 위한 기법
 *  1. 변수(Variable) : 하나의 데이터를 기억하는 기억공간
 *  2. 배열(Array) : 동일한 자료형을 묶어서 관리하는 자료구조
 *  3. 구조체(struct) : 서로 다른 자료형을 묶어서 관리하는 자료구조(멤버필드 = 변수)
 *  4. 클래스(class) : 서로 관련된 자료를 하나의 이름으로 묶어서 관리하는 자료구조(멤버필드 + 메서드)
 *  5. 컬렉션(collection)
 *  
 * 객체지향적인 프로그래밍 기법
 * 1. 클래스(class)
 *    - 객체(object)
 *    1) 포함멤버 : 멤버필드, 생성자메서드, 멤버메서드, 증첩클래스
 *    2) 객체생성 : 인스턴스 변수
 *       [클래스명] [객체명] = new [생성자메서드(배개변수)];
 *    3) 접근지정자(제한자)
 *       - private
 *       - (package) - 상속관계에서만 접근 허용
 *       - protected
 *       - public - 언제든지 접근 허용
 *    
 * 2. 캡슐화(정보은닉)
 *    - 멤버필드는 private
 *    - 멤버메서드는 public
 *    
 * 3. 상속
 *    1) 포함Object의 단점을 보완하기 위해
 *       - 포함Object란?
 *         클래스 내부에 임의의 클래스에 접근할 수 있는 객체를 가지고 있는 형태
 *    2) 상속(Inheritance) : 부모클래스의 멤버를 자식 클래스가 그대로 물려받아 사용할 수 있는 기능
 *       - 키워드 : extends
 *       - 형식
 *         접근제한자 [지정예약어] class 파생클래스 extends 기반클래스(....)
 *         기반클래스 = 상위클래스 = 부모클래스
 *         파생클래스 = 하위클래스 = 자녀클래스
 *       - 단일상속을 기반으로 구현된다.
 *    3) 자바에서 생략된 개념으로 사용되는 것들
 * 4. 다형성
 * 5. 추상(abstract)
 * 6. 다중상속(인터페이스 : interface)
 */
class A{
	int a=10;
}

class B extends A{
	int b=20;
	//A ap=new A(); // 포함 Object
}

class C extends B{
	int c=30;
	//B bp=new B();
}

class D extends C{
	int d=40;
	//C cp=new C();
}
public class Exam_04 {
	public static void main(String[] ar){
		D dp=new D();
		
		System.out.println("a = "+dp.a);//.을찍어야하는 포함Object의 단점
		System.out.println("b = "+dp.b);
		System.out.println("c = "+dp.c);
		System.out.println("d = "+dp.d);
		
	}
}
