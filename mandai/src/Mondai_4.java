/*
 * ���� ���� n��ŭ ��ǥ��
 */
import java.io.*;
public class Mondai_4 {
	public static void main(String[] ar)throws IOException{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int cli=0;
		System.out.print("���� �Է� -");
		cli=Integer.parseInt(in.readLine());
		for(int i=1;i<=cli;i++){
			for(int j=1;j<=i;j++)
				System.out.print(j+" ");
			System.out.println();
		}

		
	}
}
