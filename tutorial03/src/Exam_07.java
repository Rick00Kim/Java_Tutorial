/**
 * ���� ó�� ���α׷� 1�ܰ�
 * ����, ����, ���������� �Է¹޾� ������ ����� ����Ͽ� ���
 * 
 */
import java.util.Scanner;
public class Exam_07 {
	public static void main(String[] ar){
		//����
		int kor=0,eng=0,ma=0,total=0;
		float aver=0.0f;
		Scanner buf=new Scanner(System.in);
		//�Է¹�
		System.out.print("Write  Kor Score - ");
		kor=Integer.parseInt(buf.nextLine());
		System.out.print("Write  Eng Score- ");
		eng=Integer.parseInt(buf.nextLine());
		System.out.print("Write Math Score- ");
		ma=Integer.parseInt(buf.nextLine());
		
		//ó����
		total=kor+eng+ma;
		aver=total/3.0f;
		//��¹�
		System.out.printf("Total Score - %d\n"
				+ "   Average - %.2f",total,aver);
	}
}
