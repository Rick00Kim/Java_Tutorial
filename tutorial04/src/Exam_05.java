/*
 * 정수연산시 주의할 사항은 int이하의 정수형의 연산결과는 반드시 int에 담아야한다.
 */
public class Exam_05 {
	public static void main(String[] ar){
		byte a=10,b=20;
		int c=0;//byte= 128~127사이의 정수 표현. 1byte
		c=a+b;
		long d=10L;
		int e=10;
		long f=d+e;
	}
}
