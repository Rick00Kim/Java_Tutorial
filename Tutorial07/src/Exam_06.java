import java.io.*;
public class Exam_06 {
	public static void main(String[] ar)throws IOException{
		char[] sub[]=new char[][]{{'j','a','v','a'},
									{'s','u','n'},
									{'a','p','p','l','e'}};
//			char[] a={'j','a','v','a'};
//			char[] b={'s','u','n'};
//			char[] c={'a','p','p','l','e'};
			sub[0]=new char[]{'j','a','v','a'};
			sub[1]=new char[]{'s','u','n'};
			sub[2]=new char[]{'a','p','p','l','e'};
			for(int i=0;i<sub.length;i++){
				for(int j=0;j<sub[i].length;j++)
				System.out.print(sub[i][j]);
				System.out.println();
			}
	}
}

