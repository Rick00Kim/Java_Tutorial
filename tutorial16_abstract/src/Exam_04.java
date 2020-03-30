/*
 * abstract(추상) : 설계도(디자인)
 * 
 * 1. abstract 클래스
 *    - abstract 메서드를 포함하고 있는 클래스로 다형성 표현으로 사용해야한다.
 *    - 객체를 발생시킬 수 없는 것을 제외하면 일반 클래스와 동일하다.
 *    
 * 2. abstract 메서드
 *    - 메서드의 내용부가 정의되지 않은 형태로 모델(디자인)개념으로 사용되는 메서드
 *    - 반드시 오버라이딩(재정의) 되어야 사용할 수 있다.
 */

import java.io.*;
abstract class Calculator{
	public abstract int sum(int x, int y);
	public abstract int sub(int x, int y);
	public abstract int mul(int x, int y);
	public abstract int div(int x, int y);
}
class MyCalculator extends Calculator{

	public int sum(int x, int y) {
		
		return x+y;
	}

	public int sub(int x, int y) {
		
		return x-y;
	}

	public int mul(int x, int y) {
		
		return x*y;
	}

	public int div(int x, int y) {
		
		return x/y;
	}
}
class FriendCalculator extends Calculator{


	public int sum(int x, int y) {
		return x+y;
	}

	public int sub(int x, int y) {
		return x-y;
	}

	public int mul(int x, int y) {
		return x*y;
	}

	public int div(int x, int y) {
		return x/y;
	}
	
}
public class Exam_04 {
	public static void main(String[] ar){
		int x=10,y=20,rst=0;
		Calculator cal=new MyCalculator();
		
		
		System.out.println(x+" + "+y+" = "+rst);
	}
}
