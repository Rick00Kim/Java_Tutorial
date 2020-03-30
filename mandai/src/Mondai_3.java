/*
 * 모든 짝수 더한 값 - 모든 홀수 더한 값
 */
import java.io.*;
public class Mondai_3 {
	public static void main(String[] ar)throws IOException{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int client=0;
		int[] cli;
		int hh_sum=0;
		int jj_sum=0;
		System.out.print("Write num - ");
		client=Integer.parseInt(in.readLine());
		cli=new int[client];
		for(int i=0;i<client;i++){
			System.out.print(i+1+"번째 - ");
			cli[i]=Integer.parseInt(in.readLine());
		}
		for(int i=0;i<cli.length;i++){
			if(cli[i]%2==0){
				jj_sum+=cli[i];
			}else if(cli[i]%2!=0){
				hh_sum+=cli[i];
			}
		}
		System.out.println("짝수합 - 홀수합 = "+(jj_sum-hh_sum));
	}
}
