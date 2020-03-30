/*
 * 1 ~ 100 사이의 자연수 출력
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
