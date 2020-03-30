/**
 * 이름과 나이를 입력받아 출력하는 프로그램을 구현하시오.
 */
import java.util.Scanner;

public class Exam_06 {
	public static void main(String[] ar){
		//선언문 : 변수의 자료형과 초기값을 담을 때
		Scanner buf = new Scanner(System.in);
		String name="";
		int age=0;
		//입력문 : 입력형식에 맞게 프로그램을 구현할 때 
		System.out.print("이름 = ");
		name=buf.nextLine();
		System.out.print("나이 = ");
		age=buf.nextInt();
		//처리문 : 처리하는 문장 - 명령어나 제어문을 통해 처리
		
		//출력문 : 출력형식에 맞게 프로그램을 구현할 때
		System.out.println();
		System.out.printf("이름 - %s\n나이 - %d\n",name,age);
	}
}
