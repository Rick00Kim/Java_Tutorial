package study;

public class Exam_01 {
	public static void main(String[] ar){
		int[] x=new int[10];
		x[0]=45;
		x[1]=55;
		x[2]=60;
		x[3]=70;
		x[4]=20;
		x[5]=90;
		x[6]=77;
		x[7]=40;
		x[8]=38;
		x[9]=88;
		int sum=0;
		for(int i=0;i<x.length;i++){
			System.out.print(x[i]+" ");
			sum+=x[i];
		}
		System.out.println("Sum : "+sum);
		sum=0;
		for(int i=0;i<x.length;i++){
			x[i]=(int)(Math.random()*10);
			System.out.print(x[i]+" ");
			sum+=x[i];
		}
		System.out.println("Sum : "+sum);
	}
}
