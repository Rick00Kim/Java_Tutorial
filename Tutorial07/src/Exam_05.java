/**
 * 배열의 요소 : 다차원 배열일 경우
 * int[] x= new int[5];
 * 
 * int[] y[] = new int[3][4];  <- 12개의 공간
 * 
 */

public class Exam_05 {
	public static void main(String[] ar){
		int[][] x=new int[][]{};
		
		/*
		 * x[0][0]
		 * x[0][1]
		 * x[0][2]
		 * x[1][0]
		 * x[1][1]
		 * x[1][2]
		 *  
		 */
		for(int i=0;i<2;i++){
			for(int j=0;j<3;j++){
				System.out.print("x["+i+"]["+j+"] = "+x[i][j]+" ");
			}
			System.out.println();
			System.out.println();
		}
	}
}
