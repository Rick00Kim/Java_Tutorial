/*
 * 세 개의 정수를 입력받아 큰 수를 출력하는 프로그램을 구현하시오.
 * 단, 삼항연산자를 이용할 것.
 * 
 * <입력형식>
 * 첫번째 수 =
 * 두번째 수 =
 * <출력형식>
 * 큰 수 =
 * 
 */
import java.io.*;
public class Exam_09 {
	public static void main(String[] ar)throws IOException{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int num1=0,num2=0,num3=0,max=0;
		System.out.print("첫번째 수 = ");
		num1=Integer.parseInt(in.readLine());
		System.out.print("두번째 수 = ");
		num2=Integer.parseInt(in.readLine());
		System.out.print("세번째 수 =");;
		num3=Integer.parseInt(in.readLine());
		
		max=num1>num2?num1:num2;
		max=max>num3?max:num3;
		System.out.println("큰 수 = "+max);
	}
}
