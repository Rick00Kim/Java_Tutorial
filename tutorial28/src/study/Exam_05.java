package study;

public class Exam_05 {
	public static void main(String[] ar){
		int[][] a={{100,200,200,200},
				{90,500,200,100},
				{60,500,20,400}};
		double sum=0;
		
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++)
				sum+=a[i][j];
		}
		System.out.println("Че : "+sum);
		System.out.println("ЦђБе : "+(sum/a.length));
	}
}
