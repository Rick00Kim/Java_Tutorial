/**
 * �ϳ��� ���ڸ� �Է¹޾� �빮��, �ҹ���, ���ڰ� �ƴ� ��츦 �Ǵ� �ϴ� ���α׷� ����
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
				System.out.println("�빮��");
			}else if(cli>96 &&cli<123){
				System.out.println("�ҹ���");
			}else
				System.out.println("���ڰ� �ƴմϴ�.");
			
			System.out.print("Exit??(y/n)");
			yn=(char)System.in.read();
			System.in.read();
			System.in.read();
			if(yn=='n' || yn=='N') break;
		}
		System.out.println("Exit Program....");
	}
}
