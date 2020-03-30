/*
 * 구구단을 출력하는 프로그램
 */
import java.io.*;
public class Exam_07 {
	public static void main(String[] ar)throws IOException{
		int cli=0;
		int i=0;
		char yn=0;
		do{
			do{
			System.out.print("Dan : ");
			cli=System.in.read()-'0';
			System.in.read();
			System.in.read();
			System.out.println(cli+"단");
			}while(cli>48 && cli<78);
		for(i=1;i<10;i++)
			System.out.println(cli+" * "+i+" = "+(cli*i));
		System.out.print("Exit??? - ");
		yn=(char)System.in.read();
		System.in.read();
		System.in.read();
		}while(yn=='n' || yn=='N');
		System.out.println("Exit Program....");
	}
}
