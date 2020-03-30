/*
 * 배열(Array) - 동일한 자료형을 하나의 이름으로 묶어서 관리하는 자료구조
 *  - 자료구조 : 
 *    변수(Variable) : 하나의 데이터를 저장하는 기억공간
 *    배열(Array)    : 동일한 자료형 ~
 *    구조체(Struct) : 서로 다른 자료형을 ~
 *    클래스(Class) 
 *     - JVM : 자바의 가상 머신
 * 1.단일차원배열(1차원 배열)
 *    - 배열의 첨자를 1개 가지고 있는 배열
 *    - 장점
 *       1)기억장소의 낭비를 줄인다.
 *       2)연속된 공간을 할당받아 자료를 저장하기 때문에 처리속도가 빠르다.
 *       3)유사문구가 생성되어, 반복처리가 가능하다.(for문과 연관)   
 */
public class Exam_01 {
	public static void main(String[] ar){
		int x=0,y=0,z=0;
		int[] a=new int[3]; //각 공간에 default 초기화가 된다.
		int i=0;
		//
		//배열 선언 방법 - 자료형[] 배열명;
		//배열명 = new 자료형[배열의 첨자=크기];
		
		System.out.println("x = "+x);
		System.out.println("y = "+y);
		System.out.println("z = "+z);
		for(i=0;i<a.length;i++)
			a[i]=i+50;
		for(i=0;i<a.length;i++)
		System.out.println("a["+i+"] = "+a[i]);
	}
}
