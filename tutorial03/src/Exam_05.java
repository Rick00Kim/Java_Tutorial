import java.util.Scanner;
public class Exam_05 {
	public static void main(String[] ar){
		//�ν��Ͻ�(��ü) ����
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��1 = ");
		int x= sc.nextInt();
		System.out.print("��2 = ");
		int y= sc.nextInt();
		
		int result=x+y;
		System.out.println(x+"+"+y+"="+result);
	}
}
