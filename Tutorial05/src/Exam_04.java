/**
 * ���� ���α׷�
 * �� ���� ������ �ϳ��� �����ڸ� �Է¹޾� ����� ����.
 * 1. ����������� �̿��Ͽ� ������ �ڷ����� �˸°� ������ ��.
 * 2. �־��� �����ȣ�̿��� ���� ������ �ٽ� �Է¹޵��� �����Ѵ�.
 * 3. �����ڰ� '/'�̰� �ι�° ���� 0�� ������ �ι�° ���� �ٽ� �Է¹޵��� �����Ѵ�.
 */
import java.io.*;
public class Exam_04 {
	public static void main(String[] ar)throws IOException{
		BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
		int num1=0,num2=0,rst=0;
		char op=0;
		System.out.print("1st = ");
		num1=Integer.parseInt(in.readLine());
		do{
			System.out.print("Op = ");
			op=(char)System.in.read();
			in.readLine();
		}while(op!='*' && op!='/' && op!='+' && op!='-' && op!='%');
		do{
		System.out.print("2nd = ");
		num2=Integer.parseInt(in.readLine());
		}while(op == '/' && num2 ==0);
		switch(op){
		case '+': rst=num1+num2; break;
		case '-': rst=num1-num2; break;
		case '*': rst=num1*num2; break;
		case '/': rst=num1/num2; break;
		case '%': rst=num1%num2; 
		}
		System.out.println();
		System.out.println(num1+" "+op+" "+num2+" = "+rst);
	}
}