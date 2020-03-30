import java.io.*;
public class ManaGrd {
	public static void main(String[] ar)throws IOException{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
//
		int kor=0,eng=0,math=0,total=0;
		float avg=0.0f;
//
		System.out.print("Kor  = ");
		kor=Integer.parseInt(in.readLine());
		System.out.print("Eng  = ");
		eng=Integer.parseInt(in.readLine());
		System.out.print("Math = ");
		math=Integer.parseInt(in.readLine());
		
		total=kor+eng+math;
		avg=total/3.0f;
		System.out.println();
		System.out.println("Total   = "+total);
		System.out.printf("Average = %.2f\n",avg);
		
		if(avg>90){
			System.out.println("Grade = A");
		}else if(avg>80){
			System.out.println("Grade = B");
		}else if(avg>70){
			System.out.println("Grade = C");
		}else if(avg>60){
			System.out.println("Grade = D");
		}else
			System.out.println("Grade = F");
			
		
	}

}
