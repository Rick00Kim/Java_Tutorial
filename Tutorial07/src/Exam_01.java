
import java.io.*;
public class Exam_01 {
	public static void main(String[] ar)throws IOException{
		/**
		 * main() 메서드
		 *  - 프로그램 시작시 사용자로부터 값을 입력받아 처리할 목적으로 구현.
		 *  - 형식
		 *    Usage : 클래스명 매개변수, 매개변수,......
		 *  - 매개변수의 크기
		 *    ar.length
		 *  - 프로그램 종료
		 *    System.exit(0);
		 */
		if(ar.length!=1){
			System.out.println("Usage : Exam_01 인원수");
			System.exit(0);
		}
		int inwon=Integer.parseInt(ar[0]);
		
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		String[] name =new String[inwon];
		for(int i=0;i<name.length;i++){
			System.out.print(i+"번째 사람 이름 = ");
			name[i]=in.readLine();
		}
		System.out.println();
		for(int i=0;i<name.length;i++){
			System.out.println(i+"번째 : "+name[i]);
		}
	}
}
