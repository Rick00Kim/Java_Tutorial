/**
 * 계산기 프로그램
 * 두 개의 정수와 하나의 연산자를 입력받아 계산을 수행.
 * 1. 입출력형식을 이용하여 변수와 자료형을 알맞게 선언할 것.
 * 2. 주어진 연산기호이외의 값이 들어오면 다시 입력받도록 구현한다.
 * 3. 연산자가 '/'이고 두번째 수가 0이 들어오면 두번째 수를 다시 입력받도록 구현한다.
 */
import java.io.*;
public class Exam_04 {
	public static void main(String[] ar)throws IOException{
		BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
		int num1=0,num2=0,rst=0;
		char op=0;
		System.out.print("1st = ");
		num1=Integer.parseInt(in.readLine());
		do{
			System.out.print("Op = ");
			op=(char)System.in.read();
			in.readLine();
		}while(op!='*' && op!='/' && op!='+' && op!='-' && op!='%');
		do{
		System.out.print("2nd = ");
		num2=Integer.parseInt(in.readLine());
		}while(op == '/' && num2 ==0);
		switch(op){
		case '+': rst=num1+num2; break;
		case '-': rst=num1-num2; break;
		case '*': rst=num1*num2; break;
		case '/': rst=num1/num2; break;
		case '%': rst=num1%num2; 
		}
		System.out.println();
		System.out.println(num1+" "+op+" "+num2+" = "+rst);
	}
}