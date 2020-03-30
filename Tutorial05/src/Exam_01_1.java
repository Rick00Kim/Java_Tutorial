	/* 
	 * 하나의 문자를 입력받아 출력하는 작업을 반복한다.
	 * 문자 = 
	 * (문자)=ASCII
	 * 계속(y/n)=
	 */
import java.io.*;
public class Exam_01_1 {
	public static void main(String[] ar)throws IOException{
		char cli=0;   //입력받을 문자를 저장할 변수 선언
		char yn=0;//계속 진행할 지의 여부를 판단하는 변수 선언
		while(true){
			System.out.print("Input = ");
			cli=(char)System.in.read();
			System.in.read();
			System.in.read();
			System.out.println("Output - "+cli+" <-> "+(int)cli);
			System.out.print("Continue??(y/n) - ");
			yn =(char)System.in.read();
			System.in.read();
			System.in.read();
			System.out.println();
			if(yn=='n'||yn=='N') break;
		}
		System.out.println("Close Program!!");
	}
}

