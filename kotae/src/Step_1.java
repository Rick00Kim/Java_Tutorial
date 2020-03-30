import java.io.*;

public class Step_1 {
	public static void main(String[] ar) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] title = {"����", "����", "����"};
		int[][] sub = new int[3][4];		
		double[] avg = new double[3];
		char[] level = new char[3]; // '\0'
		
		for(int k = 0; k < sub.length; k++){
			for(int i = 0; i < sub[k].length - 1; i++){
				do{
	 				System.out.print(title[i] + " = ");
	 				sub[k][i] = Integer.parseInt(in.readLine());
	 			}while(sub[k][i] < 0 || sub[k][i] > 100);
				sub[k][3] += sub[k][i];//sub[3] = sub[3] + sub[i];   // ����
			}
	
			avg[k] = sub[k][3] / (float)title.length;
			
			switch((int)avg[k]/10){ // 10 9 8 7 6 5 4 3 2 1 0
			case 10: // 100��				
			case  9: // 90 ~ 99��
					level[k] = 'A'; break;
			case  8: // 80 ~ 89��
					level[k] = 'B'; break;
			case  7: // 70 ~ 79��
					level[k] = 'C'; break;
			case  6: // 60 ~ 69��
					level[k] = 'D'; break;
			default: // case�̿��� ���� ���� ��쿡 ȣ��ȴ�.
					level[k] = 'F';
			}
		}	
		
		System.out.println();
		for(int i = 0; i < 3; i++){
			System.out.println("���� = " + sub[i][3]);
			System.out.printf("��� = %.2f\n", avg[i]);
			System.out.printf("���� = %c\n", level[i]);
		}
	}
}
