/**
 * �� ���� ������ �Է¹޾� ū ������� �����ϴ� ��� ���α׷�.
 */
import java.io.*;
public class Exam_06 {
	public static void main(String[] ar)throws IOException{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int num1=0,num2=0,num3=0;
		int tmp=0;   //�ڸ��ٲ�
		System.out.print("1st = ");		
		num1=Integer.parseInt(in.readLine());
		System.out.print("2nd = ");
		num2=Integer.parseInt(in.readLine());
		System.out.print("3rd = ");
		num3=Integer.parseInt(in.readLine());
		if(num2 >= num1 &&num2 >= num3){
			tmp=num1;
			num1=num2;//�ٽ�
			num2=tmp;
		}else if(num3>=num1 && num3>=num2){
			tmp=num1;
			num1=num3;
			num3=tmp;
		}
		if(num3>=num2){
			tmp=num2;
			num2=num3;
			num3=tmp;
		}
		

		
		System.out.println(num1+" >= "+num2+" >= "+num3);
	}
}
/*if(num1>num2 && num1> num3){
if(num2>num3){
	System.out.println(num1 +" >= "+num2+" >= "+num3);
}else
	System.out.println(num1+" >= "+num3+" >= "+num2);
}else if(num2>num1 && num2>num3){
if(num1>num3){
	System.out.println(num2+" >= "+num1+" >= "+num3);
}else
	System.out.println(num2+" >= "+num3+" >= "+num1);
}else{
if(num1>num2){
	System.out.println(num3+" >= "+num1+" >= "+num2);
}else
	System.out.println(num3+" >= "+num2+" >= "+num1);
}*/