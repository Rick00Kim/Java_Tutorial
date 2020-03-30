/*
 * ������ �迭(2���� �迭)
 * 1. �����ϴ� ���
 *    - �ڷ���[][] �迭��;
 *    - �ڷ���[] �迭��[];
 *    - �ڷ��� �迭��[][];  C_Style
 * 2. ������ �迭�� �ʱ�ȭ
 *    - �迭�� = new �ڷ���[÷��1][÷��2];
 *    - �迭�� = new �ڷ���[][]{{},{},...};
 *    - �迭�� = new �ڷ���[÷��][]; 			<- �����迭
 * 3. ������ �迭�� Ư¡
 *    - ������ �迭���� �� ������ ��� Reference�̰�, 
 *      ������ �迭 ������ ���� ������ �����̴�.
 *    - ������ �迭�� ���� ���� �迭�� �����ȴ�.
 *    - ������ �迭�� ���� for���� �Բ� ���ȴ�.
 *    - ������ �迭������ ���� �迭�� �����ϴ�.
 */
//3���� ������ �Է¹޾� ������ ����� ����Ͽ� ���
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
