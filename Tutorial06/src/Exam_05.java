/*
 * 동적할당이 가능하다.
 * 5명의 점수를 입력받아 출력하는 프로그램
 */
import java.io.*;
public class Exam_05 {
	public static void main(String[] ar)throws IOException{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int[] cli=new int[5];
		int tmp=0;
		for(int i=0;i<cli.length;i++){
			System.out.print((i+1)+" - ");
			cli[i]=Integer.parseInt(in.readLine());
		}
		//선택정렬(Selection Sort)
		System.out.println("Selection Sort");
		for(int i=0;i<4;i++){
			for(int j=i+1;j<5;j++){
				if(cli[i]>cli[j]){
					tmp=cli[i];
					cli[i]=cli[j];
					cli[j]=tmp;
				}
			}
		}

		//삽입정렬(In Sort)
		
		//Bubble정렬
		
		System.out.println();
		for(int i=0;i<cli.length;i++){
			System.out.println(cli[i]);
		}
		
	}

}
