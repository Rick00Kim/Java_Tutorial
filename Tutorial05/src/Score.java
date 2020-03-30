import java.io.*;
public class Score {
	public static void main(String[] ar)throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int kor=0,eng=0,math=0;
		int total=0;
		float avg=0.0f;
		char grd;
		System.out.print("Kor  : ");
		kor=Integer.parseInt(in.readLine());
		System.out.print("Eng  : ");
		eng=Integer.parseInt(in.readLine());
		System.out.print("math : ");
		math=Integer.parseInt(in.readLine());
		total=kor+eng+math;
		avg=total/3.0f;
		/* if¹®
		 * if(avg>90)
			grd='A';
		else if(avg>80)
			grd='B';
		else if(avg>70)
			grd='C';
		else if(avg>60)
			grd='D';
		else
			grd='F';
		*/
		 //Switch case
		switch((int)avg/10){
			case 10 :
				
			case 9 :
				grd='A';
				break;
			case 8 :
				grd='B';
				break;
			case 7 :
				grd='C';
				break;
			case 6 :
				grd='D';
				break;
			default :
				grd='F';
		}

		
		
		System.out.println("Total : "+total);
		System.out.printf("Average : %.2f\n",avg);
		System.out.println("Grade : "+grd);
	}
}
