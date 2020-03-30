/*
 * 하나의 숫자를 입력받아 양수인지 판단하는 프로그램을 구현하시오.
 */
import java.io.*;
public class Exam_10 {

	public static void main(String[] args)throws IOException{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int num =0 ;
		System.out.print("Number - ");
		num=Integer.parseInt(in.readLine());
		System.out.println();
		if(num>0){
			System.out.println("입력받은 숫자 "+num+"는 양수입니다");
		}else if(num<0){
			System.out.println("입력받은 숫자 "+num+"는 음수입니다.");
		}else
			System.out.println("입력받은 숫자 "+num+"는 Zero입니다.");
			System.out.println("프로그램을 종료합니다.");
		
	}

}
