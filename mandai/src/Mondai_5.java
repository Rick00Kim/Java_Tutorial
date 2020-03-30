import java.io.*;
public class Mondai_5 {
	public static void main(String[] ar)throws IOException{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int client=0;
		int[] cli;
		int tmp;
		System.out.print("Write num - ");
		client=Integer.parseInt(in.readLine());
		cli=new int[client];
		for(int i=0;i<client;i++){
			System.out.print(i+1+"번째 - ");
			cli[i]=Integer.parseInt(in.readLine());
		}
		for(int i=0;i<cli.length;i++){
			for(int j=i+1;j<cli.length;j++){
				if(cli[i]>cli[j]){
					tmp=cli[i];
					cli[i]=cli[j];
					cli[j]=tmp;
				}
			}
		}
		System.out.println("최대값 - 최소값 -> "+(cli[client-1]-cli[0]));
		
	}
}
