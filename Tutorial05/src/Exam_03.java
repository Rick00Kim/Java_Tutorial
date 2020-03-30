/**
 * do~while문 : 선실행 후 조건비교
 *              - 주어진 조건이 거짓이라도 한번은 수행한다.
 *              - do{  
 *                 반복할작업;
 *                }while(논리조건식);
 *              - 유효성검사 : 입력값을 제한할 때
 *              
 * while문
 *     - 형식
 *       while(논리조건식){
 *          반복할작업;
 *       }
 * 성적처리프로그램
 * 국어,영어,수학점수를 입력받아 총점,평균,학점 내기
 * 각점수의 점수를 0~100으로 한정.
 */
import java.io.*;
public class Exam_03 {
	public static void main(String[] ar)throws IOException{
		BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
		int kem[]={0,0,0},total=0,i=0;
		float avg=0.0f;
		String sub[]={"Kor","Eng","math"};
		for(i=0;i<3;i++){
			do{
				System.out.printf("%s - ",sub[i]);
			kem[i]=Integer.parseInt(in.readLine());
			}while(kem[i]<0 || kem[i]>100);
		}
		for(i=0;i<3;i++)
			total+=kem[i];
		avg=total/3.0f;
	}
}
