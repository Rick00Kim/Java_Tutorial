/**
 * BufferedReader ����
 */
import java.io.*; //input & output ����
public class Exam_01 {
	public static void main(String[] ar)throws IOException{
		/*System.out.print("Ű���� �ϳ� �Է� =");
		int x= System.in.read()-48;
		System.out.println("x= "+x);*/
		//����
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		/*
		 * readLine() - ���ڿ��� �Է¹޴´�.
		 */
		String imsi="";
		int x=0;
		byte y=0;
		float z=0.00f;
		//�Է¹�
		System.out.print("Num : ");
		imsi= in.readLine();
		x=Integer.parseInt(imsi);
		y=Byte.parseByte(imsi);
		z=Float.parseFloat(imsi);
		//ó����
		//��¹�
		System.out.println("x ="+x);
		System.out.println("y= "+y);
		System.out.println("z= "+z);
	}

}
