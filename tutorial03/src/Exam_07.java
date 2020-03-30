/**
 * 성적 처리 프로그램 1단계
 * 국어, 영어, 수학점수를 입력받아 총점과 평균을 계산하여 출력
 * 
 */
import java.util.Scanner;
public class Exam_07 {
	public static void main(String[] ar){
		//선언문
		int kor=0,eng=0,ma=0,total=0;
		float aver=0.0f;
		Scanner buf=new Scanner(System.in);
		//입력문
		System.out.print("Write  Kor Score - ");
		kor=Integer.parseInt(buf.nextLine());
		System.out.print("Write  Eng Score- ");
		eng=Integer.parseInt(buf.nextLine());
		System.out.print("Write Math Score- ");
		ma=Integer.parseInt(buf.nextLine());
		
		//처리문
		total=kor+eng+ma;
		aver=total/3.0f;
		//출력문
		System.out.printf("Total Score - %d\n"
				+ "   Average - %.2f",total,aver);
	}
}
