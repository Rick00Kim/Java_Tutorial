/**
 * do~while�� : ������ �� ���Ǻ�
 *              - �־��� ������ �����̶� �ѹ��� �����Ѵ�.
 *              - do{  
 *                 �ݺ����۾�;
 *                }while(�����ǽ�);
 *              - ��ȿ���˻� : �Է°��� ������ ��
 *              
 * while��
 *     - ����
 *       while(�����ǽ�){
 *          �ݺ����۾�;
 *       }
 * ����ó�����α׷�
 * ����,����,���������� �Է¹޾� ����,���,���� ����
 * �������� ������ 0~100���� ����.
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
