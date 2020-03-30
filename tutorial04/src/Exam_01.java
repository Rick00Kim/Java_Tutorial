/**
 * BufferedReader 사용법
 */
import java.io.*; //input & output 약자
public class Exam_01 {
	public static void main(String[] ar)throws IOException{
		/*System.out.print("키보드 하나 입력 =");
		int x= System.in.read()-48;
		System.out.println("x= "+x);*/
		//선언문
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		/*
		 * readLine() - 문자열로 입력받는다.
		 */
		String imsi="";
		int x=0;
		byte y=0;
		float z=0.00f;
		//입력문
		System.out.print("Num : ");
		imsi= in.readLine();
		x=Integer.parseInt(imsi);
		y=Byte.parseByte(imsi);
		z=Float.parseFloat(imsi);
		//처리문
		//출력문
		System.out.println("x ="+x);
		System.out.println("y= "+y);
		System.out.println("z= "+z);
	}

}
