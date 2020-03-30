/*
 * 세 개의 정수를 입력받아 큰 수와 작은 수를 비교하여 출력하는 프로그램을 구현하시오.
 * 
 * <입력형식>
 * 첫번째수 =
 * 두번째수 =
 * 
 * <출력형식>
 * 큰수 =
 * 작은수 =
 */
import java.io.*;
public class Exam_11 {

	public static void main(String[] args)throws IOException {
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int num1=0,num2=0,num3=0,max=0,mid=0,min=0;
		System.out.print("1st - ");
		num1=Integer.parseInt(in.readLine());
		System.out.print("2nd - ");
		num2=Integer.parseInt(in.readLine());
		System.out.print("3rd - ");
		num3=Integer.parseInt(in.readLine());
		if(num1>num2 && num1>num3){
			if(num2>num3){
				max=num1;
				mid=num2;
				min=num3;
			}else{
				max=num1;
				mid=num3;
				min=num2;
			}
		}else if(num2>num1 && num2>num3){
			if(num1>num3){
				max=num2;
				mid=num1;
				min=num3;
			}else{
				max=num2;
				mid=num3;
				min=num1;
			}
			
		}else if(num3>num1 && num3>num2){
			if(num1>num2){
				max=num3;
				mid=num1;
				min=num2;
			}else{
				max=num3;
				mid=num2;
				min=num1;
			}
		}

		System.out.println("MAX : "+max);
		System.out.println("MID : "+max);
		System.out.println("MIN : "+min);
		System.out.println("Shutdown");
	}
}
