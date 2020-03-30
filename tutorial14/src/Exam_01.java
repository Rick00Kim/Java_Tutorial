/*
 * arraycopy
 */
import java.io.*;

public class Exam_01 {
	public static void main(String[] ar)throws IOException{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int[] x=new int[5];
//		int i=0;
		for(int k=0;k<10;k++){
			System.out.print("자료 = ");
			x[k]=Integer.parseInt(in.readLine());
			if(k>=4){ //배열의 재구성
				int[] tmp=new int[x.length+1];
				System.arraycopy(x, 0, tmp, 0, x.length);
				x=tmp;
			}
		}
		System.out.println();
		for(int j=0;j<x.length;j++){
			System.out.println("x["+j+"] - "+x[j]);
		}
	}
}
