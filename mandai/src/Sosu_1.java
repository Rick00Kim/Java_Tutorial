/*
 *  1 ~ `00000 사이의 정수들 중 소수의 개수를 세어 출력하는 프로그램
 */
import java.io.*;

public class Sosu_1 {
	public static final int MAX=100000;
	public static void main(String [] ar)throws IOException{
		int cnt=0;
		int i,j;
		for(i=2;i<=MAX;i++){
			for(j=2;j<MAX-1;j++){
				if(i%j==0)
					break;
			}
			if(i==j)
				cnt++;
		}
		System.out.println(cnt);
	}
}
