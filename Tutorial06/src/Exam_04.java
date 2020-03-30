/*
 * 성적처리 프로그램
 * 국어, 영어, 수학점수를 입력받아 총점과 평균을 계산하는 프로그램을 구현.
 */
import java.io.*;
public class Exam_04 {
	public static void main(String[] ar)throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int[] sub=new int[4];
		int i=0;
		float avg=0.0f;
		String[] sub_name={"KOR","ENG","MATH"};
		//sub_name=new String[]{"Kor","Eng","math"};
		for(i=0;i<sub_name.length;i++){
			System.out.print(sub_name[i]+" = ");
			sub[i]=Integer.parseInt(in.readLine());
			sub[sub_name.length]+=sub[i];
		}
		avg=sub[sub_name.length]/3.0f;
		System.out.println("Total : "+sub[sub_name.length]);
		System.out.printf("Average : %.2f\n",avg);
	}
}
