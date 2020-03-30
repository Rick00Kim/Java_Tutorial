package study;
import java.io.*;
public class Exam_02 {
	public static int add(int[] a){
		int tot=0;
		for(int i:a)
			tot+=i;
		return tot;
	}
	public static int setMax(int[] a){
		int max=0;
		for(int i=0;i<a.length;i++){
			if(max<a[i])
				max=a[i];
		}
		return max;
	}
	public static void main(String[] ar)throws IOException{
		BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
		int[] client;
		int tot=0,max=0;
		float avg=0.0f;
		System.out.print("Data Count - ");
		int cnt=Integer.parseInt(in.readLine());
		client=new int[cnt];
		for(int i=0;i<client.length;i++){
			System.out.print((i+1)+"번째 수 - ");
			client[i]=Integer.parseInt(in.readLine());
		}
		System.out.println();
		System.out.print("입력한 수 : ");
		for(int i=0;i<client.length;i++)
			System.out.print("("+(i+1)+" - "+client[i]+") ");
		tot=add(client);	
		max=setMax(client);
		avg=tot/(float)client.length;
		
		System.out.println("\nTotal : "+tot);
		System.out.printf("Average : %.2f\n", avg);
		System.out.println("Max : "+max);
			
	}
}
