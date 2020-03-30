/**
 * 하나의 문자를 입력받아 대문자, 소문자, 문자가 아닌 경우를 판단 하는 프로그램 구현
 *
 */
import java.io.*;
public class Exam_05 {
	public static void main(String[] ar)throws IOException{
//		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		char cli=0;
		char yn=0;
		while(true){
			System.out.print("Input = ");
			cli=(char)System.in.read();
			System.in.read();
			System.in.read();
			
			if(cli>64 && cli<91){
				System.out.println("대문자");
			}else if(cli>96 &&cli<123){
				System.out.println("소문자");
			}else
				System.out.println("문자가 아닙니다.");
			
			System.out.print("Exit??(y/n)");
			yn=(char)System.in.read();
			System.in.read();
			System.in.read();
			if(yn=='n' || yn=='N') break;
		}
		System.out.println("Exit Program....");
	}
}
