/*
 * 1 ~ 100 ������ �ڿ��� ���
 */

public class Exam_08 {
	public static void main(String[] ar){
		int i=0;
		for(i=1;i<101;i++){
//			System.out.print(i);
//			if(i%10==0) System.out.println();
//			else System.out.print("\t");
			if(i%2!=0) continue;
				System.out.printf("%3d",i);
		}
		
	}
}
