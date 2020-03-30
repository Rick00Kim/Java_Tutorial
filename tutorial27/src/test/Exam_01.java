package test;
/*
 * 형의 일치(Data Type) -> 형변환(Casting) -> 다형성
 * 상수 : 컴퓨터처리할 수 있는 형태의 데이터
 *  - 논리형 자료형 : true or false
 *  - 정수형 자료형 : 10진수,2진수,8진수,16진수
 *                 132         047  0x55  5050
 *  - 실수형 자료형 : 
 *  - 문자형 자료형 : 
 *  - 문자열형 자료형 :
 */


public class Exam_01 {
	//멤버필드
	int x;
	static final int MAX=100;
	static int y;
	//생성자 메서드
	Exam_01(){
		
	}
	//맴버메서드
	public static void main(String[] ar){
		Exam_01 ex=new Exam_01();
		//지역변수로는 static이 들어올 수 없다.
//		Exam_01.y=10;
		ex.y=50;
	}
	//중첩클래스
}
