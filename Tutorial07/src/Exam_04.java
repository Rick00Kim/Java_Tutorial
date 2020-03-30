import java.io.*;
public class Exam_04 {
	public static void main(String[] ar)throws IOException{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int[] sub[] =new int[3][4];
		float[] avg=new float[3];
		String[] title={"Kor","Eng","Math"};
		for(int j=0;j<sub.length;j++){
			for(int i=0;i<title.length;i++){
				System.out.print(title[i]+" = ");
				sub[j][i]=Integer.parseInt(in.readLine());
				sub[j][3]+=sub[j][i];
			}
		avg[j]=sub[j][3]/3.0f;
		}
		for(int i=0;i<3;i++){
			System.out.println();
			System.out.println("Total = "+sub[i][3]);
			System.out.printf("Average = %.2f\n",avg[i]);
		}
	}

}
