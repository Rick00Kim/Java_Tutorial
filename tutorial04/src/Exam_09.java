/*
 * �� ���� ������ �Է¹޾� ū ���� ����ϴ� ���α׷��� �����Ͻÿ�.
 * ��, ���׿����ڸ� �̿��� ��.
 * 
 * <�Է�����>
 * ù��° �� =
 * �ι�° �� =
 * <�������>
 * ū �� =
 * 
 */
import java.io.*;
public class Exam_09 {
	public static void main(String[] ar)throws IOException{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int num1=0,num2=0,num3=0,max=0;
		System.out.print("ù��° �� = ");
		num1=Integer.parseInt(in.readLine());
		System.out.print("�ι�° �� = ");
		num2=Integer.parseInt(in.readLine());
		System.out.print("����° �� =");;
		num3=Integer.parseInt(in.readLine());
		
		max=num1>num2?num1:num2;
		max=max>num3?max:num3;
		System.out.println("ū �� = "+max);
	}
}
