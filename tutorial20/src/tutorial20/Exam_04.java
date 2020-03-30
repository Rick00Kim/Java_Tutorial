package tutorial20;
/*
 * 1. 변수와 상수 그리고 자료형
 *   1) 변수 : 하나의 상수를 기억하는 기억장소, 변하는 수
 *   2) 상수 : 고정된 값
 *   3) 형의 일치!!(Type 일치)
 *      변수 = 상수
 *      변수 = 상수
 *      변수 수식(산술식, 관계식, 논리식 .....)
 *   4) 자료형(Data Type)
 *     -기본 자료형   : 값을 담고 있는 자료형
 *      8대 자료형 : boolean
 *                 byte(1) < short(2) < int(4) < long(8)
 *                           char(2)
 *                 float(4) < double(8)
 *     -참조형 자료형 : 값을 가지고 있는 주소를 가르키는 자료형
 *                   String str="문자열";
 *                   String str=new String("문자열");
 *                   클래스나 인터페이스가 이에 해당됨.
 */
public class Exam_04 {
	public static int add(int[] data){
		int sum=0;
		for(int i=0;i<data.length;i++)
			sum+=data[i];
		return sum;
	}
	public static float avg(int sum){
		return sum/3.0f;
	}
	public static void main(String[] ar){
		int[] data={1,7,9,6,5,8,3};
		int sum=add(data);
		float avg=avg(sum);
		
		System.out.printf("total : %d, avg : %.2f",sum,avg);
	}
}
