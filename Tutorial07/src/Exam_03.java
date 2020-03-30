/*
 * 다차원 배열(2차원 배열)
 * 1. 선언하는 방법
 *    - 자료형[][] 배열명;
 *    - 자료형[] 배열명[];
 *    - 자료형 배열명[][];  C_Style
 * 2. 다차원 배열의 초기화
 *    - 배열명 = new 자료형[첨자1][첨자2];
 *    - 배열명 = new 자료형[][]{{},{},...};
 *    - 배열명 = new 자료형[첨자][]; 			<- 동적배열
 * 3. 다차원 배열의 특징
 *    - 다차원 배열에서 각 영역은 모두 Reference이고, 
 *      마지막 배열 공간만 실제 데이터 공간이다.
 *    - 다차원 배열은 단일 차원 배열로 구성된다.
 *    - 다차원 배열은 다중 for문과 함께 사용된다.
 *    - 다차원 배열에서는 동적 배열이 가능하다.
 */
//3명의 성적을 입력받아 총점과 평균은 계산하여 출력
import java.io.*;
public class Exam_03 {
	public static void main(String[] ar)throws IOException{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
//		int[] kor =new int[3];
//		int[] eng =new int[3];
//		int[] math =new int[3];
//		int[] total=new int[3];
		int[][] cli=new int [3][4];
		float[] avg=new float[3];
		String[] sub=new String[]{"Kor","Eng","Math"};
		
		/*for(int i=0;i<3;i++){
			System.out.print(sub[i]+" = ");
			kor[i]=Integer.parseInt(in.readLine());
			System.out.print(sub[i]+" = ");
			eng[i]=Integer.parseInt(in.readLine());
			System.out.print(sub[i]+" = ");
			math[i]=Integer.parseInt(in.readLine());
			total[i]=kor[i]+eng[i]+math[i];
			avg[i]=total[i]/3.0f;
		}*/
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print(i+1+" - "+sub[j]+" = ");
				cli[i][j]=Integer.parseInt(in.readLine());
				cli[i][3]+=cli[i][j];
			}
			avg[i]=cli[i][3]/3.0f;
		}
		for(int i=0;i<3;i++){
			System.out.println();
			System.out.println(i+1+"`s Total - "+cli[i][3]);
			System.out.printf("%d`s Average - %.2f\n",i+1,avg[i]);

		}
	}
}
