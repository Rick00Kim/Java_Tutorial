
import java.io.*;
public class Exam_01 {
	public static void main(String[] ar)throws IOException{
		/**
		 * main() �޼���
		 *  - ���α׷� ���۽� ����ڷκ��� ���� �Է¹޾� ó���� �������� ����.
		 *  - ����
		 *    Usage : Ŭ������ �Ű�����, �Ű�����,......
		 *  - �Ű������� ũ��
		 *    ar.length
		 *  - ���α׷� ����
		 *    System.exit(0);
		 */
		if(ar.length!=1){
			System.out.println("Usage : Exam_01 �ο���");
			System.exit(0);
		}
		int inwon=Integer.parseInt(ar[0]);
		
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		String[] name =new String[inwon];
		for(int i=0;i<name.length;i++){
			System.out.print(i+"��° ��� �̸� = ");
			name[i]=in.readLine();
		}
		System.out.println();
		for(int i=0;i<name.length;i++){
			System.out.println(i+"��° : "+name[i]);
		}
	}
}
