import java.io.*;
public class Exam_04 {
	public static void main(String[] ar)throws IOException{
		System.out.print("Ű���� �ϳ��� �������� : ");
		int x=System.in.read()-48;
		System.out.println("x = "+x);
		System.in.read();
		System.in.read();
		System.out.print("���� =");
		char y=(char)System.in.read();
		System.out.println("y = "+y);
	}
}
