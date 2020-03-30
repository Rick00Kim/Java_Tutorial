import java.io.*;
public class Aida {
	public static void main(String[] ar)throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int num1=0,num2=0,rst=0;
		int i=0;
		System.out.print("num1 - ");
		num1=Integer.parseInt(in.readLine());
		System.out.print("num2 - ");
		num2=Integer.parseInt(in.readLine());
		if(num1>num2){
			for(i=num2;i<=num1;i++)
				rst+=i;
		}
		else{
			for(i=num1;i<=num2;i++)
				rst+=i;	
		}
		System.out.println("»çÀÌÇÕ : "+rst);
	}
}
