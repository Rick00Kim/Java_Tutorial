/*
 * �����Ҵ��� �����ϴ�.
 * 5���� ������ �Է¹޾� ����ϴ� ���α׷�
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
		//��������(Selection Sort)
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

		//��������(In Sort)
		
		//Bubble����
		
		System.out.println();
		for(int i=0;i<cli.length;i++){
			System.out.println(cli[i]);
		}
		
	}

}
