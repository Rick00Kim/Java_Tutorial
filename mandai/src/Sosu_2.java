import java.io.*;

public class Sosu_2 {
	public static final int MAX=100000;
	public static void main(String [] ar)throws IOException{
		int cnt=0;
		int cnt_sum=0;
		int i,j;
		for(i=2;i<=MAX;i++){
			for(j=2;j<MAX-1;j++){
				if(i%j==0)
					break;
			}
			if(i==j)
				cnt++;
			if(cnt<=50){
				cnt_sum+=i;
			}
		}
		System.out.println("1~100000까지의 소수 : "+cnt);
		System.out.println("밑에서 50개의 소수의 합 : "+cnt_sum);
	}
}
