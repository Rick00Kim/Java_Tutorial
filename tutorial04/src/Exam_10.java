/*
 * �ϳ��� ���ڸ� �Է¹޾� ������� �Ǵ��ϴ� ���α׷��� �����Ͻÿ�.
 */
import java.io.*;
public class Exam_10 {

	public static void main(String[] args)throws IOException{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int num =0 ;
		System.out.print("Number - ");
		num=Integer.parseInt(in.readLine());
		System.out.println();
		if(num>0){
			System.out.println("�Է¹��� ���� "+num+"�� ����Դϴ�");
		}else if(num<0){
			System.out.println("�Է¹��� ���� "+num+"�� �����Դϴ�.");
		}else
			System.out.println("�Է¹��� ���� "+num+"�� Zero�Դϴ�.");
			System.out.println("���α׷��� �����մϴ�.");
		
	}

}
