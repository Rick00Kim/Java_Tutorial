/**
 * ���� ó�� ���α׷� 
 * �⺻�� - �������� �Է¹ް� ������ ����� ���
 */
import java.io.*;
public class Exam_04 {
	static BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
	static int kor=0,eng=0,math=0,total=0;
	static float avg=0.0f;
	public static void input()throws IOException{
		System.out.print("Kor - ");
		kor=Integer.parseInt(in.readLine());
		System.out.print("Eng - ");
		eng=Integer.parseInt(in.readLine());
		System.out.print("Math - ");
		math=Integer.parseInt(in.readLine());
	}
	public static void process(){
		total=kor+eng+math;
		avg=total/3.0f;
	}
	public static void output(){
		System.out.println("Total : "+total);
		System.out.printf("Average : %.2f\n", avg);
	}
	public static void main(String[] ar)throws IOException{
		input();
		process();
		output();
		
	}
}
