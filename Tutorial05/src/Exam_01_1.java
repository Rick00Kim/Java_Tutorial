	/* 
	 * �ϳ��� ���ڸ� �Է¹޾� ����ϴ� �۾��� �ݺ��Ѵ�.
	 * ���� = 
	 * (����)=ASCII
	 * ���(y/n)=
	 */
import java.io.*;
public class Exam_01_1 {
	public static void main(String[] ar)throws IOException{
		char cli=0;   //�Է¹��� ���ڸ� ������ ���� ����
		char yn=0;//��� ������ ���� ���θ� �Ǵ��ϴ� ���� ����
		while(true){
			System.out.print("Input = ");
			cli=(char)System.in.read();
			System.in.read();
			System.in.read();
			System.out.println("Output - "+cli+" <-> "+(int)cli);
			System.out.print("Continue??(y/n) - ");
			yn =(char)System.in.read();
			System.in.read();
			System.in.read();
			System.out.println();
			if(yn=='n'||yn=='N') break;
		}
		System.out.println("Close Program!!");
	}
}

