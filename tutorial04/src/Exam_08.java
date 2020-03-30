/*
 * 삼항연산자 : 항을 세 개 가지고 있는 연산자, if제어문의 모체가 된다.
 * 형식
 *   (조건항)?(항1):(항2);
 *   또는
 *   (변수)=(조건항)?(항1):(항2);
 * 의미
 *   주어진 조건항이 참이면 항1이 실행되고, 그렇지 않으면 항2가 실행된다.
 */ 
import java.io.*;
public class Exam_08 {
	public static void main(String[] ar)throws IOException{
		BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
		/*
		 * 하나의 숫자를 입력받아 양수인지 출력하는 프로그램을 구현하시오.
		 */
		int num=0;
		String str="";
		System.out.print("Write number = ");
		num=Integer.parseInt(in.readLine());
		str=num>0?"양수":"음수";
		System.out.println("Your Number - "+str);
		
	}
}
