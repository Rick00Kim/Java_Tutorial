import java.io.*;

public class Step_1 {
	public static void main(String[] ar) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] title = {"국어", "영어", "수학"};
		int[][] sub = new int[3][4];		
		double[] avg = new double[3];
		char[] level = new char[3]; // '\0'
		
		for(int k = 0; k < sub.length; k++){
			for(int i = 0; i < sub[k].length - 1; i++){
				do{
	 				System.out.print(title[i] + " = ");
	 				sub[k][i] = Integer.parseInt(in.readLine());
	 			}while(sub[k][i] < 0 || sub[k][i] > 100);
				sub[k][3] += sub[k][i];//sub[3] = sub[3] + sub[i];   // 총점
			}
	
			avg[k] = sub[k][3] / (float)title.length;
			
			switch((int)avg[k]/10){ // 10 9 8 7 6 5 4 3 2 1 0
			case 10: // 100점				
			case  9: // 90 ~ 99점
					level[k] = 'A'; break;
			case  8: // 80 ~ 89점
					level[k] = 'B'; break;
			case  7: // 70 ~ 79점
					level[k] = 'C'; break;
			case  6: // 60 ~ 69점
					level[k] = 'D'; break;
			default: // case이외의 값이 나올 경우에 호출된다.
					level[k] = 'F';
			}
		}	
		
		System.out.println();
		for(int i = 0; i < 3; i++){
			System.out.println("총점 = " + sub[i][3]);
			System.out.printf("평균 = %.2f\n", avg[i]);
			System.out.printf("학점 = %c\n", level[i]);
		}
	}
}
