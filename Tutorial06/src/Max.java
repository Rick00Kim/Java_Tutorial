import java.io.*;
public class Max {
	public static void main(String[] ar)throws IOException{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int num1=0,num2=0;
		
		System.out.print("1st : ");
		num1=Integer.parseInt(in.readLine());
		System.out.print("2nd : ");
		num2=Integer.parseInt(in.readLine());
		if(num1>num2)
			System.out.println("Max - "+num1);
		else
			System.out.println("Max - "+num2);
	}
}
