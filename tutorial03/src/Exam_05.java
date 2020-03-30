import java.util.Scanner;
public class Exam_05 {
	public static void main(String[] ar){
		//인스턴스(객체) 생성
		Scanner sc = new Scanner(System.in);
		
		System.out.print("수1 = ");
		int x= sc.nextInt();
		System.out.print("수2 = ");
		int y= sc.nextInt();
		
		int result=x+y;
		System.out.println(x+"+"+y+"="+result);
	}
}
