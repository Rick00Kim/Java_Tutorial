/*
 * ���׿����� : ���� �� �� ������ �ִ� ������, if����� ��ü�� �ȴ�.
 * ����
 *   (������)?(��1):(��2);
 *   �Ǵ�
 *   (����)=(������)?(��1):(��2);
 * �ǹ�
 *   �־��� �������� ���̸� ��1�� ����ǰ�, �׷��� ������ ��2�� ����ȴ�.
 */ 
import java.io.*;
public class Exam_08 {
	public static void main(String[] ar)throws IOException{
		BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
		/*
		 * �ϳ��� ���ڸ� �Է¹޾� ������� ����ϴ� ���α׷��� �����Ͻÿ�.
		 */
		int num=0;
		String str="";
		System.out.print("Write number = ");
		num=Integer.parseInt(in.readLine());
		str=num>0?"���":"����";
		System.out.println("Your Number - "+str);
		
	}
}
